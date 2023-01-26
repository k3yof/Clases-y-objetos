import java.util.Arrays;
import java.util.Scanner;

class calendar
{
    private int [] fecha;

    calendar(int año,int mes ,int dia)
    //creamos un calendario
    {
        fecha = new int [3];
        if (fecha[2]<=31 && fecha [2]>=1)
        {
            fecha[2] = dia;
        }
        else
        {
            fecha[2] = 1;
        }
        if (fecha[1]<=12 && fecha [1]>=1)
        {
            fecha[1] = mes;
        }
        else
        {
            fecha[1] = 1;
        }
        if (fecha[0]>=0)
        {
            fecha[0] = año;
        }
        else
        {
            fecha[0] = 1;
        }
       
    }
    public int getDia()
    {
        return fecha[2];
    }
    public int getMes()
    {
        return fecha[1];
    }
    public int getAño()
    {
        return fecha[0];
    }
    void incrementarDia()
    {
        if (fecha[2]<32)
        {
            fecha[2] = fecha[2]+1;
        }
        else
        {
            fecha[2] = 1;
            incrementarMes();
        }
       
    }
    void incrementarMes()
    {
        if (fecha[1]<13)
        {
            fecha[1] = fecha[1]+1;
        }
        else
        {
            fecha[1]=1;
            incrementarAño();
        }
       
    }
    void incrementarAño()
    {
        fecha[0] = fecha[0]+1;
    }

    void incrementarAño(int cantidad)
    {
        fecha[0] = fecha[0]+1;
    }
    public void mostrar()
    {
        System.out.println(Arrays.toString(fecha));
    }
    boolean iguales(calendar otrafecha)
    {
        boolean igual=false;

        if (fecha[0] == otrafecha.getAño() && fecha[1] == otrafecha.getMes() && fecha[2] == otrafecha.getDia())
        {
            igual= true;
        }
        return igual;
    }

}

class cesar
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    } 
}