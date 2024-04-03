package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Criando a lista duplamente encadeada");
		Lista lista = new Lista();
		
		
		
		System.out.println("\n\n\ninserindo elementos na lista: (inserindo 0,1,2,3,4,0,6,7,8 e 9) ");
		System.out.println("Antes:");
		System.out.println(lista.imprime());
		lista.insere(0);
		lista.insere(1);
		lista.insere(2);
		lista.insere(3);
		lista.insere(4);
		lista.insere(0);
		lista.insere(6);
		lista.insere(7);
		lista.insere(8);
		lista.insere(9);
		System.out.println("Depois:");
		System.out.print(lista.imprime());
		
				System.out.println("\n\n\nremoção do valor 1 repetido 4 vezes no inicio:");
				System.out.println("Antes:");
				System.out.print(lista.imprime());
				lista.remove(0,false);
				System.out.println("Depois:");
				System.out.print(lista.imprime());
		
	}

}