public class App {
    public static void main(String[] args) throws Exception {
        int[] vetorzao = new int [10];
    //preenchendo os 10 espaços do vetor com valores de 1 a 10
        for (int i = 0; i < 10; i++) {
            vetorzao[i] = i + 1;
        }
    //imprimindo os valores
        for (int i = 0; i <=10; i++) {
            System.out.println(vetorzao[i]);
        }
    }
}
