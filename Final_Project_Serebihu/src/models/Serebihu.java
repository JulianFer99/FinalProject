package models;

import java.util.ArrayList;

import enums.TypeMaterials;

public class Serebihu {
	private ArrayList<ManageBeneficiary> listBeneficiaries;
	private ArrayList<Bond> listBonds; 
	private double totalPaper;
	private double totalPlastic;
	private double totalGlas;
	private double totalCopper;
	
	public Serebihu() {
		listBeneficiaries = new ArrayList<ManageBeneficiary>();
		listBonds = new ArrayList<Bond>();
	}

	public void addBeneficiary(ManageBeneficiary beneficiary) {
		listBeneficiaries.add(beneficiary);
	}
	
	public boolean numberIdIsFalse(long numberId) {
		boolean isTrue=true;
		for (int i = 0; i < listBeneficiaries.size(); i++) {
			if(listBeneficiaries.get(i).getBeneficiary().getNumberID() == numberId) {
				isTrue=false;
			}
		}
		return isTrue;
	}

	public void redeemPoints(Bond bond, long numberID) {
		double points = askManageBeneficiary(numberID).getPointAcumulated();
		askManageBeneficiary(numberID).addBond(bond);
		listBonds.add(bond);
		askManageBeneficiary(numberID).setPointAcumulated(points - bond.getPoints());
	}

	public ManageBeneficiary askManageBeneficiary(long numberID) {
		ManageBeneficiary result = null;
		for (int i = 0; i < listBeneficiaries.size(); i++) {
			if (listBeneficiaries.get(i).getBeneficiary().getNumberID() == numberID)
				result = listBeneficiaries.get(i);
		}
		return result;
	}

	public void removeManageBeneficiary(long numberID) {
		for (int i = 0; i < listBeneficiaries.size(); i++) {
			if (listBeneficiaries.get(i).getBeneficiary().getNumberID() == numberID)
				listBeneficiaries.remove(i);
		}
	}

	public void addMaterial(TypeMaterials typeMaterials , double kilos, long numberID) {
		ManageBeneficiary beneficiary = askManageBeneficiary(numberID);
		double points = beneficiary.getPointAcumulated();
		double kilogramMaterial = 0;
		switch (typeMaterials) {
		
		case PAPER:
			kilogramMaterial = beneficiary.getTotalKilogramPaper();
			beneficiary.setTotalKilogramPaper(kilogramMaterial + kilos);
			totalPaper += kilos;
			beneficiary.setPointAcumulated(points + (kilos * TypeMaterials.PAPER.getPoint()));
			break;
			
		case PLASTIC:
			kilogramMaterial = beneficiary.getTotalKilogramPlastic();
			beneficiary.setTotalKilogramPlastic(kilogramMaterial + kilos);
			totalPlastic += kilos;
			beneficiary.setPointAcumulated(points + (kilos * TypeMaterials.PLASTIC.getPoint()));
			break;
			
		case GLAS:
			kilogramMaterial = beneficiary.getTotalKilogramGlas();
			beneficiary.setTotalKilogramGlas(kilogramMaterial + kilos);
			totalGlas += kilos;
			beneficiary.setPointAcumulated(points + (kilos * TypeMaterials.GLAS.getPoint()));
			break;
		case COPPER:
			kilogramMaterial = beneficiary.getTotalKilogramCopper();
			beneficiary.setTotalKilogramCopper(kilogramMaterial + kilos);
			totalCopper += kilos;
			break;
		}
	}

	public Object[][] toObjectVectorBeneficiary() {
		int sizeColumns = 3;
		Object[][] datasMatrix = new Object[this.listBeneficiaries.size()][sizeColumns];
		System.out.println(listBeneficiaries.size() + "   ");
		for (int i = 0; i < listBeneficiaries.size(); i++) {
			if (listBeneficiaries.get(i) != null) {
				datasMatrix[i] = listBeneficiaries.get(i).toObjectVectorBeneficiary();
			}
		}
		return datasMatrix;
	}

	public Object[][] toObjectVectorManage() {
		int sizeColumns = 8;
		Object[][] datasMatrix = new Object[listBeneficiaries.size()][sizeColumns];
		for (int i = 0; i < datasMatrix.length; i++) {
			if (listBeneficiaries.get(i) != null) {
				datasMatrix[i] = listBeneficiaries.get(i).toObjectVectorManage();
			}
		}
		return datasMatrix;
	}

	public Object[][] toObjectBonds() {
		int sizeColumns = 2;
		Object[][] datasMatrix = new Object[this.calculteTotalBonds()][sizeColumns];
		for (int i = 0; i < datasMatrix.length; i++) {
			if (listBeneficiaries.get(i) != null) {
				for (int j = 0; j < listBeneficiaries.get(i).getBonds().size(); j++) {
					datasMatrix[i] = toObjectBondAndBeneficiary(i,j);
				}
			}
		}
		return datasMatrix;
	}

	public int calculteTotalBonds() {
		int result = 0;
		for (int i = 0; i < listBeneficiaries.size(); i++) {
			result += listBeneficiaries.get(i).getBonds().size();
		}
		return result;
	}

	public Object[] toObjectBondAndBeneficiary(int positionBeneficiary, int positionBond) {
		return new Object[] {
				listBeneficiaries.get(positionBeneficiary).getBonds().get(positionBond).getType().getText(),
				listBeneficiaries.get(positionBeneficiary).getBeneficiary().getName() };
	}

	public ArrayList<ManageBeneficiary> getListBeneficiaries() {
		return listBeneficiaries;
	}

	public void setListBeneficiaries(ArrayList<ManageBeneficiary> listBeneficiaries) {
		this.listBeneficiaries = listBeneficiaries;
	} 

	public ArrayList<Bond> getListBonds() {
		return listBonds;
	}

	public void setListBonds(ArrayList<Bond> listBonds) {
		this.listBonds = listBonds;
	}

	public double getTotalPaper() {
		return totalPaper;
	}

	public void setTotalPaper(int totalPaper) {
		this.totalPaper = totalPaper;
	}

	public double getTotalPlastic() {
		return totalPlastic;
	}

	public void setTotalPlastic(int totalPlastic) {
		this.totalPlastic = totalPlastic;
	}

	public double getTotalGlas() {
		return totalGlas;
	}

	public void setTotalGlas(int totalGlas) {
		this.totalGlas = totalGlas;
	}

	public double getTotalCopper() {
		return totalCopper;
	}

	public void setTotalCopper(int totalCopper) {
		this.totalCopper = totalCopper;
	}

}
