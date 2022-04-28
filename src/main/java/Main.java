public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String aB = Integer.toBinaryString(a);
        String bB = Integer.toBinaryString(b);

        BinOps bins = new BinOps();
        System.out.println("Исходные числа: " + a + " = " + aB + ", " + b + " = " + bB);

        String sumB = bins.sum(aB, bB);
        String multB = bins.mult(aB, bB);
        System.out.println("a + b = " + sumB + " = " + Integer.parseInt(sumB, 2));
        System.out.println("a * b = " + multB + " = " + Integer.parseInt(multB, 2));
    }
}
