import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Line;



class Punto2d
{
   private double x;
   private double y;
   private double posiciones1 [];
    //Constructor
    Punto2d()//Constructor por defecto
    {
      x=0;
      y=1;
    }
    Punto2d(double x,double y)//Constructor por defecto
    {
      this.x=x;
      this.y=y;
    }
    //Comportamiento

    public double  getPosicionX()
    {
        return x;
    }
    public double  getPosicionY()
    {
        return y;
    }
    public double []  getPosicion(int fil,int col)
    {
       double posiciones [];
       posiciones = new double [2];

       posiciones[0]=fil;
       posiciones[1]=col;

       return posiciones;
    }
    

    void  setPosicionX(double x)
    {
        this.x=x;
    }
    void  setPosicionY(double y)
    {
        this.y=y;
    }
    void  setPosicion1()
    {
       
       posiciones1 = new double [2];

       posiciones1[0]=this.x;
       posiciones1[1]=this.y;

       
    }

    
    int[] insertar(int resul[], int elem)
    //inserta un nuevo elemento en el array pasado como argumento
    //SIN respetar orden
    {
        resul = Arrays.copyOf(resul, resul.length+1);
        resul[resul.length-1] = elem;

        return resul;
    }  

    public boolean comparar(Punto2d otro)
    {
        boolean iguales=false;
        if ( this.x == otro.getPosicionX() && this.y == otro.getPosicionY())
        {
            iguales=true;
        }

        return iguales;
    }

    //Metodo importante
    public boolean equals(Object otro)
    {
        return (this.comparar((Punto2d)otro));



        //Puedes usar el metodo anterior o el siguiente
        /* 
        Punto2d alguien = (Punto2d) otro;
        boolean iguales=false;
        if ( this.x==alguien.x  && this.y == alguien.y)
        {
            iguales=true;
        }

        return iguales; 
        */
    }







    double [] setPosicion(int fila,int cols)
    {
       double posiciones [];
       posiciones = new double [2];

       posiciones[0]=this.x;
       posiciones[1]=this.y;

       return posiciones;


    }

}
class Linea
{
    private Punto2d [] linea;

    //Constructor
    Linea(Punto2d punto1, Punto2d punto2)//Constructor por defecto
    {  
      linea = new Punto2d [2];
  
      linea[0] = punto1;
      linea[1] = punto2;  
    }

    //Mostrar la linea
    Punto2d [] getLinea()
    {
        return linea;
    }
    //Insertar Punto
    public Punto2d[] insertar( Punto2d elem)
    //inserta un nuevo elemento en el array pasado como argumento
    //SIN respetar orden
    {
        linea = Arrays.copyOf(linea, linea.length+1);
        linea[linea.length-1] = elem;

        return linea;
    }  
    //Borrar Punto
    /* public Punto2d[] eliminar (Punto2d elem)
    {
        Punto2d copia[]=Arrays.copyOf(linea, elem);//copia es un clon de t
        int i=0;
        while(i<copia.length)//recorremos copia
        {
            if (copia[i]> elem)
            {
                //hay que eliminar copia [i];
                copia[i]=copia[copia.length-1];//copiamos el ultimo en copia[i]
                //y decrementamos la longitud de  copia 1. Elimina el ultimo.
                copia=Arrays.copyOf(copia, copia.length-1);
                //Ahora tendremos que volver a comprobar copia[i]. No modificamos i

            }else
            {
                i++;//copia[i] se queda en la tabla, comprobamos copia[i+1]
            }
           
        }
        return copia;
    }  */
    //Mostrar linea
    private void mostrarLinea()
    {

    }
    //Desplazar
    //Ver el tamaño
    private int getTamaño()
    {
        int tamañoLinea;
        tamañoLinea = linea.length;
        return tamañoLinea;
    }
    //equals a lineas
     private void compararTamaño(Linea linea2)
    {
        //Ver el tamaño de la linea1
        int tamañolinea1 = getTamaño();
        int tamañoLinea2;
        tamañoLinea2 = linea2.getTamaño();

        if (tamañolinea1==tamañoLinea2)
        {
            System.out.println("Las dos lineas son iguales");
        }
        else
        {
            System.out.println("Las dos lineas no son iguales");
        }
        
    } 

}

public class camion
{

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);       
  
       Punto2d camion1;
       
       //s1 = new Semaforo1();

       //Constructoor por defecto
       camion1 = new Punto2d(4,4);


       Punto2d puntoInicio;
       Punto2d puntoFin;
       puntoInicio = new Punto2d(5,7);
       puntoFin = new Punto2d(8,9);


       Linea a;
       a = new Linea(puntoInicio,puntoFin);
       
       System.out.print(Arrays.toString(a.getLinea()));
       












    }
     
}