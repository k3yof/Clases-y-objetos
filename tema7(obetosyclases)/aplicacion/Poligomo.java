import java.util.*;

abstract class Poligono
{
    protected double base;
    protected double altura;

    abstract double area();
}
class Triangulo extends Poligono
{
        Triangulo(double base,double altura)
        {
            this.altura = altura;
            this.base= base;
        }
        public double area()
        {
            return (base*altura)/2;
        }
        public boolean equals(Object otro)
        {
           
            //Puedes usar el metodo anterior o el siguiente
             
            Triangulo alguien = (Triangulo) otro;
            boolean iguales=false;
            if ( this.altura==alguien.altura  && this.base == alguien.base)
            {
                iguales=true;
            }
    
            return iguales; 
            
        }
}
   
class Rectangulo extends Poligono
{
        Rectangulo(double base,double altura)
        {
            this.altura = altura;
            this.base= base;
        }
        public double area()
        {
            return base*altura;
        }
        public boolean equals(Object otro)
        {
           
            //Puedes usar el metodo anterior o el siguiente
             
            Rectangulo alguien = (Rectangulo) otro;
            boolean iguales=false;
            if ( this.altura==alguien.altura  && this.base == alguien.base)
            {
                iguales=true;
            }
    
            return iguales; 
            
        }
}

    

public class Poligomo
{

    public static void main(String[] args) 
    {
       
       
    }
     
}