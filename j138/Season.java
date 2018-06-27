
public enum Season {
	SPRING("����"), SUMMER("����"), FALL("����"), WINTER("����");

	private final String name;

	private Season(String name)
    {
        this.name = name;
    }

	public String getName() {
		return name;
	}
}
