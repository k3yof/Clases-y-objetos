import java.util.Arrays;

interface Sonido
{
    int version =1;
    void voz();
}
class Perro implements Sonido
{
    Perro()
    {

    }
    public void voz()
    {
        System.out.println("Guau");
    }
}
class Gato implements Sonido
{

    Gato()
    {

    }
    public void voz()
    {
        System.out.println("Miau");
    }
}

public class Main 
{
    public static void main(String[]args) 
    {
       Gato a = new Gato();
        a.voz();
        Perro b = new Perro();
        b.voz();
        System.out.println(b.version);
       
    
        
    }
    
}
