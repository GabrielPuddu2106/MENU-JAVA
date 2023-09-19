import java.util.Scanner;

public class MenuCuerposGeometricos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double areaLateral, areaTotal, volumen, tang, aBase, area, volumenZona, radio, volumenCasquete;
        double pBase, apotema, areaBase, altura, diametro;
        double ladoMenor, ladoMayor, areaBMAYOR, areaBMENOR, pBMAYOR, pBMENOR;
        double radioMayor, radioMenor, generatriz;
        int lados, base, numeroGrados, caras, arista;

        // PROCESAMIENTO DE DATOS DE ENTRADA

        System.out.println("Menu de opciones");
        System.out.println("1) Prisma");
        System.out.println("2) Cilindro");
        System.out.println("3) Piramide");
        System.out.println("4) Cono");
        System.out.println("5) Esfera");
        System.out.println("6) ZonaEsferica");
        System.out.println("7) CasqueteEsferico");
        System.out.println("8) TroncoDeCono");
        System.out.println("9) TroncoDePiramide");
        System.out.println("10) Hueso_CuñaEsferica");
        System.out.println("11) Ortoedro");
        System.out.println("12) Tetaedro");
        System.out.println("13) Hexaedro");
        System.out.println("14) Octaedro");
        System.out.println("15) Dodecaedro");
        System.out.println("16) Icosaedro");
        System.out.println("17) Salir");

        byte opc = lector.nextByte();

        switch (opc) {
            case 1:
                System.out.println("1) Prisma");

                do {
                    System.out.println("INGRESE LA LONGITUD DEL PRISMA / NO NEGATIVOS");
                    longitud = lector.nextDouble();
                } while (longitud <= 0);

                do {
                    System.out.println("INGRESE EL NUMERO DE LADOS DEL PRISMA / NO NEGATIVOS");
                    lados = lector.nextInt();
                } while (lados <= 0 || lados > 6);

                do {
                    System.out.println("INGRESE LA ALTURA DEL PRISMA  / NO NEGATIVOS");
                    altura = lector.nextDouble();
                } while (altura <= 0);
                // CALCULO DE DATOS DE ENTRADA

                pBase = lados * altura;
                tang = 360 / (2 * lados);
                apotema = longitud / (2 * Math.tan(tang * 3.1416 / 180));
                aBase = pBase + apotema / 2;
                volumen = aBase + altura;
                areaLateral = pBase * altura;
                areaTotal = areaLateral + 2 * aBase;

                // RESULTADOS

                System.out.println("El PBASE ES:" + pBase);
                System.out.println(" LA TANGENTE ES:" + tang);
                System.out.println("EL APOTEMA ES:" + apotema);
                System.out.println("EL AREA BASE ES:" + aBase);
                System.out.println("El VOLUMEN ES:" + volumen);
                System.out.println("EL AREA LATERAL ES:" + areaLateral);
                System.out.println("EL AREA TOTAL ES:" + areaTotal);

                break;

            case 2:
                System.out.println("2) Cilindro");

                do {
                    System.out.println("Ingrese el Radio");
                    radio = lector.nextDouble();

                    if (radio > 0) {
                        break;
                    } else {
                        System.out.println("VALOR INGRESADO INCORRECTO");

                        System.out.println("VUELVA INGRESAR EL RADIO");
                    }

                } while (true);

                do {
                    System.out.println("Ingrese la altura");
                    altura = lector.nextDouble();
                    if (altura > 0) {
                        break;
                    } else {
                        System.out.println("VALOR INGRESADO INCORRECTO");

                        System.out.println("VUELVA INGRESAR LA ALTURA");
                    }

                } while (true);

                // PROCESANDO DATOS DE ENTRADA
                areaLateral = 2 * (3.1416) * radio * altura;
                areaTotal = 2 * (3.1416) * radio * (altura + radio);
                volumen = (3.1416) * radio * radio * altura;

                System.out.println("EL AREA LATERAL ES:" + areaLateral);
                System.out.println("EL VOLUMEN ES:" + volumen);
                System.out.println("EL AREA TOTAL ES:" + areaTotal);

                break;

            default:
                break;
        }

    }
}