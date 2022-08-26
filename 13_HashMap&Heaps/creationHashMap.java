import java.util.*;

public class creationHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",135);
        hm.put("China",140);
        hm.put("USA",350);
        hm.put("Nigeria",300);
        hm.put("Indonesia",280);
        hm.put("Pakistan",200);

        hm.put("Kenya",150);
        hm.put("India",140);
        
        hm.get("China");
        hm.get("Nepal");
        
        hm.containsKey("USA");
        hm.containsKey("England");
        
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        System.out.println();
        for(String key : hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }

    }
}
