/*  Author: Carter Buckner
    project: Assignment4 - CopAuto Class
    Course: CSCE 3193H | L. Streeter
    Last Modified: 15 Oct 2019 20:55 PM
*/

import java.awt.Graphics;
import java.util.*;

class CopAuto extends Auto{
  private static int xRatio;
  private static int yRatio;
  //private Sprite sprite;

  public CopAuto(){
    super("CopAuto", 30, (new Engine("V6", 30, 100)), "cop-auto.jpg");
    super.fillUp();
    // System.out.println(getDescription());
    Random random = new Random();
    xRatio = random.nextInt(11)-5;
    yRatio = random.nextInt(11)-5;

  }
  public void update(Graphics g){
    // Move the auto
    // System.out.println("COPAUTO");
    super.drive(20, xRatio, yRatio);
    super.update(g);
  }
}
