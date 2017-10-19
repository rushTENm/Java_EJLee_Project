package item;

import java.util.Scanner;

import order.Order;

public class Item {
    static int count = 1;
    int index = 0;
    String itemId;
    int saleType; // 1 일반, 2 특별할인, 3 묶음할인
    String name;
    int price;
    ItemType category;  // 구분. 1운동복, 2운동바지, 3후드티, ...
    String mf;
    String sizeOption;

    public Item() {
    }

    ;

    public void read(Scanner sc) {
        index = count++;
        saleType = 1;
        itemId = sc.next();
        category = ItemType.get(sc.nextInt());  // 1~7
        name = sc.next();
        price = sc.nextInt();
        mf = sc.next();
        sizeOption = sc.next();
    }

    // T-01 3 후드티_ST1 5000 f s/m/l
    // 아이템의 정보를 출력하는 메소드, 상속에서 Overriding
    public void print() {
        System.out.printf("%2d)", index);
        this.printOrder();
        System.out.printf(" - %-8s ", sizeOption);
    }

    // 주문에 대한 기본적인 공통부를 출력하는 메소드
    public void printOrder(Order ord) {
        System.out.printf("[%2d]", index);
        printOrder();
    }

    private void printOrder() {
        System.out.printf(" [%s] %s %s\t%5d원",
                itemId, category.getName(), name, price);  //**
    }

    // 할인 정보를 출력하는 메소드. 일반 상품은 하는 일이 없으나
    // 상속 클래스에서는 해당하는 할인 정보를 출력
    public void printOrderDiscount(Order ord) {  // 상속에서 Overriding

    }

    // 할인액을 계산하여 돌려주는 메소드
    // 상속 클래스에서 할인 여부를 판단하여 할인액을 반환하도록 오버라이딩해야 함
    public int getDiscount(boolean bMember) {
        return 0;
    }

    // 여러 가지 검색기능을 위한 비교 함수
    // index는 숫자이므로 문자열로 변환하여 키워드와 비교함
    public boolean compare(String kwd) {
        return (kwd.equals(index + "") || kwd.equals(itemId) || kwd.equals(name));
    }

    // 비교를 위한 아이템 객체 초기화 부분
    // 사용자가 입력한 값만 그 값으로 초기화하고 길이0이면(그냥 엔터) ""로 초기화한다.
    public void init(String indx, String code, String name, String sz) {
        if (indx.length() == 0) index = 0;
        else index = Integer.parseInt(indx);
        if (code.length() == 0) this.itemId = "";
        else this.itemId = code;
        if (name.length() == 0) this.name = "";
        else this.name = name;
        if (sz.length() == 0) this.sizeOption = "";
        else this.sizeOption = sz;
    }

    // 검색에서 사용자가 선택한 값을 가진 객체 it를 이용해 비교
    // 기본값이면 사용자가 그냥 엔터를 한 경우이므로 무시, 값을 가지면 같아야 함
    // 할인 여부나 할인 타입으로 검색하려면 이 메소드를 오버라이딩해야 함
    public boolean compare(Item it) {
        if (it.index == 0 || index == it.index) return true;
        if (it.itemId.length() == 0 || itemId.equals(it.itemId)) return true;
        if (it.name.length() == 0 || name.equals(it.name)) return true;
        if (it.sizeOption.length() == 0 || sizeOption.contains(it.sizeOption)) {
            if (it.sizeOption.equals("l")) {
                if (sizeOption.indexOf("l") == sizeOption.indexOf("xl") + 1)
                    return false;
            }  // l이 검색되어야 하는데 l은 없고 xl만 있는 경우
            return true;
        }
        return false;
    }

    // 다른 패키지에서 사용할 수 있도록 필드를 반환하는 public 메소드들
    public int getIndex() {
        return index;
    }

    public int getPrice() {  // 상속에서 Overriding
        return price;
    }

    public ItemType getCategory() {
        return category;
    }

    public void readBundle(Scanner fileIn) {
    }
}