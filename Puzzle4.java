public class Puzzle4{

public static void main(String args[]){

Puzzle4b[] obs = new Puzzle4b[6];

int y = 1;

int x = 0;

int result = 0;

while (x < 6) {

obs[x].doStuff(x);

--------

y= y * 10;

x=x+1

}

x = 6;

while (x > 0) {

obs[x].doStuff(x);

result = result +x;

}

system.out.println("result " +result);

}

}

class Puzzle4b{

int ivar;

public int doStuff(int ivar){

if(ivar>100){

return -----------

}else{

return-------

}

}

}

