class Revolver 
{
    private int posicionActual;
    private int bala;
    Revolver ()
    {
        bala  = (int) (Math.random()*6)+1;
        posicionActual = 0;
    }

    //Devuelve true si la bala coincide con la posicion del tambor
    public boolean disparar()
    {
        boolean coincide = false;
        if (bala == posicionActual)
        {   
            coincide = true;
        }
        return coincide;
    }

    public void siguienteBala()
    {
        if (posicionActual > 0 && posicionActual <7 )
        {
            posicionActual++;
        }
        else
        {
            posicionActual =0;
        }
    }

    public String toString()
    {
        String estado;
        estado = "La posicion actual es: "+ posicionActual+ " La bala esta: "+bala;
        return estado;
    }
}
class Jugador
{
    private int id=-1;
    private String nombre;
    private boolean vivo;
    

    Jugador()
    {
        id = id +1;
        this.nombre = "Jugador "+id;
        
        vivo = true;
    }

    //GETTERS & SETTERS 
    public boolean getVivo()
    {
        return vivo;
    }
    public void setVivo(boolean vivo)
    {
        this.vivo = vivo;
    }
    public boolean disparar( Revolver r)
    {
        if (r.disparar()== true)
        {
            vivo = false;
        }
        return vivo;
    }
}
class Juego
{
    private Jugador[] jugadores;
    private Revolver revolver;
    private int numJugadores;
    Juego()
    {
        numJugadores = 6;
        jugadores = new Jugador[numJugadores];

    }
    Juego (int numJugadores) 
    {
        if ( numJugadores > 0 && numJugadores <7)
        {
            this.numJugadores = numJugadores;
        }
        else
        {
            numJugadores = 6;
        }
    }
    Jugador[] insertar(Jugador elem)
    {
        jugadores = Arrays.copyOf(jugadores, jugadores.length+1);
        jugadores[jugadores.length-1] = elem;

        return jugadores;
    }
    public int getNumJugadores()
    {
        return numJugadores;
    }
    public boolean finJuego()
    {
        boolean terminado = false;
        
        for (int i =0;i <=jugadores.length;i++)
        {
            if(jugadores[i].disparar(revolver)== false)
            {
                terminado = true;
            }
        }
        return terminado;
    }

    public void ronda()
    {
        
            for (int i =0;i <=jugadores.length;i++)
            {
                do{
                    if(jugadores[i].disparar(revolver) == true)
                    {
                        jugadores[i].setVivo(false);
                        System.out.println("El jugador ha muerto");
                    } 
                    else
                    {
                        System.out.println("Siguiente Jugador");
                    }
                }while (jugadores[i].getVivo() == true);
            }
       
        
    }
}
public class Main 
{
    public static void main(String[]args) 
    {
      
       
       
        
    }
    
}