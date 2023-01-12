import java.util.Arrays;
import java.util.Scanner;

class Semaforo1
{
    byte estado;//Si el numero es 1(rojo),2(verde),3(amarillo)
    boolean blink = false;
    int tiempo = 0;//Sera un contador que empezara en 0 y depende del color ira hasta un numero o otro
    boolean on = false;//Veremos si el semaforo esta encendido o apagado

    //Comportamiento

    void estado1()
    {
        if (estado==1)//ROJO
        {
            System.out.println("Rojo");
            
        
        }
        else if (estado==2)//VERDE
        {
            System.out.println("Verde");
          
        }
        else if (estado==3)
        {
            System.out.println("AmarilloParpadeando");
        }
        else if (estado==4)//AMARILLO
        {
            System.out.println("Amarillo");
            estado=0;
        
        }
    }

    void encender()
    {
        on = true;
        System.out.println("Ahora el semaforo esta encendido");
    }
    void apagar()
    {
        on = false;
        System.out.println("Ahora el semaforo esta apagado");
    }
}

public class semaforo 
{


    public static void main(String[] args) 
    {
       

            Scanner sc = new Scanner(System.in);

            //Creacion de variables
            Semaforo1 ajustes;
            ajustes = new Semaforo1();
            int esEncendido;
            int esEstado;


            System.out.println("Hola bienvenido al semaforo de la cache arabial");
            System.out.println("El semaforo esta apagado,quieres encenderlo");
            System.out.println("Si(1) No (2)");
            esEncendido = sc.nextInt();
            switch (esEncendido)
            {
                case 1 -> 
                {
                    ajustes.encender();
                    esEstado=1;
                    //ajustes.estado1();
                    while(esEstado==1)
                    {
                    System.out.println("Quieres cambiar de estado: ");
                    System.out.println("Si(1) No (2)");
                    
                    esEstado = sc.nextInt();
                    System.out.println();
                    

                        switch (esEstado)
                        {
                            case 1 -> 
                            {
                                ajustes.estado++;
                                ajustes.estado1();
                                System.out.println();
                                System.out.println();
                                
                            }
                            case 2 ->
                            {
                                break;
                            }
                            default -> 
                            {
                                System.out.println("Opcion erronea");    
                                break;
                            }
                        }
                    }
                    
                }
                case 2 ->
                {
                    ajustes.apagar();
                }
                default -> 
                {
                    System.out.println("Opcion erronea");
                }
            }


            sc.close();
    }
    
    
}