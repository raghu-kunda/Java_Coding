public class GenRanNum{

public static void main (String args[]) {

String wordListOne[] = {"24/7","multiTiar","30,OOO foot","B-to-B","win-win","frontend","web- based","pervasive","smart","sixsigma","cri tical-path","dynamic"};

int lenOne = wordListOne.length;

int rand1 = (int) (Math.random() *lenOne);

System.out.println(rand1);

}
}