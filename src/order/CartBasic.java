package order;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import item.Item;
import item.ItemDiscount;

public class CartBasic {
    public static void main(String[] args) {
        CartBasic cart = new CartBasic();
        cart.run();
    }

    Scanner keyin = new Scanner(System.in);

    static ArrayList<Order> ordList = new ArrayList<>();
    static ArrayList<Item> itemList = new ArrayList<>();

    static ArrayList<String> members = new ArrayList<>();

    // static 필드를 초기화하는 정적 초기화 블록.
    // 프로그램 실행하면 먼저 실행됨.
    static {
        members.add("ejlee");
        members.add("admin");
    }

    ;

    public void run() {
        readAllItems();
        printAllItems();

        readAllOrders();
        printAnOrder("ejlee");
        printAnOrder("kim");
        printAnOrder("admin");

        menu();
    }

    void readAllOrders() {
        Scanner orderFile = openFile("orders.txt");
        while (orderFile.hasNext()) {
            processAnOrder(orderFile);
        }
    }

    void processAnOrder(Scanner orderFile) {
        String id = orderFile.next();
        Order ord = null;
        while (true) {
            ord = new Order(id);
            ord.read(orderFile);
            if (ord.item == null)
                break;
            ordList.add(ord);
            // ord.print();
        }
    }

    void menu() {
        // 추가로 구현되어야 하는 부분 (메뉴에 따른 검색 기능)
    }

    static boolean isMember(String user) {
        return members.contains(user);
    }

    // 이 사용자의 주문에서 item에 해당하는 상품의 개수
    static int counts(String user, Item item) {
        for (Order ord : ordList) {
            if (ord.userId.equals(user) && ord.item == item) {
                return ord.cc;
            }
        }
        return 0;
    }

    public static Item findItem(String kwd) {
        for (Item item : itemList) {
            if (item.compare(kwd))
                return item;
        }
        return null;
    }

    void readAllItems() {
        Scanner fileIn = openFile("items-i-step3.txt");
        Item it = null;
        fileIn.nextLine();
        int type = 0;
        while (fileIn.hasNext()) {
            type = fileIn.nextInt();  // 상속에서 추가되어야 하는 부분
            if (type == 1)
                it = new Item();
            else if (type == 2)
                it = new ItemDiscount();
            it.read(fileIn);
            itemList.add(it);
        }
        fileIn.close();
    }

    private static Scanner openFile(String filename) {
        File f = new File(filename);
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return fileIn;
    }

    void printAllItems() {
        for (Item item : itemList) {
            item.print();
            System.out.println();
        }
    }

    void printAnOrder(String id) {
        int total = 0;
        System.out.println("주문확인 : " + id);
        for (Order ord : ordList) {
            if (ord.userId.equals(id)) {
                ord.print();
                total += ord.getTotal();
            }
        }
        System.out.println(" 합계 : " + total + "원");
    }
}