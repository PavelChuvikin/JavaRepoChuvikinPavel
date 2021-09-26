package homework5;

public class Animal {
   private int runLimit;
   private double jumpLimit;
   private int swimLimit;

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }
    public void setJumpLimit(double jumpLimit) {
        this.jumpLimit = jumpLimit;
    }
    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }
    public int getRunLimit() {
        return runLimit;
    }
    public double getJumpLimit() {
        return jumpLimit;
    }
    public int getSwimLimit() {
        return swimLimit;
    }
    public boolean run(int runDistance){
        boolean result = runDistance < runLimit;
        return result;
    }
    public boolean jump(double jumpHight){
        boolean result = jumpHight < jumpLimit;
        return result;
    }
    public boolean swim(int swimDistance){
        boolean result = swimDistance < swimLimit;
        return result;
    }
}
