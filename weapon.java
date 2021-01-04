//In this class will only be used to store global level and weapon type
public class weapon {
    
    //initialize all weapon level as 0 (no weapon)
    private int[] level,type = {0,0,0,0,0,0,0,0,0,0};
    
    //0: No weapon   1: Crossbow   2: Guns   3: Catapult   4: Crossbow
    public int getType(int row) {    //Get what weapon type is on that row
        return type[row];
    }

    //Which row, specify weapon type
    public void setType(int row,int types) {
        type[row] = types;
    }

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
    
/* (deprecated START)
    
    //Get appropriate attack damage value based on weapon type
    public int getAtkDmg(int row) {
        
        switch (type[row]) {
            case 0 ->                 {
                    
                }
            case 1 ->                 {
                    int atkdmg = 5;
                }
            case 2 ->                 {
                    int atkdmg = 10;
                }
            case 3 ->                 {
                    int atkdmg = 0;
                }
            default ->                {
                    
                }
        }
        return atkdmg;
    }   
    
    (deprecated END)    */
}
