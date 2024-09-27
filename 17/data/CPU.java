package data;

public class CPU extends Product {
    public double clockRate = 2.4; // 時脈，2.4GHz
    public int coreNumber = 4; // 核心數 4 核心

    public void render() {
        String description = this.number + "," +
                this.brand + "," +
                this.name + "," +
                this.clockRate + "," +
                this.coreNumber;

        System.out.println(description);
    }
}
