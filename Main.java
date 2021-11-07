
package ConversorJava;
//biblioteca de leitura
import java.util.Scanner; 

public class Mainnovo {
//variaveis 
    static int Menu = 1;
    static int opcao;
    static float temperatura, dinheiro, cotacao;
    static boolean confirmacao;
    
    public static void main(String[] args) { 
//leitura da biblioteca scanner
        Scanner Leitor = new Scanner(System.in); 
 //função enquanto do java       
        while (Menu != 0) { 
           System.out.println("cotação do dolar");
            cotacao = Leitor.nextFloat();
            
            System.out.println("Conversor de celsius para fahrenheit digite 1");
            System.out.println("Conversor de fahrenheit para celsius digite 2");
            System.out.println("Conversor real para dolar digite 3 ");
            System.out.println("Conversor dolar para real digite 4 ");
            System.out.println("0: Sair");
            opcao = Leitor.nextInt();
//escolha no java            
            switch (opcao) { 
               
                case 1 -> {
                   
                    System.out.println("Digite a temperatura em Celsius");
                    temperatura = Leitor.nextFloat();
                    temperatura = fahrenheit(temperatura); //chama a finção de conversão
                    System.out.println("sua temperatura em fahrenheit é: " + temperatura + "°F.");
                    confirmacao = true; //confima a conversão 
                }
                case 2 -> {
                    System.out.println("Digite a temperatura em Farenheit");
                    temperatura = Leitor.nextFloat();
                    temperatura = celsius(temperatura);
                    System.out.println("Sua temperatura em Celsius é: " + temperatura + "°C.");
                    confirmacao = true;
                }
                case 3 -> {
                    System.out.println("Informe o valor em real");
                    dinheiro = Leitor.nextFloat();
                    dinheiro = real(dinheiro);
                    System.out.println("O valor em dolar é: " + dinheiro + "$.");
                    confirmacao = true;
                }
                case 4 -> {
                    System.out.println("Informe o valor em dolar");
                    dinheiro = Leitor.nextFloat();
                    dinheiro = dolar(dinheiro);
                    System.out.println("seu valor em real é : " + dinheiro + "$.");
                    confirmacao = true;
                }
                default -> System.out.println("Número inválido");
            }
//
            if (confirmacao) { 
                System.out.println("Aperte 1 para usar o conversor e 2 para sair");
                Menu = Leitor.nextInt();
//1 volta para o inicio               
                if (Menu == 1) { //1 volta para o inicio
                    confirmacao = false;
                } else { //2 sair
                    Menu = 0;
                }
            }
        }
    }
//conversor farenheit ~ celsius
    public static float fahrenheit(float temperatura) { 
        float res = (float) (temperatura * 1.8 + 32);
        return res;
    }
//conversor celsius ~ farenheit
    public static float celsius(float temperatura) { 
        float res = (float) ((temperatura - 32) / 1.8);
        return res;
    }
//conversor reais ~ dolares
    public static float real(float dinheiro) { 
        float res = dinheiro / cotacao;
        return res;
    }
//conversor dolares ~ reais
    public static float dolar(float dinheiro) { 
        float res = dinheiro * cotacao;
        return res;
    }
    
   
}