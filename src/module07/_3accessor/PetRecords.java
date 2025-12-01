package module07._3accessor;

public class PetRecords {
    //instance variables
    private String petName;
    private int petAge;
    private double petWeight;
    private String animalType;
    private String petBreed;
    //constructor with no parameters
    public PetRecords(){
        this.petName = "";
        this.petAge= 0;
        this.petWeight=0;
        this.animalType= "";
        this.petBreed = "";
    }
    //constructor with parameters
    public PetRecords(String name, int age, double weight, String animal, String breed){
        this.petName = name;
        this.petAge = age;
        this.petWeight = weight;
        this.animalType = animal;
        this.petBreed = breed;
    }
    //getter methods
    public String getPetName(){
        return petName;
    }
    public int getPetAge(){
        return petAge;
    }
    public double getPetWeight (){
        return petWeight;
    }
    public String getAnimalType(){
        return animalType;
    }
    public String getPetBreed(){
        return petBreed;
    }
    //making toString() method
    public String toString(){
        return petName + " is " + petAge + ", and weighs "+ petWeight + ". Is a " + animalType + ", " + petBreed;
    }
    //setter methods
    public void setPetName(String newName){
        petName = newName;
    }
    public void setPetAge(int newAge){
        petAge = newAge;
    }
    public void setPetWeight(double newWeight){
        petWeight = newWeight;
    }
    public void setAnimalType(String newType){
        animalType = newType;
    }
    public void setBreed(String newBreed){
        petBreed = newBreed;
    }

public static void main(String[] args){
    // testing constructor w/o parameters
    PetRecords pet1 = new PetRecords();
    PetRecords pet2 = new PetRecords("Mandarina Fih",0,0.5,"Fish", "Koi Betta");
    PetRecords pet3 = new PetRecords("Blue", 4, 6, "Dog", "Pomeranian");
   
    //Trying out toString for both constructors
    System.out.println(pet1.toString());
    System.out.println(pet2.toString());
    System.out.println(pet3.getPetName() + " is " + pet3.getPetAge() + " years old.");
    System.out.println("They are a "+ pet3.getAnimalType() + ", " + pet3.getPetBreed() + " and weighs " + pet3.getPetWeight());
    
    // changing values from null 
    pet1.setPetName("Luna");
    pet1.setPetAge(2);
    pet1.setPetWeight(21);
    pet1.setAnimalType("Cat");
    pet1.setBreed("Ragdoll");
    // checking if it worked
    System.out.println(pet1.toString());
    

    }
}
