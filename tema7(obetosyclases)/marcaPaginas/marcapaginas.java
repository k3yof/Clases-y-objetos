import java.util.Arrays;
import java.util.Scanner;

class MarcarPaginas
{

    private int marcador;
    MarcarPaginas()
    {
        marcador =0;
    }
    
    //Saber la pagina en la que estamos
    public int getPagina()
    {
        return marcador;
    }
    //Disminuir en 1 la pagina
    public void decrementarPagina()
    {
        marcador--;
    }

    //Disminuir el numero de paginas que queramos
    public void decrementarPagina(int numeroPginasLeidas)
    {
        if (numeroPginasLeidas>marcador)
        {
            marcador = marcador-numeroPginasLeidas;
        }
       else
       {
        System.out.println("No se ha decrementado nada");
       }
    }
    //Aumentar en uno,la pagina en la que estamos

    public void aumentarPagina()
    {
        marcador++;
    }
    //Aumentar el numero de paginas que queramos
    public void aumentarPagina(int numeroPginasLeidas)
    {
        if (numeroPginasLeidas>1)
        {
            marcador = marcador+numeroPginasLeidas;
        }
       else
       {
        System.out.println("No se ha aumentado nada");
       }
    }
    //Si el usuario quiere empezar de nuevo el libro
    public void resetearMarcador()
    {
        marcador=0;
    }
   


  
   
  

}

class marcapaginas
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    } 
}