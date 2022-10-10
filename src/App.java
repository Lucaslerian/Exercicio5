import java.util.Scanner;


public class App {
    public static void main (String [] args){
        //Faça um Programa que converta metros para centímetros    
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite uma medida em metros: ");
        double metros = sc.nextDouble();
        sc.close();
        //Converter em centímetros (1 metro = 100cm)
        double centímetros = metros * 100;
        System.out.println(metros + " metros corresponde a " + centímetros + " centímetros");
        }
        
    }
