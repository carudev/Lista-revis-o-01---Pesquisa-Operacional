//Lista 01 revisão Pesquisa Operacional ANNA CAROLINA
package aula2;
import java.util.Random;
   import java.util.Scanner;



public class Aula2 {

    public static void main(String[] args) {
        
        //Questão 01 Olá Mundo:
        System.out.println("         ");
        System.out.println("Olá tia Lu! Bora se aventurar na lista 01 de revisão? :D\n");
        System.out.println("-------------------------------------------\n\n");
     
        
        Scanner ler = new Scanner(System.in);
        
        
        // Questão 02 Ler 10 números armazenar num vetor e imprimir o vetor
        System.out.println("Então, vamos preencher um vetor com 10 núemros? :p:\n");
        int vetor[] = new int[10];
        int i, auxvetor;
        for (i = 0; i < 10; i++){
            System.out.println("Por favor, digite um núemro:");
            vetor[i] = ler.nextInt();
            auxvetor = vetor[1]; 
        }
        
        System.out.println("O vetor formado pelos números inseridos é: \n");
        for (i = 0; i < 10; i++){
            System.out.print(vetor[i] + " ");
            System.out.println(" ");
        }
        
        System.out.println("  \n");        

        System.out.println("-------------------------------------------\n\n");
        
        
        //Questao 03 Ler e preencher uma matriz 10x10, imprimir a matriz
        System.out.println("Agora vamos preencher  automáticamente uma matriz 10x10 e imprimir:\n");
        Random generator = new Random();
        int m[][] = new int[10][10]; 
        for (int a = 0; a < 10; a++){
            for(int b = 0; b <10; b ++){
                m[a][b] = generator.nextInt(10);
            }
        }
        for (int a = 0; a < 10; a++){
            for(int b = 0; b <10; b ++){
                System.out.print(m[a][b] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("  \n");          
        System.out.println("Acima você pode conferir a matriz que criamos randomicamente para a questão 03! :D\n");
        System.out.println("-------------------------------------------\n");
        
        
        //Questão 04 media, maior e menor
        System.out.println("Agora, vamos calcular qual o maior, o menor e a média entre os dez números que você digitar! Bora lá!");      
        int maior = 0, menor = 100000, aux;
        int pombo[] = new int[10];
        int media = 0;

        for (int j = 0; j < 10; j++) {
            System.out.println("Por favor, digite um núemro:");
            pombo[j] = ler.nextInt();
            aux = pombo[j];
            
            media += pombo[j];
            
            if (maior < aux) {
                maior = pombo[j];
            }

            if (menor > aux) {
                menor = pombo[j];
            }
            
            float total = (float)media / pombo.length;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("  ");
        
        System.out.println("A média dos números digitados é: " + media);
        System.out.println("Pronto! Terminamos juntas a Lista 01, nos vemos na próxima! Valeu tia Lu! :D  \n");  
    }
}

