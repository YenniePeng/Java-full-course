# Java Learning Journey

这是一个持续更新的 Java 学习仓库，用来保存我在学习过程中的小练习。

每个知识点放在独立的 `lesson` 子目录中，并且都可以单独编译和运行。以后学到的新内容也会继续按照这个结构追加，不需要重新创建仓库。

## 当前课程

| Lesson | 主题 | 主要知识点 |
| --- | --- | --- |
| `lesson-01-variables-data-types` | Variables & Data Types | 基本类型、引用类型、`if/else` |
| `lesson-02-scanner-input` | Scanner Input | 读取字符串、数字、字符和布尔值 |
| `lesson-03-rectangle-area` | Rectangle Area | 用户输入、乘法计算 |
| `lesson-04-mad-libs` | Mad Libs | 字符串输入与拼接 |
| `lesson-05-operators` | Operators | `+ - * / %`、运算顺序 |
| `lesson-06-shopping-cart` | Shopping Cart | 商品、单价、数量与总价 |
| `lesson-07-switch-calculator` | Enhanced Switch Calculator | 增强型 `switch`、除零判断 |
| `lesson-08-banking-program` | Banking Program | 循环、方法、余额操作 |
| `lesson-09-random-dice` | Random Dice | `Random`、循环、ASCII 图案 |
| `lesson-10-arrays-for-each` | Arrays & Enhanced For Loop | 动态数组、普通 `for`、for-each |
| `lesson-11-array-search` | Array Search | 遍历数组、查找元素、`break`、字符串比较 |
| `lesson-12-varargs` | Varargs | 可变参数、数组遍历、求和与平均值 |
| `lesson-13-2d-arrays` | 2D Arrays | 二维数组、行列索引、嵌套 for-each |
| `lesson-14-java-quiz-game` | Java Quiz Game | 数组、二维数组、循环、条件判断与计分 |
| `lesson-15-rock-paper-scissors` | Rock Paper Scissors | `do-while`、`continue`、随机选择与胜负判断 |
| `lesson-16-java-slot-machine` | Java Slot Machine | 方法、随机数组、循环、余额与赔率计算 |
| `lesson-17-objects-and-classes` | Objects & Classes | 对象、类、属性、方法与引用类型 |
| `lesson-18-constructors` | Constructors | 构造方法、参数、初始值与 `this` |
| `lesson-19-overloaded-constructors` | Overloaded Constructors | 构造方法重载与多种对象初始化方式 |
| `lesson-20-array-of-objects` | Array of Objects | 对象数组、引用、for-each 与修改对象属性 |

## 运行方式

需要安装 JDK 17 或更高版本。进入任意 lesson 目录后运行：

```bash
javac Main.java
java Main
```

例如：

```bash
cd lesson-03-rectangle-area
javac Main.java
java Main
```

编译后生成的 `.class` 文件不会提交到 Git。

## 后续更新

每学完一个新知识点，就新增一个编号 lesson，并更新本 README 的课程列表。
