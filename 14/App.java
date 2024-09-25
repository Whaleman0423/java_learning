import math.geometry.Point;;

class App {
    public static void main(String[] args) {
        // 程式的進入點
        System.out.println(Point.ORIGIN_X);
        Point.renderOrigin();

        // System.out.println(Point.x); // 錯誤：x 非 static，不可直接使用“類別”的屬性

        // 呼叫建構式，產生 Point 物件實體
        // String opj = new Point(); // 錯誤，Point 不能被宣告為 String

        Point p = new Point(3, 4);
        System.out.println(p.x);
        System.out.println(p.y);
        p.render();

        Point p2 = new Point(1, 1);
        System.out.println(p2.x);
        p2.render();

    }

}