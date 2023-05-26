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
//   public static void main(String[] args) {
//     Canvas c;
//     c = new Canvas(200, 200);

//     // Draw the outline of the face
//     c.fill("yellow");
//     c.stroke("black");
//     c.circle(100, 100, 50);

//     // draw the mouth
//     c.stroke("black");
//     c.fill("yellow");
//     c.circle(100, 100, 30);
//     c.stroke("yellow");
//     c.rect(68, 68, 62, 40);

//     // draw the eyes
//     c.stroke("black");
//     c.fill("black");
//     c.circle(100 - 20, 100 - 10, 5);
//     c.circle(100 + 20, 100 - 10, 5);

//     c.draw();
//   }
// }

