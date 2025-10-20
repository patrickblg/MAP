public class aufgabe3 {

    public int[] sum(int[] list1, int[] list2) {


        if (list1.length != list2.length) {
            throw new IllegalArgumentException("Zahlen mussen gleich lang sein");
        }

        int[] finalList = new int[list1.length + 1];
        int carry = 0;
        for (int i = list1.length - 1; i >= 0; i--) {
            if (list1[i] + list2[i] > 9) {
                finalList[i+1] = (list1[i] + list2[i]) % 10;
                carry = (list1[i] + list2[i]) / 10;

            } else {
                if(carry != 0){
                    finalList[i+1] = list1[i] + list2[i] + carry;
                }
                else{
                    finalList[i+1] = list1[i]+list2[i];
                }

                carry = 0;
            }

        }
        return finalList;
    }

    public int[] diff(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            throw new IllegalArgumentException("Zahlen mussen gleich lang sein");
        }
        int[] finalList = new int[list1.length];
        int borrow = 0;
        for (int i = list1.length - 1; i >= 0; i--) {

            int a=list1[i]-borrow;
            int b=list2[i];
            if(a<b){
                a+=10;
                borrow=1;

            }
            else borrow=0;
            finalList[i] = a-b;

        }
        return finalList;
    }

    public int[] mul(int[]list, int x) {
        int temp=0;
        int remainder=0;
        int[]finalList=new int[list.length+1];
        for(int i=list.length-1;i>=0;i--){
            temp=list[i]*x;
            if(temp>9){
                remainder=temp/10;
                finalList[i]=temp%10;
            }
            else{
                if(remainder!=0){
                    finalList[i]=remainder+temp;
                }
                else{finalList[i]=temp;}

                remainder=0;
            }


        }
        return finalList;
    }

    public int[] div(int[]list, int x) {
        int remainder=0;
        int[]finalList=new int[list.length];
        for(int i=0;i<list.length;i++){
            int current=remainder*10+list[i];
            finalList[i]=current/x;
            remainder=current%x;

        }
        return finalList;
    }
}
