package Uni_ds;

public class InsertNode {
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=next;
		}
	}
		Node head;
		public void Insert(int new_data)
		{
			Node new_node=new Node(new_data);
			new_node.next=head;
			head=new_node;
		}
		public void InsertAfter(Node prev_node,int new_data)
		{
			if(prev_node==null)
			{
				System.out.println("NODe is null");
			}
			else
			{
				Node new_node=new Node(new_data);
				new_node.next=prev_node.next;
				prev_node.next=new_node;
			}
		}
		public void printlist()
		{
			Node newn=head;
			while(newn!=null)
			{
				System.out.println(newn.data);
				newn=newn.next;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertNode list=new InsertNode();
		list.Insert(11);
		list.Insert(22);
		list.Insert(82);
		list.InsertAfter(list.head.next, 8);
		list.printlist();
	}

}
