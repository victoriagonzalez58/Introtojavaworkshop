void setup(){
  size(1000,500);
  noFill();

}
int leftX =(300);
int rightX=(600);
int leftSpeed=1;
int rightSpeed=-1;
void draw(){

  background(230);

  for(int i =20; i >0; i--){
 
  ellipse(leftX,250, i*10, i*10);
  
}

    for(int i =20; i >0; i--){
    
  ellipse(rightX,250, i*10, i*10);
    }
  leftX=leftX+leftSpeed;
  rightX= rightX+rightSpeed;
  
  if(leftX>= 500){
    leftSpeed=-1;
  
  }
  if(rightX<=400){
    rightSpeed=1;
  }
}