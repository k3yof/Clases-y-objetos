import java.util.*;

class Main
{
    public static void main(String [] args)
    {
    
    
    //Crear un Mapa
    Map<String,Integer> mapa = new HashMap<>();

    

    mapa.put("Manu", 47);
    mapa.put("Salva", 5);
    mapa.put("d", 2);
    mapa.put("F", 1);
   
    

    boolean f = mapa.containsKey("d");
    System.out.println(mapa.get("Manu"));
    System.out.println("------");
    Iterator<Map.Entry<String,Integer>> it =  mapa.entrySet().iterator();
    for(;it.hasNext();)
    {
        Map.Entry entry = (Map.Entry) it.next();
        System.out.println("Clave: " + entry.getKey() + ", valor: " + entry.getValue());
      
    } 
   
       

        
        System.out.println("-------------------");
        System.out.println("Mostrar datos: ");
        //Forma favorita
        mapa.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v));  
        System.out.println("-------------------");  
        
   

        

   

    }
}