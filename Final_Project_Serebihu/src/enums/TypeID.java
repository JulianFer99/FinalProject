package enums;

public enum TypeID {
	CC("C�dula"), TI("Tarjeta de identidad"), RC("Registro civil");

	private String text;

	private TypeID(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
