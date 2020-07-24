public class ReverseWords {
    public String reverseWords(String s) {
        //   char[] sArray= s.toCharArray();
        //   int start=0;
        //   for(int i=0;i<sArray.length;i++){
        //       //System.out.println(sArray[i]+""+i+sArray.length);
        //       if(sArray[i]==' ' || i==sArray.length-1){
        //           int end=i-1;
        //           if(i==sArray.length-1) end =i; 
        //           while(start<end){
        //               char temp=sArray[start];
        //               sArray[start++]=sArray[end];
        //               sArray[end--]=temp;
        //           }
        //           start=Math.min(i+1,sArray.length-1);
        //       }
        //   }
        // return  new String(sArray);
          String[] str = s.split(" ");
          for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
          StringBuilder result = new StringBuilder();
          for (String st : str) result.append(st + " ");
          return result.toString().trim();
      }
}