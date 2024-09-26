package math.geometry;

public class Line {
    private Point p1;
    private Point p2;

    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public void render() {
        System.out.println(
                this.p1.getX() + "," + this.p1.getY() + "-" + this.p2.getX() + "," + this.p2.getY());
    }
}
