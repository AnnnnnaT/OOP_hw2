import java.util.*;

public class Zoo {

    private ArrayList<Animal> zoo;

    public Zoo(){
        this.zoo = new ArrayList<>();
    }
    
    public void add(Animal animal){
        zoo.add(animal);
    }

    public void remove(int index){
        zoo.remove(index);
    }

    public void showInfo(int index){
        System.out.println(zoo.get(index).info());        
    }

    public void makeSound (int index){
        zoo.get(index).sound();
    }

    public void zooInfo(){
        for (Animal animal : zoo) {
            System.out.println(animal.info());
            System.out.println();
        }
    }

    public void zooSound(){
        for (Animal animal : zoo) {
            animal.sound();
        }
    }

    public void showAll(){
        for (int index = 0; index < zoo.size(); index++) {
            System.out.printf("%d. %s\n", index+1, zoo.get(index).info());
        }
        
    }
}
