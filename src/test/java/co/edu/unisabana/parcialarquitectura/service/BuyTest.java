package co.edu.unisabana.parcialarquitectura.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BuyTest {

  private final Buy service = new Buy();

  @Test
  public void testMakePurchaseForDifVenBuy() {
    Purchase purchase = new Purchase(2, 3, "Books");
    assertThrows(IllegalArgumentException.class, () -> {
      service.makePurchase(purchase);
    });
  }


  @Test
  public void testMakePurchaseForSameVenBuy(){
    Purchase purchase = new Purchase(2, 2, "Books");
    assertThrows(IllegalSaleException.class, () -> {
      service.makePurchase(purchase);
    });
  }

  @Test
  public void testMakePurchaseSaleNotPossible(){
    Purchase purchase = new Purchase(0, 0, null);
    assertThrows(IllegalSaleException.class, () -> {
      service.makePurchase(purchase);
    });
  }

}