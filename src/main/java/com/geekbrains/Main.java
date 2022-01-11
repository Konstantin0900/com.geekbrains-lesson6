package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Черный", 4);
        Cat cat1 = new Cat("Мурзик", "Серый", 1);
        Cat cat2 = new Cat("Васька", "Оранжевый", 12);
        cat.info();
        cat.run(67);
        cat1.run(800);
        cat.swim(700);
        cat1.swim(900);

        Dog dog = new Dog("Бобик", "Белый", 2);
        Dog dog1 = new Dog("Шарик", "Черный", 4);
        Dog dog2 = new Dog("Сокол", "Серо-белый", 6);
        dog.info();
        dog.run(150);
        dog.swim(9);
        dog1.swim(50);

    }

}
