import java.util.Arrays;
import java.util.Scanner;



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

public class camion
{

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);       
  
       Punto2d camion1;
       
       //s1 = new Semaforo1();

       //Constructoor por defecto
       camion1 = new Punto2d(4,4);


       System.out.println(camion1.getPosicionX());
       System.out.println(camion1.getPosicionY());
       












    }
     
}