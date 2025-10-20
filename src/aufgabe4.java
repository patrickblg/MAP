import java.util.Arrays;

public class aufgabe4{
    public int cheapestKeyboard(int[]keyboards){
        int min=Integer.MAX_VALUE;
        for(int current:keyboards){
            if(current<min){
                min=current;
            }
        }
        return min;
    }
    public int mostExpensiveThing(int[] keyboards, int[]usb){
        Arrays.sort(keyboards);
        Arrays.sort(usb);
        if(keyboards[keyboards.length-1]>usb[usb.length-1]){
            return keyboards[keyboards.length-1];
        }
        else return usb[usb.length-1];
    }

    public int canAfford(int[]usb, int buget){
        Arrays.sort(usb);
        for(int i=usb.length-1;i>=0;i--){
            if(usb[i]<=buget){
                return usb[i];
            }
        }
        return 0;
    }

    public int maxPrice(int[]keyboards, int[]usb, int buget){
        Arrays.sort(keyboards);
        Arrays.sort(usb);
        for(int i=keyboards.length-1;i>=0;i--){
            for(int j=usb.length-1;j>=0;j--){
                if(keyboards[i]+usb[j]<=buget){
                    return keyboards[i]+usb[j];
                }
            }
        }
        return -1;
    }


}
