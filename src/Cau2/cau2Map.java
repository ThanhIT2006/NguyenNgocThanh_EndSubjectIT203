package Cau2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class cau2Map {
    private String key;
    private Map<Integer, LinkedHashSet<String>> lengthMap;

    public cau2Map(String key){
       this.key = key;
       this.lengthMap = new LinkedHashMap<>();
    }
    public  boolean isValid(){
        return key != null && !key.trim().isEmpty();
    }
    public void process(){
        if (!isValid()) return;
        String[] raw = key.trim().split("\\s+");
        for (String w : raw) {
            String cleaned = w.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase();
            if (cleaned.isEmpty()) continue;
            int len = cleaned.length();
            lengthMap.computeIfAbsent(len, k -> new LinkedHashSet<>()).add(cleaned);
        }
    }
    public void display(){
        Map<Integer, LinkedHashSet<String>> sorted = new TreeMap<>(lengthMap);
        for (Map.Entry<Integer, LinkedHashSet<String>> entry : sorted.entrySet()){
            System.out.println(entry.getKey() + " ký tự " + entry.getValue());
        }
    }
}
