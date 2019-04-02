/**
Java program to create a linked list
*/
public class FindMiddleElement  
{   
  public static class Node  
  {  
    int data;  
    Node next;  
  } 
  public static Node head = null;  
  public static Node tref = null;
 
   /**
  Function to add a node at the end of a List 
  */
  public static void pushAtEnd(int new_data)  
  {  
    Node new_node = new Node();  
    new_node.data = new_data;  
    if(head == null)
      head = tref = new_node; 
    else
      tref.next = new_node;

    tref = new_node;
    tref.next = null;
  }  
  
  /**
  Function to print nodes in a given linked list 
  */
  public static int middleElement(Node node)  
  {  
    Node fastptr = node;
	Node slowptr = node;
	while (fastptr != null && fastptr.next != null)  
    {  
      fastptr = fastptr.next.next;
	  slowptr = slowptr.next;
    }
	return slowptr.data;
  }  

  /**
  Start function for JVM
  */
  public static void main(String[] args)  
  {
	head = null;
    pushAtEnd(10);
    pushAtEnd(12);
    pushAtEnd(14);
    pushAtEnd(15);
    pushAtEnd(16);
    pushAtEnd(20);

    System.out.println();

    System.out.println(middleElement(head));  
  } 
} 
