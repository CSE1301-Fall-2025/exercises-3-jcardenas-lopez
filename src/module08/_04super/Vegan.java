package module08._04super;

public class Vegan extends Student {
    public Vegan (String studentName){
        super(studentName);
    }

    public String getFood(){
        String output = super.getFood();
        return "No " + output + ". Tofu burger and taco please.";
    }


}
