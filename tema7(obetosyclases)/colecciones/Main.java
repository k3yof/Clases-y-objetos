import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
class Cliente implements Comparable<Cliente>
{
    String dni;
    String nombre;
    LocalDate fechaNacimiento;
    Cliente(String dni,String nombre,String fechaNacimiento)
    {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,formatoFechas);
    }
    int edad()
    {
        return (int) fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
    }
    @Override
    public boolean equals(Object ob)
    {
        return dni.equals(((Cliente) ob).dni);
    }
    @Override
    public int compareTo(Cliente otro)
    {
        return dni.compareTo(otro.dni);
    }
    @Override
    public String toString()
    {
        return "DNI: "+ dni + " Nombre: "+nombre+ " Edad: "+edad()+"\n";
    }
}

class Main
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
   
    List<Cliente> listaClientes = new ArrayList<>();
    Collection <Cliente> coleccionClie = listaClientes;
    Cliente a = new Cliente("2223","Manu","27/10/2004");
    coleccionClie.add(a);

    System.out.println( coleccionClie.size());
    System.out.println(coleccionClie.toString());
    coleccionClie.remove(a);
    System.out.println( coleccionClie.size());
    System.out.println(coleccionClie.toString());

    sc.close();
    }
}