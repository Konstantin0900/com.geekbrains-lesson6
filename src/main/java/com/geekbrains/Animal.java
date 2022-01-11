package com.geekbrains;

public abstract class Animal {
        public String name;
        public String color;
        public int age;
        public int rundistance;
        public int swimdistance;


        public void info(){
            System.out.println(name + " " + color + " " + age + "года");
        }


    public abstract void run(int rundistance);


    public abstract void swim(int swimdistance);


}



