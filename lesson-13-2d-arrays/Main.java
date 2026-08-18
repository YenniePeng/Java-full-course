public class Main {
    public static void main(String[] args) {
        // 2D Array（二维数组）适合存储矩阵形式的数据
        String[][] groceries = {
                {"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"fish", "chicken", "beef", "pork"}
        };

        // 第一个索引表示行，第二个索引表示列
        groceries[1][2] = "eggs";

        // 外层循环读取每一行，内层循环读取行中的每个元素
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
