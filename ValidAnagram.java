public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

    if(s.length()!=t.length()) return false;
    int[] table=new int[26];
    char[] sarray=s.toCharArray();
    char[] tarray=t.toCharArray();

    for(int i=0;i<sarray.length;i++){
        
        table[sarray[i]-'a']++;
        table[tarray[i]-'a']--;

    }
    
    for(int i:table){
        if(i!=0){
            return false;
        }
    }
    
    return true;
}
    
}