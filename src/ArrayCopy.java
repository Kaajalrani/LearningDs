public class ArrayCopy {
    public static void main(String[] args) {
       int[] arr = new int[] {12,54,76,64,45};
       int max = arr[0];
       for(int i = 0; i<arr.length; i++){
           if(arr[i]>max){
               max = arr[i];
           }

       }
        System.out.println(max);

    }



}
