public class Cat extends Pet {
    protected Boolean hairPresence;

    public Cat(Double height, Double weight, String eyesColor, String name, String breed, Boolean vaccination,
            String hairColor, String dateOfBirth, Boolean hairPresence) {
        super(height, weight, eyesColor, name, breed, vaccination, hairColor, dateOfBirth);
        this.hairPresence = hairPresence;
    }

    @Override
    public void sound() {
        System.err.println("Mur");
    }

    @Override
    public String info() {
        return super.info() + "presence of hair: " + hairPresence;
    }

    @Override
    public void weasel() {
        // TODO Auto-generated method stub
        super.weasel();
    }

    
}


