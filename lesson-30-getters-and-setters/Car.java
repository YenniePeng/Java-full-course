public class Car {
    // private 字段只能在 Car 类内部直接访问
    // 字段也可以设置为 final，但 final 字段初始化后不能通过 setter 修改
    private String make;
    private String color;
    private int price;

    Car(String make, String color, int price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    String getMake() {
        return this.make;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    void setMake(String make) {
        this.make = make;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can't be less than zero");
        } else {
            this.price = price;
        }
    }
}
