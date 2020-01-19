package models;

import java.util.ArrayList;

import enums.TypeMaterials;

public class ManageBeneficiary {
	private Beneficiary beneficiary;
	private double pointAcumulated;
	private ArrayList<Bond> bonds;
	private double totalKilogramPaper;
	private double totalKilogramPlastic;
	private double totalKilogramGlas;
	private double totalKilogramCopper;

	public ManageBeneficiary(Beneficiary beneficiary, int pointAcumulated, ArrayList<Bond> bonds,
			double totalKilogramPaper, double totalKilogramPlastic, double totalKilogramGlas,
			double totalKilogramCopper) {
		this.beneficiary = beneficiary;
		this.pointAcumulated = pointAcumulated;
		this.bonds = bonds;
		this.totalKilogramPaper = totalKilogramPaper;
		this.totalKilogramPlastic = totalKilogramPlastic;
		this.totalKilogramGlas = totalKilogramGlas;
		this.totalKilogramCopper = totalKilogramCopper;
		calculatePoints();
	}
	
	public ManageBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
		bonds = new ArrayList<Bond>();
		pointAcumulated = 0;
	}

	public void addBond(Bond bond) {
		bonds.add(bond);
	}

	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	public double getPointAcumulated() {
		return pointAcumulated;
	}

	public void setPointAcumulated(double pointAcumulated) {
		this.pointAcumulated = pointAcumulated;
	}

	public ArrayList<Bond> getBonds() {
		return bonds;
	}

	public void setBonds(ArrayList<Bond> bonds) {
		this.bonds = bonds;
	}

	public double getTotalKilogramPaper() {
		return totalKilogramPaper;
	}

	public void setTotalKilogramPaper(double totalKilogramPaper) {
		this.totalKilogramPaper = totalKilogramPaper;
		calculatePoints();
	}

	public double getTotalKilogramPlastic() {
		return totalKilogramPlastic;
	}

	public void setTotalKilogramPlastic(double totalKilogramPlastic) {
		this.totalKilogramPlastic = totalKilogramPlastic;
		calculatePoints();
	}

	public double getTotalKilogramGlas() {
		return totalKilogramGlas;
	}

	public void setTotalKilogramGlas(double totalKilogramGlas) {
		this.totalKilogramGlas = totalKilogramGlas;
		calculatePoints();
	}

	public double getTotalKilogramCopper() {
		return totalKilogramCopper;
	}

	public void setTotalKilogramCopper(double totalKilogramCopper) {
		this.totalKilogramCopper = totalKilogramCopper;
		calculatePoints();
	}

	private void calculatePoints() {
		pointAcumulated = (totalKilogramPaper * TypeMaterials.PAPER.getPoint()) + (totalKilogramPlastic * 20)
				+ (totalKilogramGlas * 30) + (totalKilogramCopper * 50);
	}
	public Object[] toObjectVectorManage(){
		return new Object[]{beneficiary.getName(), beneficiary.getNumberID(),totalKilogramPaper, totalKilogramPlastic,
				totalKilogramGlas,totalKilogramCopper, pointAcumulated , bonds.size()};
	}
	

	public Object[] toObjectVectorBeneficiary(){
		return new Object[]{beneficiary.getName(), beneficiary.getId().getText(), beneficiary.getNumberID()};
	}
}
