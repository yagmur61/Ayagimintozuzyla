
package strategypattern;


import java.util.Scanner;


public class Customer 
{

  public static void main( String[] args )
  {

    System.out.println("Lütfen Ödeme Tipini Seçiniz : 'KrediKart' yada 'BankaKart' yada 'Paypal'");
    Scanner scanner = new Scanner(System.in);
    String paymentType = scanner.next();
    System.out.println("Ödeme Tipi Şu : " + paymentType);

    System.out.println("\nLütfen Ödeyeceğiniz Miktarı Giriniz: ");
    Scanner scanner1 = new Scanner(System.in);
    String amount = scanner1.next();
    System.out.println("Miktar Şu : " + amount);

    PaymentContext ctx = null;
    ctx = new PaymentContext();

    if( "KrediKart".equalsIgnoreCase(paymentType) )
    {
      ctx.setPaymentStrategy(new KrediKart());
    }
    else if( "BankaKart".equalsIgnoreCase(paymentType) )
    {
      ctx.setPaymentStrategy(new BankaKart());
    }
    else if( "Paypal".equalsIgnoreCase(paymentType) )
    {
      ctx.setPaymentStrategy(new Paypal());
    }
    
    System.out.println("Ödeme Şekliniz :"+ctx.getPaymentStrategy());
    
    ctx.pay(amount);

  }
}