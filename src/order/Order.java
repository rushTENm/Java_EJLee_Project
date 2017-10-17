package order;

import java.util.Scanner;

import item.ItemType;
import item.Item;

public class Order {
    String userId;
    Item item;
    int cc;
    String sz;
    public boolean isMember;

    Order(String id) {
        userId = id;
        isMember = CartBasic.isMember(id);
    }

    void read(Scanner scan) {
        String tmp = scan.next();
        item = CartBasic.findItem(tmp);
        if (item == null) {
            //System.out.println("아이템 코드 못찾음" + tmp);
            return;
        }
        cc = scan.nextInt();
        sz = scan.next();
    }

    void print() {
        // 주문 출력에 들어갈 상품 기본 정보
        System.out.printf("%-6s ", userId);
        item.printOrder(this);
        System.out.printf(" [%d개] size:%s 소계:%5d원 ", cc, sz, getTotal());
        // 할인 정보 및 할인액 출력 (Item에서는 출력하는 것 없음)
        // 아이템 타입에 따라 오버라이딩 메소드 호출
        item.printOrderDiscount(this);
        System.out.println();
    }

    // 이 아이템에 대한 주문의 금액 소계
    // Item 상속 클래스의 getDiscount() 메소드로 할인액 계산
    int getTotal() {
        return cc * (item.getPrice() - item.getDiscount(isMember));
    }

    // 이 사용자의 주문들 중에 it 아이템 주문 개수를 반환
    // 묶음 상품의 할인액 계산을 위해 필요 - 묶음 상품은 두 상품의 개수의 최소값만큼 할인 적용
    public int count(Item it) {
        return CartBasic.counts(userId, it);
    }

    // 이 주문의 아이템 개수를 반환
    public int getCount() {
        return cc;
    }

    public String getId() {
        return userId;
    }

    public Item getItem() {
        return item;
    }
}