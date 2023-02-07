import java.util.Arrays;
import java.util.Scanner;


class Punto3d extends Punto2d
{
    private double z;
    Punto3d(double x,double y ,double z)
    {
        super(x,y);
        this.z = z;
    }
    public void  mostrarPosicion()
    {

    System.out.println();
      super.mostrarPosicion();
     
      System.out.print("  z:"+this.z);  
    }

    public double  getPosicionZ()
    {
        return this.z;
    }
    public void  setPosicionZ(double z)
    {
        this.z=z;
    }

    public double []  getPosicion(double x,double y,double z)
    {
       double posiciones [] = super.getPosicion(x, y);
       posiciones = Arrays.copyOf(posiciones, posiciones.length+1);
       posiciones[2] = z;
       return posiciones;
    }
}
class Punto2d
{
   protected double x;
   protected double y;
   protected double posiciones1 [];
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
    public double []  getPosicion(Double fil,double col)
    {
       double posiciones [];
       posiciones = new double [2];

       posiciones[0]=fil;
       posiciones[1]=col;

       return posiciones;
    }
    public void  mostrarPosicion()
    {

       System.out.print("x:"+x+"  ");
       System.out.print("y:"+y);

       
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
    public Punto2d[] eliminar (Punto2d elem)
    {
        int num = linea.length;
        Punto2d copia[]=Arrays.copyOf(linea,num);//copia es un clon de t
        int i=0;
        while(i<copia.length)//recorremos copia
        {
            if (copia[i].equals(elem))
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
    } 
    //Mostrar linea
    public void mostrarLinea()
    {
        for (int i=0;i<linea.length;i++)
        {
            linea[i].mostrarPosicion();
            System.out.println();
        }
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
     public void compararTamaño(Linea linea2)
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

public class Punto
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

       Punto2d puntoMedio;
       puntoInicio = new Punto2d(5,7);
       puntoMedio = new Punto2d(17,2);
       puntoFin = new Punto2d(8,9);


       Linea a;
       a = new Linea(puntoInicio,puntoFin);
       
    
       a.insertar(puntoMedio);
       a.mostrarLinea();
       

       Punto3d z = new Punto3d(1, 2, 3);
        
       z.mostrarPosicion();

       z.setPosicionZ(5);
       z.mostrarPosicion();

       double al [] = z.getPosicion(2, 3, 14);
       z.mostrarPosicion();
       System.out.println();
       System.out.print(Arrays.toString(al));












    }
     
}