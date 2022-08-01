import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = "/";
        String y = "*";
        String c = "+";
        String v = "-";
        String s = "^";
        String k = "k";
        String k3 = "k3";


        while (true) {
            System.out.println("Введите первое число: ");
            double x = sc.nextDouble();
            System.out.println("Введите /, *, +, -,^,k,k3");
            String q = sc.next();
            if (q.contains(d) && q.length() < 2) {
                System.out.println("Введите второе число");
                double d1 = sc.nextDouble();
                double d2 = x / d1;
                System.out.println("Ответ: " + d2);
            } else if (q.contains(y) && q.length() < 2) {
                System.out.println("Введите второе число");
                double y1 = sc.nextDouble();
                double y2 = x * y1;
                System.out.println("Ответ: " + y2);
            } else if (q.contains(c) && q.length() < 2) {
                System.out.println("Введите второе число");
                double c1 = sc.nextDouble();
                double c2 = x + c1;
                System.out.println("Ответ: " + c2);
            } else if (q.contains(v) && q.length() < 2) {
                System.out.println("Введите второе число");
                double v1 = sc.nextDouble();
                double v2 = x - v1;
                System.out.println("Ответ: " + v2);
            } else if (q.contains(s) && q.length() < 2) {
                System.out.println("Введите второе число");
                double s1 = sc.nextDouble();
                double s2 = Math.pow(x, s1);
                System.out.println("Ответ: " + s2);
            } else if (q.contains(k) && q.length() < 2) {
                double k1 = Math.sqrt(x);
                System.out.println("Ответ: " + k1);
            } else if (q.contains(k3) && q.length() < 3) {
                double k31 = Math.cbrt(x);
                System.out.println("Ответ: " + k31);
            } else {
                System.out.println("Вы ввели неверный символ, попробуйте снова");
            }


        }


    }


}
