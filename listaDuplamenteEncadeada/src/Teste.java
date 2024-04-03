import static org.junit.Assert.assertEquals;

import org.junit.Test;

import classes.Lista;

public class Teste{
	

//mostrar
	
	@Test 
	public void testVazia() { 
	Lista lista = new Lista(); 
	String ret = lista.imprime(); 
	assertEquals("lista vazia", ret); 
	} 
	@Test 
	public void test() {
	Lista lista = new Lista(); 
	lista.insere(5); 
	lista.insere(4); 
	lista.insere(3); 
	lista.insere(2); 
	lista.insere(1); 
	String ret = lista.imprime(); 
	assertEquals("Sentido normal:1 2 3 4 5  Sentido contrário:5 4 3 2 1 ", ret); 
	} 

	//mostrar
	   @Test
	   public void removeDuplicado3() {
	       Lista lista = new Lista();
	       lista.insere(55);
	       lista.insere(44);
	       lista.insere(33);
	       lista.insere(55);
	       lista.insere(22);
	       lista.insere(11);
	       lista.insere(55);
	       lista.insere(11);
	       lista.insere(55);
	       lista.remove(55, true);
	       String ret = lista.imprime();
	       assertEquals("Sentido normal:11 11 22 33 44  Sentido contrário:44 33 22 11 11 ", ret);

	   }
	   
	 //mostrar



@Test
public void removeDuplicado4() {
	       Lista lista = new Lista();
	       lista.insere(55);
	       lista.insere(55);
	       lista.insere(33);
	       lista.insere(22);
	       lista.insere(11);
	       lista.insere(11);
	       lista.remove(55, true);
	       String ret = lista.imprime();
	       assertEquals("Sentido normal:11 11 22 33 Sentido  contrário:33 22 11 11 ", ret);

	   }
	   
	   @Test
	   public void removeDuplicado9() {
           Lista lista = new Lista();
           lista.insere(1);
           lista.insere(1);
           lista.insere(1);
           lista.remove(1, true);
           String ret = lista.imprime();
           assertEquals("lista vazia", ret);

       }
	
	   @Test
	   public void esvaziaReinsere() {
	       Lista lista = new Lista();
	       lista.insere(5);
	       lista.insere(4);
	       lista.insere(3);
	       lista.insere(2);
	       lista.insere(1);
	       lista.remove(1, false);
	       lista.remove(2, false);
	       lista.remove(3, false);
	       lista.remove(4, false);
	       lista.remove(5, false);
	       lista.insere(55);
	       lista.insere(44);
	       lista.insere(33);
	       String ret = lista.imprime();
	       assertEquals("Sentido normal:33 44 55  Sentido contrário:55 44 33 ", ret);
	   }
	   
}  
