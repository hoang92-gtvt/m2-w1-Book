package main;
import book.*;

import java.util.Scanner;


public class Main {
        public Main(){};

//    private countBook(){
        private int sumPrice(MathBook[] arr){
            int sum =0;
            for (int i = 0; i <arr.length ; i++) {
                sum +=arr[i].getPrice();
            }
            return sum;
        }
        private static int countBook(MathBook[] arr){
            int count=0;
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i].getLang()=="Java"){
                    count++;
                }
            }
            return count;
        }
        private static void findbook(MathBook[] arr){
            Scanner input=new Scanner(System.in);
            System.out.println("Nhập giá tiền ");
            int coat=input.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if(arr[i].getPrice()>coat){
                    System.out.println(arr[i].getName());
                }
            }
        }
        private static String[] findbook2(MathBook[] arr){
            Scanner input=new Scanner(System.in);
            System.out.println("Nhập giá tiền ");
            int coat=input.nextInt();
            String[] arr2 =new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].getPrice()>coat){
                    arr2[i]=arr[i].getName();
                }
            }
            return arr2;
        }

        public static void main(String[] args) {
//
         MathBook[] mathbooks =new MathBook[10];
         mathbooks[0]= new MathBook("mathbook1", 10, 10000, "Java")  ;
         mathbooks[1]= new MathBook("mathbook2", 5, 12000, "Java")  ;
         mathbooks[2]= new MathBook("mathbook3", 5, 13000, "Vietnam")  ;
         mathbooks[3]= new MathBook("mathbook4", 7, 15000, "English")  ;
         mathbooks[4]= new MathBook("mathbook5", 2, 15000, "Java")  ;
         mathbooks[5]= new MathBook("mathbook6", 2, 15000, "Java")  ;
         mathbooks[6]= new MathBook("mathbook7", 7, 15000, "English")  ;
         mathbooks[7]= new MathBook("mathbook8", 2, 15000, "Java")  ;
         mathbooks[8]= new MathBook("mathbook9", 7, 15000, "English")  ;
         mathbooks[9]= new MathBook("mathbook10", 2, 15000, "Java")  ;

//             Phương an ko su dung them 1 lop
//            Main main1= new Main();
//            int sum = main1.sumPrice(mathbooks);
//            System.out.println(sum);
//             findbook(mathbooks);


//       Phương an sủ dung khác
            ManagerBook hoang=new ManagerBook();// khơi tạo không tham số, dữ liệu chưa đc truyền vào
            hoang.setArrBooks(mathbooks); // khởi tạo mảng thông qua setter, dữ liệu đc truyền;


            String[] k= hoang.findbook2(14000);
            System.out.println(k[2]);

            ManagerBook yen=new ManagerBook(mathbooks); // dùng phương thức khởi tạo có tham số,
            String[] l= hoang.findbook2(14000);
            System.out.println(l[2]);
    }
}
