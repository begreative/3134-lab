class myBook {
    private String title;
    private int width;
    private int height;
    private int xCoord;
    private int yCoord;

    public myBook(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public void updateXCoord(int x) {
        this.xCoord = x;
    }

    public void updateYCoord(int y) {
        this.yCoord = y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getTitle() {
        return this.title;
    }

    public int getX() {
        return this.xCoord;
    }

    public int getY() {
        return this.yCoord;
    }
}
