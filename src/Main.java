import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"John");
        myMap.put(2,"Tom");
        myMap.put(3,"Helen");
        myMap.put(4,"Jacob");
        myMap.put(5,"Clara");

        System.out.println(getKey(myMap));
    }

    public static Set <Integer> getKey(HashMap<Integer,String> hashMap){
        return hashMap.keySet();
    }
}

