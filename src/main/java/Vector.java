import java.util.Scanner;

public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Длина вектора. Корень из суммы квадратов
    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector) {
        return (x * vector.x + y * vector.y + z * vector.z);
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector) {
        return new Vector(y * vector.z - vector.y * z, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    // Косинус между двумя векторами
    double cos(Vector vector) {
        return (scalarProduct(vector) / (vector.length() * this.length()));
    }

    // Сумма двух векторов
    Vector add(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    // Разность двух векторов
    Vector subtract(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    @Override
    public int hashCode() {
        return (int) length();
    }


    @Override
    public boolean equals(Object vector) {
        if (getClass() != vector.getClass()) {
            return false;
        }
        Vector a = (Vector) vector;
        if (hashCode() != a.hashCode()) {
            return false;
        }
        return x == a.x && y == a.y && z == a.z;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        Vector v1 = new Vector(x1, y1, z1);
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        Vector v2 = new Vector(x2, y2, z2);
        System.out.println(v1.length());
        System.out.println(v2.length());
        System.out.println(v1.scalarProduct(v2));
        System.out.println(v1.crossProduct(v2));
        System.out.println(v2.crossProduct(v1));
        System.out.println(v1.cos(v2));
        System.out.println(v1.add(v2));
        System.out.println(v1.subtract(v2));
    }
}


