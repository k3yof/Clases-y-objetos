import java.util.Arrays;
import java.util.Scanner;



class DadoAlea
{
    int caras;//El numero hasta qu llegara el dado por ejemplo si las caras son 6 habra hasta el numero 6
    int secuencia[];//Para ir guardando la secuencia del dado
    int resp[];
    int cont=0;
    

    //Constructor
    DadoAlea()//Constructor por defecto
    {
        caras = 6;
        secuencia = new int [cont];
        resp = new int [cont];
    }
    DadoAlea(int caras)//Constructor por defecto
    {
        if (caras < 2)
        {
            this.caras = 2;
            secuencia = new int [cont];
            resp = new int [cont];
        }
        else
        {
            this.caras = caras;
            secuencia = new int [cont];
            resp = new int [cont];
        }
        
    }
    //Comportamiento

    int getCont()
    {
        return cont;
    }

    int getCartas()
    {
        return caras;
    }

    int[] insertar(int resul[], int elem)
    //inserta un nuevo elemento en el array pasado como argumento
    //SIN respetar orden
    {
        resul = Arrays.copyOf(resul, resul.length+1);
        resul[resul.length-1] = elem;

        return resul;
    }  

    int tirar()
    {
        int num = (int) (Math.random()*caras+1);
        
       // secuencia = Arrays.copyOf(resp, num);
        secuencia=insertar(secuencia, num);
        cont++;
        return num;

    }

}
class DadoAlea1
{
    int caras;//El numero hasta qu llegara el dado por ejemplo si las caras son 6 habra hasta el numero 6
    int secuencia[];//Para ir guardando la secuencia del dado
    int resp[];
    int cont=0;
    //Constructor
    DadoAlea1()//Constructor por defecto
    {
        caras = 6;
        secuencia = new int [cont];
        resp = new int [cont];
    }
    DadoAlea1(int caras)//Constructor por defecto
    {
        if (caras < 2)
        {
            this.caras = 2;
            secuencia = new int [cont];
            resp = new int [cont];
        }
        else
        {
            this.caras = caras;
            secuencia = new int [cont];
            resp = new int [cont];
        }
        
    }
    //Comportamiento
    int getCont()
    {
        return cont;
    }
    int getCartas()
    {
        return caras;
    }

    int[] insertar(int resul[], int elem)
    //inserta un nuevo elemento en el array pasado como argumento
    //SIN respetar orden
    {
        resul = Arrays.copyOf(resul, resul.length+1);
        resul[resul.length-1] = elem;

        return resul;
    }  

    int tirar()
    {
        int num = (int) (Math.random()*caras+1);
        
        
        //secuencia = Arrays.copyOf(resp, num);
        secuencia=insertar(secuencia, num);
        cont++;
        return num;


    }

}

public class dado
{

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);       
       int caras=6;
       DadoAlea dado6caras;
       DadoAlea1 dado12caras;
       //s1 = new Semaforo1();

       //Constructoor por defecto
       dado6caras = new DadoAlea(caras);
       dado12caras = new DadoAlea1(caras);

       System.out.print("Cuantas caras quieres q tenga el dado: ");
       caras=sc.nextInt();

       System.out.println(dado6caras.tirar());
       dado6caras.cont++;
       System.out.println(dado12caras.tirar());
       dado12caras.cont++;
       System.out.println(dado12caras.tirar());
       dado12caras.cont++;
       System.out.println(dado12caras.tirar());
       dado12caras.cont++;
       System.out.println("--------------------------------");
       System.out.println(Arrays.toString(dado6caras.secuencia));
       System.out.println("--------------------------------");
       System.out.println(Arrays.toString(dado12caras.secuencia));
       sc.close();
       //crear un vector de dados
       //con un bucle hacer unos cuantos lanzamientos

       int [] vectorEntero;

       vectorEntero = new int [5];

       DadoAlea []vectorDados;
       vectorDados = new DadoAlea[5];//Reservamos memoria para referencias

       //dos de 6
       //1 de 12
       //2 de 400
       for(int i=0;i<2;i++)
       {
       vectorDados[i] = new DadoAlea(6) ;
       System.out.println(vectorDados[i].getCartas());
       }

       vectorDados[3] = new DadoAlea(12) ;
       System.out.println(vectorDados[3].getCartas());

       for(int i=3;i<5;i++)
       {
            vectorDados[i] = new DadoAlea(400) ;
            System.out.println(vectorDados[i].getCartas());
       }









    }
     
}