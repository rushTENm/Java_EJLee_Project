package item;

import order.CartBasic;
import order.Order;

import java.util.Scanner;

public class ItemDiscount extends Item {
    String memberDiscount;
    int discountedPrice;
    String bundleCondition;

    @Override
    public void read(Scanner sc) {
        super.read(sc);
        memberDiscount = sc.next();
        discountedPrice = sc.nextInt();
    }

    public void readBundle(Scanner scanner) {
        bundleCondition=scanner.next();
    }

    @Override
    public void print() {
        super.print();
        if (memberDiscount.equals("y"))
            System.out.print("회원");
        else if (memberDiscount.equals("n"))
            System.out.print("전체");

        if (bundleCondition == null)
            System.out.printf("/특별할인 %d원", discountedPrice);
        else
            System.out.printf("/묶음할인 [%s] %d원", bundleCondition, discountedPrice);
    }

    @Override
    public void printOrderDiscount(Order ord) {
        System.out.print(" ");
        if (bundleCondition==null) {
            if (memberDiscount.equals("y")&&CartBasic.isMember(ord.getId()))
                System.out.printf("회원/특별할인 %d원(%d원 할인)", discountedPrice, price - discountedPrice);
            else if (memberDiscount.equals("n"))
                System.out.printf("전체/특별할인 %d원(%d원 할인)", discountedPrice, price - discountedPrice);
        } else {
            // 묶음 상품 검사
        }
    }

    @Override
    public int getDiscount(boolean bMember) {
            return price - discountedPrice;
    }
}
