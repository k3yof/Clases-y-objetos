import java.util.Arrays;
import java.util.Scanner;

class Semaforo1
{
    byte estado;//Si el numero es 1(rojo),2(verde),3(amarillo)
    boolean blink = false;
    int tiempo = 0;//Sera un contador que empezara en 0 y depende del color ira hasta un numero o otro
    boolean on = false;//Veremos si el semaforo esta encendido o apagado
    byte tiempos[] = new byte[3];
    //Constructor
    Semaforo1()//Constructor por defecto
    {
        on=true;
        blink=false;
        estado=0;

        setTiempo((byte)0,(byte)200,(byte)6);
        /* tiempos[1]=99;
        tiempos[2]=25;
        tiempos[3]=99; */
    }
    Semaforo1(byte est,boolean blink,boolean on,byte tiempoRojo,byte tiempoNaranja,byte tiempoVerde)//Constructor por defecto
    {
        //O se usa el this o se cambia el nombre
        this.on=on;
        this.blink=blink;
        estado=est;

        tiempos[1]=tiempoRojo;
        tiempos[2]=tiempoNaranja;
        tiempos[3]=tiempoVerde;
    }
    //Comportamiento

    byte getEstado()
    {
        return estado;
    }
    boolean getBlink()
    {
        return blink;
    }
    boolean getOn()
    {
        return on;
    }
    int getTiempo()
    {
        return tiempo;
    }

    void setEncender()//Setter para on
    {
        on = true;
        estado=1;
        blink=false;
        //System.out.println("Ahora el semaforo esta encendido");
    }
    void setBlink(boolean nuevoValor)
    {
        if (on ==true)
        {
            blink=nuevoValor;
        
            if (blink==true)
            {
                estado =2;//Naranja
            }
            else
            {
                estado=0;//Rojo
            }
        }
        

    }
    void setTiempo(byte tiempoRojo,byte tiempoNaranja,byte tiempoVerde)
    {
        tiempos[0] = tiempoRojo;
        tiempos[1] = tiempoNaranja;
        tiempos[2] = tiempoVerde;

    }
    void changeEstado()
    {
        if (on==true)
        {
            if (blink ==true)
            {
                setBlink(false);
            }
            else
            {
                switch (estado)
                {
                    case 1 ->
                    {
                        estado=2;//rojo a verde
                    }
                    case 2 ->
                    {
                        estado=0;//naranja a rojo
                    }
                    case 3 ->
                    {
                        estado=1;//verde a naranja
                    }
                }
            }

        }
    }
    
    void setApagar()
    {
        on = false;
        System.out.println("Ahora el semaforo esta apagado");
    }
}

class Semaforo2
{
    byte estado;//Si el numero es 1(rojo),2(verde),3(amarillo)
    boolean blink = false;
    int tiempo = 0;//Sera un contador que empezara en 0 y depende del color ira hasta un numero o otro
    boolean on = false;//Veremos si el semaforo esta encendido o apagado
    byte tiempos[] = new byte[3];
    //Constructor
    Semaforo2()//Constructor por defecto
    {
        on=true;
        blink=false;
        estado=0;

        setTiempo((byte)0,(byte)200,(byte)6);
        /* tiempos[1]=99;
        tiempos[2]=25;
        tiempos[3]=99; */
    }
    Semaforo2(byte est,boolean blink,boolean on,byte tiempoRojo,byte tiempoNaranja,byte tiempoVerde)//Constructor por defecto
    {
        //O se usa el this o se cambia el nombre
        this.on=on;
        this.blink=blink;
        estado=est;

        tiempos[1]=tiempoRojo;
        tiempos[2]=tiempoNaranja;
        tiempos[3]=tiempoVerde;
    }
    //Comportamiento

    byte getEstado()
    {
        return estado;
    }
    boolean getBlink()
    {
        return blink;
    }
    boolean getOn()
    {
        return on;
    }
    int getTiempo()
    {
        return tiempo;
    }

    void setEncender()//Setter para on
    {
        on = true;
        estado=1;
        blink=false;
        //System.out.println("Ahora el semaforo esta encendido");
    }
    void setBlink(boolean nuevoValor)
    {
        if (on ==true)
        {
            blink=nuevoValor;
        
            if (blink==true)
            {
                estado =2;//Naranja
            }
            else
            {
                estado=0;//Rojo
            }
        }
        

    }
    void setTiempo(byte tiempoRojo,byte tiempoNaranja,byte tiempoVerde)
    {
        tiempos[0] = tiempoRojo;
        tiempos[1] = tiempoNaranja;
        tiempos[2] = tiempoVerde;

    }
    void changeEstado()
    {
        if (on==true)
        {
            if (blink ==true)
            {
                setBlink(false);
            }
            else
            {
                switch (estado)
                {
                    case 0 ->
                    {
                        estado=2;//rojo a verde
                    }
                    case 1 ->
                    {
                        estado=0;//naranja a rojo
                    }
                    case 2 ->
                    {
                        estado=1;//verde a naranja
                    }
                }
            }

        }
    }
    
    void setApagar()
    {
        on = false;
        System.out.println("Ahora el semaforo esta apagado");
    }
}

public class semaforoProfesor
{


    public static void main(String[] args) 
    {
       Semaforo1 s1;
       //s1 = new Semaforo1();

       //Constructoor por defecto
       s1 = new Semaforo1();
       //Constructor complejo
       //s1 = new Semaforo1((byte)0,true, false,(byte)0,(byte)200,(byte)6);
       s1.setEncender();
       if (s1.getOn() ==true)
       {
        System.out.println("Esta encendio");
       }
       else
       {
        System.out.println("Esta apagado");
       }


           
    }
    
    
}