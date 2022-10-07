package org.sample.generics;

public class TestWildCards {

    public static void main(String[] args) {
        Box<Book> books = new Box<>();

        books.addItem(new Book("Test1", "TestAuth1",200.00));
        books.addItem(new Book("Test2", "TestAuth2",100.00));

        //unbounded wildcards
        System.out.println(BoxUtils.getItemCountUsingWildCards(books));

        //upper bounded wildcards
        Box<Fruit> fruits = new Box<>();

        fruits.addItem(new Fruit("banana", 100.00));
        fruits.addItem(new Fruit("oranges", 150.00));
        System.out.println(BoxUtils.getAveragePriceOfFruit(fruits));

        Box<Apple> apples = new Box<>();
        apples.addItem(new Apple("fuzzi",180.00));
        apples.addItem(new Apple("fuzzi",180.00));
        System.out.println(BoxUtils.getAveragePriceOfFruit(apples));


        Box<Boxable> boxable = new Box<>();
//        System.out.println(BoxUtils.getAveragePriceOfFruit(boxable));//because boxable is not extending fruits

        //lower bounded wildcards
        //when we declare lower bounded type anything up the hirarchiy is fine
        BoxUtils.addApplesToBox(apples);
        BoxUtils.addApplesToBox(fruits);
        BoxUtils.addApplesToBox(boxable);


        //BoxUtils.addApplesToBox(books); ass books does not come in the hirarchy of apples so its not gonna work
    }
}
