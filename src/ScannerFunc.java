import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerFunc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("X для первого вектора");
        double x1 = in.nextDouble();
        System.out.println("Y для первого вектора");
        double y1 = in.nextDouble();
        System.out.println("Z для первого вектора");
        double z1 = in.nextDouble();
        System.out.println("X для второго вектора");
        double x2 = in.nextDouble();
        System.out.println("Y для второго вектора");
        double y2= in.nextDouble();
        System.out.println("Z для второго вектора");
        double z2 = in.nextDouble();
        Vector vector1 = new Vector(x1, y1, z1);
        Vector vector2 = new Vector(x2, y2, z2);
        in.close();
        Vector vectorCP = vector1.crossProduct(vector2);
        Vector vectorAdd = vector1.add(vector2);
        Vector vectorSubstract = vector1.subtract(vector2);
        System.out.println("Длина вектора 1 = " + vector1.length());
        System.out.println("Длина вектора 2 = " + vector2.length());
        System.out.println("Скалярное произведение 1 и 2 = " + vector1.scalarProduct(vector2));
        System.out.println("Векторное произведение 1 и 2 = (" + vectorCP.myX() + ", " + vectorCP.myY() + ", " + vectorCP.myZ() +")");
        System.out.println("Косинус угла между векторами 1 и 2 = " + vector1.cos(vector2));
        System.out.println("Сумма векторов 1 и 2 = (" + vectorAdd.myX() + ", " + vectorAdd.myY() + ", " + vectorAdd.myZ() + ")");
        System.out.println("Разность векторов 1 и 2 = (" + vectorSubstract.myX() + ", " + vectorSubstract.myY() + ", " + vectorSubstract.myZ() + ")");

    }
}
