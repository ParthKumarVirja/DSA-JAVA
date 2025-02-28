import java.util.HashMap;

public class hm {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);
        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);                   // 100
        System.out.println(hm.get("Indonesia"));      // null

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));      // true
        System.out.println(hm.containsKey("Indonesia")); // false

        //Remove  - O(1)
        System.out.println(hm.remove("China"));      // 150 
        System.out.println(hm); 

        //size & isEmpty
        System.out.println(hm.size());    
        System.out.println(hm.isEmpty());   // false

        hm.clear();          // clear hm
        System.out.println(hm.isEmpty());   // true


    }
}