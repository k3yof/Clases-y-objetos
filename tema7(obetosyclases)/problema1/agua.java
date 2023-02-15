import java.util.Arrays;
import java.util.Scanner;

class Tanque
{
    private static final double capacidadMaxima=5000;
    private static final double capacidadMinima=1;
    private double contenidoTanque;

   
    Tanque(double contenidoTanque)
    {
        if (contenidoTanque<=capacidadMaxima && contenidoTanque>=capacidadMinima)
        {
            this.contenidoTanque = contenidoTanque;
        }
        else
        {
            this.contenidoTanque =1;
        }
    }
    public double getContenido()
    {
        return contenidoTanque;
    }
    public double setAgregar(double litrosAgregar)
    {
     if (contenidoTanque+litrosAgregar<capacidadMaxima)
     {
        contenidoTanque = contenidoTanque +litrosAgregar;
     }
     return contenidoTanque;
    }
    public double setSacarAgua(double litrosSacar)
    {
        if (contenidoTanque-litrosSacar>=capacidadMinima)
        {
           contenidoTanque = contenidoTanque - litrosSacar;
        }
        return contenidoTanque;
     
    }
    public double setSacarMitad()
    {
        if (contenidoTanque>=capacidadMinima)
        {
           contenidoTanque = contenidoTanque /2;
        }
        return contenidoTanque;
    }

}

class agua
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);

    Tanque a1;

    a1 = new Tanque(100);
    
    System.out.println(a1.getContenido());

    /* a1.setSacarAgua(2500);

    System.out.println(a1.getContenido());

    a1.setSacarMitad();

    System.out.println(a1.getContenido());
    
    a1.setAgregar(100);

    System.out.println(a1.getContenido()); */

    while (a1.getContenido()>1)
    {
        a1.setSacarMitad();

        System.out.println(a1.getContenido());
    }


    

}
}