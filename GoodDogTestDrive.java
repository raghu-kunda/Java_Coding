class GoodDogTestDrive {

public static void main(String args[]){

	GoodDog one = new GoodDog();
	
	one.setSize(70);
	
	System.out.println(one.getSize());

}
}

class GoodDog {
private int size;

public int getSize(){
return size;
}

public void setSize(int s){

this.size=s;
}

}