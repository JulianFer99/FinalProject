package views;

import java.util.Scanner;

import enums.*;
import exceptions.IncorrectOptionException;

public class Console {

	private Scanner scannerObj;

	public Console() {
		scannerObj = new Scanner(System.in);
	}

	public String readString(String message) {
		System.out.println(message);
		return scannerObj.nextLine();
	}

	public int readType() throws IncorrectOptionException {
		System.out.println(Constants.MESSAGE_READ_TYPE_ID);
		int option = 0;
		option = Integer.parseInt(scannerObj.nextLine());
		if (option < 1 || option > 3) {
			throw new IncorrectOptionException();
		}
		return option;
	}
	
	public int readBond() throws IncorrectOptionException {
		System.out.println(Constants.MESSAGE_READ_TYPE_BOND);
		int option = 0;
		option = Integer.parseInt(scannerObj.nextLine());
		if (option < 1 || option > 3) {
			throw new IncorrectOptionException();
		}
		return option;
	}
	
	public int readMaterial() throws IncorrectOptionException {
		System.out.println(Constants.MESSAGE_READ_TYPE_MATERIAL);
		int option = 0;
		option = Integer.parseInt(scannerObj.nextLine());
		if (option < 1 || option > 4) {
			throw new IncorrectOptionException();
		}
		return option;
	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showMessageErr(String message) {
		System.err.println(message);
	}

	public int readOption() throws IncorrectOptionException {
		System.out.println(Constants.SHOW_MENU);
		int option = Integer.parseInt(scannerObj.nextLine());
		if (option < 1 || option > 9) {
			throw new IncorrectOptionException();
		}
		return option;
	}

	public long readLong(String message) {
		System.out.println(message);
		return Long.parseLong(scannerObj.nextLine());
	}

	public double readDouble(String message) {
		System.out.println(message);
		return Double.parseDouble(scannerObj.nextLine());
	}
//	public void showPoints(double points) {
//		System.out.println(Constants.MESSAGE_READ_NUMBER_POINTS + points + Constants.MESSAGE_READ_NUMBER_POINTS_1);
//	}

	public TypeMaterials readTypeMaterial() {
		TypeMaterials typeMaterial = null;
		boolean isTrue = true;
		while (isTrue) {
			int option = 0;
				try {
					option = readMaterial();
				} catch (IncorrectOptionException e) {
					showMessageErr(e.getMessage());
				} catch (NumberFormatException e) {
				showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
			}
			switch (option) {

			case 1:
				typeMaterial = TypeMaterials.PAPER;
				isTrue = false;
				break;
			case 2:
				typeMaterial = TypeMaterials.PLASTIC;
				isTrue = false;
				break;
			case 3:
				typeMaterial = TypeMaterials.GLAS;
				isTrue = false;
				break;
			case 4:
				typeMaterial = TypeMaterials.COPPER;
				isTrue = false;
				break;
			}
		}return typeMaterial;

	}

	public TypeID readTypeID() {
		TypeID typeID = null;
		boolean isTrue = true;
		while (isTrue) {
			int option = 0;
				try {
					option = readType();
				} catch (IncorrectOptionException e) {
					showMessageErr(e.getMessage());
				} catch (NumberFormatException e) {
				showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
			}
			switch (option) {

			case 1:
				typeID = TypeID.CC;
				isTrue = false;
				break;
			case 2:
				typeID = TypeID.TI;
				isTrue = false;
				break;
			case 3:
				typeID = TypeID.RC;
				isTrue = false;
				break;
			}
		}return typeID;

	}

	public TypeBond readTypeBond() {
		TypeBond typeBond = null;
		boolean isTrue = true;
		while (isTrue) {
			int option = 0;
				try {
					option = readBond();
				} catch (IncorrectOptionException e) {
					showMessageErr(e.getMessage());
				} catch (NumberFormatException e) {
				showMessageErr(Constants.MESSAGE_INCORRECT_OPTION);
			}
			switch (option) {

			case 1:
				typeBond = TypeBond.DISCOUNT_MARKET;
				isTrue = false;
				break;
			case 2:
				typeBond = TypeBond.TRANSPORT_TICKET;
				isTrue = false;
				break;
			case 3:
				typeBond = TypeBond.VACATION_TICKET;
				isTrue = false;
				break;
			}
		}return typeBond;

	}

	public void generateHeader1() {
		System.out.println(String.format(Constants.FORMAT_1, Constants.HEADER_BENEFICIARY));
		System.out.println("_");
	}

	public void generateHeader2() {
		System.out.println(String.format(Constants.FORMAT_2, Constants.HEADER_SEREBIHU));
		System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════");
	}

	public void generateHeader3() {
		System.out.println(String.format(Constants.FORMAT_3, Constants.HEADER_BONDS));
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	public void showListDatas1(Object[][] datasList) {
		System.out.println();
		System.out.println();
		generateHeader1();
		for (int i = 0; i < datasList.length; i++) {
			Object[] datasObject = datasList[i];
			System.out.println(String.format(Constants.FORMAT_1, datasObject));
		}
	}

	public void showListDatas2(Object[][] datasList) {
		System.out.println();
		System.out.println();
		generateHeader2();
		for (int i = 0; i < datasList.length; i++) {
			Object[] datasObject = datasList[i];
			System.out.println(String.format(Constants.FORMAT_2, datasObject));
		}
	}

	public void showListDatas3(Object[][] datasList) {
		System.out.println();
		System.out.println();
		generateHeader3();
		for (int i = 0; i < datasList.length; i++) {
			Object[] datasObject = datasList[i];
			System.out.println(String.format(Constants.FORMAT_3, datasObject));
		}
	}
	// *Hacen parte del ToObjectVector
}
