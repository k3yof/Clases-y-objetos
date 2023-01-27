import java.util.Arrays;
import java.util.Scanner;

class calendar
{
    private char [] abecedarioMayusculas= {'A','B','C','D','E','F','G','H','I',' ','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    private char [] abecedarioMinusculas= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

   
    
    private int convertidor()
    {

    }
    public String cifradorCesar(int cantidadDerecha,String nombreReal)
    {
        String mensajeCifrado="";
        int cont =0;
        int longitud;
        longitud = nombreReal.length;

        if (cont <= longitud)
        {
            nombreReal[cont];    
        }
       nombreReal[0]= abecedarioMayusculas[cantidadDerecha];
        

        return mensajeCifrado;
    }

}

class cesar
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    } 
}