public class coin {
    private int totalCoin = 50; //initial coin
    //Get current value of coin
    public int getTotalCoin() {
        return totalCoin;
    }
    //Updates value of coin
    public void setTotalCoin(int coinChg) {
        totalCoin = totalCoin + coinChg;
    }
}
