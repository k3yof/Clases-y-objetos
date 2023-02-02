import java.util.Arrays;
import java.util.Scanner;

class Tanque
{
    private static double litrosTanque=5000;
   
    Tanque()
    {
        
    }
    public double getContenido()
    {
        return litrosTanque;
    }
    public double setAgregar(double litrosAgregar)
    {
        double copia;
        copia = litrosTanque;
        if (litrosTanque<5000 && litrosTanque>=0)
        {
            //Falta comprobar si cuando metemos una cantidad,esta no se pasa de 5000
            litrosTanque = litrosTanque+litrosAgregar;

            if(litrosTanque>5000)
            {
                litrosTanque =copia;
                
            }
        }

        return litrosTanque;
    }
    public double setSacarAgua(double litrosSacar)
    {
       
        double copia;
        copia = litrosTanque;
        if (litrosTanque<5000 && litrosTanque>=0)
        {

            //Falta comprobar si cuando metemos una cantidad,esta no se pasa de 5000
            litrosTanque = litrosTanque-litrosSacar;
           
            if(litrosTanque<=1)
            {
                litrosTanque =copia;
                
            } 
        }
        return litrosTanque;
    }
    public double setSacarMitad()
    {
        double copia;
        copia = litrosTanque;
        if (litrosTanque<5000 && litrosTanque>=0)
        {

            //Falta comprobar si cuando metemos una cantidad,esta no se pasa de 5000
            litrosTanque = litrosTanque/2;
        }
        
        return litrosTanque;
    }

}

class agua
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);

    Tanque a1;

    a1 = new Tanque();
    
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