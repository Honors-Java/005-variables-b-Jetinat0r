int bgColor = 255;
int strokeColor = 0;
int canvasSize = 500;

int sqColor = 175;
int sqSize = 225;
int sqXPos = 150;
int sqYPos = 150;

int ellColor = 255;
int ellSize = 100;
int ellXPos = 150;
int ellYPos = 150;
int ballSpeed = 2;

void setup() {
	size(canvasSize, canvasSize);
  rectMode(CENTER);
  ellipseMode(CENTER);
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

  background(bgColor);
  stroke(strokeColor);

  fill(sqColor);
  rect(sqXPos, sqYPos, sqSize, sqSize);

  fill(ellColor);
  ellipse(ellXPos, ellYPos, ellSize, ellSize);

  ellXPos += ballSpeed;
  ellYPos += ballSpeed;
}