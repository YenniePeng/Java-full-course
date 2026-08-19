public class Main {
    public static void main(String[] args) {
        // Inheritance（继承）：一个类继承另一个类的属性和方法
        // Child（子类）<- Parent（父类）<- Grandparent（祖父类）
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // isAlive 继承自 Organism
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        // Dog 和 Cat 通过 Animal 继承 eat()
        dog.eat();
        cat.eat();
        plant.photosynthesize();

        // Dog 不是 Plant，因此不能调用 photosynthesize()
//        dog.photosynthesize();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
