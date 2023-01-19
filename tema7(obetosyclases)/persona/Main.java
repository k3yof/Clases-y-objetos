import java.util.Arrays;

class Linea
{

    private Punto2d puntos[];
    
    Linea(Punto2d inicio, Punto2d fin)
    //PRE: los objetos inicio y fin NO deben ser iguales
    {
        puntos = new Punto2d[2];

        puntos[0] = inicio;
        puntos[1] = fin;
    }

    public int size()
    {
        return this.puntos.length;
    }

    public void insertar(Punto2d elem)
    {
        //copiar el array original de puntos con tam+1
        this.puntos = Arrays.copyOf(this.puntos, this.size()+1);
        
        //colocar el nuevo elemento al final
        this.puntos[this.size()-1] = elem;
    }

    private int buscar(Punto2d elem)
    //devuelve -1 si NO encuentra el elemento en la Línea
    //devuelve la posición en caso contrario [0...n]
    {
        int resul = -1;

        for(int i=0; i<this.size(); i++)
        {
            if(this.puntos[i].equals(elem))
            {
                resul = i;
                break;
            }
        }

        return resul;
    }

    public void eliminar(Punto2d elem)
    {
        int pos = this.buscar(elem);

        if (pos != -1) //se ha encontrado...
        {
            //copiamos todos los puntos MENOS el encontrado
            Punto2d copia[];

            copia = new Punto2d[this.size()-1];

            
            for(int i=0, cont=0; i<this.size(); i++)
            {
                if(i != pos)
                {
                    copia[cont] = this.puntos[i];
                    cont++;
                }
            }
        }
    }

   /*  public Punto2d[] eliminar (Punto2d elem)
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
    }  */
    public void mostrar()
    {
        for(int i=0; i<this.size(); i++)
        {
            System.out.println("Punto " + i + ":" + puntos[i].getX() + " " + puntos[i].getY());
        }
    }

}

class Punto2d
{
    private double x;
    private double y;

    Punto2d(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    private boolean comparar(Punto2d otro)
    {
        boolean resul; 

        //if ( this.x == otro.getX() && this.y == otro.getY())
        if ( this.x == otro.x && this.y == otro.y)
        {
            resul = true;
        }
        else
        {
            resul = false;
        }
        
        return resul;
    }

    public boolean equals(Object otro)
    {
        return (this.comparar((Punto2d) otro));
    }
}
class Persona
{
    String nombre;
    int edad;
    double estatura;

    Persona(String nombre, int edad, double estatura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    Persona(String nombre)
    {
        this(nombre, 7, 1.0);
        //this.nombre = nombre;
        //this.edad = 1;
        //this.estatura = 1.0;
    }
    
}

public class Main
{
    
    public static void main(String args[])
    {
        
      
      Punto2d p1, p2;

      p1 = new Punto2d(4, 5);
      p2 = new Punto2d(4, 3);

      Linea l = new Linea(p1, p2);

      l.mostrar();

      l.insertar(new Punto2d(-1, 8));
      
      l.mostrar();

      //-- eliminar no funciona. No borra. ¿Por qué?
      //-- eliminar no comprueba que haya suficientes puntos
      l.eliminar(new Punto2d(-1, 8));
      l.eliminar(p2);

      l.mostrar();

      
    }
   
}