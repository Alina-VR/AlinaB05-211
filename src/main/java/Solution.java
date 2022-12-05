import java.util.Scanner;

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

