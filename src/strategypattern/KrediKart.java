/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

public class KrediKart implements PaymentStrategy
{

  @Override
  public void pay( String amount )
  {
    System.out.println("Müşteri Ödeyeceği Para " + amount + "TL. Kredi Kartı Kullanarak");
  }

}