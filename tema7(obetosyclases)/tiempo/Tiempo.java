import java.util.Arrays;
import java.util.Scanner;

class Hora
{
    protected int hora;
    protected int minutos;
    //Hay que hacer una clase que tenga hora y minutos
    //Hora(0-23)
    //Minutos(0-60)
    Hora(int hora,int minutos)
    {
        if (hora<24 && hora >=0)
        {
            this.hora = hora;
        }
        else
            this.hora= 0;
        
        if(minutos < 60 && minutos >=0)
        {
            this.minutos = minutos;
        }
        else
            this.minutos = 0;
    }
    //Incrementa 1 minuto
    public void incrementarMinuto()
    {
        //Si se pasa de 60 minutos,sumamos 1 hora y ponemos los minutos en 0
        if (this.minutos ==60)
        {
            this.minutos = 0;
            if (this.hora == 23)
            {
                this.hora =0;
            }
            else
            {
                this.hora= this.hora+1;
            }
        }
        else
            this.minutos = this.minutos +1;
    }
    //Ahora los minutos seran el parametro que se le pasa
    //0-60
    public boolean setMinutos(int valor)
    {
        boolean cambio = false;
        if (valor<60 && valor>=0)
        {
            this.minutos = valor;
            cambio = true;
        }
        return cambio;

    }
    //Ahora las horas seran el valor que se le pasa por parametro
    //0-23
    public boolean setHora(int valor)
    {
        boolean cambio = false;
        if (valor<24 && valor>=0)
        {
            this.hora = valor;
            cambio = true;
        }
        return cambio;
    }
    //Devuelve la hora en formato bonito
    public String horaBonita()
    {
        String horaBonita;
        horaBonita = "H:"+this.hora+"  M:"+this.minutos;
        return horaBonita;
    }

}
class HoraExacta extends Hora
{
    private int segundos;
    HoraExacta(int hora,int minutos,int segundos)
    {
        super(hora, minutos);
        if(segundos < 60 && segundos >=0)
        {
            this.segundos = segundos;
        }
        else
            this.segundos = 0;

    }
    public boolean setSegundos(int valor)
    {
        boolean cambio = false;
        if (valor<60 && valor>=0)
        {
            this.segundos = valor;
            cambio = true;
        }
        return cambio;
    }
    public void incrementarSegundo()
    {
        //Si se pasa de 60 segundos,sumamos 1 minuto y si se pasa de 60 minutos sumamos 1 hora y ponemos los segundos en 0
        if (this.segundos ==60)
        {
            this.segundos=0;
            super.incrementarMinuto();
        }
        else
            this.segundos = this.segundos +1;
    }
    public boolean Equals(Object otro)
    {

        HoraExacta alguien = (HoraExacta) otro;
        boolean iguales=false;
        if ( this.hora==alguien.hora  && this.minutos == alguien.minutos&& this.segundos == alguien.segundos)
        {
            iguales=true;
        }

        return iguales; 
       
    }
}

public class Tiempo
{

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);       
  

    }
     
}