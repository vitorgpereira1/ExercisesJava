package exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.classExercise.entities;

public class Product2 {
    private String name;
    private double price;
    private int quantity;


    // Sobrecarga e tambem pode ter 1 construtor padrão
    public Product2 (){

    }
    public Product2(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product2(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock (){
        return price * quantity;
    }
    public void addProducts (int quantity){
        this.quantity += quantity;
    }
    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name +
                ", $ " +
                String.format("%.2f", price) +
                ", " +
                this.quantity +
                " units, Total: $ " +
                String.format("%.2f",totalValueInStock());
    }
}
