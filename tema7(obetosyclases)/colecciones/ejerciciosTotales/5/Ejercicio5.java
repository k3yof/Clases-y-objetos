import java.util.*;




public class Ejercicio5 
{
    public static void main(String[]args) 
    {
        
        List <Integer> listaNumeros = new ArrayList<>();
        
        for(int i =0; i<20 ; i++)
        {
            listaNumeros.add((int)(Math.random()*10+1));
        }
        int tamaño = listaNumeros.size();
        System.out.println("La lista original:");
        System.out.println(listaNumeros);
        System.out.println("//////////////////////////////");
        System.out.println("La lista modificada:");
        System.out.println(tamaño);
        while(tamaño !=0)
        {
            for (int i =0;i<tamaño-1;i++)
            {
                Integer actual = listaNumeros.get(i);
                //System.out.print("a"+actual);
                Integer siguiente = listaNumeros.get(i+1);
                //System.out.print("s"+siguiente);
                //Si el elmento es mayor los debe intercambiar
                if (actual>siguiente)
                {
                    Integer f = actual;
                    listaNumeros.set(f, siguiente);
                    listaNumeros.set(siguiente, f);
                }
            }
            tamaño--;
        }
        
        System.out.println(listaNumeros);

    }
    
}