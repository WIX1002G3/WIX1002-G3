import java.util.Scanner;

public class wall {
    private int unitWall,hp;
    
    public void setUnitWall {
        this.unitWall = unitWall;
    }
    
    public void setHp {
        this.hp = hp;
    }
    
    public void getUnitWall {
        return unitWall;
    }
    
    public void getHp {
        return hp;
    }
    
    public void wallLogic {
        if (hp == 0) {
            game.gameOver();
        }
    }
}
