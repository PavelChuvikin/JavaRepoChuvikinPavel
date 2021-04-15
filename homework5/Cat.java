package homework5;

public class Cat extends Animal {
    public Cat() {

        setRunLimit(200);
        setJumpLimit(2);
        setSwimLimit(0);
    }

    public void catRun(int runDistance){
        if (this.run(runDistance)){
            System.out.println("Кот пробежал " + runDistance + " м");
        }
        else {
            System.out.println("Кот не может пробежать более " + getRunLimit() + " м включительно");
        }
    }
    public void catJump(double jumpHight){
        if (this.jump(jumpHight)){
            System.out.println("Кот прыгнул на " + jumpHight + " м");
        }
        else {
            System.out.println("Кот не может прыгнуть на высоту более " + getJumpLimit() + " м включительно");
        }
    }
    public void catSwim(int swimDistance){

        System.out.println("Кот не может плавать");
    }

}
