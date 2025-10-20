import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        aufgabe1 a = new aufgabe1();
        int grades[]= {29,37,38,41,84,67};
        System.out.println(Arrays.toString(a.failed(grades)));
        a.avg(grades);
        System.out.println(Arrays.toString(a.roundedGrades(grades)));
        System.out.println(a.maxRounded(grades));
    }
}
