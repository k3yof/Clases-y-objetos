import java.util.Arrays;

class Baraja
{
    private Cartas barajaJuego[];

    Baraja()// por defecto
    {
        barajaJuego = new Cartas[44]; // sin 8 ni 9 ni caballeros
    }
    Baraja (boolean ochosyNueves, boolean caballeros)// tamaño sin caballeros es de 52// tamaño sin 8ynueves es de 48// tamaño completo es de 56
    {
        barajaJuego = new Cartas[44];

        if(ochosyNueves == true)
        {
            barajaJuego = Arrays.copyOf(barajaJuego, barajaJuego.length + 8);
        }
        if(caballeros == true)
        {
            barajaJuego = Arrays.copyOf(barajaJuego, barajaJuego.length + 4);
        }
    }

    public void mezclar()
    {
        Cartas barajaCopia[] = barajaJuego;
        int random = 0;
        int nums[] = new int [barajaCopia.length];
        int i = 0;
        int cont = 0;
        while(i < barajaJuego.length)
        {
            random = (int)(Math.random()* barajaJuego.length); // desordena la baraja
            nums[i] = random;

            if(buscar(random,nums)== -1)
            {
                barajaCopia[cont] = barajaJuego[random];
                cont++;
            }
            i++;
        }
        barajaJuego = barajaCopia;
    }

    void baraja() // otra forma de barajar pero que apunta al mismo metodo
    {
        this.mezclar();
    }

    public Cartas robar()
    {
        this.mezclar();
        Cartas temp = barajaJuego[barajaJuego.length-1];
        barajaJuego = Arrays.copyOf(barajaJuego,barajaJuego.length-1);
        return temp;

    }

    public static int buscar(int valor, int tabla[])
    //busca un elemento en el array dado
    {
        int encontrado = -1;
        for(int cont = 0; cont < tabla.length; cont++)
        {
            if(valor == tabla[cont])//encontrado
            {
                encontrado = cont;
                break;
            }
        }
        return encontrado;
    }
}
class Cartas
{
    private int valorCarta;
    private String valorPalo;
    Cartas(int valor, String palo)// creamos un construtor.
    {
        this.valorCarta = valor;
        this.valorPalo = palo;
    }   

    public int getvalorCarta () // creamos un get que nos devuelva el valor de la carta.
    {
        return this.valorCarta;
    }

    public String getvalorPalo()// creamos un get que nos devuelva el valor del pa
    {
        return this.valorPalo;
    }

    public String getcolor()// creamos un metodo que nos clasifique los colores de las cartas
    {
        String color;
        if(this.valorPalo == "picas" || this.valorPalo == "treboles") // como sabemos que los treboles y las picas son negros, conseguimos descartas facilmente los otros dos palos ya que son rojos.
        {
            color = "negro";
        }else
        {
            color = "rojo";
        }
        return color;
    }
    public void mostrarCarta()
    {
        System.out.print(this.valorCarta);

        switch(this.valorPalo)
        {
            case "picas"-> System.out.println(" picas");
            case "diamantes"-> System.out.println(" diamantes");
            case "corazones"-> System.out.println(" corazones"); 
            case "treboles"-> System.out.println(" treboles");

        }
    }
}

public class CartasyBaraja 
{
    public static void main(String[] args) 
    {
        Cartas carta1 = new Cartas(4, "corazones");

        System.out.println(carta1.getvalorCarta());
        System.out.println(carta1.getvalorPalo());
        System.out.println(carta1.getcolor());

        carta1.mostrarCarta();
    }
}