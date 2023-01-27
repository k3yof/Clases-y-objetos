import java.util.Arrays;
import java.util.Scanner;

class Conjuntos
{

    private int [] conjunto;
    Conjuntos()
    {
        conjunto = new int [0];
    }
    
    public int getNumeroElementos()
    {
        return conjunto.length;
    }

   


    //Metodo para saber si un elemento ya esta en el conjunto ya que no puede haber repetidos
    private boolean esta()
    {
        boolean encontrado = false;


        return encontrado;
    }
    //Insertamos el 
    public boolean insertar(Integer nuevo)
    {
        boolean insertado= false;
        if (nuevo = =)
        {
            conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
            System.arraycopy(conjunto, 0, conjunto, 1, conjunto.length - 1);
            conjunto[0] = nuevo;
            insertado = true;

        }

        return insertado;
         
    }
    //Insertar los elementos del otroconjunto
    public boolean insertar(Conjuntos otroconjunto)
    {

    }
    //Si pertenece al conjunto que tenemos se elimina el argumento 
    public boolean eliminarElemento(Integer elemento)
    {

    }
    //Eliminar un conjunto 
    public boolean eliminarConjunto(Conjuntos otroconjunto)
    {

    }
    //Indica si el elemento que le has pasado por el argumento esta ya en el conjunto o no
    public boolean pertenece(Integer elemento)
    {

    }
    public void muestra()
    {
        System.out.println("Conjunto: " + Arrays.toString(conjunto));
    }

}

class conjunto
{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    } 
}