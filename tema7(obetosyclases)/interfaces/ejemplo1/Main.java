import java.util.*;

interface Sonido
{
    int version =1;
    void voz();
}
class Perezoso implements Comparable
{
    int id ;
    String nombre;
    int edad;
    Perezoso(int id ,String nombre,int edad)
    {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    public int compareTo(Object ob)
    {
        int resultado=0;
        Perezoso otro = (Perezoso) ob;

            if (id < otro.id)
            {
                resultado = -5;
            }else if (id > otro.id)
            {
                resultado = 5;
            }else if (id == otro.id)
            {
                resultado = 0;
            }

        return resultado;
    }
    public String toString()
    {
        return "Id: "+ id + " Nombre: "+nombre;
    }
}
class ComparaId implements Comparator
{
    public int compare(Object ob1,Object ob2)
    {
        return((Perezoso)ob1).id -((Perezoso)ob2).id ;
    }
}

class ComparaNombres implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        return ((Perezoso)ob1).nombre.compareTo(((Perezoso)ob2).nombre);
    }
}
class ComparaEdad implements Comparator
{
    public int compare(Object ob1,Object ob2)
    {
        return((Perezoso)ob1).edad -((Perezoso)ob2).edad ;
    }
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
       
       Perezoso [] h = new Perezoso[]
       {
        new Perezoso(2, "manu",12),
        new Perezoso(3, "salva",5)
       };
       int resul = h[1].compareTo(h[0]);
       System.out.println(resul);

       Arrays.sort(h);
       System.out.println(Arrays.deepToString(h));
    

       ComparaId k = new ComparaId();
       ComparaNombres f= new ComparaNombres();
       Arrays.sort(h,k);
       System.out.println(Arrays.deepToString(h));
       Arrays.sort(h,f);
       System.out.println(Arrays.deepToString(h));


        
    }
    
}
