public class DataTypeVariable {
    public static void main(String[] args) {
        // 在終端機印出各種資料型態的資料
        // 整數，預設是 int 型態
        System.out.println(3);
        System.out.println(120);

        // 長整數，數字的後面特別加上 L
        // System.out.println(20000000000000);
        System.out.println(20000000000000L);

        // 浮點數，預設為 double 雙精度型態
        System.out.println(3.14159268);
        // 單精度浮點數，數字的後面特別加上 F
        System.out.println(3.14159268F);

        // 布林值
        System.out.println(false);
        // 字元，只能包一個字
        System.out.println('a');
        // System.out.println('ab');

        // 字串，可以包含 0 到多個字元
        System.out.println("哈囉你好");

        // 使用變數
        // 整數
        int x;
        x = 3;
        System.out.println(x);
        x = 120;
        System.out.println(x);

        // int y = 200000000000000L;
        long y = 200000000000000L;
        System.out.println(y);

        // 浮點數
        double m = 3.14159268;
        System.out.println(m);

        // float n = 3.14159268;
        float n = 3.14159268f;
        System.out.println(n);

        // 布林
        boolean b;
        b = true;
        System.out.println(b);

        char c = '我';
        System.out.println(c);

        String s = "哈囉你好";
        System.out.println(s);
        s = "Hello Java";
        System.out.println(s);
    }
}
