public class Hen extends Bird{
    public Hen(Double height, Double weight, String eyesColor, Double flightAltitude){
        super(height, weight, eyesColor, flightAltitude);
    }
  @Override
  public void sound() {
      System.out.println("Ko-ko-ko");
  }

@Override
public void fly() {
    System.out.println("Can't fly");
}

}