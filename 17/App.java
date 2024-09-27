import data.CPU;

class App {
    public static void main(String[] args) {
        // Class1 obj1 = new Class1();
        // Class2 obj2 = new Class2();
        // obj1.render();
        // System.out.println(obj2.x);

        // // Class2 繼承 Class1 後
        // obj2.render();

        // 使用 CPU 物件
        CPU c = new CPU();
        c.render();
        System.out.println(c.number);
    }
}
