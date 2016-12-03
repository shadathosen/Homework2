package inheritance;

public class Son extends Parent{
	
   public static void main(String[]args){
	   Son johny = new Son();
	   System.out.println("The son's heihgt is " + johny.height);
	   System.out.println("The son's eye color is" + johny.eyeColor);
	   System.out.println("The son's occupation is" + johny.occupation);
	   
   }
   
}
