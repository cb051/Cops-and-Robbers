/*  Author: Carter Buckner
    project: Assignment4 - Sprite Class
    Course: CSCE 3193H | L. Streeter
    Last Modified: 15 Oct 2019 20:55 PM
*/


import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


class Sprite
{
	private String jpgName;
	private int locationX;
	private int locationY;
	private Image image;
	// private int test;
	public Sprite(String jpgName)
	{
		setImage(jpgName);
		locationX = 0;
		locationY = 0;
	}

	public int getX() {		return locationX; }
	public int getY() {		return locationY; }
	public void setX(int x) {		locationX = x; }
	public void setY(int y) {   locationY = y; }



	public void setImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException ioe) {
            System.out.println("Unable to load image file.");
        }
	}
	public Image getImage() { return image; }

	public void update(Graphics g) {
    // Move the sprite
		g.drawImage(getImage(), getX(), getY(), 60, 60, null);
	}
}
