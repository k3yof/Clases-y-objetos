
import java.util.Arrays;
class Baraja
{
private Cartas barajaJuego[];

Baraja()// construtor por defecto
{
int cont = 0;
barajaJuego = new Cartas[44]; 
    //picas
    for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"picas");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"picas");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"picas");
        barajaJuego[cont] = carta;
        cont++;
    }
    
    //corazones
    for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"corazones");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"corazones");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"corazones");
        barajaJuego[cont] = carta;
        cont++;
    }

    //diamantes
    for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"diamantes");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"diamantes");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"diamantes");
        barajaJuego[cont] = carta;
        cont++;
    }

    //treboles

    for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"treboles");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"treboles");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"treboles");
        barajaJuego[cont] = carta;
        cont++;
    }
}
Baraja (boolean ochosyNueves, boolean caballeros)// tamaño sin caballeros es de 52// tamaño sin 8ynueves es de 48// tamaño completo es de 56
{
    barajaJuego = new Cartas[44];
    int cont = 0;

    if(ochosyNueves == true && caballeros == false)
    {
        barajaJuego = Arrays.copyOf(barajaJuego, barajaJuego.length + 8);

        // picas
        for(int j = 1; j < 12; j ++) // 1-J
        {
            Cartas carta = new Cartas(j ,"picas");
            barajaJuego[cont] = carta;
            cont++;
        }
        for(int j = 13; j < 15; j ++) // Q-K
        {
            Cartas carta = new Cartas(j ,"picas");
            barajaJuego[cont] = carta;
            cont++;
        }
        
        //corazones
        
        for(int j = 1; j < 12; j ++) // 1-J
        {
            Cartas carta = new Cartas(j ,"corazones");
            barajaJuego[cont] = carta;
            cont++;
        }
        for(int j = 13; j < 15; j ++) // Q-K
        {
            Cartas carta = new Cartas(j ,"corazones");
            barajaJuego[cont] = carta;
            cont++;
        }

        //diamantes
        
        for(int j = 1; j < 12; j ++) // 1-J
        {
            Cartas carta = new Cartas(j ,"diamantes");
            barajaJuego[cont] = carta;
            cont++;
        }
        for(int j = 13; j < 15; j ++) // Q-K
        {
            Cartas carta = new Cartas(j ,"diamantes");
            barajaJuego[cont] = carta;
            cont++;
        }

        //treboles

        for(int j = 1; j < 12; j ++) // 1-J
        {
            Cartas carta = new Cartas(j ,"treboles");
            barajaJuego[cont] = carta;
            cont++;
        }
        for(int j = 13; j < 15; j ++) // Q-K
        {
            Cartas carta = new Cartas(j ,"treboles");
            barajaJuego[cont] = carta;
            cont++;
        }

    }
    else if(caballeros == true && ochosyNueves == false)
    {
        barajaJuego = Arrays.copyOf(barajaJuego, barajaJuego.length + 4);

        for(int j = 1; j < 8; j ++)// 1-7
        {
            Cartas carta = new Cartas(j ,"picas");
            barajaJuego[cont] = carta;
            cont++;
        }
        
        for(int j = 10; j < 15; j ++) // 10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"picas");
            barajaJuego[cont] = carta;
            cont++;
        }
        
        //corazones
        for(int j = 1; j < 8; j ++)// 1-7
        {
            Cartas carta = new Cartas(j ,"corazones");
            barajaJuego[cont] = carta;
            cont++;
        }
        
        for(int j = 10; j < 15; j ++) // 10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"corazones");
            barajaJuego[cont] = carta;
            cont++;
        }

        //diamantes
        for(int j = 1; j < 8; j ++)// 1-7
        {
            Cartas carta = new Cartas(j ,"diamantes");
            barajaJuego[cont] = carta;
            cont++;
        }
        
        for(int j = 10; j < 15; j ++) // 10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"diamantes");
            barajaJuego[cont] = carta;
            cont++;
        }

        //treboles

        for(int j = 1; j < 8; j ++)// 1-7
        {
            Cartas carta = new Cartas(j ,"treboles");
            barajaJuego[cont] = carta;
            cont++;
        }
        
        for(int j = 10; j < 15; j ++) // 10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"treboles");
            barajaJuego[cont] = carta;
            cont++;
        }
    }
    else if (caballeros == true && ochosyNueves == true)
    {
        barajaJuego = Arrays.copyOf(barajaJuego, barajaJuego.length + 12);

        //picas
        for(int j = 1; j < 15; j ++)//1-10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"picas");
            barajaJuego[cont] = carta;
            cont++;
        }
    
        //corazones
        for(int j = 1; j < 15; j ++)//1-10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"corazones");
            barajaJuego[cont] = carta;
            cont++;
        }

        //diamantes
        for(int j = 1; j < 15; j ++)//1-10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"diamantes");
            barajaJuego[cont] = carta;
            cont++;
        }

        //treboles

        for(int j = 1; j < 15; j ++)//1-10,J,C,Q,K
        {
            Cartas carta = new Cartas(j ,"treboles");
            barajaJuego[cont] = carta;
            cont++;
        }


    }
    else
    {
        for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"picas");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"picas");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"picas");
        barajaJuego[cont] = carta;
        cont++;
    }
    
    //corazones
    for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"corazones");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"corazones");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"corazones");
        barajaJuego[cont] = carta;
        cont++;
    }

    //diamantes
    for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"diamantes");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"diamantes");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"diamantes");
        barajaJuego[cont] = carta;
        cont++;
    }

    //treboles

    for(int j = 1; j < 8; j ++)// 1-7
    {
        Cartas carta = new Cartas(j ,"treboles");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 10; j < 12; j ++) // 10-J
    {
        Cartas carta = new Cartas(j ,"treboles");
        barajaJuego[cont] = carta;
        cont++;
    }
    for(int j = 13; j < 15; j ++) // Q-K
    {
        Cartas carta = new Cartas(j ,"treboles");
        barajaJuego[cont] = carta;
        cont++;
    }
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
        random = (int)(Math.random()* barajaJuego.length); 
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

void baraja() 
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
public void mostrarbaraja()
{
for(int i = 0; i< barajaJuego.length; i++)
{
    barajaJuego[i].mostrarCarta();
}
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
    public static void main(String[] args) {
        Cartas carta1 = new Cartas(4, "corazones");

        System.out.println(carta1.getvalorCarta());
        System.out.println(carta1.getvalorPalo());
        System.out.println(carta1.getcolor());
        carta1.mostrarCarta();

        System.out.println("----------------------------------------------------------------");

        Baraja baraja = new Baraja(true, false);
        baraja.mostrarbaraja();;

        System.out.println("----------------------------------------------------------------");
        

    }
}