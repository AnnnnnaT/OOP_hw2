public class Animal{
     Double height;
     Double weight;
     String eyesColor;
    
public Animal(Double height, Double weight, String eyesColor){
    this.height = height;
    this.weight = weight;
    this.eyesColor = eyesColor;

}
public void sound(){
    System.out.println("");
}

public String info() {
    return String.format("Animal has height: %.2f \nweight: %.2f \n%s color of eyes\n ", height, weight, eyesColor);
 }
}
