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
public class CreditCardPaymentStrategy implements PaymentStrategy {
  private String name;
  private String cardNumber;
  private String cvv;
  private String expirationDate;

  public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String expirationDate) {
    this.name = name;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.expirationDate = expirationDate;
  }

  @Override
  public void pay(double amount) {
    System.out.println(amount + " paid by credit card");
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
public class CreditCardPaymentStrategy implements PaymentStrategy {
  private String name;
  private String cardNumber;
  private String cvv;
  private String expirationDate;

  public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String expirationDate) {
    this.name = name;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.expirationDate = expirationDate;
  }

  @Override
  public void pay(double amount) {
    System.out.println(amount + " paid by credit card");
  }
}
>>>>>>> 542417be5900ad5967ba7e2dadbdf0f5c2708ea4
