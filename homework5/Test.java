package homework5;

public class Test {

    public static void main(String[] args){
        Dog dog = new Dog();// Dog dog = new Dog(600); если бы мы хотели задавать лимит бега каждой собаки при создании
        dog.dogRun(550);
        dog.dogJump(0.5);
        dog.dogSwim(15);

        Horse horse = new Horse();
        horse.horseRun(1000);
        horse.horseJump(2);
        horse.horseSwim(50);

        Bird bird = new Bird();
        bird.birdRun(2);
        bird.birdJump(1);
        bird.birdSwim(50);

        Cat cat = new Cat();
        cat.catRun(2);
        cat.catJump(1);
        cat.catSwim(50);

        //Сделать у разных собак отличающиеся лимиты на бег можно через сеттеры, на пример:
        //Dog dog1 = new Dog();
       // dog1.setRunLimit(10000);
        //dog1.dogRun(9000);
    }
}
