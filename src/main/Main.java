package main;
import book.*;

import java.util.Scanner;


public class Main {

//    private countBook(){
        private static int sumPrice(MathBook[] arr){
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
//        MathBook mathBooks[] = new MathBook[10];
//        for (int i = 0; i <mathBooks.length ; i++) {
//            String _name = "Toán"+i;
//            mathBooks[i] = new MathBook();
//
//            mathBooks[i].setName(_name);
//            mathBooks[i].setPrice(i*1000);
//            mathBooks[i].setNumber(i*10);
//
//        }
//        for (int i = 0; i < mathBooks.length ; i++) {
//            System.out.println(mathBooks[i].getName());
//            System.out.println(mathBooks[i].getAmount());
//        }
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

            sumPrice(mathbooks);
            countBook(mathbooks);
            findbook(mathbooks);

    }
}
