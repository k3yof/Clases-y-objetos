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
    String n ="";
    int a =0;
    List<String> listaNumerosNaturales = new ArrayList<>();
    Collection <String> coleccion = listaNumerosNaturales;
   
   
    //Rellenar la lista de numeros
    while(a <5)
    {
        
        
        System.out.println("Introduce una palabra");
        n= sc.next();
        listaNumerosNaturales.add(n);
        a++;

    }
    Iterator<String> it = coleccion.iterator();
    for(;it.hasNext();)
    {
        String p = it.next(); 
        if (p.contains("a") == true)
        {
            it.remove();
        }
        
    }
   
  /*   for(int i=0 ; i< listaNumerosNaturales.size();i++)
    {
        //for( int g=0 ; g <listaNumerosNaturales.get(i).length();g++)
       // {
        if (listaNumerosNaturales.get(i).contains("a") == true)
        {

                listaNumerosNaturales.remove(i);
        }
        //}
    } */
    for (int i=0 ; i< listaNumerosNaturales.size();i++)
    {
        System.out.print(listaNumerosNaturales.get(i)+" ");   
    }
    System.out.println();
   
   
   
    sc.close();
    }
}