import math.BasicMath;
// import math.geometry.Rectangle;
import math.geometry.*;;

class App {
    public static void main(String[] args) {
        // // 程式的進入點
        // System.out.println(math.BasicMath.PI); // 若要存取，BasicMath 及其方法都需加上 public

        // int result = math.BasicMath.add(3, 4);
        // System.out.println(result);

        // 加上 import，可省略 math
        System.out.println(BasicMath.PI);
        int result = BasicMath.add(3, 4);
        System.out.println(result);

        // 兩層的封包
        // System.out.println(math.geometry.Rectangle.GOLDEN_RATIO);

        // 添加 import
        System.out.println(Rectangle.GOLDEN_RATIO);
    }

}
