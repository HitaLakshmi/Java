import java.util.*;
class pra
{
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> map=new ArrayList<>();
		ArrayList<Integer> inner=new ArrayList<>();
		ArrayList<Integer> outer=new ArrayList<>();
		inner.add(2);
		inner.add(63);
		map.add(inner);
		outer.add(3426);
		outer.add(353);
		map.add(outer);
		
		for(int i=0;i<map.size();i++){
			for(int j=0;j<map.get(i).size();j++){
				System.out.println(map.get(i).get(j));
			}
		}
	}
}

class pra{
	public static void main(String[] args){
		
	}
	
	public void balance(String st,int i,int j){
		Stack<Character> sta=new Stack<>();
		st.substring(i,j);
		for(int i=0;i<s.length;i++){
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='['){
				sta.push(c);
			}
			else if(c==']' && sta.peek()=='['){
				sta.pop();
				return true;
			}
			else if(c==')' && sta.peek()=='('){
				sta.pop();
				return true;
			}
			else if(c=='}' && sta.peek()=='{'){
				sta.pop();
				return true;
			}
			return false;
}
