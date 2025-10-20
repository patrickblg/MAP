import java.util.Arrays;

public class aufgabe1 {

    /// -a-
    public int[] failed(int[] list){

        int[]failedList = new int[list.length];
        int k=0;

        for(int i: list){
            if(i<0 || i>100){
                throw new IllegalArgumentException("Note ist nicht zwischen 0 und 100");
            }
            else if(i<40){
                failedList[k++] = i;
            }
        }
        int[]finalList = new int[k];
        int ct=0;
        for(int i: failedList){
            if(i!=0){
                finalList[ct++] = i;
            }
        }
        return finalList;
    }
    /// -b-
    public void avg(int[] list){
        double sum=0;
        for(int i: list){
            sum+=i;
        }
        System.out.printf("%.2f%n",sum/list.length);
    }
    /// -c-
    public int[] roundedGrades(int[]list){
        int[]roundedList = new int[list.length];
        for(int i=0; i<list.length; i++){
            if(list[i]<38){
                roundedList[i]=list[i];
            }
            else{
                int nextM=((list[i]/5)+1)*5;
                if(nextM-list[i]<3){roundedList[i]=nextM;}
                else{roundedList[i]=list[i];}
            }

        }
        return roundedList;
    }

    /// -d-
    public int maxRounded(int[]list){
        int[]maxRoundedList = roundedGrades(list);
        Arrays.sort(maxRoundedList);
        return maxRoundedList[maxRoundedList.length-1];
    }
}
