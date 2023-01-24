import java.util.Arrays;

class Carta
{
    private int codePoint;

    Carta(int cp)
    //crea una carta a partir de un codePoint
    {
        this.codePoint = cp;
    }

    public int valor()
    //1-10 + 11(J), 12(C), 13(Q), 14(K) 
    {
        int resul=0;

        if(codePoint< 0x1F0AF && codePoint>0x1F0A0) //picas
            resul = codePoint - 0x1F0A0;
        else
            if(codePoint< 0x1F0BF && codePoint>0x1F0B0) //corazones
                resul = codePoint - 0x1F0B0;
            else
                if(codePoint< 0x1F0CF && codePoint>0x1F0C0) //diamantes
                    resul = codePoint - 0x1F0C0;
                else
                    if(codePoint< 0x1F0DF && codePoint>0x1F0D0) //tréboles
                        resul = codePoint - 0x1F0D0;

        return resul;
    }

    public String palo()
    //P, C, D, T
    {
        String resul="";

        if(codePoint>=0x1F0A1 && codePoint<0x1F0AF)
            resul="picas";
        else
            if(codePoint>=0x1F0B1 && codePoint<0x1F0BF)
                resul="corazones";
            else
                if(codePoint>=0x1F0C1 && codePoint<0x1F0CF)
                    resul="diamantes";
                else
                    if(codePoint>=0x1F0D1 && codePoint<0x1F0DF)
                        resul="tréboles";

        return resul;
    }

    public String color()
    {
        String resul="";

        if((codePoint>=0x1F0A1 && codePoint<0x1F0AF) || (codePoint>=0x1F0D1 && codePoint<0x1F0DF))
            resul="negro";
        else
            resul="rojo";

        return resul;
    }

    public void mostrar()
    {
        System.out.print(Character.toChars(codePoint));
    }
}

class Baraja
{

    private Carta mazo[];
    private boolean ochosYnueves;
    private boolean caballeros;

    Baraja()
    //crea una baraja sin ochos, nueves ni caballeros
    {
        this.crearBarajaMinima();

        this.ochosYnueves = false;
        this.caballeros = false;
    }

    Baraja(boolean ochosYnueves, boolean caballeros)
    {
        this(); //llamamos al constructor vacío para crear una baraja "normal"

        if(ochosYnueves == true)
        {
            this.addOchosYnueves();
        }

        if(caballeros == true)
        {
            this.addCaballeros();
        }
    }

    private void crearBarajaMinima()
    //crea una baraja sin ochos, nueves ni caballeros
    {
        //el tamaño será 44
        this.mazo = new Carta[44];

        int cont=0;

        for(int i=0x1F0A1; i<=0x1F0DE; i++)
        {
            //nos saltamos los valores no deseados (mirar tabla de internet): 8, 9, caballeros, 0 y F
            if(i == 0x1F0A0 || i == 0x1F0A8 || i == 0x1F0A9 || i == 0x1F0AC || i == 0x1F0AF ||
               i == 0x1F0B0 || i == 0x1F0B8 || i == 0x1F0B9 || i == 0x1F0BC || i == 0x1F0BF ||
               i == 0x1F0C0 || i == 0x1F0C8 || i == 0x1F0C9 || i == 0x1F0CC || i == 0x1F0CF ||
               i == 0x1F0D0 || i == 0x1F0D8 || i == 0x1F0D9 || i == 0x1F0DC || i == 0x1F0AF
            )
            {
                continue;
            }
            else
            {
                this.mazo[cont]=new Carta(i);
                //System.out.println(i + " " + cont + " " + this.mazo[cont].valor() + this.mazo[cont].palo());
                cont++;
                
            }
        }

        
    }

    private void addCaballeros()
    //añade los valores hexadecimales correspondientes a los caballeros
    {
        Carta copia[];

        copia = Arrays.copyOf(this.mazo, this.mazo.length+4);

        int pos=copia.length-1;

        //rellenamos desde la última posición hacia atrás
        copia[pos] = new Carta(0x1F0AC);
        pos--;
        copia[pos] = new Carta(0x1F0BC);
        pos--;
        copia[pos] = new Carta(0x1F0CC);
        pos--;
        copia[pos] = new Carta(0x1F0DC);

        this.mazo = copia;

        this.caballeros = true;
    }

     private void addOchosYnueves()
    //añade los valores hexadecimales correspondientes a los caballeros
    {
        Carta copia[];

        copia = Arrays.copyOf(this.mazo, this.mazo.length+8);

        int pos=copia.length-1;

        //rellenamos desde la última posición hacia atrás
        copia[pos] = new Carta(0x1F0A8);
        pos--;
        copia[pos] = new Carta(0x1F0A9);
        pos--;
        copia[pos] = new Carta(0x1F0B8);
        pos--;
        copia[pos] = new Carta(0x1F0B9);
        pos--;
        copia[pos] = new Carta(0x1F0C8);
        pos--;
        copia[pos] = new Carta(0x1F0C9);
        pos--;
        copia[pos] = new Carta(0x1F0D8);
        pos--;
        copia[pos] = new Carta(0x1F0D9);

        this.mazo = copia;

        this.ochosYnueves = true;
    }

    public int restantes()
    {
        return this.mazo.length;
    }

    public void barajar()
    {
        //hacemos varios intercambios aleatorios entre las cartas disponibles en el mazo

        int pos1, pos2;
        Carta temp;

        for(int i=0; i<1000; i++)
        {
            pos1=(int)(Math.random()*this.mazo.length);
            pos2=(int)(Math.random()*this.mazo.length);

            //hacemos swap entre las cartas de las dos posiciones
            temp=this.mazo[pos1];
            this.mazo[pos1]=this.mazo[pos2];
            this.mazo[pos2]=temp;
        }
    }

    public void mezclar()
    {
        this.barajar();
    }

    public Carta robar()
    //devuelve null si no quedan cartas que robar
    {
        //aunque supuestamente estarán mezcladas y podríamos sacar la última,
        //elegimos aleatoriamente la carta
        Carta resul;

        if(this.mazo.length>0)
        {
            int pos=(int)(Math.random()*this.mazo.length);;

            resul = this.mazo[pos];

            this.mazo[pos]=this.mazo[this.mazo.length-1]; //machacamos la elegida con la última

            this.mazo=Arrays.copyOf(this.mazo, this.mazo.length-1); //reducimos el tamaño del mazo
        }
        else
            resul=null;

        return resul;
    }

    public void reinicializar()
    {
        //volvemos el mazo a su estado más básico
        this.crearBarajaMinima();

        if(this.ochosYnueves == true)
        {
            this.addOchosYnueves();
        }

        if(this.caballeros == true)
        {
            this.addCaballeros();
        }

        //barajamos para asegurarnos de que todo es aleatorio
        this.barajar();
    }
}

class BlackJack
{
    public static void main(String [] args)
    {
    
    }
}