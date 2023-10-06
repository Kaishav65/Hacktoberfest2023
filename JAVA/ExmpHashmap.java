import java.util.HashMap;
public class ExmpHashmap {
   public static void main(String[] args){
      HashMap<Integer, String> hm = new HashMap<>();
      hm.put(12, "John");
      hm.put(2, "Smith");
      hm.put(7, "Peter");
      System.out.println("HashMap object output :" + hm);
      hm.put(12, "Smith");
      System.out.println("After inserting duplicate key :" + hm);
   }
}


//OUTPUT

/*
HashMap object output :
{2=Smith, 7=Peter, 12=John}
After inserting duplicate key :   hm.put(12, "Smith");
{2=Smith, 7=Peter, 12=Smith}     

   HashMaps allow for duplicate values, but not duplicate keys. If a duplicate key is added, the previous value associated with the key is overwritten(replaced).
*/

