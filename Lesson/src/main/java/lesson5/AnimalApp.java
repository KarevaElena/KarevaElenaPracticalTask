package lesson5;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Cat cat1 = new Cat("Кекс");
        Cat cat2 = new Cat("Коржик");
        Dog dog1 = new Dog("Бобик");
        animal1.run(3);
        cat1.run(300);
        cat1.swim(6);
        dog1.run(500);
        dog1.swim(7);

    // подсчет созданных котов, собак и животных.
        Animal[] animals = {cat1, dog1, cat2, animal1};
        int count = 0;
        for(int i = 0; i < animals.length; i++) {
            count++;
        }
        System.out.println(count);


        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Васька",200);
        cats[1] = new Cat("Мурзик",150);
        cats[2] = new Cat("Компот",100);
        cats[3] = new Cat("Кузя",170);
        cats[4] = new Cat("Котя",90);

        Plate plate = new Plate(150);

        for (Cat value : cats) {
            if (value.eatFood(plate)) {
                System.out.println("Кот " + value.getName() + " покушал. Сытость = " + value.isSatiety());
            } else {
                System.out.println("Кот " + value.getName() + " не стал трогать еду. Сытость = " + value.isSatiety());
            }
        }
        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                plate.addFood(cat);
                System.out.println("В тарелку для кота " + cat.getName() + " добавили " + plate.getSupplement()
                        + " еды.");
            }
        }
    }
}
