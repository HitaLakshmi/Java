
import java.util.*;
public class Expressions {
	public static void main(String[] args) {
		String s="((C-D)*(a*b))";
		System.out.println(s); // ((C-D)*(a*b))
		System.out.println("Postfix------------->");
		String a1=intopost(s);
		System.out.println(a1);//CD-ab**
		System.out.print("Prefix------------->");
		String a2=intopre(s);
		System.out.println(a2);//*-CD*ab
		System.out.print("POST TO IN  ");
		System.out.println(posttoin(a1));// ( ( C-D )*( a*b ) )
		System.out.print("Pre TO IN  ");
		System.out.println(pretoin(a2)); //((C-D )*(a*b ) )
		System.out.println(posttopre(a1));//* - C D * a b
		System.out.println(pretopost(a2));//CD-ab**
	}
	public static String intopost(String s) {
		Stack<Character> st=new Stack<>();
		String ans="";
		for(Character c:s.toCharArray()) {
			//operand
			if((c>='A' && c<='Z')|| (c>='a' && c<='z')|| (c>='0' && c<='9')) {
				ans+=c;
			}
			
			else if(c=='(') {
				st.push(c);
			}
			else if(c==')') {
				while(!st.isEmpty() && st.peek()!='(') {
				ans+=st.pop();
			}
				st.pop(); // remove '('
			}
			else {
				while(!st.isEmpty() && priority(st.peek())>=priority(c)) {
					ans+=st.pop();
				}
				st.push(c);
			}
			
		}
		while(!st.isEmpty()) {
			ans+=st.pop();
			}
		return ans;
	}
	
	// use getters and setters to access private variables
	
	private static int priority(Character c) {
		if(c=='^') {
			return 3;
		}
		else if(c=='*' || c=='/') {
			return 2;
		}
		else if(c=='+' ||c=='-') {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static String intopre(String st) {
		String s=reverseSwap(st);
		String ans=intopost(s);
		return reverse(ans);
	}
	private static String reverse(String st) {
		int left=0;
		int right=st.length()-1;
		String ans="";
		for(int i=st.length()-1;i>=0;i--) {
			ans+=st.charAt(i);
		}
		return ans;
	}
	public static String reverseSwap(String st) {
		StringBuffer s=new StringBuffer();
		for(int i=st.length()-1;i>=0;i--) {
			char c=st.charAt(i);
			if(c=='(') {
				s.append(')');
			}
			else if(c==')') {
				s.append('(');
			}
			else {
			s.append(c);
		}
		}
		return s.toString();
	}
	
	public static String posttoin(String st) {
		Stack<String> sta=new Stack<>();
		String ans="";
		for(Character c:st.toCharArray()) {
			if((c>='A' && c<='Z')|| 
					(c>='a' && c<='z')|| 
					(c>='0' && c<='9')) {
				sta.push(c.toString());
			}
			else {
				String c1=sta.pop();
				String c2=sta.pop();
				String s="( "+ c2+ c+ c1+" )";
				sta.push(s);
			}
			
			
			
		}
		return sta.pop();
		
	}
	
	public static String pretoin(String s) {
		Stack<String> sta=new Stack<>();
		for(int i=s.length()-1;i>=0;i--) {
			Character c=s.charAt(i);
			if((c>='A' && c<='Z')|| (c>='a' && c<='z')||
					(c>='0' && c<='9')) {
				sta.push(c.toString());
			}
			else {
				String s1=sta.pop();
				String s2=sta.pop();
				String sub="("+ s1+c+s2+" )";
				sta.push(sub);
			}
			
		}
		return sta.pop();
	}
	public static String posttopre(String s) {
		Stack<String> sta=new Stack<>();
		for(Character c:s.toCharArray()) {
			if((c>='A' && c<='Z')||(c>='a' && c<='z')||(c>='0' && c<='9')) {
				sta.push(c.toString());
			}
			else {
				String s1=sta.pop();
				String s2=sta.pop();
				String sub=c+ " "+s2+" "+s1;
				sta.push(sub);
			}
		}
		return sta.pop();
	}
	
	public static String pretopost(String s) {
		Stack<String> sta=new Stack<>();
		for(int i=s.length()-1;i>=0;i--) {
			Character c=s.charAt(i);
			if((c>='A' && c<='Z')||(c>='a' && c<='z')||(c>='0' && c<='9')) {
				sta.push(c.toString());
			}
			else {
				String s1=sta.pop();
				String s2=sta.pop();
				String sub=s1+s2+c;
				sta.push(sub);
			}
			
		}
		return sta.pop();
	}
}
 
