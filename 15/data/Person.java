package data;

public class Person {
    // 物件屬性
    // public int age = 40;
    // public String name = "睿睿";

    public int age;
    public String name;

    // public Person(){} // 如果沒有建立建構式，預設會自己建立預設的建構式

    // 物件建構式
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // public Person(int x, String n){} // 錯誤，如果參數跟其他的建構式一樣，會出錯

    // 建立第二個永遠 18 歲的 Person 建構式
    public Person(String name) {
        this.age = 18;
        this.name = name;
    }

    // 物件方法
    public void talk() {
        System.out.println(this.name + ": " + this.age);
    }
}
