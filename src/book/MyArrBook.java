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
    public void editArr(int index, int thuoctinh, String value){
        Book obj = getArrBooks()[index];
        switch (thuoctinh){
            case 1:
                obj.setBookCode(value);
                break;
            case 2:
                obj.setName(value);
                break;
            case 3:
                obj.setOuthor(value);
                break;
            default:
                System.out.println("giá trị nhập thuoc tinh phải từ 1 đến 3");
                break;
        }
            //  ép kiểu string về value được ko?
    }
    public void editArr(int index, int thuoctinh, int value){
        Book obj = getArrBooks()[index];
        switch (thuoctinh){
            case 1:
                obj.setPrice(value);
                break;
            default:
                System.out.println("Giá trị nhập thuoc tinh là 1");
        }

    }

}
