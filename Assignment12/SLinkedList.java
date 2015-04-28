

public class SLinkedList extends List
{
   private Object data;
   private SLinkedList next;
   private  int size ;
   public SLinkedList()
   {
      data = new Object();
      next = null;
      size=0;
   }
 
   public SLinkedList(Object value)
   {
      data = value;
      next = null;
      
   }
 
   public Object get(int index){
	  
       if(index < size){
           return Traverse(null,index);
       } else {
           throw new ArrayIndexOutOfBoundsException();
       }
   }
   
   public Object Traverse(SLinkedList node, int index)
   {
	   int cntr=0;
      if(node == null)
         node = this;
      System.out.println("\n\nTraversing in Forward Direction\n\n");
      if(index==0)
    	  return this.data;
      while(node != null)
      {
    	  
         System.out.println(node.data);
         node = node.next;
         if(cntr==index)
         {        
        	 return node.data;
        	 
         }
         cntr++;
      }
      return null;
   }
 
   public void add(Object value)
   {
	   size++;
      SLinkedList node = new SLinkedList(value);
      if(this.next == null)
      {
         // 
         node.next = null; 
         this.next = node;
      }
      else
      {
         
         SLinkedList temp = this.next;
         node.next = temp;
         this.next = node;
       }
       
   }
   
   public int size()
   {
       return size;
   }  
}