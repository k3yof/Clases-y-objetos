import java.util.Arrays;

import javax.management.AttributeValueExp;

class Atletas
{
    String nombre;
    int numero;
    String nacionalidad;
    Double tiempo;

    Atletas()
    {
        nombre="";
        numero=0;
        nacionalidad="";
        tiempo=0.0;
    }

    Atletas(String nombre, int numero, String nacionalidad,Double tiempo)
    {
        this.nombre=nombre;
        this.numero=numero;
        this.nacionalidad=nacionalidad;
        this.tiempo=tiempo;
    }

    //GETTERS Y SETTERS

    public String getNombre() 
    {
        return nombre;
    }
    
    public String getNacionalidad() 
    {
        return nacionalidad;
    }

    public int getNumero() 
    {
        return numero;
    }

    public Double getTiempo() 
    {
        return tiempo;
    }
    

}

class Carrera
{
    Atletas totales[]= new Atletas[0];

    Atletas[] insertar(Atletas elem)
    {
        totales = Arrays.copyOf(totales, totales.length+1);
        totales[totales.length-1] = elem;

        return totales;
    }

    String ganador()
    {
        Atletas winner;
        if(totales[0].getTiempo()<totales[1].getTiempo())
        {
            winner=totales[0];
        }
        else
        {
            winner=totales[1];
        }

        for(int i=0;i<totales.length;i++)
        {
            if(totales[i].getTiempo()<winner.getTiempo())
            {
                winner=totales[i];
            }

        }
        return winner.getNombre();
    }




    

}

public class deporte 
{
    public static void main(String[]args) 
    {

        Atletas pepe = new Atletas("Pepe",14, "Español", 24.43);
        Atletas rodrigo= new Atletas("Rodrigo",24,"Brasileño",24.01);
        Atletas alfonso= new Atletas("Alfonso",24,"Brasileño",25.01);
        Atletas jose= new Atletas("Jose",24,"Brasileño",22.01);
        Carrera sanSilvestre = new Carrera();
        sanSilvestre.insertar(rodrigo);
        sanSilvestre.insertar(pepe);
        sanSilvestre.insertar(alfonso);
        sanSilvestre.insertar(jose);

        

        sanSilvestre.ganador();
        System.out.println(sanSilvestre.ganador());
    
        
    }
    
}
