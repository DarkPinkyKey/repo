package prueba;

public class Excercice_diapo260_ej2 {
    public static String main1(String[] input) {
        if (input.length == 2 && input[0].equals("admin") && input[1].equals("1234")) {
            return "login true";
        } else {
            return "login false";
        }
    }

    public static void main(String[] args) {
        String[] input = {"user", "4321"};
        String result = main1(input);
        System.out.println(result);
    }
}

