package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int pwd = 1;
        for (int i=1;i<=power;i++){
            pwd=numberToPrint*pwd;
        }
        System.out.println(pwd);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
