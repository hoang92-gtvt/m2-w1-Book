package book;

public class MathBook {
    String bookCode;
    String name;
    int price;
    int number;
    String outhor;
    String language;
    String fameWork;

    //Khoi tao sach
        public MathBook(String _name, int _number,int _price, String _language){
            this.name= _name;
            this.number= _number;
            this.price= _price;
            this.language = _language;
        }

    public MathBook(){
    }

    //Khoi tao phương thuc thuoc tinh
    public void setBookCode(String _bookCode){
        this.bookCode = _bookCode;
    }
    public String getBookCode(){
        return this.bookCode;
    };

    public void setName(String _name){
        this.name =_name;

    }
    public String getName(){
        return this.name;
    }
    public void setPrice(int _price){
        this.price= _price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setNumber(int _number){
        this.number = _number;
    }
    public int getNumber(){
        return this.number;
    }

    public void setOuthor(String _outhor){
        this.outhor =_outhor;

    }
    public String getOuthor(){
        return this.outhor;
    }

    public void setLanguage(String _language){
        this.language = _language ;

    }
    public String getLang(){
        return this.language;
    }

    public void setFameWork(String _fameWork){
        this.fameWork = _fameWork;
    }

    //phương thức cần làm
    public int getAmount(){
        return this.price*this.number;
    }


}
