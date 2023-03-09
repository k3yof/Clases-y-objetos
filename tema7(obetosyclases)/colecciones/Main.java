import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
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
        int resultado=0;

            if (nombre.compareTo(otro.nombre) < 0)
            {
                resultado = -2;
            }else if (nombre.compareTo(otro.nombre) > 0)
            {
                resultado = 5;
            }else if (nombre.compareTo(otro.nombre) == 0)
            {
                resultado = 0;
            }

        return resultado;
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
    Cliente b = new Cliente("2223","Ana","27/10/2004");
    Cliente c = new Cliente("2223","Salva","27/10/2004");
    Cliente d = new Cliente("2223","Victor","27/10/2004");
    Cliente f = new Cliente("2223","Ana","27/10/2004");
    coleccionClie.add(a);
    coleccionClie.add(b);
    coleccionClie.add(c);
    coleccionClie.add(d);
    coleccionClie.add(f);

    Cliente menor=a;
    Iterator<Cliente> it = coleccionClie.iterator();
    if (it.hasNext())
    {
        menor = it.next();
    }
   
    for(;it.hasNext();)
    {
        Cliente p = it.next();
        if(p.compareTo(menor)<0)
        {
            menor=p;
        }

        
    }
    System.out.println(menor);
    sc.close();
    }
}