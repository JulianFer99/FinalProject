package views;

public class Constants {
	public static final String SHOW_MENU = "Ingrmanuek es una loca deseada: " + "\n" + "1.Agregar beneficiario al sistema"
			+ "\n" + "2.Agregar material a un beneficiario" + "\n" + "3.Redimir puntos de un beneficiario" + "\n"
			+ "4.Consultar información básica de todos los beneficiarios" + "\n"
			+ "5.Mostrar listado de los datos de los beneficiarios" + "\n"
			+ "6.Mostrar listado de todos los bonos redimidos" + "\n" + "7.Eliminar beneficiario del sistema" + "\n"
			+ "8.Reportes" + "\n" + "9.Salir" + "\n";
	public static final String MESSAGE_CREATED_WITH_EXIT_BENEFICIARY = "Beneficiario agregado con éxito";
	public static final String MESSAGE = "Beneficiario agregado con éxito";
	public static final String MESSAGE_ADD_WITH_EXIT_MATERIAL = "Material agregado con éxito";
	public static final String MESSAGE_ADD_WITH_EXIT_BOND = "Bono redimido con éxito";
	public static final String MESSAGE_READ_NAME = "Ingrese el nombre del beneficiario: ";
	public static final String MESSAGE_READ_TYPE_ID = "Ingrese el tipo de identificación: \n" + "1. CC\n" + "2. TI\n"
			+ "3. RC\n";
	public static final String MESSAGE_READ_NUMBER_ID = "Ingrese el numero de identificación del beneficiario";
	public static final String MESSAGE_READ_TYPE_MATERIAL = "Ingrese el tipo de material que desea agregar: \n"
			+ "1. Papel\n" + "2. Plástico\n" + "3. Vidrio\n" + "4. Cobre";
	public static final String MESSAGE_READ_AMOUNT_MATERIAL = "Ingrese la cantidad de kilos que desea agregar: ";
	public static final String MESSAGE_READ_TYPE_BOND = "Seleccione el tipo de bono que desea: \n"
			+ "1. Descuento de mercado\n" + "2. Boleto de transporte\n" + "3. Bono de vacaciones\n";
	public static final String MESSAGE_READ_TYPE_TRANSPORT = "Seleccione el tipo de transporte que desea: \n"
			+ "1. Autobus\n" + "2. Taxi\n" + "3. Transmilenio";
	public static final String MESSAGE_READ_NUMBER_POINTS = "";
	public static final String MESSAGE_NAME = "Nombre";
	public static final String MESSAGE_TYPE_ID = "Tipo de documento";
	public static final String MESSAGE_NUMBER_ID = "Numero de documento";
	public static final String MESSAGE_TOTAL_KILOS = "Total kilos de: ";
	public static final String MESSAGE_PAPER = "Papel";
	public static final String MESSAGE_PLASTIC = "Plastico";
	public static final String MESSAGE_GLAS = "Vidrio";
	public static final String MESSAGE_COPPER = "Cobre";
	public static final String MESSAGE_TOTAL_POINTS = "Puntos totales ";
	public static final String MESSAGE_TOTAL_BONDS = "Bonos totales ";
	public static final String MESSAGE_BOND = "Bono";
	public static final String MESSAGE_BENEFICIARY = "Beneficiario ";
	public static final String FORMAT_1 = "%1$-20s %2$-20s %3$-20s";
	public static final String FORMAT_2 = "%1$-20s %2$-20s %3$-20s %4$-20s %5$-20s %6$-20s %7$-20s %8$-20s";
	public static final String FORMAT_3 = "%1$-20s %2$-20s";
	public static final Object[] HEADER_BENEFICIARY = { MESSAGE_NAME, MESSAGE_TYPE_ID, MESSAGE_NUMBER_ID };
	public static final Object[] HEADER_SEREBIHU = { MESSAGE_NAME, MESSAGE_NUMBER_ID, MESSAGE_PAPER, MESSAGE_PLASTIC,
			MESSAGE_GLAS, MESSAGE_COPPER, MESSAGE_TOTAL_POINTS, MESSAGE_TOTAL_BONDS };
	public static final Object[] HEADER_BONDS = { MESSAGE_BOND, MESSAGE_BENEFICIARY };
	public static final String MESSAGE_INCORRECT_OPTION = "Haz digitado una opcion NO VALIDA , \nVuelve a Intentarlo\n\n";
}























