public class Transaction {

    private Product selectedProduct;
    private TransactionStatus status;

    public Transaction() {
        status = TransactionStatus.PENDING;
    }

    public void selectProduct(Product product) {
        this.selectedProduct = product;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void complete() {
        status = TransactionStatus.COMPLETED;
    }

    public void cancel() {
        status = TransactionStatus.CANCELLED;
    }
}



public enum TransactionStatus {
    PENDING,
    COMPLETED,
    CANCELLED
}
