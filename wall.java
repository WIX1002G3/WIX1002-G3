public class wall {
    //initialize every wall with 50 HP
    private int[] hp = {50,50,50,50,50,50,50,50,50,50};
    
    //mutator for how many hp to add/remove for each wall
    public void setHp(int column,int hpChg) {
        hp[column] = hp[column] + hpChg;    //'+' is used because when it meets '-' it will follows as minus
    }
    //accessor for getting hp value for each wall
    public int getHp(int column) {
        return hp[column];
    }
}
