import java.util.*;

abstract class Pokemom
{
    protected String nombre;
    protected String entrenador;
    protected int experiencia;
    protected int salud;

    abstract void mostrar();
}
class Pichu extends Pokemom
{
        Pichu( String nombre, String entrenador,int experiencia,int salud)
        {
            this.nombre = nombre;
            this.entrenador= entrenador;
            this.experiencia = experiencia;
            this.salud = salud;
        }
        public void mostrar()
        {
            System.out.println("----------------------");
            System.out.println(" Nombre: "+this.nombre+"   ");
            System.out.println(" Entrenador: "+this.entrenador+"   ");
            System.out.println(" Experiencia: "+this.experiencia+"    ");
            System.out.println(" Salud: "+this.salud+"          ");
            System.out.println("----------------------");
        }
        public int ataqueRapido()
        {
            int dañoProducido=0;
            int d = (int) (Math.random()*10)+1;
            if (d ==1 || d ==2 || d ==3 || d ==4 || d ==5)
            {
                dañoProducido = 
            }
            return dañoProducido;
        }
        
}

class Pikachu extends Pichu
{
        Pikachu( String nombre, String entrenador,int experiencia,int salud)
        {
            super(nombre, entrenador, experiencia, salud);
        }
        
}
   
class Raichu extends Pikachu
{
        Raichu( String nombre, String entrenador,int experiencia,int salud)
        {
            super(nombre, entrenador, experiencia, salud);
        }
        
}

    

public class Pokemon
{

    public static void main(String[] args) 
    {
       Pikachu a = new Pikachu("b", "manu", 42, 50);

       a.mostrar();

       int d =0;
       while (d!=10)
       {
        d = (int) (Math.random()*10)+1;
        System.out.println(d);
       }
       
    }
     
}