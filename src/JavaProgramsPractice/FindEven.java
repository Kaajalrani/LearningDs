package JavaProgramsPractice;

public class FindEven {


    public static void main(String[] args) {
        int[] num = {1234,56,7,8,908};
        int ans = findEvenNumber(num);
        System.out.println(ans);

    }
    static  int findEvenNumber(int[] num){
        int count = 0;
        for(int num1 : num){
            if(even(num1)){
                count++;
            }
        }
        return count;

    }

   static boolean even(int num1) {
        int digits = findDigits(num1);
       /* if(digits%2 == 0){
            return true;
        }
        return false;*/
       return digits%2 == 0;
    }

    static int findDigits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;

    }
}
