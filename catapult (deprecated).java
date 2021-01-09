//Level 1, 4 coins    Level 2, 7 coins    Level 3, 14 coins
public class catapult extends weapon {
    private int atkdmg,lvl;     //atkdmg for this crossbow, lvl for specified row weapon level
    
    public int getAtkDmg(int row) {
        lvl = super.getLevel(row);
        switch (lvl) {
            case 1 ->                 { //Level 1 damage 10
                    int atkdmg = 10;
                }
            case 2 ->                 { //Level 2 damage 15
                    int atkdmg = 15;
                }
            case 3 ->                 { //Level 3 damage 20
                    int atkdmg = 20;
                }
            default ->                 {    //Level null damage 0
                    int atkdmg = 0;
                }
        }
        
        return atkdmg; 
    }
}
