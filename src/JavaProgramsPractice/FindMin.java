package JavaProgramsPractice;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,10,32,42,56,6};
        int ans = minimunValue(arr);
        System.out.println(ans);

    }
    static int minimunValue(int[] arr){
        int minValue = arr[0];
        for ( int i=0;i<arr.length;i++){
            if(minValue>arr[i]){
                minValue = i;
            }

        }
        return minValue;

    }


}
