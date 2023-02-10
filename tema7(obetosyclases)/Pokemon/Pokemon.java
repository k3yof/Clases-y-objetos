import java.util.*;

abstract class Pokemom
{
    protected String nombre;
    protected String entrenador;
    protected int experiencia;
    protected int salud;
    protected int dañoProducido=0;

    abstract void mostrar();
}
class Pichu extends Pokemom
{
        Pichu( String nombre, String entrenador,int experiencia,int salud)
        {
            this.nombre = nombre;
            this.entrenador= entrenador;
            this.experiencia = experiencia;
            this.salud = salud;
        }
        public void mostrar()
        {
            System.out.println("----------------------");
            System.out.println(" Nombre: "+nombre+"   ");
            System.out.println(" Entrenador: "+this.entrenador+"   ");
            System.out.println(" Experiencia: "+this.experiencia+"    ");
            System.out.println(" Salud: "+this.salud+"          ");
            System.out.println("----------------------");
        }
        public int ataqueRapido1()
        {
            int dañoJugada=0;
            int d = (int) (Math.random()*10)+1;
            if (d ==1 || d ==2 || d ==3 || d ==4 || d ==5)
            {
                dañoJugada = 10;
                dañoProducido = dañoProducido+10;
            }
            else
            {
                dañoJugada=20;
                dañoProducido = dañoProducido+20;
            }
            return dañoJugada;
        }

        public void ataqueRapido()
        {
            
            if (dañoProducido >=100)
            {
                this.subirExp();
            }
            else
            {
                System.out.println("Ataque rapido ha hecho : "+ataqueRapido1());
                System.out.println("Daño : "+this.dañoProducido);
                if (this.experiencia >= 50)
                {
                    System.out.println("Ha Mejorado!!!!");
                } 
            }
        }
        public int bolaRayo1()
        {
            int dañoJugada=0;
            int d = (int)(Math.random()*(20-10+1)+10);
            dañoJugada = d;
            this.dañoProducido = dañoProducido+d;

            return dañoJugada;
        }

        public void bolaRayo()
        {
            
            if (dañoProducido >=100)
            {
                this.subirExp();
            }
            else
            {
                System.out.println("Bola rayo ha hecho : "+ bolaRayo1());
                System.out.println("Daño : "+this.dañoProducido);
                if (this.experiencia >= 50)
                {
                    System.out.println("Ha Mejorado!!!!");
                } 
            }
        }

        public void subirExp()
        {
            if (this.experiencia >= 50)
            {
               
            } 

            else
            {
                this.experiencia = this.experiencia+15;
                System.out.println(this.experiencia);
                this.dañoProducido =0;
            }
        }
        protected Pikachu mejora()
        {
            this.dañoProducido = 0;
            Pikachu pokemo2 = new Pikachu("Pikachu", this.entrenador,this.experiencia, this.salud+25);
           // System.out.println("ha mejorado!!!!");
            return pokemo2;


        }
        
        
}

class Pikachu extends Pichu
{
        Pikachu( String nombre, String entrenador,int experiencia,int salud)
        {
           super(nombre, entrenador, experiencia, salud);
           
        }
        public int ataqueRapido1()
        {
            int dañoJugada=0;
            int d = (int) (Math.random()*10)+1;
            if (d ==1 || d ==2 || d ==3 || d ==4 || d ==5)
            {
                dañoJugada = 15;
                dañoProducido = dañoProducido+15;
            }
            else
            {
                dañoJugada=25;
                dañoProducido = dañoProducido+25;
            }
            return dañoJugada;
        }

        public void ataqueRapido()
        {
           
            if (dañoProducido >=100)
            {
                this.subirExp();
            }
            else
            {
                System.out.println("Ataque rapido ha hecho : "+ataqueRapido1());
                System.out.println("Daño : "+this.dañoProducido);
                if (this.experiencia >= 100)
                {
                    System.out.println("Ha Mejorado!!!!");
                } 
            }
        }
        public int bolaVoltio1()
        {
            int dañoJugada=0;
            int d = (int)(Math.random()*(50-10+1)+10);
            dañoJugada = d;
            dañoProducido = dañoProducido+d;

            return dañoJugada;
        }

        public void bolaVoltio()
        {
            
            if (dañoProducido >=100)
            {
                this.subirExp();
            }
            else
            {
                System.out.println("Bola voltio ha hecho : "+bolaVoltio1());
                System.out.println("Daño : "+this.dañoProducido);
                if (experiencia >= 100)
                {
                    System.out.println("Ha Mejorado!!!!");
                } 
            }
        }
        public void subirExp()
        {
          
            if (this.experiencia >= 100)
            {
                
            } 

            else
            {
                this.experiencia = this.experiencia+15;
                System.out.println(this.experiencia);
                this.dañoProducido =0;
            }
        }
        protected Raichu mejora()
        {
            this.dañoProducido = 0;
            Raichu pokemo3 = new Raichu("Raichu", this.entrenador,this.experiencia, this.salud+25);
            //System.out.println("ha mejorado!!!!");
            return pokemo3;


        }
}
   
class Raichu extends Pikachu
{
        Raichu( String nombre, String entrenador,int experiencia,int salud)
        {
            super(nombre, entrenador, experiencia, salud);
        }
        public int ataqueRapido1()
        {
            int dañoJugada=0;
            int d = (int) (Math.random()*10)+1;
            if (d ==1 || d ==2 || d ==3 || d ==4 || d ==5)
            {
                dañoJugada = 30;
                dañoProducido = dañoProducido+30;
            }
            else
            {
                dañoJugada=40;
                dañoProducido = dañoProducido+40;
            }
            return dañoJugada;
        }

        public void ataqueRapido()
        {
            System.out.println("Ataque rapido ha hecho : "+ataqueRapido1());
            System.out.println("Daño : "+this.dañoProducido);
            if (dañoProducido >=100)
            {
                this.subirExp();
            }
        }
        public int estallidoTrueno1()
        {
            int dañoJugada=0;
            int d = (int)(Math.random()*(90-10+1)+10);
            dañoJugada = d;
            dañoProducido = dañoProducido+d;

            return dañoJugada;
        }

        public void estallidoTrueno()
        {
            System.out.println("Bola voltio ha hecho : "+estallidoTrueno1());
            System.out.println("Daño : "+this.dañoProducido);
            if (dañoProducido >=100)
            {
                this.subirExp();
            }
        }
        public void subirExp()
        {
            this.experiencia = this.experiencia+15;
            System.out.println(this.experiencia);
            this.dañoProducido =0;
            
        }
      
        
}

    

public class Pokemon
{

    public static void main(String[] args) 
    {
       Pichu a = new Pichu("Pichu", "manu", 0, 50);

       a.mostrar();
    

       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();
       a.bolaRayo();

     
   

       Pikachu z = a.mejora();
       z.mostrar();
      
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
       z.bolaVoltio();
      


       Raichu ak = z.mejora();

       ak.mostrar();
        
       ak.estallidoTrueno();
       ak.estallidoTrueno();
       ak.estallidoTrueno();
       ak.estallidoTrueno();
       ak.estallidoTrueno();
       ak.estallidoTrueno();

    
       
    }
     
}