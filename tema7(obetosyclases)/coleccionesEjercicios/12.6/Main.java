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
    
   boolean eliminado = lista.remove(5);

   while (eliminado == true)
   {
        eliminado = lista.remove(5);
   }


   
    System.out.println(lista);
    }
}