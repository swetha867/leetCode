import java.util.Stack;

public class DialyTemperatures {
        public int[] dailyTemperatures(int[] T) {
           //  int[] result=new int[T.length];
           // // int days=0;
           //  for(int i=0;i<T.length;i++){
           //      int days=0;
           //      for(int j=i;j<T.length;j++){
           //          if(T[j]>T[i]){
           //              result[i]=days;
           //              break;
           //          }
           //          days++;
           //      }
           //  }
           //  return result;
             Stack<Integer> stack = new Stack<>();
            int[] res = new int[T.length];
            for (int i = 0; i < T.length; i++) {
                while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                    res[stack.peek()] = i - stack.pop();
                }
                stack.push(i);
            }
            return res;
        }
    
}