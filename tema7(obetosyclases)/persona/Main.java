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
        
      Semaforo s1;

      s1 = new Semaforo();
      s1 = new Semaforo((byte)0, true, false, (byte)0, (byte)200, (byte)6);

      if(s1.encendido() == true)
      {
        System.out.println("El semáforo está ON");
      }
      else
      {
        System.out.println("El semáforo está OFF");
      }

      s1.encender();

      if(s1.encendido() == true)
      {
        System.out.println("El semáforo está ON");
      }
      else
      {
        System.out.println("El semáforo está OFF");
      }

      s1.setBlink(true);


      Dado dado6caras, dado12caras;

      dado6caras = new Dado();
      dado12caras = new Dado((byte) 12);

      //dado6caras.nCaras = -5; //ERROR: nCaras es private

      for(int i=0; i<7; i++)
        System.out.println(dado6caras.lanzar());
        
      System.out.println(dado12caras.lanzar());

      System.out.println(Arrays.toString(dado6caras.getLista()));
        
        
      //crear un vector/array/tabla de dados
      //con un bucle hacer lanzamientos de cada uno de ellos

      Dado[] vectorDados;

      vectorDados = new Dado[5]; //reservamos memoria para referencias
      //dos de 6
      //1 de 12
      //2 de 400
      for(int i=0; i<2; i++)
      {
        vectorDados[i] = new Dado();
      }

      vectorDados[2] = new Dado((byte) 12);

      for(int i=3; i<5; i++)
      {
        vectorDados[i] = new Dado((byte) 125);
      }

      System.out.println("Array:");
      for(int i=0; i<5; i++)
      {
        System.out.println(vectorDados[i].getCaras());
      }

      //System.out.println(vectorDados[1].lanzar());

      Dado pruebaTest;

      pruebaTest = new Dado((byte) 12);

      System.out.println(Arrays.toString(pruebaTest.getLista()));
        
      test(pruebaTest);
        
      System.out.println(Arrays.toString(pruebaTest.getLista()));
        


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

    public static void test(Dado arg)
    //recibe un dado, lanza una vez
    {
        arg.lanzar();
    }
   
}