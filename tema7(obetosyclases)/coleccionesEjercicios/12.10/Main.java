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

    System.out.println("Introduce un numero:");
    Integer n = sc.nextInt();

    while (n >=0)
    {
        listaEnteros.add(n);
        System.out.println("Introducir un numero");
        n = sc.nextInt();
    }
    System.out.println(listaEnteros);
    System.out.println("////////////////////////////////////////////");
    
    System.out.println("Indice de valores pares:");
    for (int i =0;i <listaEnteros.size();i++)
    {
        if(listaEnteros.get(i)%2 ==0)
        {
            System.out.println(i+" ");
            listaEnteros.set(i, listaEnteros.get(i)*100);
        }
    }
    System.out.println("////////////////////////////////////////////");
   
    System.out.println(listaEnteros);
    }
}