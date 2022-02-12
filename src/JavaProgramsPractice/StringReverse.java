package JavaProgramsPractice;

public class StringReverse {
    public static void main(String[] args) {
      String str = "hello";
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
