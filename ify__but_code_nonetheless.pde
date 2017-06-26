void setup(){
  size(1000,500);


}
  int balx= (500);

void draw(){
  background(166,216,212);
  
 
  ellipse(balx,250,30,30);
  fill(61,136,252);
  stroke(97,156,250);
    
if (balx >= 500){
  balx = balx+ 1;
  
}

if (balx> width){
  balx=999;
  balx = balx -1;
}

}