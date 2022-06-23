import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
	  
    // Quadrant 1 - 10x10 grid
    for (int intLineX = width/20; intLineX <= width/2; intLineX += width/20) {
      line(intLineX, 0, intLineX, height/2);
    }
    
    for(int intLineY = height/20; intLineY <= height/2; intLineY += height/20) {
      line(0, intLineY, width/2, intLineY);
    }

    // Quadrant 2 - 5x5 grid of evenly spaced circles 
    for (int intCircleX = ((width/2) + (width/20)); intCircleX <= width; intCircleX += width/10) {
      for (int intCircleY = height/20; intCircleY <= height/2; intCircleY += height/10) {
        fill (188, 19, 111);
        circle(intCircleX, intCircleY, height/20);
      }
    }

    // Quadrant 3 - Horizontal grayscale gradient
    for (int i = 0; i < width/2; i++) {
      stroke (i, i, i);
      line(i, height/2, i, height);
    }

    // Quadrant 4 - 8 petal flower
    // explanation: translation() moves the origin from (0,0) to (300, 300). push() and pop() are used before the translation and after the for loop to not affect the green center circle.
    
    push();
    translate(300, 300);
    for (int intPetal = 0; intPetal <= 8; intPetal++){
      fill(179, 89, 59);
      rotate(PI/4);
      ellipse(0, 30, 18, 70);
    }
    pop();

    fill(35, 116, 44);
    circle(300, 300, 30);
  }
}