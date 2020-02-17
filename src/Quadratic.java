import java.util.Scanner;

public class Quadratic {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double a, b, c, delta;
            System.out.println("Giai phuong trinh bac hai ax2 + bx + c =0 ");
            System.out.println("Nhap vao a =");
            a = input.nextDouble();
            System.out.println("Nhap vao b =");
            b = input.nextDouble();
            System.out.println("Nhap vao c = ");
            c = input.nextDouble();
            delta = b * b + 4 * a * c;
            System.out.println("Phuong trinh vo nghiem.");

            if (delta >= 0) {
                  System.out.println("Phuong trinh co hai nghiem la :");
                  System.out.println("x1 = " + (-b + Math.sqrt(delta) / (2 * a)));
                  System.out.println("x2 = " + (-b - Math.sqrt(delta) / (2 * a)));
            } else if (delta == 0) {
                  System.out.println("Phuong trinh co nghiem kep la :");
                  System.out.println("x = " + (-b / 2 * a));
            }else {
                  System.out.println("The equation has no roots");
            }

      }

}
