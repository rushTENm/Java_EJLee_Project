package item;

import java.util.HashMap;

public enum ItemType {
    TRG(1, "운동복"), TRG_B(2, "운동바지"),
    HOOD_T(3, "후드티"),
    CTN_T(4, "면티  "),
    PANTS(5, "바지  "),
    SHORTS(6, "반바지"),
    SKRT(7, "치마  ");
    int typeNum;
    String typeName;

    private ItemType(int n, String tName) {
        typeNum = n;
        typeName = tName;
    }

    private static HashMap<Integer, ItemType> map = new HashMap<>();

    static {
        for (ItemType d : ItemType.values()) {
            map.put(d.typeNum, d);
        }
    }

    public int getNumber() {
        return typeNum;
    }

    public String getName() {
        return typeName;
    }

    public static ItemType get(int n) {
        return map.get(n);
    }
}
//T-01 3 후드티_ST1 5000 f s/m/l
//	static String categoryStr[] = {"운동복", "운동바지", "후드티", "면티", "바지", "반바지", "치마"};
