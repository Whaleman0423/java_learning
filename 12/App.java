class Test {
    public static void main(String[] args) {
        // 程式進入點
        Test.talk("Hello");
        Test.talk("你好");

        BasicMeth.add(3, 4);
        BasicMeth.multiply(4, 2);

        int addAns = BasicMeth.add(3, 4); // 要用變數儲存方法的回傳值
        System.out.println(addAns);

        int multiplyAns = BasicMeth.multiply(4, 2);
        System.out.println(multiplyAns);

        System.out.println("加法的結果的 20 倍：" + addAns * 20); // 回傳值的使用情境，如果需要接續回傳值的結果進行操作
    }

    // 定義更多自己的類別方法
    static void talk(String content) {
        System.out.println(content);
    }
}

class BasicMeth {
    static int add(int n1, int n2) {
        int result = n1 + n2;
        return result; // 如果沒有 return int 則會出現錯誤
    }

    static int multiply(int n1, int n2) {
        return n1 * n2;
    }
}