package book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book[] arr = new Book[10];
        arr[0] = new ProBook("a1", "Toan1", 10000, "yen", "Java", "net1");
        arr[1]= new ProBook("a2", "Toan2", 12000, "yen", "Java", "net1");
        arr[2]= new ProBook("a3", "Toan3", 15000, "yen", "JavaScript", "net1");
        arr[3] = new ProBook("a4", "Toan4", 13000, "yen", "JavaScript", "net1");
        arr[4] = new ProBook("a5", "Toan5", 13000, "yen", "Java", "net1");

        arr[5]= new FicBook("b1", "Van1", 10000, "yen2", "abc");
        arr[6] = new FicBook("b2", "Van2", 15000, "yen2", "abc");
        arr[7] = new FicBook("b3", "Van3", 16000, "yen2", "abc");
        arr[8]= new FicBook("b4", "Van4", 17000, "yen2", "abc");
        arr[9]= new FicBook("b5", "Van5", 11000, "yen2", "abc");

        Manager hoang =new Manager(arr);
//        double sum = hoang.getSumPrice(arr);
//        System.out.println(sum);
//        int count = hoang.isLanguage("Java");
//        System.out.println(count);
//        hoang.printArr();
//        hoang.sortArr();
//        hoang.printArr();


        Book b11 =new FicBook("b6", "Van6", 16000, "yen2", "abc");
        MyArrBook yen = new MyArrBook(arr);

        System.out.println("Nhập Lựa chọn cần thực hiện");
        System.out.println("1: Thêm mới một book");
        System.out.println("2: Xóa mới một book");
        System.out.println("3: Sửa mới một book");
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập giá trị ");
        int a = input.nextInt();
        switch(a){
            case 1:
                yen.addBook(b11, 5);
                yen.printArr();
                break;

            case 2:
                yen.deleteArr(5);
                yen.printArr();
                break;
            case 3:
                yen.editArr(5, 2, "van7");
                yen.printArr();
                break;
        }



    }

}
