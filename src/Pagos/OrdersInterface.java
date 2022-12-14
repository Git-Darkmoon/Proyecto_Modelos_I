/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

import java.util.List;

/**
 *
 * @author Juan
 */
interface OrdersInterface {

  // Método que permite añadir una orden a la lista de ordenes
  public void addOrder(Order orderComponent);
  
  // Método que permite eliminar una orden de la lista de ordenes
  public void removeOrder(Order orderComponent);
  
  // Método que permite listar las ordenes
  public List<Order> getOrders();

    
}
