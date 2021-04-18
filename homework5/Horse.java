package homework5;

public class Horse extends Animal{
    public Horse() {

        setRunLimit(1500);
        setJumpLimit(3.0);
        setSwimLimit(100);
    }

    public void horseRun(int runDistance){
        if (this.run(runDistance)){
            System.out.println("Лошадь пробежала " + runDistance + " м");
        }
        else {
            System.out.println("Лошадь не может пробежать более " + getRunLimit() + " м включительно");
        }
    }
    public void horseJump(double jumpHight){
        if (this.jump(jumpHight)){
            System.out.println("Лошадь прыгнула на " + jumpHight + " м");
        }
        else {
            System.out.println("Лошадь не может прыгнуть на высоту более " + getJumpLimit() + " м включительно");
        }
    }
    public void horseSwim(int swimDistance){
        if (this.swim(swimDistance)){
            System.out.println("Лошадь проплыла " + swimDistance + " м");
        }
        else {
            System.out.println("Лошадь не может проплыть более " + getSwimLimit() + " м включительно");
        }
    }
}
