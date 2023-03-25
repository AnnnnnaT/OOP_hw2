import java.util.*;

public class Menu {

    public static void showMenu() {
        System.out.println("Выберите, что хотите сделать: ");
        System.out.println("1. Добавить животное в зоопарк ");
        System.out.println("2. Убрать животное из зоопарка по номеру");
        System.out.println("3. Информация о животном по номеру");
        System.out.println("4. Информация о всех животных зоопарка");
        System.out.println("5. Издать звук животного по номеру ");
        System.out.println("6. Звук всех животных в зоопарке");
    }

    static void addAnimal(Zoo zoo) {

        System.out.println("Введите рост животного (например: 15,8): ");
        Scanner scanner = new Scanner(System.in);
        Double height = scanner.nextDouble();

        System.out.println("Введите вес животного (например: 15,8): ");
        Double weight = scanner.nextDouble();

        System.out.println("Введите цвет глаз животного: ");
        String colorEyes = scanner.nextLine();

        HashMap<Integer, String> pets = new HashMap<>();
        pets.put(1, "Кошка");
        pets.put(2, "Собака");

        HashMap<Integer, String> wilds = new HashMap<>();
        wilds.put(1, "Волк");
        wilds.put(2, "Тигр");

        System.out.println("Какой вид животного добавить(введите цифру): ");
        System.out.println("1 - дикое животное");
        System.out.println("2 - домашнее");
        Integer choose = scanner.nextInt();

        switch (choose) {
            case 1:

                System.out.println("Введите место обитания: ");
                String habitat = scanner.next();

                System.out.println("Введите время обнаружения: ");
                String locationDate = scanner.next();

                System.out.println("Какое животное хотите добавить: ");
                System.out.println(Arrays.asList(wilds));
                Integer choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Wolf wolf = new Wolf(height, weight, colorEyes, habitat, locationDate, null);

                        wolf.height = height;
                        wolf.weight = weight;
                        wolf.eyesColor = colorEyes;
                        wolf.habitat = habitat;
                        wolf.locationDate = locationDate;

                        System.out.println("Волк является вожаком(1-> да, 2-> нет): ");
                        Integer choice2 = scanner.nextInt();
                        if (choice2 == 2) {
                            wolf.leader = false;
                        }

                        zoo.add(wolf);
                        break;

                    case 2:

                        Tiger tiger = new Tiger(height, weight, colorEyes, habitat, locationDate);

                        tiger.height = height;
                        tiger.weight = weight;
                        tiger.eyesColor = colorEyes;
                        tiger.habitat = habitat;
                        tiger.locationDate = locationDate;

                        zoo.add(tiger);
                        break;

                    default:
                        break;
                }

                break;

            case 2:
                System.out.println("Какое животное хотите добавить: ");
                System.out.println(Arrays.asList(pets));
                Integer choice_ = scanner.nextInt();

                switch (choice_) {
                    case 1:
                        Cat cat = new Cat(null, null, null, null, null, null, null, null, null);

                        cat.height = height;
                        cat.weight = weight;
                        cat.eyesColor = colorEyes;

                        System.out.println("Введите имя кота: ");
                        String name = scanner.next();
                        cat.name = name;

                        System.out.println("Введите породу кота: ");
                        String breed = scanner.next();
                        cat.breed = breed;

                        System.out.println("Кот привит? (1-> да, 2-> нет): ");
                        Integer vaccination = scanner.nextInt();
                        if (vaccination == 2) {
                            cat.vaccination = false;
                        }

                        System.out.println("Введите окрас кота: ");
                        String hairColor = scanner.next();
                        cat.hairColor = hairColor;

                        System.out.println("Введите дату рождения кота: ");
                        String birth = scanner.next();
                        cat.dateOfBirth = birth;

                        System.out.println("Есть ли у кота шерсть? (1-> да, 2-> нет): ");
                        Integer hairPresence = scanner.nextInt();
                        if (hairPresence == 2) {
                            cat.hairPresence = false;
                        }

                        zoo.add(cat);

                        break;
                    case 2:
                        Dog dog = new Dog(null, null, null, null, null, null, null, null, null);

                        dog.height = height;
                        dog.weight = weight;
                        dog.eyesColor = colorEyes;

                        System.out.println("Введите имя собаки: ");
                        String nameDog = scanner.next();
                        dog.name = nameDog;

                        System.out.println("Введите породу собаки: ");
                        String breedDog = scanner.next();
                        dog.breed = breedDog;

                        System.out.println("Собака привита? (1-> да, 2-> нет): ");
                        Integer vaccinationDog = scanner.nextInt();
                        if (vaccinationDog == 2) {
                            dog.vaccination = false;
                        }

                        System.out.println("Введите окрас собаки: ");
                        String hairColorDog = scanner.next();
                        dog.hairColor = hairColorDog;

                        System.out.println("Введите дату рождения собаки: ");
                        String birthDog = scanner.next();
                        dog.dateOfBirth = birthDog;

                        System.out.println("Собака дрессируема? (1-> да, 2-> нет): ");
                        Integer training = scanner.nextInt();
                        if (training == 2) {
                            dog.training = false;
                        }

                        zoo.add(dog);

                        break;

                    default:
                        System.out.println("");
                        break;
                }
                break;

        }
        scanner.close();

        zoo.showAll();
    }

    static void deleteAnimal(Zoo zoo) {
        zoo.showAll();
        System.out.print("Введи номер животного, которое хотите удалить: ");
        Scanner scan01 = new Scanner(System.in);
        int input = scan01.nextInt();
        zoo.remove(input - 1);
        zoo.showAll();
        scan01.close();
    }

    static void info(Zoo zoo) {
        zoo.showAll();
        System.out.print("Введи номер животного для информации: ");
        Scanner scan02 = new Scanner(System.in);
        int number = scan02.nextInt();
        zoo.showInfo(number-1);
        scan02.close();

    }

    static void infoZoo(Zoo zoo) {
        zoo.zooInfo();
    }

    static void sound(Zoo zoo) {
        zoo.showAll();
        System.out.print("Введи номер животного для звука: ");
        Scanner scan03 = new Scanner(System.in);
        int number = scan03.nextInt();
        zoo.makeSound(number - 1);
        scan03.close();
    }

    static void soundZoo(Zoo zoo) {
        zoo.zooSound();
    }

}
