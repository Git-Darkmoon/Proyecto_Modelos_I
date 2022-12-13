/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author Juan
 */
public class CashStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println(amount + " -- paid with cash");
    }
    
}
