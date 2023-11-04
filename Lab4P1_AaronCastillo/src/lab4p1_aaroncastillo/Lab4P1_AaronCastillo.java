
package lab4p1_aaroncastillo;

import java.util.Scanner;


public class Lab4P1_AaronCastillo {


    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Scanner ler=new Scanner(System.in);
        System.out.println("*****Menu*****");
        System.out.println("1. Inversión especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.print("Ingrese su opcion: ");
        int opcion=leer.nextInt();
        while (opcion>0&&opcion<4){
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cadena: ");
                    String mensaje=ler.nextLine();
                    String []letras= mensaje.split(" ");
                    String espacio="";
                    int men=mensaje.length();
                    if (men>4){
                        for (int i=0; i<letras.length; i++){
                            String letra=letras[i];
                            String reves= "";
                            for (int j=letra.length()-1;j>=0;j--){
                                reves=reves+letra.charAt(j);
                            }
                            espacio=espacio+reves+" ";
                        }
                        System.out.println(espacio);
                    }else{
                        System.out.println("Su palabra debe de ser al menos 5 caracters.");
                    }
                    break;
                case 2:
                    int num1=0;
                    int num2=0;
                    int num3=0;
                    char num, num_1, num_2;
                    System.out.println("Ingrese la cadena 1:");
                    String mensaje1=ler.nextLine();
                    System.out.println("Ingrese la cadena 2:");
                    String mensaje2=ler.nextLine();
                    System.out.println("Ingrese la cadena 3:");
                    String mensaje3=ler.nextLine();
                    for (int i=0; i<mensaje1.length();i++){
                        num=mensaje1.charAt(i);
                        num1=num1+num;
                    }
                    for (int j=0; j<mensaje2.length(); j++){
                        num_1=mensaje2.charAt(j);
                        num2=num2+num_1;
                    }
                    for (int k=0; k<mensaje3.length(); k++){
                        num_2=mensaje3.charAt(k);
                        num3=num3+num_2;
                    }
                    System.out.println("Peso cadena 1: "+num1);
                    System.out.println("Peso cadena 2: "+num2);
                    System.out.println("Peso cadena 3: "+num3);
                    if (num1>num2&&num1>num3){
                        System.out.println("La cadena 1 es mas pesada.");
                    }else if (num2>num1&&num2>num3){
                        System.out.println("La cadena 2 es mas pesada.");
                    }else if (num3>num1&&num3>num2){
                        System.out.println("La cadena 3 es mas pesada.");
                    }else{
                        System.out.println("Las 3 cadenas son del mismo peso.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el mensaje que desea cifrar:");
                    mensaje=ler.nextLine();
                    System.out.print("Mensaje cifrado: ");
                    for (int i=0; i<mensaje.length();i++){
                        int n=0;
                        num=mensaje.charAt(i);
                        n=num+2;
                        char letra= (char)n;
                        System.out.print(letra);
                    }
                    System.out.println("");
                    break;
            }
            System.out.println("");
            System.out.println("*****Menu*****");
            System.out.println("1. Inversión especial");
            System.out.println("2. Balanza de cadenas");
            System.out.println("3. Cifrado de mensajes");
            System.out.print("Ingrese su opcion: ");
            opcion=leer.nextInt();
        }
    }
    
}
