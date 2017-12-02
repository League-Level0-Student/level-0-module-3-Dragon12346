int xone = 700;
int xtwo = 300;  
int yone = 500;  
int ytwo = 500;
int sizeone = 20;
int i = 200;
int sped = 2;
boolean p;
boolean o;
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
if(i%10==0){
ellipse(xtwo,ytwo,sizeone+i,sizeone+i);

}
}

  if(xone>=900){
  p = true;

  }
  if (p==true) {
  xone-=sped;
  }
  else {
    xone+=sped;
  }

if(xone<=100){
  p = false;

  }
  if (p==false) {
  xone+=sped;
  }
  else {
    xone-=sped;
  }

  if(xtwo<=100){
  o = true;

  }
  if (o==true) {
  xtwo+=sped;
  }
  else {
   xtwo-=sped;
  }

if(xtwo>=900){
  o = false;

  }
  if (o==false) {
  xtwo-=sped;
  }
  else {
    xtwo+=sped;
  }

}