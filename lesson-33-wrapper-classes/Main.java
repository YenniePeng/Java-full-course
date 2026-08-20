public class Main {
    public static void main(String[] args) {
        // 下面包含多组练习；切换示例时，一次只启用一组同名变量
        // Wrapper Classes（包装类）把基本数据类型包装成对象
        // int -> Integer、double -> Double、char -> Character、boolean -> Boolean
        // 集合等只能保存对象的地方需要使用包装类

        // 以前可以使用构造方法创建包装类对象，但这些写法已经过时
//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);

        // Autoboxing（自动装箱）：Java 自动把基本类型转换为包装类对象
        Integer a = 123;     // int -> Integer
        Double b = 3.14;     // double -> Double
        Character c = '$';   // char -> Character
        Boolean d = true;    // boolean -> Boolean

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Unboxing（自动拆箱）：Java 自动把包装类对象转换为基本类型
//        int x = a;         // Integer -> int
//        double x = b;      // Double -> double
//        char x = c;        // Character -> char
//        boolean x = d;     // Boolean -> boolean

        // 基本类型转换为 String
//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(true);
//
//        String x = a + b + c + d;
//        System.out.println(x);

        // parse 方法把 String 解析为对应的基本类型
//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");
//
//        String x = "" + a + b + c + d;
//        System.out.println(x);

        // Character 包装类提供判断字符的工具方法
//        char letter = 'b';
//        System.out.println(Character.isLetter(letter));
//        System.out.println(Character.isUpperCase(letter));
    }
}
