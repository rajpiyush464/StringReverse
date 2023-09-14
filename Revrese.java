import java.util.*;
public class Revrese {
    public static void main(String[] args)
    {
          String s="GeeksforGeeks";
          Stack<Character> st= new Stack<Character>();
          for(int i=0;i<s.length();i++)
          {
            st.push(s.charAt(i));
          }
          StringBuilder sb= new StringBuilder();
          while(!st.isEmpty())
          {
            char c=st.pop();
            sb.append(c);

          }
          System.out.println("The reverse of the string is"+sb.toString());
    }
}
