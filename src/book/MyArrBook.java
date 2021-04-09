package book;

public class MyArrBook extends Manager {

    public MyArrBook(Book[] arr) {
        super(arr);
    }

    public MyArrBook() {
    }

    public Book[] addBook(Book b1, int index ){
        Book[] newArr = new Book[super.getArrBooks().length+1];
        for (int i = 0; i < index; i++) {
            newArr[i]= super.getArrBooks()[i];
        }
        newArr[index]=b1;
        for (int i = index+1; i <newArr.length ; i++) {
            newArr[i]= super.getArrBooks()[i-1];
        }
            super.setArrBooks(newArr);
        //nếu dùng biến satic và gắn return cho trường dữ liệu của lớp parent được ko
        //sẽ có ưu nhược điểm gì?
        return newArr;
        //có thể sử dụng newArr mới này trong trường hợp nào?

    }

    public Book[] deleteArr(int index){
        Book [] newArr = new Book[super.getArrBooks().length-1];
        for (int i = 0; i < index; i++) {
            newArr[i]= super.getArrBooks()[i];
        }
        for (int i = index; i <newArr.length ; i++) {
            newArr[i]= super.getArrBooks()[i+1];
        }
            super.setArrBooks(newArr);
        return newArr;
    }

}
