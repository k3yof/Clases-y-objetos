package Abstracto;
abstract class A
{
    abstract void metodo2();
}
class B extends A
{
    void metodo2()
    {
        System.out.print("a");
    }
}
class C extends B
{
    void metodo2()
    {
        System.out.print("b");
    }
}
public class m
{

    public static void main(String[] args) 
    {
       
        C c = new C();

        c.metodo2();
    }
     
}