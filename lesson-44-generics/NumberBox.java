// extends Number 限制 T 必须是 Number 或其子类
public class NumberBox<T extends Number> {
    private T number;

    NumberBox(T number) {
        this.number = number;
    }

    T getNumber() {
        return number;
    }
}
