int xone = 500;
int xtwo = 500;  
int yone = 500;  
int ytwo = 500;
int sizeone = 20;
int sizefour = 20;
int i = 200;
int sped = 2;
void setup(){
  size(1000,1000);  


}

void draw(){
  background(67,35,86);
for (i = 200; i > 0; i--) { 
noFill();
if(i%10==0){
ellipse(xone,yone,sizeone+i,sizeone+i);
}

}
  if(xone<700){
  xone+=sped;
  }
  else if(xone>=700){
  xone-=sped;
  }




}