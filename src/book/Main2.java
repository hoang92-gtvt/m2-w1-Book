package book;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Book> listBook1 = new ArrayList<>();
        listBook1.add(new ProBook("a1", "Toan1", 10000, "yen", "Java", "net1"));
        listBook1.add(new ProBook("a2", "Toan2", 12000, "yen", "Java", "net1"));
        listBook1.add(new ProBook("a3", "Toan3", 15000, "yen", "JavaScript", "net1"));
        listBook1.add(new ProBook("a4", "Toan4", 13000, "yen", "JavaScript", "net1"));
        listBook1.add(new ProBook("a5", "Toan5", 13000, "yen", "Java", "net1"));

        listBook1.add(new FicBook("b1", "Van1", 10000, "yen2", "abc"));
        listBook1.add(new FicBook("b2", "Van2", 15000, "yen2", "abc"));
        listBook1.add(new FicBook("b3", "Van3", 16000, "yen2", "abc"));
        listBook1.add(new FicBook("b4", "Van4", 17000, "yen2", "abc"));
        listBook1.add(new FicBook("b5", "Van5", 11000, "yen2", "abc"));
        for (Book b : listBook1) {
            System.out.println(b);
        }

        System.out.println("Nhập Lựa chọn cần thực hiện");
        System.out.println("1: Thêm mới một book");
        System.out.println("2: Xóa mới một book");
        System.out.println("3: Sửa mới một book");
        System.out.println("4: Sắp xếp lại danh sách");
        Scanner input1 = new Scanner(System.in);


        int a = 1;
        while(a<5 && a>0) {
            System.out.println("Nhập giá trị ");
            a = input1.nextInt();
            switch (a) {
                case 1:
                    addBooK(listBook1);
                    break;
                case 2:
                    deleteBook(listBook1);
                    break;
                case 3:
                    editBook(listBook1);
                    break;
                case 4:
                    Collections.sort(listBook1,a);
                    break;
            }

            for (Book b : listBook1) {
                System.out.println(b);
            }
        }

    }

    private static void editBook(List<Book> listBook1) {
        String nameBook = inputNameBook();
        int index = findIndexByNameOfObject(listBook1, nameBook);
//                Book editBook = listBook1.get(index);
        Book replaceBook = inputPropertyOfProBook();
        listBook1.set(index, replaceBook);
//                listBook1.set(index,editBook);
    }

    private static void addBooK(List<Book> listBook1) {
        System.out.println("Nhập thông tin quyển sách");
        System.out.println("1: Nhập loại sach ProBook");
        System.out.println("2: Nhập loại sach Ficbook");
        Scanner input2 = new Scanner(System.in);
        int choice = input2.nextInt();
        Book newBook;
        switch (choice) {
            case 1:
                newBook = inputPropertyOfProBook();
                listBook1.add(newBook);
                break;

            case 2:
                newBook = inputPropertyOfFicBook();
                listBook1.add(newBook);
                break;
            default:
                System.out.println("Lựa chọn của bạn không đúng");
                break;
        }

    }

    private static Book inputPropertyOfProBook() {
        Book newBook = new ProBook();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập String bookCode");
        newBook.setBookCode(input.nextLine());
        System.out.println("String name");
        newBook.setName(input.nextLine());
        System.out.println("int price");
        newBook.setPrice(input.nextInt());
        System.out.println("String outhor");
        newBook.setOuthor(input.nextLine());
        System.out.println("String language");
        ((ProBook) newBook).setLanguage(input.nextLine());
        System.out.println("String framwork ");
        ((ProBook) newBook).setFramwork(input.nextLine());
        return newBook;
    }

    private static Book inputPropertyOfFicBook() {
        Book newBook = new FicBook();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập String bookCode");
        newBook.setBookCode(input.nextLine());
        System.out.println("String name");
        newBook.setName(input.nextLine());
        System.out.println("int price");
        newBook.setPrice(input.nextInt());
        System.out.println("String outhor");
        newBook.setOuthor(input.nextLine());
        System.out.println("String Catalogy");
        ((FicBook) newBook).setCategory(input.nextLine());
        return newBook;

    }

    private static void deleteBook(List<Book> listBook1) {
        String value = inputNameBook();

        int index = findIndexByNameOfObject(listBook1, value);

        listBook1.remove(index);
    }

    private static int findIndexByNameOfObject(List<Book> listBook1, String value) {
        int index = 0;
        for (int i = 0; i < listBook1.size(); i++) {
            if (listBook1.get(i).getName() == value) {
                index = i;
            }
        }
        return index;
    }

    private static String inputNameBook() {
        System.out.println("Hãy nhập tên quyển sách bạn muốn xóa");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        return value;
    }
}
