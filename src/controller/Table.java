package controller;

import model.MenuEnum;

import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    Scanner scanner = new Scanner(System.in);
    ArrayList<MenuEnum> orderedMenu = new ArrayList<>();
    int total = 0;

    public void printOrdered() {
        if (!orderedMenu.isEmpty()) {
            for (MenuEnum ordered : orderedMenu) {
                System.out.print(ordered.getName() + " ");
            }
            System.out.println("\n" + total + "원 주문되었습니다.");
        } else
            System.out.println("주문된 메뉴가 없습니다.");
    }

    public void orderMenu() {
        System.out.print("주문할 메뉴를 입력해주세요 : ");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        for (String menuStr : inputs) {
            orderedMenu.add(MenuEnum.valueOf(menuStr));
            total += MenuEnum.valueOf(menuStr).getPrice();
        }

        printOrdered();
    }

    public int pay() {
        System.out.println("1. 카드");
        System.out.println("2. 현금");
        System.out.print("결제 수단을 선택해주세요 : ");
        switch (Integer.parseInt(scanner.next())) {
            case 1:
            case 2:
            default:
                System.out.print("결제 금액을 입력해주세요 : ");
                total -= Integer.parseInt(scanner.next());

                if (total > 0) {
                    System.out.print("추가 결제를 진행하시겠습니까?[Y,N] : ");
                    if (scanner.nextLine().equals("Y") || scanner.nextLine().equals("y"))
                        pay();
                    else
                        System.out.println(total + "원 남았습니다.");
                } else if (total == 0) {
                    System.out.println("결제가 정상적으로 진행되었습니다.");
                } else if (total < 0) {
                    System.out.println("거스름돈은 " + total * (-1) + "원입니다.");
                }
                break;
        }

        return total;
    }
}
