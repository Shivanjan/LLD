public class VendingMachine{
    private Inventory inventory;
    private Payment payment;
    private Transaction transaction;

    public VendingMachine() {
        inventory = new Inventory();
        payment = new Payment();
        transaction = new Transaction();
    }

    public void selectProduct(String productId) {
        
    }

    public void insertMoney(double amount){

    }

    public void DispenceProduct(String productId) {
        

    }

    public void cancelTransaction() {
        
    }

    public void refund() {
        
    }


}