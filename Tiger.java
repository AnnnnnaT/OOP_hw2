public class Tiger extends WildAnimal {
    public Tiger(Double height, Double weight, String eyesColor, String habitat, String locationDate){
        super(height, weight, eyesColor, habitat, locationDate);
    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public void sound() {
        System.out.println("Rrrr");
    }
}
