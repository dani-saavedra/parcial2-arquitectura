package co.edu.unisabana.parcialarquitectura.service;


import co.edu.unisabana.parcialarquitectura.repository.Database;

public class Buy {




  public String makePurchase(Purchase purchase) {
    Database database = new Database();
    if (purchase.getBuyerCode() == purchase.getVendorCode()) {
      throw new IllegalSaleException(purchase.getVendorCode(), purchase.getBuyerCode());
    }
    int result = database.savePurchase(purchase.getBuyerCode(),   purchase.getItem());
    if (result == 1) {
      throw new IllegalArgumentException("Product sold");
    } else {
      throw new IllegalArgumentException("The sale was not possible");
    }
  }

}
