package homework5;

public class Dog extends Animal {
//private int run;                        если бы мы хотели
public Dog() { //public Dog(int run)      задавать лимит
   // this.run=run;                       бега для каждой собаки
    setRunLimit(500);//setRunLimit(run);  мы бы написали так
    setJumpLimit(1.5);
    setSwimLimit(20);
}

  public void dogRun(int runDistance){
    if (this.run(runDistance)){
        System.out.println("Собака пробежала " + runDistance + " м");
      }
    else {
        System.out.println("Собака не может пробежать более " + getRunLimit() + " м включительно");
    }
  }
    public void dogJump(double jumpHight){
        if (this.jump(jumpHight)){
            System.out.println("Собака прыгнула на " + jumpHight + " м");
        }
        else {
            System.out.println("Собака не может прыгнуть на высоту более " + getJumpLimit() + " м включительно");
        }
    }
    public void dogSwim(int swimDistance){
        if (this.swim(swimDistance)){
            System.out.println("Собака проплыла " + swimDistance + " м");
        }
        else {
            System.out.println("Собака не может проплыть более " + getJumpLimit() + " м включительно");
        }
    }
}
