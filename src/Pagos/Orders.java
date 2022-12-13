/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

import Pagos.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Orders {
  /*Implementación de la estrategia*/
    
  private PaymentStrategy strategy;
  private double price = 0;
  
    // Lista de pedidos
  private List<Order> orders;

  // Constructor
  public Orders() {
    this.orders = new ArrayList<>();
  }

  // Método para agregar un pedido a la lista
  public void addOrder(Order order) {
    this.orders.add(order);
  }

  // Método para eliminar un pedido de la lista
  public void removeOrder(Order order) {
    this.orders.remove(order);
  }

  // Método para obtener la lista de pedidos
  public List<Order> getOrders() {
    return this.orders;
  }
  
  public double getPrice(){
    for (Order order : orders) {
        this.price += order.getPrice();
    }
    return this.price;
  }
  
  public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
  }
    
  public void PayOrder(){
        System.out.println("Total to pay = "+ getPrice());
        this.strategy.pay(this.price);
  }
}
