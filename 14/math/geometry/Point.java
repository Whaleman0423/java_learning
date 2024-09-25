package math.geometry;

public class Point {
    // 類別的屬性與方法
    public static int ORIGIN_X = 0;
    public static int ORIGIN_Y = 0;

    public static void renderOrigin() {
        System.out.println(Point.ORIGIN_X + "," + Point.ORIGIN_Y);
    }

    // 物件的屬性、方法、建構式
    public int x = 3;
    public int y = 4;

    // 物件的建構式
    public Point(int xArg, int yArg) {
        this.x = xArg;
        this.y = yArg;
    }

    public void render() {
        System.out.println(this.x + "," + this.y);
    }
}
