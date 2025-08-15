/*
import java.util.*;
class MyArrayList{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<>();
		Collection c =new ArrayList<>();
		c.add("hita");
		al.add("A");
		al.addAll(c);
		al.add("hello");
		al.remove(1);
		al.add(null);
		al.add("A");
		System.out.println(al.isEmpty());
		System.out.println(al.contains("hita"));
		System.out.println(al);
    }

}

*/

// counting duplicates in array
/*
import java.util.Scanner;
class MyArrayList{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		int count=0;
		for(int i =0;i<n-1;i++){
			for(int j=i+1;j<=n;j++){
				if(arr[i]==arr[j]){
					count++;
					n=delete(j,arr,n);
					n--;
					
					
				}
				
			}
		}
		System.out.println(count);
		//for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
		
		//}
		
	}
	public static int delete(int index,int arr[],int n){
		for (int i = index; i < n- 1; i++) {
		{
			arr[i]=arr[i+1];
		}
		}
		return n--;
	}
	
}

*/



// LinkedList , Vector example
/*
import java.util.*;
class MyArrayList{
	public static void main(String[] args){
		List ll = new LinkedList();
	//	List l=new List();
		//l.add("me");
		List al=new ArrayList();
		al.add("hita");
		//al.add(l);
		ll.add("A");
		ll.add("B");
		ll.add("C");
		System.out.println(ll);
		ll.addFirst("Z");
		ll.addLast(null);
		ll.addLast(al);
		System.out.println(ll);
		System.out.println(" vector ");
		Vector v=new Vector();
		v.addElement("f");
		v.addElement("g");
		v.addElement("h");
		v.add(3);
		v.addAll(ll);
		System.out.println(v);
		v.removeElement("h");
		v.removeElementAt(1);
		System.out.println("size"+v.size());
		System.out.println("capacity"+v.capacity());
		System.out.println(v.elementAt(2));
System.out.println(v.firstElement());
System.out.println(v.lastElement());
System.out.println(v);		
	}
}

*/



//vector -> stack
/*

import java.util.*;
class MyArrayList{
	public static void main(String[] args){
		Stack v = new Stack();
		v.push(8);
		v.push("h");
		v.push(2004);
		v.push("jan");
		System.out.println("element poped is "+v.pop());
		System.out.println(v);
		System.out.println(v.peek());
		System.out.println(v.empty());
		System.out.println(v.search("h"));
	}
}


*/








//Cursors(includes all)
/*import java.util.*; 
import java.lang.String;
class MyArrayList{
	public static void main(String args[]){
		Vector v = new Vector();
		ArrayList al= new ArrayList();
		for(int i=1;i<=10;i++){
			al.add(i);
		}
		v.addAll(al);
		//for(int i=1;i<10;i++){
		//System.out.print(v.get(i));
		//}
		//System.out.println(v.get());
		Enumeration e =v.elements();
		Iterator i=v.iterator();
		ListIterator l = v.listIterator();
		
		//Enumeration e1 =al.elements(); 
		Iterator i1=al.iterator();
		ListIterator l1 = al.listIterator();
		//Enumeration e1 =al.elements();
		//System.out.println(e1.getClass().getName());
		//System.out.println(i1.getClass().getName());
		//System.out.println(l1.getClass().getName());
		//System.out.println(v.get(10));
		while(e.hasMoreElements()){
			//String i2=String.valueOf(e.nextElement());
			System.out.println(e);
	}
}
}
*/


// iterator coursor 
/*import java.util.*;

class MyArrayList{
	public static void main(String args[]){
		Vector v = new Vector();
		for(int i=0;i<10;i++){
			v.add(i);
		}
		Iterator i =v.iterator();
		while(i.hasNext()){
			
		System.out.println(i.next());
		i.remove();}
		System.out.println("size of vector after remove mathod called"+v.size());
	}
}
*/



// linkedhashset
/*
import java.util.*;
class MyArrayList{
	public static void main(String[] args){
		HashSet h1=new HashSet();
		LinkedHashSet h = new LinkedHashSet();
		SortedSet s =new TreeSet();
		s.add("S");
		s.add("s");
		s.add("h");
		s.add(6);
		//for(int i=0;i<10;i++){
			//h.add(i);
		//}
		//System.out.println(h.add(8));
		h.add("H");
		h.add(29);
		h.add("o");
		h1.add("H");
		h1.add(29);
		h1.add("o");
		h1.add("hello");
		h1.add("bye");
		System.out.println(s);
		//System.out.println(h1);
	}
}
*/




//comparation 
//comparable is default comparision
//comparator is customized comparision
/*
import java.util.*;
class MyArrayList{
	public static void main(String args[]){ 
		TreeSet t = new TreeSet(new MyComparatorMixed());
		t.add("XX");
		t.add("A");
		t.add(new StringBuffer("hita"));
		t.add(new StringBuffer("Me"));
		//t.add(new StringBuffer(263));
		System.out.println(t);
	}
	
	//for integer object comparision
	static class MyComparator implements Comparator{
		public int compare(Object obj1, Object obj2){
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			/*if(i1<i2){
				return +1;
			}
			else if(i1>i2)
				return -1;
			else 
				return 0;*/
			//return -i1.compareTo(i2);
			/*return i2.compareTo(i1);
}

	}
	
	// for String objects comparision
	static class MyComparatorString implements Comparator{
		public int compare(Object obj1, Object obj2){
			String i1=(String)obj1;
			String i2=(String)obj2;
			return -i1.compareTo(i2); 
		}
	}/*
	// for StringBuffer objects comparision
	static class MyComparatorStringBuffer implements Comparator{
		public int compare(Object obj1, Object obj2){
			String i1=obj1.toString();
			String i2=obj2.toString();
			return -i1.compareTo(i2); 
		}
	}
	
	
	/*
	static class MyComparatorMixed implements Comparator{
		public int compare(Object obj1,Object obj2){
			String s1=obj1.toString();
			String s2=obj2.toString();
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2)
				return -1;
			else if(l1>l2)
				return +1;
			else 
				return s1.compareTo(s2);
		}
	}
}



*/





