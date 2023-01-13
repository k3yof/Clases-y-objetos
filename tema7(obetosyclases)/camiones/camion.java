import java.util.Arrays;
import java.util.Scanner;



class Punto2d
{
   int x=0;
   int y=0;

    //Constructor
    Punto2d()//Constructor por defecto
    {
      
    }
    //Comportamiento

    int  getPosicion()
    {
        
    }
}

    
    int[] insertar(int resul[], int elem)
    //inserta un nuevo elemento en el array pasado como argumento
    //SIN respetar orden
    {
        resul = Arrays.copyOf(resul, resul.length+1);
        resul[resul.length-1] = elem;

        return resul;
    }  

    int [][] setPosicion(int fila,int cols)
    {
       // secuencia = Arrays.copyOf(resp, num);
        posicion=insertar(posicion, fila);
       
        return posicion;

    }

}

public class camion
{

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);       
       int caras=6;
       Punto2d dado6caras;
       
       //s1 = new Semaforo1();

       //Constructoor por defecto
       dado6caras = new Punto2d(caras);


      
       

       System.out.println(dado6caras.tirar());
       dado6caras.cont++;

       System.out.println("--------------------------------");
       System.out.println(Arrays.toString(dado6caras.secuencia));
       System.out.println("--------------------------------");
       sc.close();
       //crear un vector de dados
       //con un bucle hacer unos cuantos lanzamientos

       int [] vectorEntero;

       vectorEntero = new int [5];

       Punto2d []vectorDados;
       vectorDados = new Punto2d[5];//Reservamos memoria para referencias

       //dos de 6
       //1 de 12
       //2 de 400
       for(int i=0;i<2;i++)
       {
       vectorDados[i] = new Punto2d(6) ;
       System.out.println(vectorDados[i].getCartas());
       }

       vectorDados[3] = new Punto2d(12) ;
       System.out.println(vectorDados[3].getCartas());

       for(int i=3;i<5;i++)
       {
            vectorDados[i] = new Punto2d(400) ;
            System.out.println(vectorDados[i].getCartas());
       }









    }
     
}