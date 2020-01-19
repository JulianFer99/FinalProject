package enums;

public enum TypeTransport {
	BUS("Bus"), CAB("Taxi"), TRANSMILENIO("Transmilenio");

	private String text;

	private TypeTransport(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
