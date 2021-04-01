import java.util.HashMap;

public class Bookshelf {
    
    private int bookshelfWidth;
    private int bookshelfHeight;

    // map<bookTitle, Book object>
    HashMap<String, myBook> map = new HashMap<>();

    public Bookshelf(int widthLimit, myBook[] books) {
        bookshelfWidth = widthLimit;
        bookshelfHeight = 0;

        int currX = 0, currY = 0;
        int currHeight = 0;

        // Build the bookshelf
        for (int i = 0; i < books.length; i++) {
            // the next book can't fit into the current position
            // use the next shelf
            if (currX + books[i].getWidth() > widthLimit) {
                bookshelfHeight += currHeight;
                currX = 0;                      // start filling at the beginning of the next shelf
                currY += currHeight;           // use the next shelf
                currHeight = 0;
            }
            // place book here
            books[i].updateXCoord(currX);
            books[i].updateYCoord(currY);

            // update currX for the next iteration
            // no need to update currY because the coords of each book that we are 
            // storing is the bottom-left corner
            currX += books[i].getWidth();
            currHeight = Math.max(currHeight, books[i].getHeight());
            map.put(books[i].getTitle(), books[i]);
        }
        bookshelfHeight += currHeight;
    }

    public int[] getBookshelfDimension() {
        return new int[]{bookshelfWidth, bookshelfHeight};
    }

    public int[] getBookPosition(String bookTitle) {
        if (!map.containsKey(bookTitle)) return null;
        return new int[]{map.get(bookTitle).getX(), map.get(bookTitle).getY()};
    }

    public boolean removeBook(String bookTitle) {
        if (map.containsKey(bookTitle)) {
            map.remove(bookTitle);
            return true;
        }
        return false;
    }

}
