package enums;

public enum TypeBond {
	DISCOUNT_MARKET("Descuento de mercado", 100,745829), TRANSPORT_TICKET("Boleto de transporte", 80,83261),
	VACATION_TICKET("Bono de vacaciones", 150,947365);

	private String text;
	private int points;
	private int code;

	private TypeBond(String text, int points,int code) {
		this.text = text;
		this.points = points;
		this.code =  code;
	}

	public String getText() {
		return text;
	}
	
	public int getPoints() {
		return points;
	}
	
	public int getCode() {
		return code;
	}
}







