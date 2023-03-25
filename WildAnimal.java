public class WildAnimal extends Animal {
    String habitat;
    String locationDate;

    public WildAnimal(Double height, Double weight, String eyesColor, String habitat, String locationDate) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }

    public void sound() {
        
        super.sound();
    }

 
    public String info() {
      
        return super.info() + "habitat is " + habitat +"\n" + "date of location is " + locationDate + "\n";
    }
}
