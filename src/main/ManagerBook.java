package main;
import book.*;


public class ManagerBook {
    //truong du lieu
    private static MathBook[] arrBooks ;

    //set va get
    public static MathBook[] getArrBooks() {
        return arrBooks;
    }
    public static void setArrBooks(MathBook[] arr) {
        ManagerBook.arrBooks = arr;
//        this.arrBooks=arr; // tai sao ko dc;
    }

    //khoi tao
    public ManagerBook(){};
    public ManagerBook(MathBook[] arr){
        this.arrBooks= arr;
    }

    public int sumPrice(){
        int sum =0;
        for (int i = 0; i <arrBooks.length ; i++) {
            sum +=arrBooks[i].getPrice();
        }
        return sum;
    }
    public  int countBook(){
        int count=0;
        for (int i = 0; i < arrBooks.length ; i++) {
            if(arrBooks[i].getLang()=="Java"){
                count++;
            }
        }
        return count;
    }
    public  void findbook(int coat){
        for (int i = 0; i < arrBooks.length; i++) {
            if(arrBooks[i].getPrice()>coat){
                System.out.println(arrBooks[i].getName());
            }
        }
    }
    public  String[] findbook2(int coat){

        String[] arr2 =new String[arrBooks.length];
        int count =0;
        for (int i = 0; i < arrBooks.length; i++) {
            if(arrBooks[i].getPrice()< coat){
                arr2[count]=arrBooks[i].getName();
                count++;
            }
        }
        return arr2;
    }

}
