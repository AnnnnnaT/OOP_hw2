public abstract class Bird extends Animal implements Fly {
    protected Double flightAltitude;
    
    public Bird(Double height, Double weight, String eyesColor, Double flightAltitude){
        super(height, weight, eyesColor);
        this.flightAltitude = flightAltitude;
    }

    public String flying(){
       return String.format("Я лечу на %.2f метрах", flightAltitude);
    }

    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public String info() {
        return super.info();
    }

}
