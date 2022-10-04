package co.edu.unisabana.parcialarquitectura.service;

public class Purchase {
    private int vendorCode;
    private int buyerCode;
    private String item;

    public Purchase(int vendorCode, int buyerCode, String item) {
        this.vendorCode = vendorCode;
        this.buyerCode = buyerCode;
        this.item = item;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public int getBuyerCode() {
        return buyerCode;
    }

    public String getItem() {
        return item;
    }
}
