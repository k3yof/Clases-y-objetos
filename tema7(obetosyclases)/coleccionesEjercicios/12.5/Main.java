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

    for(int i=0 ;i<20;i++)
    {
        //Añadir un numero aleatorio a la lista
        lista.add((int) (Math.random()*10 +1));
    }
    System.out.println(lista);
    
    //Crear una lista
    Collection<Integer> listaSinRepetidos = new ArrayList<>();

    for (Integer e :lista)
    {
        //Si la lista sin repetidos no tiene el elemento e entonces lo ponemos
        if (!listaSinRepetidos.contains(e))
        {
            //Añadir elementos en la lista sin repetidos
            listaSinRepetidos.add(e);
        }
    }
   
    System.out.println(listaSinRepetidos);
    }
}