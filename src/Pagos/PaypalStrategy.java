<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author Juan
 */
public class PaypalStrategy implements PaymentStrategy{
    
    private String username;
    private String password;
    
    public PaypalStrategy(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println(amount + " -- paid through paypal");
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author Juan
 */
public class PaypalStrategy implements PaymentStrategy{
    
    private String username;
    private String password;
    
    public PaypalStrategy(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println(amount + " -- paid through paypal");
    }
    
}
>>>>>>> 542417be5900ad5967ba7e2dadbdf0f5c2708ea4
