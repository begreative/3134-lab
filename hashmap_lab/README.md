# Overview
Given a bookshelf with a specific width and an infinite height, fill it up with a pile of books.

Our bookshelf needs to support the following queries (explained in more detail below)
- `int[] getBookShelfDimension()`
- `int[] getBookPosition(String bookTitle)`
- `boolean removeBook(String bookTitle)`

A book, as specified by `class myBook`, has the following attributes:
```java
String title;
int width;      
int height;
int xCoord; // x-coordinate position of the book's lower-left corner on the bookshelf
int yCoord; // y-coordinate position of the book's lower-left corner on the bookshelf
```
> Everything is 0-indexed!

# Building the bookshelf
The constructor of the `Bookshelf` class takes in 2 parameters:
- `int width` specifies the fixed width of the bookshelf
- `Book[]` is the list of books that we need to store on the bookshelf

Build the bookshelf sequentially. For example, place `Book[0]` on the `[0,0]` position of the bookshelf, then `Book[1]` to the right of `Book[0]`, etc. After filling up the `0`th row, start filling up the `1`st row.

In order to support our queries, build a `HashMap` as we fill up the bookshelf. The `HashMap` should have its keys be the title of books, and its values be the corresponding `Book` object.

The most important thing to remember is that each row of your bookshelf must *not* overflow with books! (i.e. sum of the width of all books must be less than or equal to the specified `width` of the bookshelf). You may assume that the space between two books is zero.

# Queries Explained
After filling up the bookshelf, support the following queries:
### `int[] getBookShelfDimension()`
- returns the height and width of the bookshelf in the format of `[width, height]`
- Hints
  - `width` is given
  - `height` is obtained as we fill up the bookshelf
### `int[] getBookPosition(String bookTitle)`
- returns the `x` and `y` coordinate positions of book's lower-left corner on the bookshelf
- returns `null` if book is not found
- return format: `[x,y]`
### `boolean removeBook(String bookTitle)`
- remove a book from the bookshelf
- there is no need to fill in the empty space or shrink the bookshelf's height
- returns `true` on success and `false` on failure

# Challenge
### `boolean addBook(Book book)`
- add `book` to the "top" of the bookshelf
- returns `true` on success
- returns `false` on failure (when the book title already exists in the bookshelf)
### `boolean moveBookTop(String bookTitle)`
- move an existing book to the top of the bookshelf
- returns `true` on success
- returns `false` on failure (i.e. if the book cannot be found)
### Hint
- Keep track of the last-inserted position of the bookshelf in private instance variables of the `Bookshelf` class
