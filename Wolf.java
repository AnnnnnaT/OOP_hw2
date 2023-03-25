public class Wolf extends WildAnimal {
    protected Boolean leader;

    public Wolf(Double height, Double weight, String eyesColor, String habitat, String locationDate, Boolean leader){
        super(height, weight, eyesColor, habitat, locationDate);
        this.leader = leader;
    }

    @Override
    public String info() {
        return super.info() + "this wool is a leader: " + leader;
    }
    @Override
    public void sound() {
       System.out.println("Wuuu");
    }
}
