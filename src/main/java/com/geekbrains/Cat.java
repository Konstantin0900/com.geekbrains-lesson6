package com.geekbrains;

    public class Cat extends Animal {
        //public String name; from Animal
        //public String age; from Animal

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;


        }

        @Override
        public void run(int rundistance) {
            if ((rundistance >= 0) && (rundistance <= 200)) {
                System.out.println(name + " пробежал " + rundistance + " метров");
            } else {
                System.out.println(name + " не может столько пробежать, коты бегают на дистанцию до 200 метров");

            }
        }

    @Override
        public void swim( int swimdistance){
              System.out.println(name + " плавать не умеет, поэтому в заплыве не участвовал");

    }

    }


