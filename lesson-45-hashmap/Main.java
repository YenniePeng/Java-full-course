import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap 使用 key-value pairs（键值对）存储数据
        // key 必须唯一，value 可以重复
        // HashMap 不保证元素顺序，并且适合快速查找数据
        // 泛型格式：HashMap<Key, Value>
        HashMap<String, Double> map = new HashMap<>();

        // put()：添加键值对
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.25);

        // key 是唯一的，再次使用相同 key 会覆盖原来的 value
//        map.put("orange", 1.00);

        // remove()：根据 key 删除键值对
//        map.remove("apple");

        // get()：根据 key 获取 value
//        System.out.println(map.get("apple"));
//        System.out.println(map.get("coconut"));

        // containsKey()：检查 key 是否存在，返回 boolean
//        System.out.println(map.containsKey("coconut"));

//        if (map.containsKey("apple")) {
//            System.out.println(map.get("apple"));
//        } else {
//            System.out.println("Key not found");
//        }

        // containsValue()：检查 value 是否存在，注意包装类的数据类型
        // 1.25 会自动装箱为 Double，然后与 Map 中的 value 比较
        System.out.println(map.containsValue(1.25));

        // size()：返回键值对的数量
        System.out.println(map.size());

        // keySet() 返回所有 key，再通过 key 获取对应的 value
        // HashMap 的遍历顺序不固定
        for (String key : map.keySet()) {
            System.out.println(key + ": $" + map.get(key));
        }

//        System.out.println(map);
    }
}
