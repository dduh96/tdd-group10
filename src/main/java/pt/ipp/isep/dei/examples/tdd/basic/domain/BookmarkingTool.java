package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.awt.print.Book;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.*;
import java.util.stream.Collectors;

public class BookmarkingTool {
    private ArrayList<Bookmark> savedBookmarks = new ArrayList<>();

    public Bookmark addBookmark(String url) {
        Bookmark bookmark = new Bookmark(url);
        if (!bookmark.checkIfUrlValid(url)) return null;
        Bookmark foundBookmark = checkIfNotDuplicate(url);
        if (foundBookmark != null) { //is duplicated
            foundBookmark.increaseRating();
            bookmark = foundBookmark;
        } else {
            savedBookmarks.add(bookmark);
        }
        return bookmark;
    }

    /*public Bookmark findBookmark(Bookmark bookmark) {
        Bookmark bookmarkExists = null;
        Iterator<Bookmark> iteratorBookmark = savedBookmarks.iterator();
        while (iteratorBookmark.hasNext() && bookmarkExists == null) {
            Bookmark nextBookmark = iteratorBookmark.next();
            if (nextBookmark.getUrl().equals(bookmark.getUrl()))
                bookmarkExists = nextBookmark; //todo: maybe in while-head?
        }
        return bookmarkExists;
    }*/


    public boolean addKeywordToUrl(String keyword, String url) {
        boolean keywordAdded = false;
        if (url == null || keyword == null || url.isEmpty() || keyword.isEmpty() || savedBookmarks.isEmpty())
            return false;
        Iterator<Bookmark> bookmark = savedBookmarks.iterator();
        while (bookmark.hasNext() && !keywordAdded) {
            Bookmark nextBookmark = bookmark.next();
            if (nextBookmark.getUrl().equals(url)) { //todo: into while-head?
                nextBookmark.setKeyword(keyword);
                keywordAdded = true;
            }
        }
        return keywordAdded;
    }


    public Bookmark checkIfNotDuplicate(String url) {
        if (url == null || savedBookmarks.isEmpty()) return null;
        return savedBookmarks.stream().filter(bm -> bm.getUrl().equals(url)).findFirst().orElse(null);
    }


    public ArrayList<Bookmark> getSavedBookmarks() {
        return savedBookmarks;
    }

    public void setSavedBookmarks(ArrayList<Bookmark> savedBookmarks) {
        this.savedBookmarks = savedBookmarks;
    }

    public int countSecureUrl(){
        int count;
        if(!savedBookmarks.isEmpty())
            count = (int)savedBookmarks.stream().filter( bm -> bm.getUrl().contains("https")).count();
        else count = -1;
        return count;
    }

    public List<Bookmark> filterByKeyword(String keyword){
        List<Bookmark> filteredList;
        if (keyword == null){
            filteredList = null;
        }else{
            filteredList = savedBookmarks.stream().filter(bm -> bm.getKeyword().equals(keyword)).collect(Collectors.toList());
        }
        return filteredList;
    }

}
