package book;

public class Manager {
    private static Book[] arrBooks;

    public Manager(Book[] arr) {
        arrBooks = arr;
    }
    public Manager() {

    }

    public static Book[] getArrBooks() {
        return arrBooks;
    }

    public static void setArrBooks(Book[] arr1) {
        Manager.arrBooks = arr1;
    }

 //tao mot mang phu
    public static Book[] getArray(){
        Book[] arr2;
        arr2 = arrBooks;
        return arr2;
    }


    public static double getSumPrice( Book[] arr3){
        double sum =0;
        for (Book a: arr3) {
            sum += a.getPrice();
        }
        return sum;
    }

    public static int isLanguage(String abc){
        int count=0;
        for ( Book a: arrBooks ) {
            if ( a instanceof ProBook){
                String value = ((ProBook) a).getLanguage();
                if(value==abc){
                    count++;
                }
            }
        }

        return  count;
    }
    public static Book[] sortArr(){
//        Book[] newArr= new Book[arrBooks.length];
        for (int j = 0; j < arrBooks.length ; j++) {
            for (int i = 0; i < arrBooks.length-1; i++) {
                if (arrBooks[i].getPrice()>arrBooks[i+1].getPrice()){
                    Book temp= arrBooks[i];
                    arrBooks[i]=arrBooks[i+1];
                    arrBooks[i+1]=temp;
                }
            }
        }

        return arrBooks;

    }

    public static void printArr(){
        for (Book a: arrBooks ) {
            System.out.println(a);
        }
    }




}
