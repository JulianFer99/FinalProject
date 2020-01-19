package models;

import enums.TypeTransport;

public class TransportBond {
	private TypeTransport typeTransport;

	public TransportBond(TypeTransport typeTransport) {
		this.typeTransport = typeTransport;
	}

	public TypeTransport getTypeTransport() {
		return typeTransport;
	}

	public void setTypeTransport(TypeTransport typeTransport) {
		this.typeTransport = typeTransport;
	}
}
