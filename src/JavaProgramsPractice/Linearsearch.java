package JavaProgramsPractice;

public class Linearsearch {
    public static void main(String[] args) {

        int[] arr = {12,34,56,78,90};
         int target = 34;
         boolean ans = search1(arr,target);
        System.out.println(ans);
        int ans2 = search2(arr,target);
        System.out.println(ans2);
    }

     static boolean search1(int[] arr, int target) {
        if(arr.length == 0){
            return false;
        }
        for (int element : arr){
            if (element==target){
                return true;
            }

        }
        return false;
    }

    static int search2(int[] arr, int target){
        if(arr.length== 0){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -2;
    }


}
