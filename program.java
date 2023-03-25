import java.util.*;

public class program {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.add(new Cat(12.0, 13.0, "желтые", "Барсик", "британец",
        true, "рыжий", "13.02.2020", true));
        zoo.add(new Tiger(170.5, 60.6, "голубые", "джунгли", "16.02.2022"));

        Menu.showMenu();
      
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберете, что хотите сделать: ");
        int key = scan.nextInt();
        
        switch (key) {
                case 1:
                    Menu.addAnimal(zoo);
                    break;
                case 2:
                    Menu.deleteAnimal(zoo);
                    break;
                case 3:
                    Menu.info(zoo);
                    break;
                case 4:
                    Menu.infoZoo(zoo);

                    break;
                case 5:
                    Menu.sound(zoo);
                    break;
                case 6:
                    zoo.zooSound();
                    break;
                default:
                    break;
            }
        scan.close();
     
        
    
    }
}
