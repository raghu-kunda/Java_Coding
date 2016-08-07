
class StaticExample
{
   static int count=0;

   public void increment()
   {
       count++;
   }
     System.out.println(count);

   public static void main(String args[])
   {
       StaticExample obj1=new StaticExample();
       StaticExample obj2=new StaticExample();
       obj1.increment();
       obj2.increment();
       System.out.println("Obj1: count is="+obj1.count);
       System.out.println("Obj2: count is="+obj2.count);
   }
}