package Uni_ds;

public class ReverseLinkedlist { 
	  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to reverse the linked list */
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node n = node; 
        Node next = null; 
        while (n != null) { 
            next = n.next; 
            n.next = prev; 
            prev = n; 
            n = next; 
        } 
        node = prev; 
        return node; 
    } 
  
    // prints content of double linked list 
    void show(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        ReverseLinkedlist list = new ReverseLinkedlist(); 
        list.head = new Node(11); 
        list.head.next = new Node(22); 
        list.head.next.next = new Node(33); 

  
        System.out.println("Linked list"); 
        list.show(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("After reversing "); 
        list.show(head); 
    } 
} 