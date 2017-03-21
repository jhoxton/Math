
public class user {
	
	private String name;
	private int bestScore;
	
	public user(String name, int bestScore)
	{
		this.bestScore = bestScore;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore(){
		return bestScore;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setScore(int newBestScore) {
		bestScore = newBestScore;
	}
	public void printUser() {
		System.out.println(name);
		System.out.println(bestScore);
	}

	public static void checkScore() {
		// TODO Auto-generated method stub
		
	}
	
	
}
