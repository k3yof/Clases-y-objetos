import java.util.Scanner;

abstract class Pokemom
{
    protected String nombre;
    protected String entrenador;
    protected int experiencia =0;
    protected int salud;
    

    abstract void mostrar();
}
class Pichu extends Pokemom
{
        Pichu( String nombre, String entrenador)
        {
            this.nombre = nombre;
            this.entrenador= entrenador;
            this.salud = 50;
        }
        public void mostrar()
        {
            System.out.println("----------------------");
            System.out.println(" Nombre: "+nombre+"   ");
            System.out.println(" Entrenador: "+this.entrenador+"   ");
            System.out.println(" Experiencia: "+experiencia+"    ");
            System.out.println(" Salud: "+this.salud+"          ");
            System.out.println("----------------------");
        }
        public int ataqueRapido()
        {
            int dañoJugada=0;
            int d = (int) (Math.random()*10)+1;
            if (d<=5)
            {
                dañoJugada = 10;
               
            }
            else
            {
                dañoJugada=20;
                
            }
            return dañoJugada;
        }

        
        public int bolaRayo()
        {
            int dañoJugada=0;
            int d = (int)(Math.random()*(20-10+1)+10);
            dañoJugada = d;
            return dañoJugada;
        }

        public int getExp()
        {
            return experiencia;
        }
        public void subirExp(int valor)
        {
         
                this.experiencia = this.experiencia+valor;
                System.out.println("Exp: "+this.experiencia);
        }
        
        
}

class Pikachu extends Pichu
{
        Pikachu( String nombre, String entrenador,int experiencia)
        {
           super(nombre, entrenador);
           this.experiencia= super.experiencia;
           
        }
        public int ataqueRapido()
        {
            int dañoJugada=0;
            int d = (int) (Math.random()*10)+1;
            if (d<=5)
            {
                dañoJugada = 15;
            }
            else
            {
                dañoJugada=25;      
            }
            return dañoJugada;
        }

       
        public int bolaVoltio()
        {
            int dañoJugada=0;
            int d = (int)(Math.random()*(50-10+1)+10);
            dañoJugada = d;
           return dañoJugada;
        }

        
       
       
}
   
class Raichu extends Pikachu
{
        Raichu( String nombre, String entrenador,int experiencia)
        {
            super(nombre, entrenador, experiencia);
            this.experiencia= super.experiencia;
        }
        public int ataqueRapido()
        {
            int dañoJugada=0;
            int d = (int) (Math.random()*10)+1;
            if (d<=5)
            {
                dañoJugada = 30;
                
            }
            else
            {
                dañoJugada=40;
            }
            return dañoJugada;
        }

     
        public int estallidoTrueno()
        {
            int dañoJugada=0;
            int d = (int)(Math.random()*(90-10+1)+10);
            dañoJugada = d;
         

            return dañoJugada;
        }

        
}

    

public class Pokemon
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int resp;
        int ataque;
       
       int dañoProducido=0;
       Pichu a = new Pichu("Pichu", "manu");

       

       a.mostrar();
    

       boolean salir= false;
     
       do
       {
        System.out.println("Que ataque quieres usar:");
        System.out.println("1) Ataque rapido 2)bolaRayo 3)Salir");
        resp = sc.nextInt();
        switch (resp)
        {    
            case 1 ->
            {
                if (dañoProducido >=100)
                {
                    a.subirExp(15);
                    dañoProducido=0;
                    //salir=true;
                    if (a.getExp() >= 50)
                    {
                        System.out.println("Ha Mejorado!!!!");
                        salir = true;
                    } 
                }
                else
                {
                    ataque = a.ataqueRapido();
                    System.out.println("Ataque rapido ha hecho : "+ataque);
                    dañoProducido = dañoProducido + ataque;
                    System.out.println("Daño : "+dañoProducido);
                    
                }
            }
            case 2->
            {
                
                    if (dañoProducido >=100)
                    {
                        a.subirExp(15);
                        dañoProducido =0;
                        if (a.getExp() >= 50)
                        {
                            System.out.println("Ha Mejorado!!!!");
                            salir = true;
                        }  
                    }
                    else
                    {
                    
                            ataque = a.bolaRayo();
                    
                        
                        System.out.println("Bola rayo ha hecho : "+ ataque);
                        dañoProducido = dañoProducido + ataque;
                        System.out.println("Daño : "+dañoProducido);
                        
                        
                    
                    
                    }

                
                }
                case 3->
                {
                    break;
                }
                
            
            default -> 
            {
                System.out.println("Opcion incorrecta");
            }

        }
       // System.out.println(a.getExp());
        
       }while (salir==false );


       salir = false;
       Pikachu z = new Pikachu("Pikachu", "Manu",1);
       a=z;
       a.mostrar();
       do
       {
        System.out.println("Que ataque quieres usar:");
        System.out.println("1) Ataque rapido 2)bolaVoltio 3)Salir");
        resp = sc.nextInt();
        switch (resp)
        {    
            case 1 ->
            {
                if (dañoProducido >=100)
                {
                    a.subirExp(15);
                    dañoProducido =0;  
                    if (a.getExp() >= 100)
                    {
                        System.out.println("Ha Mejorado!!!!");
                        salir = true;
                    } 
                }
                else
                {
                    ataque = a.ataqueRapido();
                    System.out.println("Ataque rapido ha hecho : "+ataque);
                    dañoProducido = dañoProducido + ataque;
                    System.out.println("Daño : "+dañoProducido);
                  
                }
            }
            case 2->
            {
                
                    if (dañoProducido >=100)
                    {
                        a.subirExp(15);
                        dañoProducido =0;
                        if (a.getExp() >= 100)
                        {
                            System.out.println("Ha Mejorado!!!!");
                            salir = true;
                        }  
                    }
                    else
                    {
                    
                           // ataque = a.bolaVoltio();
                    
                    /*     
                        System.out.println("Bola voltio ha hecho : "+ ataque);
                        dañoProducido = dañoProducido + ataque;
                        System.out.println("Daño : "+dañoProducido); */
                        
                        
                    
                    
                    }

                
                }
                
                case 3->
                {
                    break;
                }
                
            
            default -> 
            {
                System.out.println("Opcion incorrecta");
            }

        }
       }while (salir==false);

       salir = false;
        Raichu ak = new Raichu("Raichu", "Salva",5);

        a = ak;
        a.mostrar();
       do
       {
        System.out.println("Que ataque quieres usar:");
        System.out.println("1) Ataque rapido 2)EstallidoTrueno 3)Salir");
        resp = sc.nextInt();
        switch (resp)
        {    
            case 1 ->
            {
                if (dañoProducido >=100)
                {
                    a.subirExp(15);
                    dañoProducido =0;
                    
                }
                else
                {
                    ataque = a.ataqueRapido();
                    System.out.println("Ataque rapido ha hecho : "+ataque);
                    dañoProducido = dañoProducido + ataque;
                    System.out.println("Daño : "+dañoProducido);
                    
                }
            }
            case 2->
            {
                
                    if (dañoProducido >=100)
                    {
                        a.subirExp(15);
                        dañoProducido =0;
                    
                    }
                    else
                    {
                    
                           // ataque = a.estallidoTrueno();
                    
                        
                        /* System.out.println("Bola rayo ha hecho : "+ ataque);
                        dañoProducido = dañoProducido + ataque;
                        System.out.println("Daño : "+dañoProducido);
                         */
                        
                    
                    }

                
                }
                
                
            
            default -> 
            {
                System.out.println("Opcion incorrecta");
            }

        }
       }while (resp!=3);
       
        
     
   
  
       
    }
     
}