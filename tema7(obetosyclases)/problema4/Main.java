class Candado 
{
    private int [] combinacionSecreta;
    private int [] combinacionJugador;
    private int longitud;
    Candado()
    {
        //Combinacion de 3 cifras
        longitud = 3;
        //0,1,2
        combinacionSecreta = new int [longitud];
        combinacionSecreta [0] = 1;
        combinacionSecreta [1] = 5;
        combinacionSecreta [2] = 7;
        combinacionJugador = new int [longitud];
    }
    Candado(int longitud)
    {
        //Longitud adaptada a cualquier candado
        this.longitud =longitud;
        combinacionSecreta = new int [longitud];
        combinacionSecreta [0] = 1;
        combinacionSecreta [1] = 5;
        combinacionSecreta [2] = 7;
        combinacionJugador = new int [longitud];
    }

    //GETTERS & SETTERS
    public int getPrimerNumeroPublico()
    {
        return combinacionJugador[0];
    }
    public int getSegundoNumeroPublico()
    {
        return combinacionJugador[1];
    }
    public int getTercerNumeroPublico()
    {
        return combinacionJugador[2];
    }
    public void setPrimerNumeroPublico(int num)
    {
        this.combinacionJugador[0]= num;
    }
    public void setSegundoNumeroPublico(int num)
    {
        this.combinacionJugador[1]= num;
    }
    public void setTercerNumeroPublico(int num)
    {
        this.combinacionJugador[2]= num;
    }


    public boolean puedeAbrir()
    {
        boolean abierto = false;

        if (combinacionSecreta[0] == combinacionJugador[0] && combinacionSecreta[1] == combinacionJugador[1] && combinacionSecreta[2] == combinacionJugador[2] )
        {
            abierto = true;
        }

        return abierto;
    }
    public boolean mismaCombinacionActual(Candado otro)
    {
        boolean iguales = false;

        if (otro.getPrimerNumeroPublico() == combinacionJugador[0] && otro.getSegundoNumeroPublico() == combinacionJugador[1] && otro.getTercerNumeroPublico() == combinacionJugador[2] )
        {
            iguales = true;
        }

        return iguales;
    }


}
public class Main 
{
    public static void main(String[]args) 
    {
      
       
       
        
    }
    
}