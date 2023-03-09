import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
   
    //Crear una lista
    List<Integer> listaEnteros = new ArrayList<>();

    for(int i=0 ;i<20;i++)
    {
        //Añadir un numero aleatorio a la lista
        listaEnteros.add((int) (Math.random()*10 +1));
    }
    System.out.println(listaEnteros);
    System.out.println("////////////////////////////////////////////");
    //Le decimos que la lista es ahoora una tabla,y le decimos la memoria
 
    //Ordenamos la tabla
  
    
    Comparator<Integer> ordenDecreciente = new Comparator<>()
    {
        public int compare(Integer e1,Integer e2)
        {
            return e2-e1;
        }
    };
    
    listaEnteros.sort(ordenDecreciente);
    System.out.println(listaEnteros);
    System.out.println("////////////////////////////////////////////");
    listaEnteros.sort(ordenDecreciente.reversed());
    System.out.println(listaEnteros);
    }
}