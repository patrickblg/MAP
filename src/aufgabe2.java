import java.util.Arrays;

public class aufgabe2 {

    public int maxNum(int[]list){
        Arrays.sort(list);
        return list[list.length-1];

    }
    public int minNum(int[]list){
        Arrays.sort(list);
        return list[0];
    }

    public int maxSum(int[]list){
        Arrays.sort(list);
        int sum=0;
        for(int i=1;i<list.length;i++){
            sum+=list[i];

        }
        return sum;

    }

    public int minSum(int[]list){
        Arrays.sort(list);
        int sum=0;
        for(int i=0;i<list.length-1;i++){
            sum+=list[i];
        }
        return sum;
    }

}
