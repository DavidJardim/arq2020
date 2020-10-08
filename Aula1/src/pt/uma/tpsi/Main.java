package pt.uma.tpsi;

public class Main {

    public static int calculatePer(int height, int width){
        int per = 0;
        per = 2 * (height + width);
        return per;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int per = calculatePer(2, 2);
        System.out.println("O perímetro do retângulo é: " + per);
    }
}
