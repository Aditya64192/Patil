class A
{
   public void m1(int x)
   {
     System.out.println("Parent");
     }
}
class B extents A
{


      public void m1(int x)
   {
     System.out.println("child t");
     } }
  class Test
  {


     public static void main(String[]args(){

     A a=new A();


     a.m1();
     A a= new B();
     a.m1();

     }}
