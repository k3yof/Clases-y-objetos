import java.util.Arrays;

import javax.management.AttributeValueExp;

class Atleta
{
    String nombre;
    int numero;
    String nacionalidad;
    Double tiempo;

    //Constructor por defecto
    Atleta()
    {
        nombre="";
        numero=0;
        nacionalidad="";
        tiempo=0.0;
    }
    //Constructor Personalizado
    Atleta(String nombre, int numero, String nacionalidad,Double tiempo)
    {
        this.nombre=nombre;
        this.numero=numero;
        this.nacionalidad=nacionalidad;
        this.tiempo=tiempo;
    }

    //GETTERS Y SETTERS

    //Devuelve el nombre
    public String getNombre() 
    {
        return nombre;
    }
    //Devuelve la nacionalidad
    public String getNacionalidad() 
    {
        return nacionalidad;
    }
    //Devuelve el numero de la camiseta del participante
    public int getNumero() 
    {
        return numero;
    }
    //Devuelve el tiempo que hace el participante
    public Double getTiempo() 
    {
        return tiempo;
    }

    //Establece un nuevo nombre
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    //Establece la nacionalidad
    public void setNacionalidad(String nacionalidad) 
    {
        this.nacionalidad = nacionalidad;
    }
    //Establece el numero de la camiseta del participante
    public void setNumero(int numero) 
    {
       this.numero= numero;
    }
    //Establece el tiempo que hace el participante
    public void setTiempo(double tiempo) 
    {
       this.tiempo = tiempo;
    }



    

}

class Carrera
{
    Atleta participantes[]= new Atleta[0];

    Atleta[] insertar(Atleta elem)
    {
        participantes = Arrays.copyOf(participantes, participantes.length+1);
        participantes[participantes.length-1] = elem;

        return participantes;
    }

    String ganador()
    {
        Atleta ganador;
       
        ganador=participantes[0];
      

        for(int i=1;i<participantes.length;i++)
        {
            if(participantes[i].getTiempo()<ganador.getTiempo())
            {
                ganador=participantes[i];
            }

        }
        return ganador.getNombre();
    }




    

}

public class Velocidad 
{
    public static void main(String[]args) 
    {

        Atleta manu = new Atleta("Manu",14, "Español", 17.2);
        Atleta maria= new Atleta("Maria",11,"Brasileño",30.0);
        Atleta salva= new Atleta("Salva",2,"Costa Rica",20.3);
        Atleta alberto= new Atleta("Alberto",33,"Portugues",22.09);
        Carrera sanSilvestre = new Carrera();
        sanSilvestre.insertar(maria);
        sanSilvestre.insertar(manu);
        sanSilvestre.insertar(salva);
        sanSilvestre.insertar(alberto);

        

        sanSilvestre.ganador();
        System.out.println(sanSilvestre.ganador());
    
        
    }
    
}
