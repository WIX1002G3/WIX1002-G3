//Level 1, 2 coins    Level 2, 5 coins    Level 3, 10 coins
public class crossbow extends weapon {
    private int atkdmg,lvl;     //atkdmg for this crossbow, lvl for specified row weapon level
    
    public int getAtkDmg(int row) {
        lvl = super.getLevel(row);
        switch (lvl) {
            case 1 ->                 { //Level 1 damage 1
                    int atkdmg = 2;
                }
            case 2 ->                 { //Level 2 damage 2
                    int atkdmg = 5;
                }
            case 3 ->                 { //Level 3 damage 3
                    int atkdmg = 10;
                }
            default ->                 {    //Level 4 damage 4
                    int atkdmg = 0;
                }
        }
        
        return atkdmg; 
    }
}
