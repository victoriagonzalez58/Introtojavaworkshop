int rdy = 0;
int randomNumber = (int) random(500);
int score = 0;
String winnningMessage = "Congrats";
void checkCatch (int x){
if (x > mouseX && x < mouseX+100){
      score++;
       randomNumber = (int) random(500);
      
}
      
   else if (score > 0)
     score--;
println("Your score is now: " + score);
}



void setup(){

    size(500,500);
background(125,237,103);


  

}




  void draw(){
    
    background(125,237,103);
    fill(257, 50, 53);
    rect(mouseX, 450, 50, 50);
    fill(81, 164, 250); 
    ellipse(randomNumber, rdy, 20,40);
    fill(81, 164, 250);  
    stroke(81, 164, 250);
rdy= rdy+1;
if (rdy >= 500) {
  rdy=0;
  checkCatch(randomNumber);
  randomNumber = (int) random(500);
 }
else{
  rdy= (rdy+1);
  }

fill(0, 0, 0);
textSize(16);


text(winnningMessage, 50,50);

textSize(30);
text(winnningMessage, 40, 40);

text("Score: " + score, 20, 20);



  }