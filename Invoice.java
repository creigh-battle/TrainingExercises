package Training;

public class Invoice {

    String partNumber;
    String description;
    int quantity;
    double pricePerItem;



    public Invoice(String partNumber, String description, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;

        this.setQuantity(quantity);
        this.setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) quantity = 0;
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0) pricePerItem = 0;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        if (quantity < 0) {
            quantity = 0;
        }
        if (pricePerItem < 0) {
            pricePerItem = 0.0;
        }
        return quantity * pricePerItem;
    }

}

class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoiceTest = new Invoice("42", "Training Book", 3, 14.99);
        System.out.println(invoiceTest.getInvoiceAmount());
    }
}
