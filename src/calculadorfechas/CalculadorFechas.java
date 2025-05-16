package calculadorfechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculadorFechas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LocalDate fechaNacimiento = null;

        System.out.println(
                "______                          _____                                 \n"
                + "| ___ \\                        |  __ \\                                \n"
                + "| |_/ /_ __ _   _  __ _ _ __   | |  \\/_   _  _____   ____ _ _ __ __ _ \n"
                + "| ___ \\ '__| | | |/ _` | '_ \\  | | __| | | |/ _ \\ \\ / / _` | '__/ _` |\n"
                + "| |_/ / |  | |_| | (_| | | | | | |_\\\\ \\ |_| |  __/\\ V / (_| | | | (_| |\n"
                + "\\____/|_|   \\__, |\\__,_|_| |_|  \\____/\\__,_|\\\\___| \\_/ \\__,_|_|  \\__,_|\n"
                + "             __/ |                                                    \n"
                + "            |___/                                                     \n"
                + "=================================================== <[Calculadora de edad]> ======================================");

        System.out.print("Introduce la fecha de nacimiento (formato AAAA-MM-DD): ");
        String entrada = scan.nextLine();

        try {
            fechaNacimiento = LocalDate.parse(entrada);
            LocalDate fechaActual = LocalDate.now();

            Period edad = Period.between(fechaNacimiento, fechaActual);

            System.out.println("La persona tiene " + edad.getYears() + " años, "
                    + edad.getMonths() + " meses y "
                    + edad.getDays() + " días.");
        } catch (DateTimeParseException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Formato de fecha inválido. Usa el formato AAAA-MM-DD.");
        }
        System.out.println("==================================================================================================================");
    }
}
