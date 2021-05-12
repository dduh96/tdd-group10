package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookmarkingToolTest {

    /**
     * checkIfDuplicate Case 1: Is Duplicate
     */
    @Test
    public void checkIfNotDuplicate_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        String expected = url;
        String actual = tool.checkIfNotDuplicate(url).getUrl();

        assertEquals(expected, actual);
    }

    /**
     * checkIfDuplicate Case 2: Is Not Duplicate
     */
    @Test
    public void checkIfNotDuplicate_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";

        Bookmark expected = null;
        Bookmark actual = tool.checkIfNotDuplicate(url);

        assertEquals(expected, actual);
    }

    /**
     * checkIfDuplicate Case 3: URL is NULL
     */
    @Test
    public void checkIfNotDuplicate_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;

        Bookmark expected = null;
        Bookmark actual = tool.checkIfNotDuplicate(url);

        assertEquals(expected, actual);
    }


    /**
     * checkIfUrlValid(String url)
     * only checks syntax of URL string, not if website exists
     * Case 1: URL is not valid
     */
    @Test
    public void checkIfUrlValid_caseOne(){
        String url = "hello, world!";
        Bookmark bookmark = new Bookmark(url);

        boolean expected = false;
        boolean actual = bookmark.checkIfUrlValid(url);

        assertEquals(expected, actual);
    }

    /**
     * checkIfUrlValid(String url)
     * only checks syntax of URL string, not if website exists
     * Case 2: URL is valid
     */
    @Test
    public void checkIfUrlValid_caseTwo(){
        String url = "https://github.com";
        Bookmark bookmark = new Bookmark(url);

        boolean expected = true;
        boolean actual = bookmark.checkIfUrlValid(url);

        assertEquals(expected, actual);
    }

    /**
     * checkIfUrlValid(String url)
     * only checks syntax of URL string, not if website exists
     * Case 3: URL is NULL
     */
    @Test
    public void checkIfUrlValid_caseThree(){
        String url = null;
        Bookmark bookmark = new Bookmark(url);

        boolean expected = false;
        boolean actual = bookmark.checkIfUrlValid(url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 1: Operation successful
     */
    @Test
    public void addKeywordToUrl_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = true;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 2: URL does not exist in BookmarkList
     */
    @Test
    public void addKeywordToUrl_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";


        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 3: Keyword is NULL
     */
    @Test
    public void addKeywordToUrl_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = null;
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 4: URL is NULL
     */
    @Test
    public void addKeywordToUrl_caseFour(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;
        String keyword = "programming";
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 5: Keyword and URL is NULL
     */
    @Test
    public void addKeywordToUrl_caseFive(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;
        String keyword = null;
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 6: Bookmark already has associated Keyword
     */
    @Test
    public void addKeywordToUrl_caseSix(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";
        Bookmark bookmark = new Bookmark(url);
        bookmark.setKeyword("work");
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(bookmark);
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = true;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 7: Testing Case Sensitivity
     */
    @Test
    public void addKeywordToUrl_caseSeven(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";
        Bookmark bookmark = new Bookmark(url);
        bookmark.setKeyword("Programming");
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(bookmark);
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = true;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 1: URL does not already exist, is successful
     */
    @Test
    public void addBookmark_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";

        String expected = new Bookmark(url).getUrl();
        String actual = tool.addBookmark(url).getUrl();

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 2: URL already exists
     */
    @Test
    public void addBookmark_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        int expected = 2;
        int actual = tool.addBookmark(url).getRating();

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 3: URL is NULL
     */
    @Test
    public void addBookmark_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;

        Bookmark expected = null;
        Bookmark actual = tool.addBookmark(url);

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 4: URL is invalid
     */
    @Test
    public void addBookmark_caseFour(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "hello, world!";

        Bookmark expected = null;
        Bookmark actual = tool.addBookmark(url);

        assertEquals(expected, actual);
    }


}