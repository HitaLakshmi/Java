package practice;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Que {
    Node front;
    Node rear;

    // ENQUEUE (add at rear)
    public void add(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // PEEK (front element)
    public int peek() {
        if (front == null) return -1;
        return front.value;
    }

    // DEQUEUE (remove from front)
    public int remove() {
        if (front == null) return -1;

        int ans = front.value;
        front = front.next;

        // if queue becomes empty
        if (front == null) {
            rear = null;
        }
        return ans;
    }

    // DISPLAY
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Queue {
	
    public static void main(String[] args) {
        Que q = new Que();
        q.add(8);
        q.add(65);
        q.add(97);
        q.add(52);

        q.display();          // 8 -> 65 -> 97 -> 52 -> null
        System.out.println(q.peek());   // 8
        System.out.println(q.remove()); // 8
        q.display();          // 65 -> 97 -> 52 -> null
    }
}
