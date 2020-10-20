int bgColor = 255;
int strokeColor = 0;
int canvasSize = 500;

int sqR;
int sqG;
int sqB;
int sqWidth;
int sqHeight;
int sqXPos;
int sqYPos;

int ellR;
int ellG;
int ellB;
int ellSize = 10;

void setup() {
	size(canvasSize, canvasSize);
  rectMode(CENTER);
  ellipseMode(CENTER);

  randomizeSquareVars();
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  stroke(strokeColor);
  
  ellR = random(0, 255);
  ellG = random(0, 255);
  ellB = random(0, 255);

  fill(sqR, sqG, sqB);
  rect(sqXPos, sqYPos, sqWidth, sqHeight);

  fill(ellR, ellG, ellB);
  ellipse(mouseX + random(-30, 30), mouseY + random(-30, 30), ellSize, ellSize);
}

void mousePressed(){
  background(bgColor);

  randomizeSquareVars()
}

void randomizeSquareVars(){
  sqR = random(0, 255);
  sqG = random(0, 255);
  sqB = random(0, 255);
  sqWidth = random(1, 255);
  sqHeight = random(1, 255);
  sqXPos = random(0, 500);
  sqYPos = random(0, 500);
}