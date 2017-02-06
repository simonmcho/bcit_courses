import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBook{
    private Book book1;
    private Book book2;

    @Before
    public void setUp(){
        book1 = new Book(1986, "dracULA", "brAm", "sTOKER");
        book2 = new Book(2003, "perSUaSiON", "jaNE", "austen");
    }

    @After
    public void tearDown(){
        book1 = null;
        book2 = null;
    }
    
    @Test
    public void test1(){
        assertEquals("B.S.", book1.getAuthorInitials());
        assertEquals("J.A.", book2.getAuthorInitials());
    }
    
    @Test
    public void test2(){
        assertEquals("Dracula", book1.getTitle());
        assertEquals("Persuasion", book2.getTitle());        
    }
    
    @Test
    public void test3(){
        assertEquals(book1.getYearPublished(), 1986);
        assertEquals(book2.getYearPublished(), 2003);
        
    }
    
    @Test
    public void test4(){
        assertEquals(book2.getAuthorFirstName(), "Jane");
        assertEquals(book1.getAuthorFirstName(), "Bram");
        
    }
    
    @Test
    public void test5(){
        assertEquals(book2.getAuthorLastName(), "austeN");
        assertEquals(book1.getAuthorLastName(), "stokeR");
    }
    
    @Test
    public void test6(){
        assertEquals(Book.getActivity(), "Reading");
    }
    
    @Test
    public void test7(){
        assertEquals(book1.getDetails(), "DRACULA WAS PUBLISHED BY BRAM STOKER IN 1986!");
        assertEquals(book2.getDetails(), "PERSUASION WAS PUBLISHED BY JANE AUSTEN IN 2003!");
    }
    
    @Test
    public void test8(){
        assertEquals(Book.FIRST_BOOK_PUBLISHED_YEAR, "1455");
    }
}
