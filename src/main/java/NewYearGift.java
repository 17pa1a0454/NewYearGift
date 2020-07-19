
public class NewYearGift {
    public static void main(String args[]) {
    	
    	Sweets sw1=new Sweets();
    	sw1.name="laddu";
    	sw1.weigth= 20;
    	int awe=sw1.weigth;
    	
    	Sweets sw2=new Sweets();
    	sw2.name="5star";
    	sw2.weigth=12;
    	int bwe=sw2.weigth;
    	
    	System.out.printf("Sweet and Chocolate taken are %s,%s with weigths %d,%d\n\n",sw1.name,sw2.name,sw1.weigth,sw2.weigth);
    	System.out.printf("After placing in a single gift, OverAll Weigth is %d\n\n",awe+bwe);
    	System.out.println("After sorting according to there weigths");
    	if(awe>bwe) {
    		System.out.printf("First to be taken from gift is %s with weigth %d\n",sw1.name,sw1.weigth);
    		System.out.printf("Second to be taken from gift is %s with weigth %d",sw2.name,sw2.weigth);
    }
    	else {
    		System.out.printf("First to be taken from gift is %s with weigth %d\n",sw2.name,sw2.weigth);
    		System.out.printf("Second to be taken from gift is %s with weigth %d",sw1.name,sw1.weigth);
    	}
}
}