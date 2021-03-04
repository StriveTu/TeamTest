import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final double PI = 3.14;
        while (true) {
            System.out.println("请输入半径：");
            Scanner scanner = new Scanner(System.in);
            int r = scanner.nextInt();
            double c = PI * r * 2;
            double s = PI * r * r;
            System.out.println("周长是" + c + "\n" + "面积是" + s);
        }
    }
}
