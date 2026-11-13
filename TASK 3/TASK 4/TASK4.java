import java.util.*;

public class PharmacyInventory {
Sorted by key
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        hashMap.put("M103", 50);
        hashMap.put("M101", 30);
        hashMap.put("M102", 40);
        treeMap.putAll(hashMap);
        linkedMap.put("M103", 50);
        linkedMap.put("M101", 30);
        linkedMap.put("M102", 40);
        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedMap);
        System.out.println("Stock of M101: " + hashMap.get("M101"));
        System.out.println("Code Order Report:");
        for (Map.Entry<String, Integer> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println("Insertion Order Report:");
        for (Map.Entry<String, Integer> e : linkedMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
