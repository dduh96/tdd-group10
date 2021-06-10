package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    @Test
    public void addKeywordToUrl_caseEight(){
        BookmarkingTool tool = new BookmarkingTool();
        String url ="https://github.com";
        String keyword = "programming";
        Bookmark bookmark = new Bookmark(url);

        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(bookmark);
        tool.setSavedBookmarks(savedBookmarks);

        tool.addKeywordToUrl(keyword,url);

        String expected = "programming";
        String actual = tool.getSavedBookmarks().get(0).getKeyword();

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

        assertThrows(IllegalArgumentException.class, () -> {
            tool.addBookmark(url);
        });
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


        assertThrows(IllegalArgumentException.class, () -> {
            tool.addBookmark(url);
        });
    }

    @Test
    public void addBookmark_caseFive(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        tool.addBookmark(url);

        int expected = 1;
        int actual = tool.getSavedBookmarks().size();

        assertEquals(expected, actual);
    }



    /**
     * countSecureUrl(): int
     * Case 1: has secure URLs
     */
    @Test
    public void countSecureUrl_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url1 = "https://github.com";
        String url2 = "https://google.com";
        tool.addBookmark(url1);
        tool.addBookmark(url2);

        int expected = 2;
        int actual = tool.countSecureUrl();

        assertEquals(expected, actual);
    }

    /**
     * countSecureUrl(): int
     * Case 2: No secure URLs
     */
    @Test
    public void countSecureUrl_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url1 = "http://github.com";
        String url2 = "http://google.com";
        tool.addBookmark(url1);
        tool.addBookmark(url2);

        int expected = 0;
        int actual = tool.countSecureUrl();

        assertEquals(expected, actual);
    }

    /**
     * countSecureUrl(): int
     * Case 3: List empty
     */
    @Test
    public void countSecureUrl_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();

        int expected = -1;
        int actual = tool.countSecureUrl();

        assertEquals(expected, actual);
    }

    /**
     * filterByKeyword(): List<Bookmark>
     * Case 1: keyword is NULL -> return NULL
     */
    @Test
    public void filterByKeyword_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        assertNull(tool.filterByKeyword((String) null));
    }

    /**
     * filterByKeyword(): List<Bookmark>
     * Case 2: Bookmarks found
     */
    @Test
    public void filterByKeyword_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm1 = new Bookmark("http://github.com");
        Bookmark bm2 = new Bookmark("http://google.com");
        bm1.setKeyword("programming");
        bm2.setKeyword("search");
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2)));

        String keyword = "search";

        List<Bookmark> expected = Arrays.asList(bm2);
        List<Bookmark> actual = tool.filterByKeyword(keyword);

        assertArrayEquals(expected.toArray(), actual.toArray());

    }

    /**
     * filterByKeyword(): List<Bookmark>
     * Case 3: No Bookmarks found
     */
    @Test
    public void filterByKeyword_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm1 = new Bookmark("http://github.com");
        Bookmark bm2 = new Bookmark("http://google.com");
        bm1.setKeyword("programming");
        bm2.setKeyword("search");
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2)));

        String keyword = "sport";

        List<Bookmark> expected = Collections.emptyList();
        List<Bookmark> actual = tool.filterByKeyword(keyword);

        assertArrayEquals(expected.toArray(), actual.toArray());

    }

    /**
     * filterByKeyword(): List<Bookmark>
     * Case 4: savedBookmarks empty
     */
    @Test
    public void filterByKeyword_caseFour(){
        BookmarkingTool tool = new BookmarkingTool();

        String keyword = "sport";

        assertNull(tool.filterByKeyword(keyword));

    }

    /**
     * filterByKeyword(): List<Bookmark>
     * Case 5: Bookmarks found, Case sensitivity
     */
    @Test
    public void filterByKeyword_caseFive(){
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm1 = new Bookmark("http://github.com");
        Bookmark bm2 = new Bookmark("http://google.com");
        bm1.setKeyword("programming");
        bm2.setKeyword("search");
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2)));

        String keyword = "Search";

        List<Bookmark> expected = Arrays.asList(bm2);
        List<Bookmark> actual = tool.filterByKeyword(keyword);

        assertArrayEquals(expected.toArray(), actual.toArray());

    }

    /**
     * filterByKeyword(List keywords)
     * Case 1: bookmarks for all keywords found
     */
    @Test
    public void filterByKeywords_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm1 = new Bookmark("http://github.com");
        Bookmark bm2 = new Bookmark("http://google.com");
        Bookmark bm3 = new Bookmark("https://tumblr.com");
        bm1.setKeyword("programming");
        bm2.setKeyword("search");
        bm3.setKeyword("leisure");
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2, bm3)));

        List<String> keywords = Arrays.asList("Search", "Leisure");

        List<Bookmark> expected = Arrays.asList(bm2, bm3);
        List<Bookmark> actual = tool.filterByKeyword(keywords);

        assertArrayEquals(expected.toArray(), actual.toArray());

    }

    /**
     * filterByKeyword(List keywords)
     * Case 2: keywords are empty
     */
    @Test
    public void filterByKeywords_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm1 = new Bookmark("http://github.com");
        Bookmark bm2 = new Bookmark("http://google.com");
        Bookmark bm3 = new Bookmark("https://tumblr.com");
        bm1.setKeyword("programming");
        bm2.setKeyword("search");
        bm3.setKeyword("leisure");
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2, bm3)));

        List<String> keywords = Collections.emptyList();

        assertNull(tool.filterByKeyword(keywords));

    }

    /**
     * filterByKeyword(List keywords)
     * Case 3: keywords are NULL
     */
    @Test
    public void filterByKeywords_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm1 = new Bookmark("http://github.com");
        Bookmark bm2 = new Bookmark("http://google.com");
        Bookmark bm3 = new Bookmark("https://tumblr.com");
        bm1.setKeyword("programming");
        bm2.setKeyword("search");
        bm3.setKeyword("leisure");
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2, bm3)));

        List<String> keywords = null;

        assertNull(tool.filterByKeyword(keywords));

    }

    /**
     * filterByKeyword(List keywords)
     * Case 4: bookmarks for some keywords found
     */
    @Test
    public void filterByKeywords_caseFour(){
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm1 = new Bookmark("http://github.com");
        Bookmark bm2 = new Bookmark("http://google.com");
        Bookmark bm3 = new Bookmark("https://tumblr.com");
        bm1.setKeyword("programming");
        bm2.setKeyword("search");
        bm3.setKeyword("leisure");
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2, bm3)));

        List<String> keywords = Arrays.asList("Search", "Leisure", "Sport");

        List<Bookmark> expected = Arrays.asList(bm2, bm3);
        List<Bookmark> actual = tool.filterByKeyword(keywords);

        assertArrayEquals(expected.toArray(), actual.toArray());

    }

    /**
     * filterByDomain(String domain)
     * Case 1: domain is NULL
     */
    @Test
    public void filterByDomain_CaseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String domain = null;

        List<Bookmark> foundBms = tool.filterByDomain(domain);

        assertNull(foundBms);

    }

    /**
     * filterByDomain(String domain)
     * Case 2: No bms found
     */
    @Test
    public void filterByDomain_CaseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String domain = "google.com";
        tool.addBookmark("https://github.com");

        List<Bookmark> actual = tool.filterByDomain(domain);
        List<Bookmark> expected = Collections.emptyList();

        assertArrayEquals(expected.toArray(), actual.toArray());

    }

    /**
     * filterByDomain(String domain)
     * Case 3: bms found
     */
    @Test
    public void filterByDomain_CaseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String domain = "github.com";
        String url1 = "https://github.com/dduh96";
        String url2 = "https://google.com/search?q=python";
        Bookmark bm1 = new Bookmark(url1);
        Bookmark bm2 = new Bookmark(url2);
        bm1.setDomainByUrl(url1);
        bm2.setDomainByUrl(url2);
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2)));

        List<Bookmark> actual = tool.filterByDomain(domain);
        List<Bookmark> expected = Arrays.asList(bm1);

        assertArrayEquals(expected.toArray(), actual.toArray());

    }

    /**
     * filterByDomain(String domain)
     * Case 4: found bms, list correct size?
     */
    @Test
    public void filterByDomain_CaseFour(){
        BookmarkingTool tool = new BookmarkingTool();
        String domain = "github.com";
        String url1 = "https://github.com/dduh96";
        String url2 = "https://github.com/search?q=python";
        Bookmark bm1 = new Bookmark(url1);
        Bookmark bm2 = new Bookmark(url2);
        bm1.setDomainByUrl(url1);
        bm2.setDomainByUrl(url2);
        tool.setSavedBookmarks(new ArrayList<>(Arrays.asList(bm1, bm2)));

        int actual = tool.filterByDomain(domain).size();
        int expected = 2;

        assertEquals(expected, actual);
    }

    /**
     * filterByDomain(String domain)
     * Case 5: savedBms empty
     */
    @Test
    public void filterByDomain_CaseFive(){
        BookmarkingTool tool = new BookmarkingTool();
        String domain = "github.com";

        List<Bookmark> actual = tool.filterByDomain(domain);
        List<Bookmark> expected = Collections.emptyList();

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    /**
     * setDomainByURL(String url)
     * Case 1: url is a URL, -> return correct domain set
     */
    @Test
    public void setDomainByURL_CaseOne(){
        String url = "https://github.com/dduh";
        Bookmark bm = new Bookmark(url);

        boolean expected = true;
        boolean actual = bm.setDomainByUrl(url);


        assertEquals(expected, actual);

    }

    /**
     * setDomainByURL(String url)
     * Case 1: url is NULL, -> throw NullPointerException
     */
    @Test
    public void setDomainByURL_CaseTwo(){
        String url = null;
        Bookmark bm = new Bookmark(url);

        boolean expected = false;
        boolean actual = bm.setDomainByUrl(url);

        assertEquals(expected, actual);
    }

    /**
     * deleteTag()
     * Case 1: sucessful return type
     */
    @Test
    public void deleteTag_CaseOne(){
        String url = "https://github.com/dduh";
        String tag = "programming";
        Bookmark bm = new Bookmark(url);
        bm.setKeyword(tag);

        boolean expected = true;
        boolean actual = bm.deleteTag();

        assertEquals(expected,actual);
    }

    /**
     * deleteTag()
     * Case 2: tag sucessfully deleted
     */
    @Test
    public void deleteTag_CaseTwo(){
        String url = "https://github.com/dduh";
        String tag = "programming";
        Bookmark bm = new Bookmark(url);
        bm.setKeyword(tag);
        bm.deleteTag();
        String expected = "";
        String actual = bm.getKeyword();

        assertEquals(expected,actual);
    }

    /**
     * deleteTag()
     * Case 3: tag already empty
     */
    @Test
    public void deleteTag_CaseThree(){
        String url = "https://github.com/dduh";
        Bookmark bm = new Bookmark(url);

        boolean expected = false;
        boolean actual = bm.deleteTag();

        assertEquals(expected,actual);
    }

    /**
     * deleteBookmark()
     * Case 1: sucessful return type
     */
    @Test
    public void deleteBookmark_CaseOne(){
        String url = "https://github.com/dduh";
        BookmarkingTool tool = new BookmarkingTool();
        tool.addBookmark(url);

        boolean expected = true;
        boolean actual = tool.deleteBookmark(url);

        assertEquals(expected,actual);
    }

    /**
     * deleteBookmark()
     * Case 2: bookmark sucessfully deleted (list is empty)
     */
    @Test
    public void deleteBookmark_CaseTwo(){
        String url = "https://github.com/dduh";
        BookmarkingTool tool = new BookmarkingTool();
        tool.addBookmark(url);
        tool.deleteBookmark(url);
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();

        int expected = 0;
        int actual = savedBookmarks.size();

        assertEquals(expected,actual);
    }


    /**
     * deleteBookmark()
     * Case 3: bookmark sucessfully deleted (bm cannot be found anymore)
     */
    @Test
    public void deleteBookmark_CaseThree(){
        String url = "https://github.com/dduh";
        BookmarkingTool tool = new BookmarkingTool();
        Bookmark bm = new Bookmark(url);
        tool.deleteBookmark(url);
        ArrayList<Bookmark> savedBookmarks = tool.getSavedBookmarks();

        boolean expected = false;
        boolean actual = savedBookmarks.contains(bm);

        assertEquals(expected,actual);
    }

    /**
     * deleteBookmark()
     * Case 4: bookmark doesn't exist
     */
    @Test
    public void deleteBookmark_CaseFour(){
        String url = "https://github.com/dduh";
        BookmarkingTool tool = new BookmarkingTool();

        boolean expected = false;
        boolean actual = tool.deleteBookmark(url);

        assertEquals(expected,actual);
    }

    /**
     * deleteBookmark()
     * Case 5: bookmark url is null
     */
    @Test
    public void deleteBookmark_CaseFive(){
        String url = null;
        BookmarkingTool tool = new BookmarkingTool();

        boolean expected = false;
        boolean actual = tool.deleteBookmark(url);

        assertEquals(expected,actual);
    }
}
