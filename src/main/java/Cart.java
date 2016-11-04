package main;
import java.util.ArrayList;

public class Cart {

  ArrayList<Item> items;
  double totalPrice;


  public Cart() {
    this.items = new ArrayList<Item>();
    this.totalPrice = 0.00;

  }
  public ArrayList getItems() {
    return this.items;
  }
  public double getTotalPrice() {
    return this.totalPrice;
  }
  public double AddItem(Item item) {
    return this.totalPrice += item.price;
  }

}
