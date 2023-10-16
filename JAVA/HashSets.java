import java.util.*;
class HashSets{
    public static void main(String[] args) {
        Set <String> set= new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        ArrayList<String> list= new ArrayList<String>();
        list.add("x");
        list.add("y");
        list.add("z");
        set.addAll(list);
        Iterator<String> itr=set.iterator();
        while(itr.hasNext() ){
            System.out.println(itr.next());
        }
        set.clear();
        System.out.println("Deleted all elements\nNew elements");
        
        set.add("John");
        set.add("David");
        set.add("Mike");
        set.add("Ricky");
        Iterator<String> itr2=set.iterator();
        while(itr2.hasNext() ){
            System.out.println(itr2.next());
        }
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name to search: ");
            String name=sc.next();

            if(set.contains(name))
                System.out.println(name+" found in the list");
            else
                System.out.println(name+" not found in the list");
        }
    }
}


