package Uni_ds;

import java.util.*; 

public class Loopdet{ 
  
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
  
  
    static public void Insert(int new_data) 
    { 
       
        Node new_node = new Node(new_data); 
  
        new_node.next = head; 
  
        
        head = new_node; 
    } 
  
   
    static boolean detLoop(Node h) 
    { 
        HashSet<Node> s = new HashSet<Node>(); 
        while (h != null) { 
           
            if (s.contains(h)) 
                return true; 
  
           
            s.add(h); 
  
            h = h.next; 
        } 
  
        return false; 
    } 
  
    public static void main(String[] args) 
    { 
        Loopdet list = new Loopdet(); 
  
        list.Insert(20); 
        list.Insert(4); 
        list.Insert(15); 
        list.Insert(10); 
  
        list.head.next.next.next.next = list.head; 
  
        if (detLoop(head)) 
            System.out.println("Loop found"); 
        else
            System.out.println("No Loop"); 
    } 
} 
