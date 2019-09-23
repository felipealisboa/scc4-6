package math;

public class MonetarySystem {

    private int minAmount;
    private int maxAmount;
    private int n;

    public MonetarySystem(int minAmount, int maxAmount, int n) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.n = n;

        monetaryCount(minAmount, maxAmount, n);
    }

    private void monetaryCount(int minAmount, int maxAmount, int n) {
        int maxCount;
        int minCount;
        int minNew;

            if(n % maxAmount == 0) {
                maxCount = Math.abs(n / maxAmount );
                System.out.println("Saque R$" + n + ": " + maxCount + " nota de R$" + maxAmount);

            } else if(n % maxAmount == 1) {
                maxCount = Math.abs(n / maxAmount) -1;
                minNew = n - (maxCount * maxAmount);
                minCount = Math.abs(minNew / minAmount);
                System.out.println("Saque R$" + n + ": " + minCount + " nota de R$" + minAmount + " e " + maxCount + " nota de R$" + maxAmount);

            } else {
                maxCount = Math.abs(n / maxAmount);
                minNew = n - (maxCount * maxAmount);
                minCount = Math.abs(minNew / minAmount);
                System.out.println("Saque R$" + n + ": " + minCount + " nota de R$" + minAmount + " e " + maxCount + " nota de R$" + maxAmount);
            }
    }

}
