/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author Juan
 */
public class CarDeliveryHandler extends BaseHandler {
   @Override
   public void handleRequest(Request request) {
      if (request.getDistance()> 20) {
          System.out.println("-- Delivery will be made by Car");
      } else {
         super.handleRequest(request);
      }
   }
    
}
