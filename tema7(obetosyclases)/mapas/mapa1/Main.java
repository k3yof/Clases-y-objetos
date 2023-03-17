import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Academico implements Comparable<Academico>
{
   
    private String nombre;
    private LocalDate anioIngreso;
    Academico(String nombre,String anioIngreso)
    {
        this.nombre = nombre;
        DateTimeFormatter formatoFechas=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.anioIngreso = LocalDate.parse(anioIngreso,formatoFechas);
    }
    int getIngreso()
    {
        return (int) anioIngreso.until(LocalDate.now(),ChronoUnit.YEARS);
    }

    @Override
    public String toString()
    {
        return "Nombre:"+nombre+" Año Ingreso:"+anioIngreso;
    }
    @Override
    public int compareTo(Academico otro)
    {
        return nombre.compareTo(otro.nombre);
    }
    
}
class Main
{
    static boolean nuevoAcademico(Map<Character,Academico> academia, Academico nuevo,Character letra)
    {
        boolean hecho = false;
        if ((letra >='A' && letra <='Z') || (letra >='a' && letra <='z') || letra == 'ñ' || letra == 'Ñ')
        {
            academia.put(letra, nuevo);
            hecho = true;
        }
        else
        {
            System.out.println("Letra no valida");
        }
        return hecho;
    }
    public static void main(String [] args)
    {
    
    Scanner sc = new Scanner(System.in);
    
    //Crear un Mapa
    Map<Character,Academico> academia = new TreeMap<>();
    for (int i =0;i< 5;i++)
    {
        System.out.println("Letra: ");
        Character letra = sc.next().charAt(0);
        System.out.println("Nombre: ");
        String nombre =  sc.next();
        System.out.println("Año ingreso");
        String añoIngreso = sc.next();
        nuevoAcademico(academia, new Academico(nombre, añoIngreso), letra);
    }
    
    System.out.println("Orden por letra: "+academia);
    //Creamos una collecion y le añadimos los Valores V del mapa academia
    Collection<Academico>  sinletra= academia.values();
    //Creamos una lista solo de los valores del mapa
    List<Academico> listaSinLetra = new ArrayList<>(sinletra);
    //Ordenamos los nombres de la lista
    Collections.sort(listaSinLetra);
    System.out.println("Por nombre sin letra:"+listaSinLetra);

    //Comparar por año de ingreso

    Comparator<Academico> comparaIngresos = new Comparator<>()
    {
        public int compare(Academico o1 ,Academico o2)
        {
            return o1.getIngreso() - o2.getIngreso();
        }
    };

    Collections.sort(listaSinLetra,comparaIngresos);
    System.out.println("Por año sin letra: "+listaSinLetra);
    Set<Map.Entry<Character,Academico>> conletra = academia.entrySet(); 


   
    

   


   

    }
}