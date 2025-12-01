package module08._04super;

public class Person 
{
      private String name = null;
      
      public Person(String theName)
      {
         name = theName;
      }
      
      public String getFood() 
      {
         return "Hamburger";
      }
      
      public static void main(String[] args)
      {
         Person p = new Student("Javier");
         System.out.println(p.getFood());
         Vegan v = new Vegan("Vegan");
         System.out.println(v.getFood());
      }
   }
