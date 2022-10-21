package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (i + j > cathetusLength) {
                    System.out.print(cathetusLength - j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j < cathetusLength; j++) {
                if (i > j) {
                    System.out.print(j + 1);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
