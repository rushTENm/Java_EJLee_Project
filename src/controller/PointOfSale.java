package controller;

import java.util.Scanner;

public class PointOfSale {
    Table tables[] = new Table[20];
    Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.print("테이블 번호를 입력해주세요. : ");
            int selectedNumber = Integer.parseInt(scanner.next())-1;
            if (tables[selectedNumber] == null)
                tables[selectedNumber] = new Table();

            System.out.println("1. 주문");
            System.out.println("2. 주문 메뉴 조회");
            System.out.println("3. 결제");
            System.out.print("무엇을 하시겠습니까? ");
            switch (Integer.parseInt(scanner.next())) {
                case 1:
                    tables[selectedNumber].orderMenu();
                    break;
                case 2:
                    tables[selectedNumber].printOrdered();
                    break;
                case 3:
                    if (tables[selectedNumber].pay()<=0) {
                        tables[selectedNumber] = null;
                    }
                    break;
            }
        }
    }
}
