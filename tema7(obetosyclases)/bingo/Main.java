import java.util.Arrays;
import java.util.Scanner;

class Bombo
{
    private int [] numeros;
    private int [] numsExtraidos = new int [100];
    Bombo()
    {
        numeros = new int [100];
        for(int i =1;i<numeros.length;i++)
        {
            numeros[i] =i;
        }
    }
    //GETTERS & SETTERS
    public int getLongitudNumeros()
    {
        return numeros.length;
    }
    //Metodo para ver si se ha llenado bien el bombo
    /* 
    public void mostrar()
    {
        for(int i =1;i<numeros.length;i++)
        {
            System.out.println(i+": "+numeros[i]);
        }
    } 
    */
    public static int buscar(int copiaNumeros[],int numeroBuscado)
    //busca un elemento en el array dado
    //si lo encuentra devuelve la posición del elemento
    //si no lo encuentra, devuelve -1
    {
      int resul=-1; //suponemos que no está
      int elemento;

        for(int j=0; j<copiaNumeros.length; j++)
        {
            elemento = copiaNumeros[j];

            if(numeroBuscado == elemento) //está!!!
            {
                resul = j;
                break; //no necesitamos comparar más
            }
        }
        return resul;
       
    }

    public int extraer()
    {
        //Hay que extraer una bola sin que este repetida
        int numAlea=0;
        int numExtraido =0;
        int i =0;
        
        //Sacamos un numero aleatorio
        numAlea = (int)(Math.random()*99+1);


        
            //numExtraido = this.numeros[numAlea];
            numsExtraidos[i] =numExtraido;
            //Si no esta repetida
            while(buscar(numsExtraidos, numExtraido) != -1)
            {
                if (buscar(numsExtraidos, numExtraido) != -1)
                {
                    numExtraido = this.numeros[numAlea];
                }
                else
                {
                    numAlea = (int)(Math.random()*99+1);
                }
            }

            
        
        
        return numExtraido;
        
    }
}
class Carton
{
    private Bombo a;
    private int [] carton;
    private boolean [] tachado;
    Carton()
    {
        a = new Bombo();
        carton = new int [15];
        tachado = new boolean [carton.length];
        for(int i =1;i<carton.length;i++)
        {
            //Rellenamos el carton
            carton[i] =a.extraer();
            tachado[i] = false;
        }
        
    }

    public static int buscar(int copiaNumeros[],int numeroBuscado)
    //busca un elemento en el array dado
    //si lo encuentra devuelve la posición del elemento
    //si no lo encuentra, devuelve -1
    {
      int resul=-1; //suponemos que no está
      int elemento;

        for(int j=0; j<copiaNumeros.length; j++)
        {
            elemento = copiaNumeros[j];

            if(numeroBuscado == elemento) //está!!!
            {
                resul = j;
                break; //no necesitamos comparar más
            }
        }
        return resul;
       
    }

    public boolean comprobar(int num)
    {
        boolean encontrado = false;

        //Si esta el numero nos devuelve un numero diferente a -1
        int a = buscar(carton, num);
        if(a != -1)
        {
            //Si esta llamamos a tachar y lo tachamos
            encontrado = true;
            tachar(a);
        }
        return encontrado;
    }
    private void tachar(int num)
    {
        
        //Hay que tachar el numero que sale
        //Tachamos el numero que ha salido
        tachado[num] = true; 

       
        
    }

    public boolean bingo()
    {
        boolean tengoBingo = true;
        //Consideramos que tenemos bingo cuando en la tabla tachado de nuestros numeros esta en true
      
        //Cuando uno sea false significa que no tenemos bingo
        for(int i =0;i<tachado.length;i++)
        {
            if(tachado[i]== false)
            {
    
                tengoBingo = false;
                
            }
        } 
        
        /* if(tachado[carton[0]]== true 
        &&tachado[carton[1]]== true 
        && tachado[carton[2]]== true 
        && tachado[carton[3]]== true 
        && tachado[carton[4]]== true 
        && tachado[carton[5]]== true 
        &&tachado[carton[6]]== true 
        && tachado[carton[7]]== true 
        &&tachado[carton[8]]== true 
        && tachado[carton[9]]== true 
        && tachado[carton[10]]== true 
        && tachado[carton[11]]== true 
        &&tachado[carton[12]]== true 
        &&tachado[carton[13]]== true 
        &&tachado[carton[14]]== true 
        
        )
        {
            System.out.println("Has ganado!!!!");
            tengoBingo = true;
        } 
         */
        
        return tengoBingo;
    }
}

class Main
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    Bombo feria = new Bombo();
    
   
    Carton [] cartones = new Carton[]
    {
        new Carton(),
        new Carton(),
        new Carton()
    };
    int num=0;
    boolean a;
    boolean b;
    boolean c;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    do
    {
        //Sacamos un numero del bombo
        num =feria.extraer();
        System.out.println("Ha salido el numero: "+num);
        //Comprobamos si esta el numero
        a = cartones[0].comprobar(num);
        b =cartones[1].comprobar(num);
        c = cartones[2].comprobar(num);

        d =cartones[0].bingo();
        if (d == true)
        {
            break;
        }
        e =cartones[0].bingo();
        if (e == true)
        {
            break;
        }
        f =cartones[0].bingo();
        if (f == true)
        {
            break;
        }
    }while (d == false || e == false|| f == false);
  

    } 
}