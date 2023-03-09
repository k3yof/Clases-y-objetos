import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
   
    //Crear una lista
    Collection<Integer> lista = new ArrayList<>();

    for(int i=0 ;i<100;i++)
    {
        //Añadir un numero aleatorio a la lista
        lista.add((int) (Math.random()*10 +1));
    }
    System.out.println(lista);
    
    //Crear una lista
    Collection<Integer> cincos = new ArrayList<>();

   
    //Añadimos un 5 a la lista y despues le pasamos a la otra lista todos los 5
    cincos.add(5);
    //cincos.add(2);
    //Eliminamos todos los elementos de la lista 5
    lista.removeAll(cincos);
   
    System.out.println(lista);
    }
}