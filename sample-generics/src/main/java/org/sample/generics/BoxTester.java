package org.sample.generics;

public class BoxTester {

    public static void main(String[] args) {
        Box<Book> books = new Box<>();

        books.addItem(new Book("Test1", "TestAuth1",200.00));
        books.addItem(new Book("Test2", "TestAuth2",100.00));

        System.out.println(books);
        System.out.println(books.getLatestItem());
        System.out.println(BoxUtils.getItemCount(books));
        System.out.println(books.getTotalPrice());

        Box<Fruit> fruits = new Box<>();

        fruits.addItem(new Fruit("banana", 100.00));
        fruits.addItem(new Fruit("oranges", 150.00));

        System.out.println(fruits);
        System.out.println(fruits.getLatestItem());
        System.out.println(BoxUtils.getItemCount(fruits));
        System.out.println(fruits.getTotalPrice());
    }
}
