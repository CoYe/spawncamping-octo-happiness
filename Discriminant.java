public class Main {

    public static void main(String[] args) {
        double a, b, c, x, x1, x2, discriminant;
        a = 2;
        b = 12;
        c = 17;
        discriminant =  (b * b) - (4 * a * c);
        if (discriminant > 0) {
            x1 = (((-b) + StrictMath.sqrt(discriminant)) / (2 * a));
            x2 = (((-b) - StrictMath.sqrt(discriminant)) / (2 * a));
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
            System.out.println("Подставим корни в уравнение х1 - " + (a*(x1*x1) + b*x1 + c));
            System.out.println("Подставим корни в уравнение х2 - " + (a*(x2*x2) + b*x2 + c));
        } else if (discriminant == 0){
            x = (-b)/(2 * a);
            System.out.println("x = " + x);
            System.out.println("Подставим корни в уравнение х - " + (a*(x*x) + b*x + c));
        }else if (discriminant < 0){
            System.out.println("Нет корней");
        }
    }
}
