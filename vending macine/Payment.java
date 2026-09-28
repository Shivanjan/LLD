public class Payment {
    private double amountInserted;

    public void insertMoney(double amount) {
        amountInserted += amount;
    }

    public double getAmountInserted() {
        return amountInserted;
    }

    public void reset(){
        amountInserted = 0;
    }

    public  double refund() {
       int refundamount= (int) amountInserted;
        System.out.println("Refunding: " + refundamount);
        amountInserted =0;
        return refundamount;
    }

}