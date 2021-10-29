import java.util.Scanner;

public class reto {

    /**
     * @param args the command line arguments
     */
    public static String valor;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int elegir;
        int valores;
        int salir = 0;

        do {
            System.out.println("Ingrese Digitos");
            valores = leer.nextInt();
            String str_valor = String.valueOf(valores);
            setValor(str_valor);

            System.out.println("Eliga el tamaño de la Fuente");
            System.out.println("Normal => 1: ");
            System.out.println("Grande => 2: ");
            elegir = leer.nextInt();

            if (elegir == 1) {
                imprimirNormal();
            } else if (elegir == 2) {
                imprimirGrande();
            }

            System.out.println("Desea Continuar Si => 1  No => 2 ");
            salir = leer.nextInt();
        } while (salir == 1);
        
    }  
        

    public static void setValor(String valores) {
        valor = valores;
    }

    public static char[] stringAArray() {
        char[] ch = new char[valor.length()];

        for (int i = 0; i < valor.length(); i++) {
            ch[i] = valor.charAt(i);
        }
        return ch;
    }

    public static void imprimirNormal() {
        String filaUno = "";
        String filaDos = "";
        String filaTres = "";
        for (int i = 0; i < valor.length(); i++) {
            String[] Array = guardarCaracteresNormalesEnArray(stringAArray()[i]);
            for (int k = 0; k < 3; k++) {
                if (k == 0) {
                    filaUno = filaUno + Array[k];
                }
                if (k == 1) {
                    filaDos = filaDos + Array[k];
                }
                if (k == 2) {
                    filaTres = filaTres + Array[k];
                }
            }
        }
        filaUno = filaUno + "\n";
        filaDos = filaDos + "\n";
        filaTres = filaTres + "\n";
        System.out.print(filaUno);
        System.out.print(filaDos);
        System.out.print(filaTres);
    }

    public static String[] guardarCaracteresNormalesEnArray(char digito) {
        String[] caracteres = new String[5];

        switch (digito) {
            case '0':
                caracteres[0] = " _ ";
                caracteres[1] = "| |";
                caracteres[2] = "|_|";
                break;
            case '1':
                caracteres[0] = "   ";
                caracteres[1] = "  |";
                caracteres[2] = "  |";
                break;
            case '2':
                caracteres[0] = " _ ";
                caracteres[1] = " _|";
                caracteres[2] = "|_ ";
                break;
            case '3':
                caracteres[0] = " _ ";
                caracteres[1] = " _|";
                caracteres[2] = " _|";
                break;
            case '4':
                caracteres[0] = "   ";
                caracteres[1] = "|_|";
                caracteres[2] = "  |";
                break;
            case '5':
                caracteres[0] = " _ ";
                caracteres[1] = "|_ ";
                caracteres[2] = " _|";
                break;
            case '6':
                caracteres[0] = " _ ";
                caracteres[1] = "|_ ";
                caracteres[2] = "|_|";
                break;
            case '7':
                caracteres[0] = " _ ";
                caracteres[1] = "  |";
                caracteres[2] = "  |";
                break;
            case '8':
                caracteres[0] = " _ ";
                caracteres[1] = "|_|";
                caracteres[2] = "|_|";
                break;
            case '9':
                caracteres[0] = " _ ";
                caracteres[1] = "|_|";
                caracteres[2] = " _|";
                break;
            default:
                throw new AssertionError();
        }

        return caracteres;
    }

    public static void imprimirGrande() {
        String filaUno = "";
        String filaDos = "";
        String filaTres = "";
        String filaCuatro = "";
        String filaCinco = "";
        for (int i = 0; i < valor.length(); i++) {
            String[] Array = guardarCaracteresGrandesEnArray(stringAArray()[i]);
            for (int k = 0; k < 5; k++) {
                if (k == 0) {
                    filaUno = filaUno + Array[k];
                }
                if (k == 1) {
                    filaDos = filaDos + Array[k];
                }
                if (k == 2) {
                    filaTres = filaTres + Array[k];
                }
                if (k == 3) {
                    filaCuatro = filaCuatro + Array[k];
                }
                if (k == 4) {
                    filaCinco = filaCinco + Array[k];
                }
            }
        }
        filaUno = filaUno + "\n";
        filaDos = filaDos + "\n";
        filaTres = filaTres + "\n";
        filaCuatro = filaCuatro + "\n";
        filaCinco = filaCinco + "\n";
        System.out.print(filaUno);
        System.out.print(filaDos);
        System.out.print(filaTres);
        System.out.print(filaCuatro);
        System.out.print(filaCinco);
    }

    public static String[] guardarCaracteresGrandesEnArray(char digito) {
        String[] caracteres = new String[5];

        switch (digito) {
            case '0':
                caracteres[0] = " ___ ";
                caracteres[1] = "|   |";
                caracteres[2] = "|   |";
                caracteres[3] = "|   |";
                caracteres[4] = "|___|";
                break;
            case '1':
                caracteres[0] = "     ";
                caracteres[1] = "    |";
                caracteres[2] = "    |";
                caracteres[3] = "    |";
                caracteres[4] = "    |";
                break;
            case '2':
                caracteres[0] = " ___ ";
                caracteres[1] = "    |";
                caracteres[2] = " ___|";
                caracteres[3] = "|    ";
                caracteres[4] = "|___ ";
                break;
            case '3':
                caracteres[0] = " ___ ";
                caracteres[1] = "    |";
                caracteres[2] = " ___|";
                caracteres[3] = "    |";
                caracteres[4] = " ___|";
                break;
            case '4':
                caracteres[0] = "     ";
                caracteres[1] = "|   |";
                caracteres[2] = "|___|";
                caracteres[3] = "    |";
                caracteres[4] = "    |";
                break;
            case '5':
                caracteres[0] = " ___ ";
                caracteres[1] = "|    ";
                caracteres[2] = "|___ ";
                caracteres[3] = "    |";
                caracteres[4] = " ___|";
                break;
            case '6':
                caracteres[0] = " ___ ";
                caracteres[1] = "|    ";
                caracteres[2] = "|___ ";
                caracteres[3] = "|   |";
                caracteres[4] = "|___|";
                break;
            case '7':
                caracteres[0] = " ___ ";
                caracteres[1] = "    |";
                caracteres[2] = "    |";
                caracteres[3] = "    |";
                caracteres[4] = "    |";
                break;
            case '8':
                caracteres[0] = " ___ ";
                caracteres[1] = "|   |";
                caracteres[2] = "|___|";
                caracteres[3] = "|   |";
                caracteres[4] = "|___|";
                break;
            case '9':
                caracteres[0] = " ___ ";
                caracteres[1] = "|   |";
                caracteres[2] = "|___|";
                caracteres[3] = "    |";
                caracteres[4] = " ___|";
                break;
            default:
                throw new AssertionError();
        }

        return caracteres;
    }

}