/*  Author: Carter Buckner
    project: Assignment4 - RobberAuto Class
    Course: CSCE 3193H | L. Streeter
    Last Modified: 15 Oct 2019 20:55 PM
*/

import java.awt.Graphics;
import java.util.*;

class RobberAuto extends Auto{
  private int xRatio;
  private int yRatio;
  //private Sprite sprite;


  public RobberAuto(){
    super("RobberAuto", 20, (new Engine("V6", 20, 200)), "red-auto.jpg");
    super.fillUp();
    // System.out.println(getDescription());
    Random random = new Random();
    xRatio = random.nextInt(11)-5;
    yRatio = random.nextInt(11)-5;
  }
  public void update(Graphics g){
    // Move the auto
    // System.out.println("ROBBERAUTO");
    super.drive(40, xRatio, yRatio);
    super.update(g);
  }
}
