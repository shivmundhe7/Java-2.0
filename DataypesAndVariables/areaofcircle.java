import java.util.Scanner;

public class areaofcircle{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float rad = sc.nextFloat();
            float area = 3.14f * rad * rad;
            System.out.println(area);
        }
    }
}