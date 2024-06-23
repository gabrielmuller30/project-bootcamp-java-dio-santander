import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Insira o segundo valor: ");
        int valor2 = scanner.nextInt();

        try{
        
            contar(valor1, valor2);
        
        }catch(ParametroInvalidosExceptions e){
            System.err.println("O segundo valor inserido tem que ser maior que o primeiro");
        }
        scanner.close();
    }

    static void contar (int valor1, int valor2)throws ParametroInvalidosExceptions{
        if(valor1>valor2){
            throw new ParametroInvalidosExceptions();           
        }else{
            int contagem = valor2-valor1;
            for(int i=1; i<=contagem ; i++){
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}