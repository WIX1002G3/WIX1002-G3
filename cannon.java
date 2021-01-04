//Level 1, 5 coins    Level 2, 10 coins    Level 3, 15 coins
public class cannon extends weapon {
    private int atkdmg,lvl;     //atkdmg for this crossbow, lvl for specified row weapon level
    
    public int getAtkDmg(int row) {
        lvl = super.getLevel(row);
        switch (lvl) {
            case 1 ->                 { //Level 1 damage 1
                    int atkdmg = 15;
                }
            case 2 ->                 { //Level 2 damage 2
                    int atkdmg = 20;
                }
            case 3 ->                 { //Level 3 damage 3
                    int atkdmg = 25;
                }
            default ->                 {    //Level 4 damage 4
                    int atkdmg = 0;
                }
        }
        
        return atkdmg; 
    }
}
