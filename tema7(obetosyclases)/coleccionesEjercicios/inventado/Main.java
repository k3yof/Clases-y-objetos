import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
    
    long startTime = System.nanoTime();
    //Crear una lista
    List<Integer> listaEnteros = new ArrayList<>();

   
    Integer n = 0;

    while (n<5000000)
    {
        listaEnteros.add((int)(Math.random()*5000000+1));
        n++;
    }
    
    System.out.println("////////////////////////////////////////////");
    System.out.println("Su tamaño es: "+listaEnteros.size());
    Collections.sort(listaEnteros);
    //Integer a = Collections.max(listaEnteros);
    Integer a = Collections.binarySearch(listaEnteros,Collections.max(listaEnteros));
    System.out.println("////////////////////////////////////////////");
    System.out.println(a);
    Integer b = a+1;
    listaEnteros.add(b);
    System.out.println("////////////////////////////////////////////");
    System.out.println(b);
    System.out.println("Su tamaño es: "+listaEnteros.size());
    

    long endTime = System.nanoTime();

    double tiempo = endTime-startTime /1e6;
    System.out.println("Ha tardado "+tiempo+ " Milisegundos");
    System.out.println("Ejercicio 4.1:");
    long t1 = System.nanoTime();
    Integer m = listaEnteros.size();
    for(int i=0;i<m;i++)
    {
        System.out.println(listaEnteros.get(i)+" ");
    }

    long t2 = System.nanoTime();
    double t3 = (t2-t1)/1e6;
    System.out.println("Ha tardado "+t3+ " Milisegundos");

    }
}