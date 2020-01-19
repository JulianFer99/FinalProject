package enums;

public enum TypeMaterials {
	PAPER("Papel", 10), PLASTIC("Plastico", 20), GLAS("Vidrio", 30), COPPER("Cobre", 50);

	private String text;
	private int point;

	private TypeMaterials(String text, int point) {
		this.text = text;
		this.point = point;
	}

	public String getText() {
		return text;
	}

	public int getPoint() {
		return point;
	}
}
