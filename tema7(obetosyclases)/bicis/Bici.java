import java.util.Arrays;
import java.util.Scanner;

class Carrera
{
    private Atleta atleta;
    private int distancia;
    private Atleta [] participantes;

    Carrera()
    {

    }
    Carrera(Atleta [] participantes,Atleta ganador)
    {
        participantes = new Atleta [] (participantes);
    }

    public String getGanadorNombre(Atleta ganador)
    {
        String nombreGanador;
        nombreGanador=ganador.getNom();

        return nombreGanador;
    }
    public String informacionAtleta(Atleta a)
    {
        String inf;

        inf = a.getNom()+"  "+a.getNum()+"  "+a.getNac()+"   "+a.getTie();

        return inf;

    }
    
}

class Atleta
{
    private String nombre;
    private int numero;
    private String nacionalidad;
    private double tiempo;

    Atleta(String nom,int num,String nac,double tie)
    {
        this.nombre = nom;
        this.numero = num;
        this.nacionalidad = nac;
        this.tiempo = tie;
    }
    
    public String getNom()
    {
        return nombre;
    }
    public int getNum()
    {
        return numero;
    }
    public String getNac()
    {
        return nacionalidad;
    }
    public double getTie()
    {
        return tiempo;
    }
}
class Bici
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);

    Atleta a;
    Atleta b;

    a = new Atleta("Paquillo", 0, "Español", 10);
    b = new Atleta("Pepito", 1, "Español", 100);

    if (a.getTie()<b.getTie())
    {
        System.out.println(a.getNom()+" con un tiempo de "+a.getTie());
    }
    else
    {
        System.out.println(b.getNom()+" con un tiempo de "+b.getTie());
    }
    
    Carrera c;
    c = new Carrera();
    System.out.println(c.informacionAtleta(a));

    }
}