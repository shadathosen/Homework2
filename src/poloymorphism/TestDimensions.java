package poloymorphism;

public class TestDimensions {

	public static void main(String[]args){
		Dimensions house = new Dimensions();
		double firstSize = house.distance(8.4, 2.3, 4.6);
		System.out.println(firstSize);
		int secondSize = house.distance(54, 65, 32, 56);
		System.out.println(secondSize);
	}
				
}
