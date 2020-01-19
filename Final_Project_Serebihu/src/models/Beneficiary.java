package models;

import enums.TypeID;
import exceptions.IncorrectOptionException;

public class Beneficiary {
	private String name;
	private TypeID id;
	private long numberID;

	public Beneficiary(String name, TypeID id, long numberID){
		this.name = name;
		this.id = id;
		this.numberID = numberID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeID getId() {
		return id;
	}

	public void setId(TypeID id) {
		this.id = id;
	}

	public long getNumberID() {
		return numberID;
	}

	public void setNumberID(long numberID) {
		this.numberID = numberID;
	}
//	public Object[] toObjectVectorBeneficiary(){
//		return new Object[]{name, id.getText(), numberID};
//	}	
}
