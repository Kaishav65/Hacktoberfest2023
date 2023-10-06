import java.util.HashSet;
public class ExmpHashset {
   public static void main(String[] args){
      HashSet<String> hs = new HashSet<>();
      hs.add("John");
      hs.add("Smith");
      hs.add("Peter");
      System.out.println("Before adding duplicate values " + hs);
      hs.add("John");
      hs.add("Smith");
      System.out.println("After adding duplicate values " + hs);
      hs.add(null);
      hs.add(null);
      System.out.println("After adding null values " + hs);
   }
}


/*
//OUTPUT

Before adding duplicate values
[John, Smith, Peter]
After adding duplicate values
[John, Smith, Peter]
After adding null values
[null, John, Smith, Peter]

*/






