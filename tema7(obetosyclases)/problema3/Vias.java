import java.util.Arrays;


class Vagon
{
    private boolean []  ocupado;
    private boolean primera;
    private int asientosMaximos =40;
    private int [] asiento ;
    Vagon()
    {
        asiento = new int[asientosMaximos];
        ocupado = new boolean [asientosMaximos];
        for (int i=0;i<asientosMaximos;i++)
        {
            ocupado[i] = false;
        }   
        this.primera = false;
    }
    Vagon(boolean primera)
    {
        this(); 
        this. primera = primera;
    }

    //GETTERS & SETTERS


    public int getAsientosMaximos()
    {
        return asientosMaximos;
    }
    public boolean getPrimera()
    {
        return primera;
    }
    //Le pasamos un numero de asiento y nos dice si esta ocupado o no 
    public boolean getOcupado(int numAsiento)
    {
        return ocupado[numAsiento];
    }

    public void setPrimera(boolean primera)
    {
        this.primera = primera;
    }
    //Le pasamos un numero de asiento y nos dice si esta ocupado o no 
    public void setOcupado(int numAsiento,boolean estado)
    {
        ocupado[numAsiento] = estado;
    }

    public void rellenar()
    {
        int prob ;
        if (primera == true )
        {
            prob =1;
        }
        else
        {
           prob =4;
        } 

        for (int i=0;i<getAsientosMaximos();i++)
            {
                int n = (int) (Math.random()*10)+1;
                if (n <=prob )
                {   
                    ocupado[i] = true;
                }
                else
                {
                    ocupado[i] = false;
                }
            }  
    }

    

}

class Tren
{
    private String estPartida;
    private String estLlegada;
    private int precioPrimera;
    private int precioSegunda;
    private Vagon [] vagones;
    Tren()
    {
        this.estLlegada = "Baza";
        this.estPartida = "Granada";
        this.precioPrimera = 5;
        this.precioSegunda = 10;
    }
    Tren(String estPartida,String estLlegada,int precioPrimera,int precioSegunda)
    {
        this.estLlegada = estLlegada;
        this.estPartida = estPartida;
        this.precioPrimera = precioPrimera;
        this.precioSegunda = precioSegunda;
    }

    //GETTERS & SETTERS

    public String getEstPartida()
    {
        return estPartida;
    }

    public String getEstLlegada()
    {
        return estLlegada;
    }
    
    public int getPrecioPrimera()
    {
        return precioPrimera;
    }

    public int getPrecioSegunda()
    {
        return precioSegunda;
    }

    public void setEstPartida(String estPartida)
    {
        this.estPartida = estPartida;
    }

    public void setEstLlegada(String estLlegada)
    {
        this.estLlegada = estLlegada;
    }
    
    public void setPrecioPrimera(int precioPrimera)
    {
        this.precioPrimera = precioPrimera;
    }

    public void setPrecioSegunda(int precioSegunda)
    {
        this.precioSegunda = precioSegunda;
    }


    //Venta tickets

    public int recaudao(Vagon a)
    {
        int recaudao=0;
        for (int i=0;i<a.getAsientosMaximos();i++)
            {
                
                if (a.getPrimera()==true)
                {   
                    recaudao = recaudao +precioPrimera;
                }
                else
                {
                    recaudao = recaudao +precioSegunda;
                }
            }  
        return recaudao;
    }

    //Matriz de vagones
    //Insertar de vagones
    void insertar(Vagon elem)
    {
        vagones = Arrays.copyOf(vagones, vagones.length+1);
        vagones[vagones.length-1] = elem;

    }
    //funcion de rellenar todos los vagones con reutilizacion
    public void rellenar()
    {
        for (int i=0;i<vagones.length;i++)
        {
           
            vagones[i].rellenar();
            
        }  
       
    }



}

public class Vias 
{
    public static void main(String[]args) 
    {

       
    
        
    }
    
}
