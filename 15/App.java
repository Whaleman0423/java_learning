import data.Person;

class App {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.talk();
        // // Person p2 = new Person("叮叮", 12); // 錯誤．當沒有定義建構式

        Person p1 = new Person(10, "丁滿");
        p1.talk();

        Person p2 = new Person("彭彭");
        p2.talk();

        // Person p3 = new Person(); // 錯誤，當已經有定義需要有參數的建構式，則必須要給參數
    }
}
