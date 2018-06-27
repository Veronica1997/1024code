package Season;

public class j123 {
	Season season;

	public j123(Season season) {
		this.season = season;
	}

	public void describe() {

		switch (season) {
		case Spring:
			System.out.println("Today is" + " " + season);
			break;
		case Summer:
			System.out.println("Today is" + " " + season);
			break;
		case Autumn:
			System.out.println("Today is" + " " + season);
			break;
		case Winter:
			System.out.println("Today is" + " " + season);
			break;
		default:
			System.out.println("The end of the world ");
		}

	}

	public static void main(String[] args) {
		j123 spring = new j123(Season.Spring);
		j123 summer = new j123(Season.Summer);

		spring.describe();
		summer.describe();
	}
}
