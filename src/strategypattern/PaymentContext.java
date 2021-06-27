/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;


public class PaymentContext
{
 private PaymentStrategy paymentStrategy;

 // Müşteri, bu yöntemi çağırarak hangi 
 //Ödeme Yöntemini kullanılacağını belirleyecektir.
 
 public void setPaymentStrategy(PaymentStrategy strategy)
 {
  this.paymentStrategy = strategy;
 }

 public PaymentStrategy getPaymentStrategy()
 {
  return paymentStrategy;
 }

 public void pay(String amount)
 {
  paymentStrategy.pay(amount);
 }

}