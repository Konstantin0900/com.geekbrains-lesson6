package com.geekbrains;

    public class Dog extends Animal {
        //public String name; from Animal
        //public String age; from Animal

        public Dog(String name, String color, int age){
            this.name = name;
            this.color = color;
            this.age = age;


        }
        @Override
        public void run(int rundistance) {
             if ((rundistance >= 0) && (rundistance <= 500)) {
                System.out.println(name + " пробежал " + rundistance + " метров");
            } else {
                System.out.println(name + " не может столько пробежать, собаки бегают на дистанцию до 500 метров");
            }
        }

        @Override
        public void swim(int swimdistance) {
             if ((swimdistance >= 0) && (swimdistance <= 10)) {
                System.out.println(name + " проплыл " + swimdistance + " метров");
            } else {
                System.out.println(name + " не может столько проплыть, собаки плавают на дистанцию до 10 метров");
            }
        }
        }