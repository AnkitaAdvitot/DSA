
import java.util.Scanner;
import java.util.Stack;

class RedundantBrackets{

    static boolean redundant(String s){
        String str="+-*/";
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || str.contains(ch+"")){
                st.push(ch);
            }
            else{
                boolean flag=true;
                if(ch==')'){
                    while(st.peek()!='('){
                        if(str.contains(st.peek()+"")){
                            flag=false;
                        }
                        st.pop();
                    }
                    st.pop();
                    if(flag)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string ");
        String str=sc.next();

        System.out.println("Is string have redundant brackets "+redundant(str));
    }
}