public class Stork extends Bird {
    public Stork(Double height, Double weight, String eyesColor, Double flightAltitude){
        super(height, weight, eyesColor, flightAltitude);
    }

    @Override
    public void sound() {
        System.out.println("Kr-kr-kr");;
    }

    @Override
    public void fly() {
        System.out.println("Love flying");
    }

}
