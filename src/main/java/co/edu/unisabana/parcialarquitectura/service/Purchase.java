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

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public int getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(int buyerCode) {
        this.buyerCode = buyerCode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
