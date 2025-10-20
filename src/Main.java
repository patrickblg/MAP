import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        aufgabe1 a = new aufgabe1();
        int grades[]= {29,37,38,41,84,67};
        System.out.println("\nAUFGABE 1\n");
        System.out.println(Arrays.toString(a.failed(grades)));
        a.avg(grades);
        System.out.println(Arrays.toString(a.roundedGrades(grades)));
        System.out.println(a.maxRounded(grades) + "\n");

        ///
        System.out.println("AUFGABE 2\n");

        aufgabe2 b = new aufgabe2();
        int num[]={4,8,3,10,17};
        System.out.println(b.maxNum(num));
        System.out.println(b.minNum(num));
        System.out.println(b.maxSum(num));
        System.out.println(b.minSum(num));

        System.out.println("AUFGABE 3\n");
        aufgabe3 c = new aufgabe3();
        int[]list={1,3,6,0,0,0};
        int[]list2={1,1,1,1};
        System.out.println(Arrays.toString(c.div(list,2)));

        System.out.println("\nAUFGABE 4\n");
        aufgabe4 d = new aufgabe4();
        int[]keyboards={40,60};
        int[]usb={8,12};
        int buget=60;
        System.out.println("Billigste Tastatur: "+d.cheapestKeyboard(keyboards));
        System.out.println("Most expensive thing: "+ d.mostExpensiveThing(keyboards,usb));
        System.out.println("Most expensive usb Markus can afford: "+d.canAfford(usb,69));
        System.out.println("Max he can afford for buget "+ buget + " is "+d.maxPrice(keyboards,usb,buget));

    }


}
