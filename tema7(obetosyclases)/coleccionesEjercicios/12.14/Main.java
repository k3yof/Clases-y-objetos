
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
class Registro
{
    LocalTime hora;
    double temperatura;
    Registro(double temperatura)
    {
        this.temperatura = temperatura;
        this.hora = LocalTime.now();
    }

    public String toString()
    {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "Registro: "+ " Hora" + hora.format(f)+ " Temperatura "+temperatura +"\n";
    }
}
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        //sn.useDelimiter("\n");
        boolean salir = false;
        int opcion=-1; //Guardaremos la opcion del usuario
 
        Set<Registro> temperaturas = new LinkedHashSet<>();
 
       
 
        while (!salir) {
 
            System.out.println("--------------------");
            System.out.println("--------------------");
            System.out.println("1. Añadir registro");
            System.out.println("2. Listar registro");
            System.out.println("3. Mostrar Estadistica");
            System.out.println("4. Salir");
            System.out.println("--------------------");
            System.out.println("--------------------");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1 ->
                    {
                        System.out.println("Introduce la temperatura");
                        double temperatura = sn.nextDouble();
                        useLocale(Locale.US).nextDouble();
                        temperaturas.add(new Registro(temperatura));
                    }
                    case 2 ->
                    {
                        System.out.println(temperaturas);
                    } 
                    case 3 ->
                    {

                    }
                    case 4 ->
                    {
                        salir = true;
                        sn.close();
                        break;
                    }
 
                    default->
                        System.out.println("numero no valido");
                }
 
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                System.out.println(opcion);
                sn.next();
            }
 
        }
 
    }

    private static Scanner useLocale(Locale us) {
        return null;
    }
 
}
