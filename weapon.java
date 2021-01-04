public class weapon {
    //initialize all weapon level as 0 (no weapon)
    private int[] level = {0,0,0,0,0,0,0,0,0,0};
    private int atkdmg;
    
    //Type 0:Crossbow   Type 1:Gun   Type 2: Catapult   Type 3: Cannon (Planned only.)
    
    //The row is to be specified by user
    public int getLevel(int row) {
        return level[row];
    }
    //Set level of each row in the main game class.
    public void setLevel(int row,int lvl) {
        if (lvl >= 0 && lvl <4) {
            level[row] = lvl;
        }
        else System.out.println("Maximum level reached. (3)");  //Should implement a function where it requesting for other user input again (not skipped and become enemy's turn)
    }
    //Get appropriate attack damage value based on weapon level
    public int getAtkDmg(int row) {
        switch (level[row]) {
            case 1 ->                 {
                    int atkdmg = 2;
                }
            case 2 ->                 {
                    int atkdmg = 5;
                }
            case 3 ->                 {
                    int atkdmg = 10;
                }
            default ->                 {
                    int atkdmg = 0;
                }
        }
        return atkdmg;
    }
}
