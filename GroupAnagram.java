import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length==0) return new ArrayList<>();
        Map<String,List> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            
            // char c[]=strs[i].toCharArray();
            // Arrays.sort(c);
            // String key=String.valueOf(c);
            char[] ca = new char[26];
            for (char c : strs[i].toCharArray()) ca[c - 'a']++;
            String key = String.valueOf(ca);
            if(!map.containsKey(key)) map.put(key,new ArrayList<>());
            map.get(key).add(strs[i]);
            
        }
        return new ArrayList(map.values());
        
    }
    
}