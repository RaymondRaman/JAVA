// Exercise 1(a): Draw a smilling face
import com.educative.graphics.*;

class Smiley {
  public static void main(String[] args) {
    Canvas c;
    c = new Canvas(200, 200);

    // Draw the outline of the face
    c.fill("yellow");
    c.stroke("black");
    c.circle(100, 100, 50);

    // draw the mouth
    c.fill("yellow");
    c.stroke("black");
    c.circle(100, 100, 30);
    c.fill("yellow");
    c.stroke("yellow");
    c.rect(70,70,60,40);

    // draw the eyes
    c.fill("black");
    c.stroke("black");
    c.circle(80, 90, 5);

    c.fill("black");
    c.stroke("black");
    c.circle(120, 90, 5);
    
    c.draw();
  }
}

// solution: 
// import com.educative.graphics.*;

// class Smiley {
  public static void main(String[] args) {
    Canvas c;
    c = new Canvas(200, 200);

    // Draw the outline of the face
    c.fill("yellow");
    c.stroke("black");
    c.circle(100, 100, 50);

    // draw the mouth
    c.stroke("black");
    c.fill("yellow");
    c.circle(100, 100, 30);
    c.stroke("yellow");
    c.rect(68, 68, 62, 40);

    // draw the eyes
    c.stroke("black");
    c.fill("black");
    c.circle(100 - 20, 100 - 10, 5);
    c.circle(100 + 20, 100 - 10, 5);

    c.draw();
  }
}

// Exercise 1b: method calling
import com.educative.graphics.*;

class SmileyFactored {
  static Canvas c;

  public static void drawOutline(){
      c.fill("yellow");
      c.stroke("black");
      c.circle(100, 100, 50);
  }

  public static void drawMouth(){
    c.stroke("black");
    c.fill("yellow");
    c.circle(100, 100, 30);
    c.stroke("yellow");
    c.rect(68, 68, 62, 40);
  }

  public static void drawEyes(){
    c.stroke("black");
    c.fill("black");
    c.circle(100 - 20, 100 - 10, 5);
    c.circle(100 + 20, 100 - 10, 5);
  }

  public static void main(String[] args) {
    
    c = new Canvas(200, 200);
    drawOutline();
    drawMouth();
    drawEyes();
    c.draw();
  }
}

// Exercise 2
class Exercise{
    public static void main(String[] args){
        System.out.println("Hello, hello.");
        System.out.println("I don't know why you say goodbye.");
        System.out.println("I say hello.");

    }
}
