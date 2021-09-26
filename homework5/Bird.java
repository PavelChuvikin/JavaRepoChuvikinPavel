package homework5;

public class Bird extends Animal {
    public Bird() {

        setRunLimit(5);
        setJumpLimit(0.2);
        setSwimLimit(0);
    }

    public void birdRun(int runDistance){
        if (this.run(runDistance)){
            System.out.println("Птица пробежала " + runDistance + " м");
        }
        else {
            System.out.println("Птица не может пробежать более " + getRunLimit() + " м включительно");
        }
    }
    public void birdJump(double jumpHight){
        if (this.jump(jumpHight)){
            System.out.println("Птица прыгнула на " + jumpHight + " м");
        }
        else {
            System.out.println("Птица не может прыгнуть на высоту более " + getJumpLimit() + " м включительно");
        }
    }
    public void birdSwim(int swimDistance){

            System.out.println("Птица не может плавать");
        }

}
