package com.local.logica;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido al sistema de Facturación ");
            System.out.println("");
            System.out.println("Escribe el número correspondiente a tu necesidad.");
            System.out.println("");
            System.out.println("1. Consultar info de tarjetas");
            System.out.println("2. Salir");
            System.out.println("");
            System.out.println("");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // consumir el salto de línea

            if (opcion == 2) {
                break;
            }
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Selecciona el mes a consultar");
                    System.out.println("1. Enero");
                    System.out.println("2. Febrero");
                    System.out.println("3. Marzo");
                    System.out.println("4. Abril");
                    System.out.println("5. Mayo");
                    System.out.println("6. Junio");
                    System.out.println("7. Julio");
                    System.out.println("8. Agosto");
                    System.out.println("9. Septiembre");
                    System.out.println("10. Octubre");
                    System.out.println("11. Noviembre");
                    System.out.println("12. Diciembre");
                    System.out.println("13. Volver");
                    System.out.println("");
                    System.out.println("");
                    int mes = scanner.nextInt();
                    scanner.nextLine(); // consumir el salto de línea
                    if (mes == 1) {
                    System.out.println("Tarjetas de Enero");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0001-0001-0001-0001");
                    System.out.println("Valor de apertura: 20000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0001-0002-0002-0002");
                    System.out.println("Valor de apertura: 110000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0001-0003-0003-0003");
                    System.out.println("Valor de apertura: 90000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0001-0004-0004-0004");
                    System.out.println("Valor de apertura: 22000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0001-0005-0005-0005");
                    System.out.println("Valor de apertura: 35000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");


                    } if (mes == 2) {
                    System.out.println("Tarjetas de Febrero");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0002-0001-0001-0001");
                    System.out.println("Valor de apertura: 21000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0002-0002-0002-0002");
                    System.out.println("Valor de apertura: 111000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0002-0003-0003-0003");
                    System.out.println("Valor de apertura: 91000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0002-0004-0004-0004");
                    System.out.println("Valor de apertura: 23000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0002-0005-0005-0005");
                    System.out.println("Valor de apertura: 36000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 3) {
                    System.out.println("Tarjetas de Marzo");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0003-0001-0001-0001");
                    System.out.println("Valor de apertura: 22000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0003-0002-0002-0002");
                    System.out.println("Valor de apertura: 112000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0003-0003-0003-0003");
                    System.out.println("Valor de apertura: 92000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0003-0004-0004-0004");
                    System.out.println("Valor de apertura: 24000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0003-0005-0005-0005");
                    System.out.println("Valor de apertura: 37000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 4) {
                    System.out.println("Tarjetas de Abril");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0004-0001-0001-0001");
                    System.out.println("Valor de apertura: 23000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0004-0002-0002-0002");
                    System.out.println("Valor de apertura: 113000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0004-0003-0003-0003");
                    System.out.println("Valor de apertura: 93000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0004-0004-0004-0004");
                    System.out.println("Valor de apertura: 25000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0004-0005-0005-0005");
                    System.out.println("Valor de apertura: 38000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 5) {
                    System.out.println("Tarjetas de Mayo");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0005-0001-0001-0001");
                    System.out.println("Valor de apertura: 24000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0005-0002-0002-0002");
                    System.out.println("Valor de apertura: 114000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0005-0003-0003-0003");
                    System.out.println("Valor de apertura: 94000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0005-0004-0004-0004");
                    System.out.println("Valor de apertura: 26000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0005-0005-0005-0005");
                    System.out.println("Valor de apertura: 39000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 6) {
                    System.out.println("Tarjetas de Junio");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0006-0001-0001-0001");
                    System.out.println("Valor de apertura: 25000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0006-0002-0002-0002");
                    System.out.println("Valor de apertura: 115000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0006-0003-0003-0003");
                    System.out.println("Valor de apertura: 95000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0006-0004-0004-0004");
                    System.out.println("Valor de apertura: 27000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0006-0005-0005-0005");
                    System.out.println("Valor de apertura: 40000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 7) {
                    System.out.println("Tarjetas de Julio");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0007-0001-0001-0001");
                    System.out.println("Valor de apertura: 26000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0007-0002-0002-0002");
                    System.out.println("Valor de apertura: 116000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0007-0003-0003-0003");
                    System.out.println("Valor de apertura: 96000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0007-0004-0004-0004");
                    System.out.println("Valor de apertura: 28000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0007-0005-0005-0005");
                    System.out.println("Valor de apertura: 41000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 8) {
                    System.out.println("Tarjetas de Agosto");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0008-0001-0001-0001");
                    System.out.println("Valor de apertura: 27000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0008-0002-0002-0002");
                    System.out.println("Valor de apertura: 117000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0008-0003-0003-0003");
                    System.out.println("Valor de apertura: 97000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0008-0004-0004-0004");
                    System.out.println("Valor de apertura: 29000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0008-0005-0005-0005");
                    System.out.println("Valor de apertura: 42000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 9) {
                    System.out.println("Tarjetas de Septiembre");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0009-0001-0001-0001");
                    System.out.println("Valor de apertura: 28000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0009-0002-0002-0002");
                    System.out.println("Valor de apertura: 118000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0009-0003-0003-0003");
                    System.out.println("Valor de apertura: 98000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0009-0004-0004-0004");
                    System.out.println("Valor de apertura: 30000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0009-0005-0005-0005");
                    System.out.println("Valor de apertura: 43000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 10) {
                    System.out.println("Tarjetas de Octubre");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0010-0001-0001-0001");
                    System.out.println("Valor de apertura: 29000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0010-0002-0002-0002");
                    System.out.println("Valor de apertura: 119000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0010-0003-0003-0003");
                    System.out.println("Valor de apertura: 99000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0010-0004-0004-0004");
                    System.out.println("Valor de apertura: 31000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0010-0005-0005-0005");
                    System.out.println("Valor de apertura: 44000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 11) {
                    System.out.println("Tarjetas de Noviembre");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0011-0001-0001-0001");
                    System.out.println("Valor de apertura: 30000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0011-0002-0002-0002");
                    System.out.println("Valor de apertura: 120000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0011-0003-0003-0003");
                    System.out.println("Valor de apertura: 100000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0011-0004-0004-0004");
                    System.out.println("Valor de apertura: 32000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0011-0005-0005-0005");
                    System.out.println("Valor de apertura: 45000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 12) {
                    System.out.println("Tarjetas de Diciembre");     
                    System.out.println("");    
                    System.out.println("Número de cuenta: 0012-0001-0001-0001");
                    System.out.println("Valor de apertura: 31000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0012-0002-0002-0002");
                    System.out.println("Valor de apertura: 121000");
                    System.out.println("Tipo de tarjeta: Nomina");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0012-0003-0003-0003");
                    System.out.println("Valor de apertura: 101000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0012-0004-0004-0004");
                    System.out.println("Valor de apertura: 33000");
                    System.out.println("Tipo de tarjeta: Joven");
                    System.out.println("");
                    System.out.println("Número de cuenta: 0012-0005-0005-0005");
                    System.out.println("Valor de apertura: 46000");
                    System.out.println("Tipo de tarjeta: Visa");
                    System.out.println("");
                    System.out.println("");
                    } if (mes == 13) {
                        break;
                    }
                }
            }
        }
    }
    
}
