/*  Author: Carter Buckner
    project: Assignment4 - Model Class
    Course: CSCE 3193H | L. Streeter
    Last Modified: 15 Oct 2019 20:55 PM
*/

import java.awt.Graphics;
import java.io.IOException;
import java.util.*;
class Model
{
    // private Sprite sprite;
    private ArrayList<Sprite> sprites;
    private int currSprite;

    Model() throws IOException {
		// sprite = new Sprite("smiley.jpg");
    sprites = new ArrayList<Sprite>();
    sprites.add(new CopAuto());
    // sprites.add(new RobberAuto());
    currSprite = 0;
    }

    public void update(Graphics g) {
      for(int i = 0; i < sprites.size(); i++){
        sprites.get(i).update(g);
      }
    }
    public void setLocation(int X, int Y){
      if(currSprite%2 == 0){
        sprites.add(new RobberAuto());
      }else{
        sprites.add(new CopAuto());
        // sprites.add(new RobberAuto());
      }
      sprites.get(sprites.size()-1).setX(X);
      sprites.get(sprites.size()-1).setY(Y);
      currSprite++;
    }
    public void refill(){

        for(int i = 0; i < sprites.size(); i++){
          ((Auto)sprites.get(i)).fillUp();
        }

    }
}
