package controller;

import java.time.LocalDate;

import enums.TypeBond;
import enums.TypeID;
import enums.TypeMaterials;
import exceptions.IncorrectOptionException;
import models.Beneficiary;
import models.Bond;
import models.ManageBeneficiary;
import models.Serebihu;
import views.Console;
import views.Constants;

public class ControllerApp {
	private Serebihu serebihu;
	private Console console;

	public ControllerApp() {
		serebihu = new Serebihu();
		console = new Console();
		run();
	}
	
	public void run() {
		boolean isTrue = true;
		while (isTrue) {
			int option = 0;
			try {
				option = (console.readOption());
			} catch (NumberFormatException e) {
				console.showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
			} catch (IncorrectOptionException e) {
				console.showMessageErr(e.getMessage());
			}
			switch (option) {
			case 1:
				doCreateBeneficiary();
				console.showMessage(Constants.MESSAGE_CREATED_WITH_EXIT_BENEFICIARY);
				break;
			case 2:
				doAddMaterialBeneficiary();
				console.showMessage(Constants.MESSAGE_ADD_WITH_EXIT_MATERIAL);
				break;
			case 3:
				doRedeemPoints();
				console.showMessage(Constants.MESSAGE_ADD_WITH_EXIT_BOND);
				break;
			case 4:
				console.showListDatas1(serebihu.toObjectVectorBeneficiary());
				break;
			case 5:
				console.showListDatas2(serebihu.toObjectVectorManage());
				break;
			case 6:
				console.showListDatas3(serebihu.toObjectBonds());
				break;
			case 7:
				doRemoveBeneficiary();
				console.showMessage(Constants.MESSAGE_ADD_WITH_EXIT_MATERIAL);
				break;
			case 8: /* Reportes */
			case 9:
				isTrue = false;
				break;

			}
		}
	}

	public void doCreateBeneficiary()  {
		String name = console.readString(Constants.MESSAGE_READ_NAME);
		TypeID id = console.readTypeID();
		long numberID=0;
		try{
			while(numberID==0) {
			numberID = console.readLong(Constants.MESSAGE_READ_NUMBER_ID);
			if(serebihu.numberIdIsFalse(numberID)==false) {
				console.showMessageErr(Constants.MESSAGE_ID_EXIST);
				numberID=0;
			}
			}
		}catch (NumberFormatException e) {
			console.showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
			numberID=0;
		}
		Beneficiary beneficiary = new Beneficiary(name, id, numberID);
		ManageBeneficiary manageBeneficiary = new ManageBeneficiary(beneficiary);
		serebihu.addBeneficiary(manageBeneficiary);
	}

	public void doAddMaterialBeneficiary() {
		long numberID = 0 ;
		try{
			while(numberID==0) {
			numberID = console.readLong(Constants.MESSAGE_READ_NUMBER_ID);
			}
		}catch (NumberFormatException e) {
			console.showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
			numberID=0;
		}
		
		TypeMaterials material = console.readTypeMaterial();
		Double amountMaterial = 0.0 ;
		try{
			while(numberID==0) {
				amountMaterial = console.readDouble(Constants.MESSAGE_READ_AMOUNT_MATERIAL);
			}
		}catch (NumberFormatException e) {
			console.showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
		}
		serebihu.addMaterial(material, amountMaterial, numberID);
	}

	public void doRedeemPoints() {
		long numberID = 0 ;
		try{
			while(numberID==0) {
			numberID = console.readLong(Constants.MESSAGE_READ_NUMBER_ID);
			}
		}catch (NumberFormatException e) {
			console.showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
			numberID=0;
		}
		double points = serebihu.askManageBeneficiary(numberID).getPointAcumulated();
		console.showMessage(Constants.MESSAGE_READ_NUMBER_POINTS + points);
		TypeBond typeBond = console.readTypeBond();
		Bond bond = new Bond(typeBond.getCode(), calculateDueDate(), typeBond, typeBond.getPoints());
		serebihu.redeemPoints(bond, numberID);
	}

	private LocalDate calculateDueDate() {
		LocalDate actualDate = LocalDate.now();
		int month = actualDate.getMonthValue();
		return LocalDate.of(actualDate.getYear(), month + 2, actualDate.getDayOfYear());
	}

	private void doRemoveBeneficiary() {
		long numberID = 0 ;
		try{
			while(numberID==0) {
			numberID = console.readLong(Constants.MESSAGE_READ_NUMBER_ID);
			if(serebihu.numberIdIsFalse(numberID)==true) {
				console.showMessageErr(Constants.MESSAGE_ID__NO_EXIST);
				numberID=0;
			}
			}
		}catch (NumberFormatException e) {
			console.showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
		}
		serebihu.removeManageBeneficiary(numberID);
	}

	

}
