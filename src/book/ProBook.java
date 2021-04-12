package book;

public class ProBook extends Book {
    String language;
    String framwork;

    public ProBook(String bookCode, String name, int price, String outhor,String language, String framwork ) {
        super(bookCode, name, price, outhor);
        this.language = language;
        this.framwork = framwork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramwork() {
        return framwork;
    }

    public void setFramwork(String framwork) {
        this.framwork = framwork;
    }

    @Override
    public String toString() {

        return  super.toString()+
                "ProBook{" +
                "language='" + language + '\'' +
                ", framwork='" + framwork + '\'' +
                '}';
    }
}
