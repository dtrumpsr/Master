
import java.util.Stack;

public class BookShelf  {

	public BookShelf()
	{
		
	}
	 private  Stack<Book> stack = new Stack<Book>(); 
	 
	 public void setBook(Book book) {
		 push(book); }

	    public Book getBook() {
	        return stack.pop(); }
	    
	    public int numBooks()
	    {
	      return stack.size();
	    }
	    
	    public void  push(Book b) {
	    	stack.push(b);
	        while (stack.size() > 5) {
	        	stack.removeElementAt(stack.size() - 1);
	        }
	        
	    }
}