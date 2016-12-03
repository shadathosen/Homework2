package abstraction;

public class TestGym {

	public static void main(String[] args) {
		
		School school = new Cafeteria();
		school.recentTeachers();
		school.seniorTeachers();
		
		Meeting meeting = new Cafeteria();
		meeting.principal();
		meeting.counselor();
		
		Cafeteria cafeteria = new Cafeteria();
		cafeteria.soccerTeam();
		cafeteria.danceClub();
	}

}
