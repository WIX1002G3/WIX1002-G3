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
    //logic to lose the game if one of the wall HP falls to zero or below.
    public void wallLogic() {
        for (int i = 0; i < 10; i++) {
            if (hp[i] <= 0) {
                game.gameOver();
            }
        }
    }
}
