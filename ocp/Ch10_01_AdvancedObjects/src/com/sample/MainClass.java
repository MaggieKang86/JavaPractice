package com.sample;

public class MainClass {

    public static void main(String[] args) {

//        Fish fish = new Fish("小魚兒");
//        fish.swim();

        Anemonefish anemonefish = new Anemonefish("尼莫");
        anemonefish.swim();

        Shark shark = new Shark("大白鯊");
        shark.swim();

        Human human = new Human("陳玟均");
        human.swim();

        Superman superman = new Superman("林佑昇");
        superman.swim();
        superman.fly();

        Flyingfish flyingfish = new Flyingfish("大飛魚");
        flyingfish.swim();
        flyingfish.fly();

    }

}

