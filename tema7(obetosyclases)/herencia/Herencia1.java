import java.util.*;
class Persona
{
   protected String nombre;
   protected int edad;
   protected double estatura;

   Persona(String nombre,int edad,double estatura)
   {

        this.nombre= nombre;
        this.edad= edad;
        this.estatura=estatura;
   }    

   public void mostrarDatos()
   {
    System.out.print("Soy una persona con un nombre de: "+nombre+" con una edad de "+edad+ " con una estatura de "+estatura);
   }
}

class Empleado extends Persona
{
       protected double salario;
       Empleado(String nombre,int edad,double estatura,double salario)
       {
            super(nombre, edad, estatura);
            this.salario = salario;

       }
       
       public void mostrarDatos()
        {
            super.mostrarDatos();
            System.out.println();
            System.out.println("Mi salario es: "+this.salario);
        }
}
class Jubilado extends Empleado
{
    private int añosCotizados;
    Jubilado(String nombre,int edad,double estatura,double salario,int añosCotizados)
    {
        super(nombre, edad, estatura, salario);
        this.añosCotizados = añosCotizados;

    }
    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Mis años cotizados son: "+this.añosCotizados);
    }
}
public class Herencia1 
{
    public static void main(String[]args) 
    {

        
        Empleado e = new Empleado("Perico", 12, 1.8, 1080.0);
        e.mostrarDatos();

        Jubilado j = new Jubilado("Perico", 12, 1.8, 1080.0,50);

        j.mostrarDatos();
        
    }
    
}
