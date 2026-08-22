// T 代表一种类型，创建 Box 对象时再指定实际类型
public class Box<T> {
    private T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}
