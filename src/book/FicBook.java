package book;

public class FicBook extends Book {
    String category;

    public FicBook(String bookCode, String name, int price, String outhor, String category) {
        super(bookCode, name, price, outhor);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "FicBook{" +
                "category='" + category + '\'' +
                '}';
    }
}
