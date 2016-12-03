package abstraction;

public abstract class Meeting implements School{

    public void seniorTeachers(){
    	System.out.println("There aren't a lot of senior teachers");
    }
	
	public void recentTeachers(){
		System.out.println("There are a lot of new teachers");
	}
	
	public abstract void principal();
	
	public abstract void counselor();
	
	
	
}
