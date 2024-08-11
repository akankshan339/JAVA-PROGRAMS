import java.io.*;
public class stackclass{
    public class Node{
        int data;
        Node next;          //data type of next is Node
        public Node(int data)     //constructor of Node class
        {
            this.data=data;
            next=null;
        }
        public class stack
        {
            public static Node head;
            public static boolean isEmpty()
            {
               return head==null; 
            }
        }
        
             public  void push(int data)
             {
                 Node newNode=new Node(data);
                 if(isEmpty())
                 {
                     head=newNode;
                     return;
                     }
                 newNode.next=head;
                 head=newNode;
                 if(head==null)
                 {
                     
                     }
                    }
                    
                    public static int pop()
                    {
                          if(isEmpty())
                          {
                              return -1;
                            }
                         int top=head.data;
                         head=head.next;
                         return top;
                     }
                     
                     public static int peek()
                     {
                       if(isEmpty())
                       {
                              return -1;
                            }
                            return head.data;
                     }
                     
             public static void main(String args[])throws IOException{
                 //stacklass s=new stackclass();
                 Node s=new Node();
                 s.push(1);
                 s.push(2);
                 s.push(3);
                 s.push(4);
                 while(!s.isEmpty()){
                     System.out.println(s.peek());
                    s.pop();
                     
                 }
                 
             }
            
        }
    }


    
    
        
    
