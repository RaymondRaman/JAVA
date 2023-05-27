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

// Format
class printExamples {
  public static void main(String args[]) {
    System.out.format("My favorite number is %.3f.\n", 3.141592654); 
    
    // part of a times table:
    System.out.format("%2d %2d %2d\n", 4, 6, 8);
    System.out.format("%2d %2d %2d\n", 8, 12, 16);
  }
}

// drawSmile function
import com.educative.graphics.*;

class Smile {
  public static void drawSmile(Canvas c, int x, int y, double scale) {
    // Draw the outline of the face
    c.fill("yellow");
    c.stroke("black");
    c.circle(x, y, 50 * scale);

    // draw the mouth
    c.stroke("black");
    c.fill("yellow");
    c.circle(x, y, 30 * scale);
    c.stroke("yellow");
    c.rect(x - 32 * scale, y - 32 * scale, 62 * scale, 40 * scale);

    // draw the eyes
    c.stroke("black");
    c.fill("black");
    c.circle(x - 20 * scale, y - 10 * scale, 5 * scale);
    c.circle(x + 20 * scale, y - 10 * scale, 5 * scale);
  }

  public static void main(String[] args) {
    Canvas c;
    c = new Canvas(200, 200);
    drawSmile(c, 100, 100, 0.5);
  }
}

// Translation exercise: factor
class PrintFactors {
  public static void printFactors(int number){
    int possible_factor = 1;
    while (possible_factor <= number) {
      if(number % possible_factor == 0) {
        System.out.println(possible_factor + " is a factor of " + number + ".");
      }
      possible_factor++;
    }
  }

  public static void main(String[] args) {
    printFactors(42);
  }
}

