import java.util.Arrays;
import java.util.Scanner;



class Punto2d
{
   double x;
   double y;

    //Constructor
    Punto2d()//Constructor por defecto
    {
      x=0;
      y=0;
    }
    //Comportamiento

    double  getPosicionX()
    {
        return x;
    }
    double  getPosicionY()
    {
        return y;
    }
    double  getUbicacion()
    {
        double c = x+y;

        return c;
    }


    
    int[] insertar(int resul[], int elem)
    //inserta un nuevo elemento en el array pasado como argumento
    //SIN respetar orden
    {
        resul = Arrays.copyOf(resul, resul.length+1);
        resul[resul.length-1] = elem;

        return resul;
    }  

    void setPosicion(int fila,int cols)
    {
       

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
       camion1 = new Punto2d();

       camion1.getUbicacion();












    }
     
}