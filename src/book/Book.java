package book;

public class Book {
    private String bookCode;
    private String name;
    private int price;
    private String outhor;

    public Book(String bookCode, String name, int price, String outhor) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.outhor = outhor;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOuthor() {
        return outhor;
    }

    public void setOuthor(String outhor) {
        this.outhor = outhor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", outhor='" + outhor + '\'' +
                '}';
    }
}
