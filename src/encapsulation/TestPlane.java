package encapsulation;

public class TestPlane {

	public static void main(String[] args) {
		Planes boeing = new Planes();
		boeing.setPlaneNumber(1111);
		boeing.setPlaneName("SuperJumbo");
	    boeing.setPlaneCode("777");
	    boeing.setPlaneHome("Emirates");
	
	    System.out.println(boeing.getPlaneNumber()+" " + boeing.getPlaneName()+" " + boeing.getPlaneCode()+" " + boeing.getPlaneHome());	
	
	    Planes airbus = new Planes();
	    airbus.setPlaneNumber(2222);
	    airbus.setPlaneName("LongJet");
	    airbus.setPlaneCode("A380");
	    airbus.setPlaneHome("Quantas");
	    
	    System.out.println(airbus.getPlaneNumber()+" " + airbus.getPlaneName()+" " + airbus.getPlaneCode()+" " + airbus.getPlaneHome());	
		
	    
	
	}

	
}
