import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Maiin
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
   
    Collection<Integer> numeros = new ArrayList<>();
    System.out.println("Introduce un numero: ");
    Integer n = sc.nextInt();
    while( n!=-1)
    {
        numeros.add(n);
        System.out.println("Introduce un numero: ");
        n = sc.nextInt();
    }
    System.out.println("Lista: "+numeros);
    System.out.println("Pares: ");
    for(Integer a : numeros)//Tenemos una variable del tipo que necesitamos a que coge los valores de la coleccion numeros
    {
        if (a%2==0)
        {
            System.out.print(a+" ");
        }
    }
    System.out.println();

    Iterator<Integer> it = numeros.iterator();

    for (;it.hasNext();)
    {
        n = it.next();
        if (n%3==0)
        {
            it.remove();
        }
    }
    System.out.println("No multiplos de 3: "+numeros);
    sc.close();
    }
}