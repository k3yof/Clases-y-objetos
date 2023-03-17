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
   
    
    int i=0;
        String nombre;
        double altura;
        Map<String, Double> m = new HashMap<>();
        Scanner sn = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("1.Introducir datos: ");
        i=sn.nextInt();
        switch(i) {
            case 1:
            System.out.println("Introduce Nombre: ");
            nombre = sa.nextLine();
            System.out.println("Introduce Altura; ");
            altura = sn.nextDouble();

                m.put(nombre, altura);

                System.out.println(m);
              break;
            default:
              System.out.println("Introduce Datos");
          }
        
   


   

    }
}