import java.util.Scanner;

public class LoopStatement {

    public static void main(String[] args) {
        // continue; 基本測試
        // for (int i = 0; i <= 6; i++) {
        // continue;
        // System.out.println(i); // 錯誤：continue下面都不會執行
        // }

        // for (int i = 0; i <= 6; i++) {
        // if (i % 3 == 0) {
        // continue;
        // }
        // System.out.println(i); // 打印出 1, 2, 4, 5
        // }

        // for (int i = 0; i <= 6; i++) {
        // // if (i % 3 == 0) {
        // // continue;
        // // }
        // System.out.println(i); // 打印出 1, 2, 3, 4, 5, 6
        // }

        // break; 基本測試
        // int i = 0;
        // while (i <= 6) {
        // System.out.println(i); // 打印出 1, 2, 3, 4, 5, 6
        // i++;
        // }

        // int i = 0;
        // while (i <= 6) {
        // break;
        // System.out.println(i); // 錯誤：break 後的程式碼不會被執行
        // i++;
        // }

        // int i = 0;
        // while (i <= 6) {
        // if (i == 4) {
        // break;
        // }
        // System.out.println(i); // 打印出 0, 1, 2, 3; 4 會 break 強制結束回圈
        // i++;
        // }

        // 應用案例：連續輸入直到正確為止
        // Scanner s = new Scanner(System.in);
        // System.out.println("請輸入一個正整數");
        // int number = s.nextInt();
        // // System.out.println(number);

        // if (number > 0) {
        // System.out.println("輸入正確");
        // } else {
        // System.out.println("輸入錯誤");
        // }

        // Scanner s = new Scanner(System.in);
        // // System.out.println(number);
        // int number;
        // while (true) {
        // System.out.println("請輸入一個正整數");
        // number = s.nextInt();
        // System.out.println("使用者輸入的數值為：" + number);

        // if (number > 0) { // 如果使用者輸入正確，強制結束回圈
        // break;
        // } else { // 如果使用者輸入錯誤，則繼續執行回圈
        // System.out.println("輸入錯誤");
        // }
        // }
        // // 取得正確的輸入，做想要做的工作
        // System.out.println("輸入正確: " + number);
    }
}
