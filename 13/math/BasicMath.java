package math; // 宣告所在的封包（package）名稱

// 類別的名稱需與檔案名稱一樣，才可以被其他 java 檔案調用
public class BasicMath {
    public static double PI = 3.1415926;

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }
}