// for customized class 
/*
import java.util.*;
class Employee implements Comparable{
	String name;
	int eid;
	Employee(String name , int eid){
		this.name=name;
		this.eid=eid;
	}
	public String toString(){
		return name+"--"+eid;
	}
	//for integer comparision
	public int compareTo(Object obj){
		int eid1=this.eid;
		Employee e =(Employee)obj;
		int eid2=e.eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return +1;
		else 
			return 0;
	}
}

class MyArrayList{
	public static void main(String args[]){
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("balaish",150);
		Employee e3=new Employee("chiru",50);
		
		Employee e4=new Employee("nag",100);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
	}
}

// for string comparision 
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
}
*/


//priority queue
/*
import java.util.*;
class MyArrayList{
	public static void main(String args[]){
		PriorityQueue q= new PriorityQueue();
		/*q.offer("H");
		q.offer("hita");
		q.add("gdfu");
		q.add("iyksgs");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q);
		
		PriorityBlockingQueue p = new PriorityBlockingQueue();
		p.offer("ufedaa");
		p.offer("H");
		p.offer("hita");
		p.add("gdfu");
		p.add("iyksgs");
		System.out.println(p.toString());
	}
}
*/


//LinkedHashMap
/*
import java.util.*;
class MyArrayList{
	public static void main(String args[]){
		/*LinkedHashSet h = new LinkedHashSet();
		h.add("hita");
		h.add("j");
		h.add(67);
	   System.out.println(h);
	   	TreeSet h = new TreeSet();
		h.add("hita");
		h.add("j");
		h.add("67");
	   System.out.println(h);
	   
	}
}
*/



// to find subset of particular number
/*
import java.util.*;
class array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		Object res[]=Subset(arr , sum);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
		
	}
	public static int[] sum(int arr[] , int n){
		int sum=0;
		int x=0;
		int temp[]=new int[arr.length];
		while(sum<n){
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
			if(sum<n){
				sum=sum-arr[i];
				i++;
				
				sum=sum+arr[i];
			}
			temp[x]=arr[i];
			x++;
			
		}
		}
		return temp;
	}
	
	public static Object[] Subset(int arr[],int sum){
		int n=0;
		ArrayList a = new ArrayList();
		for(int i=0;i<arr.length;i++){
			if(n+arr[i]<=sum){
				sum=+arr[i];
				a.add(arr[i]);
			}
		}
		
		Object temp[] = new Object[a.size()];
		for(int i=0;i<a.size();i++){
			temp[i]=a.get(i);
		}
		return temp;
	}
}
*/







//new exception throw 
/*
import java.util.*;
class MyArrayList{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		Test t = new Test();
		
		
		System.out.println(t.divide(num));
	}
	static class Test{
		public static int divide(int num){
		 
			if(num==0){
			throw new ArithmeticException("divide by zero "+num);}
			int sum =(num/0);
		 return sum;
		 
		}
	}
}
*/





/*import java.util.*;
import java.io.*;
class MyArrayList{
	public static void main(String[] args){
		try(FileInputStream fin=new FileInputStream("abc.properties");){
		Properties p = new Properties();
		
		p.load(fin);
		System.out.println(p);}
		catch(FileNotFoundException){
			System.out.println(e.message());
		}
		catch(IOException){
			System.out.println(e.message());
		}
	}
}
 */
 
 /*
import java.util.*;
class MyArrayList{
	public static void main(String[] args){
		int[] a={35,53,7,02,6};
		for(int a1:a){
			System.out.println(a1);
		}
		System.out.println("-------");
		Arrays.sort(a);
		for(int a1:a){
			System.out.println(a1);
		}
		Object[] obj = {"A","j","G"};
		System.out.println("-------");
		Arrays.sort(obj);
		for(Object obj1:obj){
			System.out.println(obj1);
		}
	System.out.println("-------");
		Arrays.sort(obj,new MyComparator());
		for(Object obj1:obj){
			System.out.println(obj1);
		}
	}
	
	static class MyComparator implements Comparator{
		public int compare(Object obj1, Object obj2){
			String s1= obj1.toString();
			String s2=obj2.toString();
			return s2.compareTo(s1);
		}
	}
	
}
*/


/*
 Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
               
                 if(x>=-128 & x<=127 &x==0)System.out.println("* byte");{
                
                if(x>=-32767 && x<=32766){
                    System.out.println("* short");
                }
                  if (x>=-2147483648 && x<=2147483647){
                
                    System.out.println("* int");
                }
               
            
                if(x>=-9223372036854775808L  && x<=9223372036854775807L ) {
            
                System.out.println("* long");
                }
                 }
            
        }
		*/
		
		
		
		
		
		
import java.util.*;
class MyArrayList{
	public static void main(String[] args){
		ArrayList l = new ArrayList();
		
		l.add("hista");
		l.add("huarr");
		l.add("iam");
		l.add("ag");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		Collections.sort(l, new MyComparator());
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
	static class MyComparator implements Comparator{
		public int compare(Object obj1, Object obj2){
			String i1 = obj1.toString();
			String i2 = obj2.toString();
			return i2.compareTo(i1);
		}
	}
}
