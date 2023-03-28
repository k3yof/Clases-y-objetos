import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
   
    List<Integer> listaNumerosNaturales = new ArrayList<>();
    Collection <Integer> coleccion = listaNumerosNaturales;
   
   
    //Rellenar la lista de numeros
    for (int i =0;i<=100;i++)
    {
        listaNumerosNaturales.add(i);
    }
    for (int i=0 ; i< listaNumerosNaturales.size();i++)
    {
        System.out.print(listaNumerosNaturales.get(i)+" ");   
    }
    System.out.println();
   
    //Poner el it antes del bucle
    System.out.println("//////////////////////////////////////////////////");
    Iterator<Integer> it = coleccion.iterator();
    for(;it.hasNext();)
    {
        Integer p = it.next();
        System.out.print(listaNumerosNaturales.get(p)+" ");
    }
   
    sc.close();
    }
}