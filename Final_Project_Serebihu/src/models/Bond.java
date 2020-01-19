package models;

import java.time.LocalDate;

import enums.TypeBond;

public class Bond {
	private int code;
	private LocalDate dueDate;
	private TypeBond type;
	private int points;

	public Bond(int code, LocalDate dueDate, TypeBond type, int points) {
		this.code = code;
		this.dueDate = dueDate;
		this.type = type;
		this.points = points;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public TypeBond getType() {
		return type;
	}

	public void setType(TypeBond type) {
		this.type = type;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
