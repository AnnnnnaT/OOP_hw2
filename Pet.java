public class Pet extends Animal implements Weasel{
    String breed;
    Boolean vaccination;
    String hairColor;
    String dateOfBirth;
    String name;

    public Pet(Double height, Double weight, String eyesColor, String name, String breed, Boolean vaccination,
            String hairColor, String dateOfBirth) {
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.hairColor = hairColor;
        this.dateOfBirth = dateOfBirth;

    }

    public void sound() {
        super.sound();
    }

    public String info() {

        return super.info() +"name: " + name + "\n" + "breed: " + breed + "\n" +
                "vaccination: " + vaccination + "\n" + "color of hair: " + hairColor + "\n" +
                "date of birth: " + dateOfBirth + '\n';
    }

    public void weasel() {
    }
}
