package module07._4static;

public class Song 
{ 

  //add a static variable to count how many times the verse method is called
  public static int methodCounter =0;

  //update the method to increment the counter
  public static void verse(String animal, String noise) 
  {
    System.out.println( "Old MacDonald had a farm" );
    System.out.println( "E-I-E-I-O" );
    System.out.println( "And on that farm he had a " + animal );
    System.out.println( "E-I-E-I-O" );
    System.out.println( "With a " + noise + "-" + noise + " here") ;
    System.out.println( "And a " + noise + "-" + noise + " there" );
    System.out.println( "Here a " + noise + ", there a " + noise );
    System.out.println( "Everywhere a " + noise + "-" + noise );
    System.out.println( "Old MacDonald had a farm" );
    System.out.println( "E-I-E-I-O" );
    methodCounter++;
  }

  public static void main(String[] args) 
  {
    verse( "cow" , "moo" );
    verse( "duck" , "quack" );
    //add a few more verses
    verse("pig", "oink");
    verse("chicken", "cluck");

    //print the counter value
    System.out.println(Song.methodCounter);

  }
}