//public class IOManager {
//	private Scanner console; 
//	
//	public IOManager() {
//		console = new Scanner(System.in);
//	}
//	
//	public void generateHeaderTeam() {
//		System.out.println(String.format(SBView.FORMAT_TEAM, SBView.HEADERS));
//		System.out.println(SBView.FORMAT_HEADER_LINES);
//		System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
//	}
//	
//	public void generateHeaderTeamPlayer() {
//		System.out.println(String.format(SBView.FORMAT_TEAM_PLAYER, SBView.HEADERS_TEAM_PLAYER));
//		System.out.println(SBView.FORMAT_HEADER_LINES);
//	}
//	
//	public void generateHeaderArbitrator() {
//		System.out.println(String.format(SBView.FORMAT_ARBITRATOR, SBView.HEADERS_ARBITRATOR));
//		System.out.println(SBView.FORMAT_HEADER_LINES);
//	}
//	
//
//	private void generateHeaderPlayer() {
//		System.out.println(String.format(SBView.FORMAT_PLAYER, SBView.HEADERS_PLAYER));
//		System.out.println(SBView.FORMAT_HEADER_LINES);
//	}
//	
//	public void showListDatas(ArrayList<Object[]> datasTeam) {
//		generateHeaderTeam();
//		for (Object[] objects : datasTeam) {
//			System.out.println(String.format( SBView.FORMAT_TEAM, objects));
//		}
//		System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
//	}
//	
//	public void showListDatasPlayer(ArrayList<Object[]> datasPlayer) {
//		generateHeaderTeamPlayer();
//		for (Object[] objects : datasPlayer) {
//			System.out.println(String.format( SBView.FORMAT_TEAM_PLAYER, objects));
//		}
//		System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
//	}
//	
//	public void showListDatasArbitrator(ArrayList<Object[]> datasArbitrator) {
//		generateHeaderArbitrator();
//		for (Object[] objects : datasArbitrator) {
//			System.out.println(String.format( SBView.FORMAT_ARBITRATOR, objects));
//		}
//		System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
//	}
//	
//	public void showDatasTeamUnic(Object[] team) {
//		generateHeaderTeam();
//		System.out.println(String.format(SBView.FORMAT_TEAM, team));
//	}
//	
//	public void showDatasPlayerUnic(Object[] player) {
//		generateHeaderPlayer();
//		System.out.println(String.format(SBView.FORMAT_PLAYER, player));
//	}
//	
//	public void showDatasArbitratorUnic(Object[] arbitrator) {
//		generateHeaderArbitrator();
//		System.out.println(String.format(SBView.FORMAT_ARBITRATOR, arbitrator));
//	}
//
//	public void showDatasGeneral(ArrayList<Object[]> datasFarm) {
//		generateHeaderTeamPlayer();
//		for (Object[] objects : datasFarm) {
//			System.out.println( String.format(SBView.FORMAT_TEAM_PLAYER, objects) );
//		}
//		System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
//	}
//	
//	public int showMenu() {
//		System.out.println(SBView.MAIN_MENU);
//		return Integer.parseInt(console.nextLine());
//	}
//	
//	public int showMenuTeamInformation() {
//		System.out.println(SBView.MAIN_MENU_TEAM);
//		return Integer.parseInt(console.nextLine());
//	}
//
//	public int showMenuPlayer() {
//		System.out.println(SBView.MAIN_MENU_PLAYER);
//		return Integer.parseInt(console.nextLine());
//	}
//	
//	public int showMenuArbitrator() {
//		System.out.println(SBView.MAIN_MENU_ARBITRATOR);
//		return Integer.parseInt(console.nextLine());
//	}
//	
//	public int showMenuModifyTeam() {
//		System.out.println(SBView.SUB_MENU_TEAM);
//		return Integer.parseInt(console.nextLine());
//	}
//
//	public int showMenuModifyPlayer() {
//		System.out.println(SBView.SUB_MENU_PLAYER);
//		return Integer.parseInt(console.nextLine());
//	}
//	
//	public int showMenuModifyArbitrator() {
//		System.out.println(SBView.SUB_MENU_ARBITRATOR);
//		return Integer.parseInt(console.nextLine());
//	}
//	
//	public int showMenuStatistics() {
//		System.out.println(SBView.MAIN_MENU_STATISTICS);
//		return Integer.parseInt(console.nextLine());
//	}
//
//	public String readName() {
//		System.out.println(SBView.NAME);
//		return console.nextLine();
//	}
//
//	public String readSurname() {
//		System.out.println(SBView.LAST_NAME);
//		return console.nextLine();
//	}
//
//	public String readIdPlayer() {
//		System.out.println(SBView.ID_PLAYER);
//		return console.nextLine();
//	}
//	
//	public String readIdArbitrator() {
//		System.out.println(SBView.ID_ARBITRATOR);
//		return console.nextLine();
//	}
//	
//	public String readIdTeam() {
//		System.out.println(SBView.ID_TEAM);
//		return console.nextLine();
//	}
//	
//	public float readWeight() {
//		System.out.println(SBView.WEIGHT);
//		return Float.parseFloat(console.nextLine());
//	}
//
//	public float readHeight() {
//		System.out.println(SBView.HEIGHT);
//		return Float.parseFloat(console.nextLine());
//	}
//	
//	public LocalDate readDate() {          
//		try {
//			System.out.println(SBView.DATE);
//			return Utilities.toDate(console.nextLine());
//		} catch(DateTimeFormatException e) {
//			showMessageDateFormat(e.getMessage());
//			return readDate();
//		}
//	}
//
//	public void showMessageEnd() {
//		System.out.println(SBView.MESSAGE_END);
//	}
//	
//	public String readNumberPlayer() {
//		System.out.println(SBView.MESSAGE_NUMBER_PLAYER);
//		return console.nextLine();
//	}
//
//	public void showDocumentNotFound(String message) {
//		System.out.println(SBView.SPACE_UTIL);
//		System.err.println( message );
//	}
//	
//	public Gender getGender() {
//		int option = 0;
//		System.out.println(SBView.GENDER_TYPE );
//
//		option = Integer.parseInt( console.nextLine() );
//
//		Gender gender = null;
//		switch (option) {
//		case 1:
//			gender = Gender.MALE;
//			break;
//		case 2:
//			gender = Gender.FEMALE;
//			break;
//		}
//		return gender;
//	}
//	
//	public TypeState generateState() {
//		int option = 0;
//		System.out.println(SBView.STATE_TYPE );
//
//		option = Integer.parseInt( console.nextLine() );
//
//		TypeState gender = null;
//		switch (option) {
//		case 1:
//			gender = TypeState.VIGENT;
//			break;
//		case 2:
//			gender = TypeState.DESCLASSIFIED;
//			break;
//		}
//		return gender;
//	}
//
//	public TypeDocument getDocument() {
//		int option = 0;
//		System.out.println(SBView.MENU_ID_TYPE);
//
//		option = Integer.parseInt( console.nextLine() );
//
//		TypeDocument document = null;
//
//		switch (option) {
//		case 1:
//			document = TypeDocument.CC;
//			break;
//		case 2:
//			document = TypeDocument.FOREING_ID;
//			break;
//		case 3:
//			document = TypeDocument.IC;
//			break;
//		}
//		return document;
//	}
//	
//	public PlayerPosition givePosition() {
//		int option = 0;
//		System.out.println(SBView.MENU_POSITION_TYPE);
//
//		option = Integer.parseInt( console.nextLine() );
//
//		PlayerPosition position = null;
//
//		switch (option) {
//		case 1:
//			position = PlayerPosition.EAVES;
//			break;
//		case 2:
//			position = PlayerPosition.POST;
//			break;
//		case 3:
//			position = PlayerPosition.SHIPOWNER;
//			break;
//		}
//		return position;
//	}
//	
//	public void showMessageDateFormat(String message) {
//		System.err.println(message);
//	}
//
//	public TypeArbitrator getTypeArbitrator() {
//		int option = 0;
//		System.out.println(SBView.ARBITRATOR_TYPE);
//
//		option = Integer.parseInt( console.nextLine() );
//
//		TypeArbitrator arbitrator = null;
//
//		switch (option) {
//		case 1:
//			arbitrator = TypeArbitrator.BACKGROUND;
//			break;
//		case 2:
//			arbitrator = TypeArbitrator.SIDE;
//			break;
//		case 3:
//			arbitrator = TypeArbitrator.TABLE;
//			break;
//		}
//		return arbitrator;
//	}
//	
//	private int getBiggerAverage(double[] vectorOfAverages) {
//		int biggerAverage = 0;
//		for (int i = 0; i < vectorOfAverages.length; i++) {
//			if (biggerAverage < vectorOfAverages[i]) {
//				biggerAverage = (int) vectorOfAverages[i];
//			}
//		}
//		return biggerAverage + 2;
//  }
//	
//	private Object[] getRow(int biggerAverage, double[] vectorOfAverages) {
//		Object[] row = new Object[SBView.FORMAT_TWO_GRAPHIC.length()];
//		row[0] = biggerAverage;
//		for (int i = 0; i < vectorOfAverages.length; i++) {
//			if (vectorOfAverages[i] >= biggerAverage) {
//				row[i + 1] = SBView.BAR_GRAPHIC;
//			}else{
//				row[i + 1] = SBView.VOID_GRAPHIC;
//			}
//		}
//		return row;
//  }
//
//	public void printGraphicsMenWomen(double[] vectorOfAverages) {
//		System.out.println(SBView.SPACE_UTIL);
//		System.out.println(SBView.SEPARATOR_TWO);
//		System.out.println(SBView.GRAPHIC_FOR_WOMAN_AND_MAN);
//		graphicGenerator(vectorOfAverages);
//		generateFooter();
//	}
//
//	private void graphicGenerator(double[] vectorOfAverages) {
//		int biggerAverage = getBiggerAverage(vectorOfAverages);
//		for (int i = biggerAverage; i > 0; i--) {
//			System.out.println(String.format(SBView.FORMAT_TWO_GRAPHIC, getRow(biggerAverage, vectorOfAverages)));
//			biggerAverage--;
//		}
//		
//	}
//	
//	private void generateFooter() {
//		System.out.println("");
//		System.out.println(SBView.SEPARATOR_TWO);
//		System.out.println(String.format(SBView.FORMAT_TWO_GRAPHIC, SBView.FOOTER));
//		System.out.println(SBView.SEPARATOR_TWO);
//	}
//	
//	
//	private Object[] getRowAge(int biggerAverage, double[] vectorOfAverages) {
//		Object[] row = new Object[SBView.FORMAT_AGE.length()];
//		row[0] = biggerAverage;
//		for (int i = 0; i < vectorOfAverages.length; i++) {
//			if (vectorOfAverages[i] >= biggerAverage) {
//				row[i + 1] = SBView.BAR_GRAPHIC;
//			}else{
//				row[i + 1] = SBView.VOID_GRAPHIC;
//			}
//		}
//		return row;
//  }
//	
//	public void printGraphicsAge(double[] vectorOfAverages) {
//		System.out.println("");
//		System.out.println(SBView.SEPARATOR_AGE);
//		System.out.println(SBView.GRAPHIC_FOR_AGE);
//		graphicGeneratorAge(vectorOfAverages);
//		generateFooterAge();
//	}
//	
//	private void graphicGeneratorAge(double[] vectorOfAverages) {
//		int biggerAverage = getBiggerAverage(vectorOfAverages);
//		for (int i = biggerAverage; i > 0; i--) {
//			System.out.println(String.format(SBView.FORMAT_AGE, getRowAge(biggerAverage, vectorOfAverages)));
//			biggerAverage--;
//		}
//		
//	}
//	
//	private void generateFooterAge() {
//		System.out.println("");
//		System.out.println(SBView.SEPARATOR_AGE);
//		System.out.println(String.format(SBView.FORMAT_AGE, SBView.FOOTER_AGE));
//		System.out.println(SBView.SEPARATOR_AGE);
//	}
//
//
//
//
//
