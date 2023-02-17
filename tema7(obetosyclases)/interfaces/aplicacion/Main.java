import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

interface Sonido
{
    int version =1;
    void voz();
}
class Futbolista implements Comparable
{
    String nombre;
    int edad;
    String dni;
    int numGoles;
    LocalDate fechaNacimiento;
    Futbolista()
    {
        nombre ="Manu";
        edad = 18;
        dni = "12345687g";
        numGoles = 100;
    }
    Futbolista(String dni,int numGoles ,String nombre,int edad,String fechaNacimiento)
    {
        this.dni =dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
        //Para la fecha de nacimiento
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }
    //GETTERS & SETTERS
    String getDni()
    {
        return dni;
    }

    int getFechaNacimiento()
    {
        return (int) fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
    }




    public int compareTo(Object ob)
    {
        int resultado=0;
        Futbolista otro = (Futbolista) ob;

            if (dni.compareTo(otro.dni) < -1)
            {
                resultado = -2;
            }else if (dni.compareTo(otro.dni) > -1)
            {
                resultado = 5;
            }else if (dni.compareTo(otro.dni) == -1)
            {
                resultado = 0;
            }

        return resultado;
    }
    public String toString()
    {
        return "Dni: "+ dni + " Nombre: "+nombre + " Edad: "+edad+ " Numero de Goles: "+numGoles+" Fecha Nacimiento: "+fechaNacimiento+"\n";
    }
}
 
class ComparaEdad implements Comparator
{
    public int compare(Object ob1,Object ob2)
    {
        int dif =((Futbolista)ob1).edad -((Futbolista)ob2).edad ;
        ComparaNombres f= new ComparaNombres();

        if  ( dif ==0 )
        {
            return f.compare(ob1, ob2);
        }
        else
        {
            return dif;
        }
    }
}
class ComparaFechaNacimiento implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        return ((Futbolista)ob1).fechaNacimiento.compareTo(((Futbolista)ob2).fechaNacimiento);
    }
}



class ComparaNombres implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        return ((Futbolista)ob1).nombre.compareTo(((Futbolista)ob2).nombre);
    }
}

public class Main 
{
    public static void main(String[]args) 
    {
      
       
        Futbolista [] futbolistas = new Futbolista[]
       {
        new Futbolista("12354896g",2,"Paquillo",17,"22-03-1921"),
        new Futbolista("54852619h",2,"Manu",18,"27-10-2004"),
        new Futbolista("97842635d",2,"Salva",11,"22-03-2022"),
        new Futbolista("42359587j",2,"Ismael",22,"22-03-1999"),
        new Futbolista("63968124e",2,"Isabel",33,"22-03-1975")
       };
       int resul = futbolistas[0].compareTo(futbolistas[2]);
       System.out.println(resul);
       System.out.println();
       System.out.println();

       Arrays.sort(futbolistas);
       System.out.println(Arrays.deepToString(futbolistas));
       System.out.println();
     

        ComparaEdad k = new ComparaEdad();
        ComparaNombres f= new ComparaNombres();
        Comparator z= f.reversed();
        Arrays.sort(futbolistas,k);
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();
     

        Arrays.sort(futbolistas,f);
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();

        ComparaFechaNacimiento v = new ComparaFechaNacimiento();
        Arrays.sort(futbolistas,v);
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();

        Arrays.sort(futbolistas,z);
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();
      


        
    }
    
}
