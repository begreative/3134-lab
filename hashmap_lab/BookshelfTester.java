public class BookshelfTester {
    public static void main(String[] args) {
        // our goal is to insert 10 books into the bookshelf
        myBook[] books = {
            // new Book(title, width, height)
            new myBook("The Illiad", 2, 6),
            new myBook("The Odyssey", 1, 4),
            new myBook("Genesis", 5, 8),
            new myBook("Data Structures and Algorithm Analysis in Java", 15, 20),
            new myBook("Song of Solomon", 3, 9),
            new myBook("Pride and Prejudice", 10, 9),
            new myBook("Macbeth", 4, 9),
            new myBook("Crime and Punishment", 2, 4),
            new myBook("Republic", 9, 4),
        };

        Bookshelf bookshelfObj = new Bookshelf(15, books);

        // get bookshelf dimension
        System.out.println("\n----------------\nTesting getBookshelfDimension():");
        int[] bookshelfDim = bookshelfObj.getBookshelfDimension();
        System.out.println("The bookshelf's width is " + bookshelfDim[0] + 
                            " and height is " + bookshelfDim[1]);

        // test getBookPosition()
        System.out.println("\n----------------\nTesting getBookPosition():");
        for (int i = 0; i < books.length; i++) {
            int[] pos = bookshelfObj.getBookPosition(books[i].getTitle());
            System.out.println(books[i].getTitle() + " is located at position (" + 
                                pos[0] + ", " + pos[1] + ").");
        }

        // test removeBook()
        System.out.println("\n----------------\nTesting removeBook:");
        // remove "Macbeth"
        bookshelfObj.removeBook("Macbeth");
        if (bookshelfObj.getBookPosition("Macbeth") == null)
            System.out.println("Macbeth is successfully removed!");
        else 
            System.out.println("Failed to remove Macbeth");
        // remove "Republic"
        bookshelfObj.removeBook("Republic");
        if (bookshelfObj.getBookPosition("Republic") == null)
            System.out.println("Republic is successfully removed!");
        else 
            System.out.println("Failed to remove Republic");

        System.out.println("\n----------------\nend of testing");
    }
}
