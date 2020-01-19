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