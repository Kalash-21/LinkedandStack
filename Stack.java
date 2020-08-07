package Uni_ds;
class Stackp_p { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX];
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stackp_p() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stackp_p s = new Stackp_p(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop()); 
    } 
}