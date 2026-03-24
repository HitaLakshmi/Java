
import java.util.*;
 class TreeNode {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Tree n=new Tree();
	n.add(sc);
	n.preorder(n.root);
	n.search(85);
	n.delete(332);
	}

}
class Node{
	int value;
	Node right;
	Node left;
	public Node(int value) {
		this.value=value;
		
	}
}
class Tree{
	Node root;
	public void add(Scanner sc) {
		System.out.println("Enter root value");
		int value=sc.nextInt();
		 root=new Node(value);
		 add(sc,root);
		 
	}
	public void add(Scanner sc,Node node) {
		System.out.println("Do u want to enter left ");
		boolean left=sc.nextBoolean();
		if(left) {
			System.out.println("Enter left value");
			int value=sc.nextInt();
			node.left=new Node(value);
			add(sc,node.left);
		}
		System.out.println("Do u want to enter right ");
		boolean right=sc.nextBoolean();
		if(right) {
			System.out.println("Enter right value");
			int value=sc.nextInt();
			node.right=new Node(value);
			add(sc,node.right);
		}
	}
	
	public void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.value);
		inorder(node.right);
	}
	
	public void preorder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.value);
		preorder(node.left);
		preorder(node.right);
	}
	public void postorder(Node node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.value);
	}
	
	
	public void bfs(Node node) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node curr=queue.remove();
			System.out.println(curr.value+" ");
			if(curr.left!=null) {
				queue.add(curr.left);
			}
			if(curr.right!=null) {
				queue.add(curr.right);
			}
			
		}
	}
	public void search(int value ){
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node curr=queue.remove();
			if(curr.value==value){
				System.out.println("Found");
				return;
			}if(curr.left!=null){
				queue.add(curr.left);
			}
			if(curr.right!=null){
				queue.add(curr.right);
			}
		}
			System.out.println("Not found");
		
		
	}
	
	public void insertLast(int value){
		Node newNode=new Node(value);
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node curr=queue.remove();
			if(curr.left==null){
				curr.left=newNode;
				break;
			}
			if(curr.right==null){
				curr.right=newNode;
			break;
			}
			queue.add(curr.left);
			queue.add(curr.right);
		}
	}
	
	public int findDeepest(){
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		Node curr=null;
		while(!queue.isEmpty()){
			curr= queue.remove();
			if(curr.left!=null){
				queue.add(curr.left);
			}
			if(curr.right!=null){
				queue.add(curr.right);
			}
		}
				return curr.value;
	}
	public void deleteDeepest(){
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		Node previous=null,present=null;
		while(!queue.isEmpty()){
			previous=present;
			present= queue.remove();
			if(present.left==null){
				previous.right=null;
				return;
			}
			if(present.right==null){
				present.left=null;
				return;
				
			}
			queue.add(present.left);
			queue.add(present.right);
		}
	}
	
	public void delete(int value){
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		Node curr=null;
		while(!queue.isEmpty()){
			curr= queue.remove();
			if(curr.value==value){
				curr.value=findDeepest();
				deleteDeepest();
				System.out.println("Deleted");
				return;
			}
			else{
				if(curr.left!=null){
					queue.add(curr.left);
				}
				if(curr.right!=null){
					queue.add(curr.right);
				}

			}
			
		}
		System.out.println("Not deleted");
	}
		
		
	
}