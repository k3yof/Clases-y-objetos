import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


class Main
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
 
    List<Integer> listaNumerosNaturales = new ArrayList<>();
    List<Integer> listaNumerosNaturales2 = new ArrayList<>();
    List<Integer> listaNumerosNaturalesFinal = new ArrayList<>();
    Collection <Integer> coleccion = listaNumerosNaturales;
   
   
    //Rellenar la lista de numeros
        
    for (int i= 0; i <= 10000; i++)
    {
        listaNumerosNaturales.add((int) (Math.random() * 100 +1));
    }

    for (int i= 0; i <= 10000; i++)
    {
        listaNumerosNaturales2.add((int) (Math.random() * 100 +1));
    }

    for (int i=0 ; i< listaNumerosNaturales.size();i++)
    {
        if(listaNumerosNaturales.get(i) > listaNumerosNaturales2.get(i))
        {
            listaNumerosNaturalesFinal.add(listaNumerosNaturales.get(i));
        }
        else 
        {
            listaNumerosNaturalesFinal.add(listaNumerosNaturales2.get(i));
        }
        
    }

    int media = 0;

    for (int i=0 ; i< listaNumerosNaturalesFinal.size();i++)
    {
        media = media + listaNumerosNaturalesFinal.get(i);

    }

    media = media / listaNumerosNaturalesFinal.size();

    System.out.println(media);

    //System.out.print(listaNumerosNaturalesFinal +" ");   
   
   
   
    sc.close();
    }
}