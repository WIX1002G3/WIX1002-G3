public class weapon {
    
    //initialize all weapon level as 0 (no weapon)
    private int[] level,type = {0,0,0,0,0,0,0,0,0,0};
    
    //0: No weapon   1: Crossbow   2: Guns   3: Catapult   4: Cannon
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
        //Should implement a function where it requesting for other user input again (not skipped turn)
        else System.out.println("Maximum level reached. (3)");
    }
    //Get attack damage base on type
    public int getAtkDmg(int type, int level) {
        int atkdmg = 0;
        
        //Crossbow type----------------------------------------------------------
        if (type == 1) {
            switch (level) {
                case 1 ->                 { //Level 1 damage 2
                        atkdmg = 2;
                    }
                case 2 ->                 { //Level 2 damage 5
                        atkdmg = 5;
                    }
                case 3 ->                 { //Level 3 damage 10
                        atkdmg = 10;
                    }
                default ->                { //Level null damage 0
                        atkdmg = 0;
                    }
            }
        }
        //Guns type--------------------------------------------------------------
        else if (type == 2) {
            switch (level) {
                case 1 ->                 { //Level 1 damage 5
                        atkdmg = 5;
                    }
                case 2 ->                 { //Level 2 damage 10
                        atkdmg = 10;
                    }
                case 3 ->                 { //Level 3 damage 12
                        atkdmg = 12;
                    }
                default ->                { //Level null damage 0
                        atkdmg = 0;
                    }
            }
        }
        //Catapult type----------------------------------------------------------
        else if (type == 3) {
            switch (level) {
                case 1 ->                 { //Level 1 damage 10
                        atkdmg = 10;
                    }
                case 2 ->                 { //Level 2 damage 15
                        atkdmg = 15;
                    }
                case 3 ->                 { //Level 3 damage 20
                        atkdmg = 20;
                    }
                default ->                { //Level null damage 0
                        atkdmg = 0;
                    }
            }
        }
        //Cannon type------------------------------------------------------------
        else if (type == 4) {
            switch (level) {
                case 1 ->                 { //Level 1 damage 15
                        atkdmg = 15;
                    }
                case 2 ->                 { //Level 2 damage 20
                        atkdmg = 20;
                    }
                case 3 ->                 { //Level 3 damage 25
                        atkdmg = 25;
                    }
                default ->                { //Level null damage 0
                        atkdmg = 0;
                    }
            }
        }
        //-----------------------------------------------------------------------
        else {return 0;}
        
        return atkdmg;
    }
}
