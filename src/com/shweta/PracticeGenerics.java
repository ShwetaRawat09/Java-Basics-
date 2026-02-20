package com.shweta;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PracticeGenerics {

    public static void main(String[] args){

        // Generic Repository with Student
        Repository<Student> studentRepo = new Repository<>();
        studentRepo.add(new Student("Aman", 85));
        studentRepo.add(new Student("Riya", 93));

        System.out.println("Students:");
        for (Student s : studentRepo.getAll()) {
            System.out.println(s);
        }

        // Generic Repository with Product
        Repository<Product> productRepo = new Repository<>();
        productRepo.add(new Product("Laptop", 75000));
        productRepo.add(new Product("Phone", 30000));

        System.out.println("\nProducts:");
        for (Product p : productRepo.getAll()) {
            System.out.println(p);
        }

        // Bounded Generic Method
        System.out.println("\nSquare of 4: " + MathUtil.square(4));

        // Wildcard Example
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        System.out.println("Total: " + StatsUtil.calculateTotal(numbers));
    }
}

class Repository<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    public T get(int index){
        return items.get(index);
    }

    public List<T> getAll(){
        return items;
    }
}

class Student {

    private String name;
    private double marks;

    public Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    public double getMarks(){
        return marks;
    }

    @Override
    public String toString(){
        return name + " - " + marks;
    }
}

class Product {

    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return name + " - " + price;
    }
}

class MathUtil {

    public static <T extends Number> double square(T number){
        return number.doubleValue() * number.doubleValue();
    }
}

class StatsUtil {

    public static double calculateTotal(List<? extends Number> list){
        double total = 0;

        for (Number num : list){
            total += num.doubleValue();
        }

        return total;
    }
}