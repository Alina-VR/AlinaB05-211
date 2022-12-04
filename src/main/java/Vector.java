import java.util.Scanner;

public class Vector {
    double x, y, z;
    static double a = Math.random();
    static double b = Math.random();
    static double c = Math.random();

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
        return (int) (a * x * x * x + b * y * y + c * z);
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



