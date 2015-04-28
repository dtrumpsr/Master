
import junit.framework.*;

public class BookShelfTest extends TestCase {
   protected BookShelf emptybookshelf=null;
   protected BookShelf  fullbookshelf=null;
   
   // assigning the values
   protected void setUp(){
	   emptybookshelf= new BookShelf();
	   fullbookshelf=new BookShelf();
	   fullbookshelf.setBook(new Book("B1", "A1", "P1", 1990));
	   fullbookshelf.setBook(new Book("B2", "A2", "P2", 1991));
	   fullbookshelf.setBook(new Book("B3", "A3", "P3", 1992));
	   fullbookshelf.setBook(new Book("B4", "A4", "P4", 1993));
	   fullbookshelf.setBook(new Book("B5", "A5", "P5", 1994));
   }

   
   public void testemptyBookShelfNumBooks(){
      int result= emptybookshelf.numBooks();
      assertTrue(result == 0);
   }
   
   public void testfullBookShelfNumBooks(){
	      int result= fullbookshelf.numBooks();
	      assertTrue(result == 5);
	   }
}
