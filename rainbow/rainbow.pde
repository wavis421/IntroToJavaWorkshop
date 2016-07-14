PImage rainbow;
PImage unicorn;

void setup() {
  
  rainbow = loadImage("rainbow.png");  
  size(rainbow.width, rainbow.height);
  
  background (rainbow);
 
  unicorn = loadImage("unicorn.png"); 
}

void draw() {
  
  if (mousePressed) {
    background (rainbow);
    image (unicorn, mouseX, mouseY);
  }
}
