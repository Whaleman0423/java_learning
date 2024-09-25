class Test {
    public static void main(String[] args) {
        // 程式進入點
        Test.talk(); // 呼叫類別的方法
        Test.talk();
        // Test.talkWithContent(); // 錯誤：沒有給參數
        Test.talkWithContent("你好哇！");

        BasicMeth.add(3, 4); // 7
        BasicMeth.multiply(4, 2); // 8
    }

    // 定義更多自定義的類別方法
    static void talk() {
        System.out.println("Hello");
    }

    static void talkWithContent(String content) {
        System.out.println(content);
    }
}

class BasicMeth {
    static void add(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);
    }

    static void multiply(int n1, int n2) {
        int result = n1 * n2;
        System.out.println(result);
    }
}