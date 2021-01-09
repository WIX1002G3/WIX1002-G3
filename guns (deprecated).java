//Level 1, 3 coins    Level 2, 6 coins    Level 3, 12 coins
public class guns extends weapon {
    private int atkdmg,lvl;     //atkdmg for this crossbow, lvl for specified row weapon level
    
    public int getAtkDmg(int row) {
        lvl = super.getLevel(row);
        switch (lvl) {
            case 1 ->                 { //Level 1 damage 5
                    int atkdmg = 5;
                }
            case 2 ->                 { //Level 2 damage 10
                    int atkdmg = 10;
                }
            case 3 ->                 { //Level 3 damage 12
                    int atkdmg = 12;
                }
            default ->                 {    //Level null damage 0
                    int atkdmg = 0;
                }
        }
        
        return atkdmg; 
    }
}
