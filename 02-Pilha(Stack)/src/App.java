import java.util.Stack;

public class App {
    public static void main(String[] args){
        //Nas pilhas(stacks) os ultimos serão os primeiros, o ultimo da fila é sempre o primeiro a ser retirado
        Stack<String> carros = new Stack<>();

        carros.push("BMW");
        carros.push("Ferrari");
        carros.push("Camaro");
        carros.push("Lamborgni");

        //peek retorna o elemento no topo da pilha
        //System.out.println("Topo da pilha: " + carros.peek());

        //pop retorna o elemento no topo e o retira
        System.out.println("Fim da pilha que foi removido: " + carros.pop());

        System.out.println(carros);

        //empty indica se a pilha está vazia ou não
        //? é um operador ternário e é utilizado para avaliar uma condição e retornar um resultado diferente dependendo do resultado da condição.
        System.out.println(carros.empty()?"Pilha vazia":"Pilha com elementos");

        //clear limpa a pilha
        carros.clear();
        
    }
}
