public class Dog extends Pet implements Train{
    protected Boolean training;

    public Dog(Double height, Double weight, String eyesColor, String name, String breed, Boolean vaccination,
    String hairColor, String dateOfBirth, Boolean training){
        super(height, weight, eyesColor, name, breed, vaccination, hairColor, dateOfBirth);
        this.training = training;
    }

    public void training(){
        
    }

    @Override
    public void sound() {
        System.out.println("Gav-gav");
    }

    @Override
    public void weasel() {
        super.weasel();
    }

    @Override
    public String info() {
        return super.info() + "possibility of training: " + training;
    }

    @Override
    public void train() {
        System.out.println("Love to train every day");
    }
}
