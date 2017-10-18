package item;

import order.Order;

import java.util.Scanner;

public class ItemDiscount extends Item {
    String memberDiscount;
    int discountedPrice;

    @Override
    public void read(Scanner sc) {
        super.read(sc);
        memberDiscount = sc.next();
        discountedPrice = sc.nextInt();
    }

    @Override
    public void print() {
        super.print();
        if (memberDiscount.equals("y"))
            System.out.print("회원");
        else if (memberDiscount.equals("n"))
            System.out.print("전체");
        System.out.printf("/특별할인 %d원", discountedPrice);
    }

    @Override
    public void printOrderDiscount(Order ord) {
        System.out.print(" ");
        if (memberDiscount.equals("y"))
            System.out.print("회원");
        else if (memberDiscount.equals("n"))
            System.out.print("전체");
        System.out.printf("/특별할인 %d원(%d원 할인)", discountedPrice,price- discountedPrice);
    }

    @Override
    public int getDiscount(boolean bMember) {
        return price-discountedPrice;
    }
}
