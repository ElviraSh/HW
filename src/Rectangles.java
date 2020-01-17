import java.util.Scanner;

public class Rectangles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextFloat();
        System.out.print("b = ");
        double b = in.nextFloat();
        System.out.print("c = ");
        double c = in.nextFloat();
        System.out.print("d = ");
        double d = in.nextFloat();

        if (a > 0 & b > 0 & c > 0 & d > 0) { //проверяем, положительные ли введенные числа (по условию задачи)
            if (((a < c) & (b < d)) | ((b < c) & (a < d))) { //если каждая сторона одного прямоугольника меньше каждой соответсвеннной стороны другого прямоугольника, то первый прямоугольник можно помстить в другой прямоугольник
                 System.out.println("Прямоугольник со сторонами a,b возможно поместить в прямоугольник со сторонами c,d, так, чтобы стороны одного прямоугольника были параллельны или перпендикулярны сторонам другого прямоугольника");
                } else {
                    System.out.println("Прямоугольник со сторонами a,b невозможно поместить в прямоугольник со сторонами c,d, так, чтобы стороны одного прямоугольника были параллельны или перпендикулярны сторонам другого прямоугольника");
                }

        }else {
                System.out.println("Введите корректные данные");


        }
    }
}
