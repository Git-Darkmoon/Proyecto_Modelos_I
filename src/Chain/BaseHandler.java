/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author Juan
 */
public class BaseHandler implements Handler {
   private Handler nextHandler;

   @Override
   public void setNext(Handler handler) {
      this.nextHandler = handler;
   }

   @Override
   public void handleRequest(Request request) {
      if (nextHandler != null) {
         nextHandler.handleRequest(request);
      }
   }
}
