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
