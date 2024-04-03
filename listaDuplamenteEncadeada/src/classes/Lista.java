package classes;
public class Lista {
	private No ref; 

	public No getRef() {
		return ref;
	}

	public void setRef(No ref) {
		this.ref = ref;
	}
	public Lista() {
		ref = null;
	}
	public void insere(int info) {
		if(ref == null) {
			ref = new No(info, null, null);
		}else if (ref != null) {
			No refno = ref;
			do {
				if(refno.getInfo() > info) {
					if(refno == ref){
						ref = new No(info, refno, null);
						refno.setAnt(ref);
						break;
					}else{
						No novo = new No(info, refno, refno.getAnt());
						refno.setAnt(novo);
						novo.getAnt().setProx(novo);
						break;
					}
				}else if(refno.getProx() == null) {
					refno.setProx(new No(info, null, refno));
					break;
				}else{
					refno = refno.getProx();
				}
			}while(refno != null);
		}
	}
	public String imprime() {
		if (ref != null) {
	    	StringBuilder sentidoNormal = new StringBuilder("Sentido normal:");
	    	StringBuilder sentidoContrario = new StringBuilder(" Sentido contrário:");
	    	No ultimo = null;
	    	
	    	for (No i = ref; i != null; i = i.getProx()) {
	    		sentidoNormal.append(i.getInfo()).append(" ");
	    		if (i.getProx() == null) {
	    			ultimo = i;
	    		}
	    	}
	    	
	    	for (No i = ultimo; i != null; i = i.getAnt()) {
	    		sentidoContrario.append(i.getInfo()).append(" ");
	    	}
	    	
	    	return sentidoNormal.toString() + sentidoContrario.toString();
	    } else {
	    	return "lista vazia";
	    }
	}
	public void remove(int apagar, boolean duplicados) {
		No i = ref;
		while(i != null) {
			if(i.getInfo() == apagar) {
				if(i == ref) {
					ref = i.getProx();
					if(i.getProx() != null) {
						i.getProx().setAnt(null);
					}else {
						break;
					}
				}else if (i.getProx() == null) {
					i.getAnt().setProx(null);
					break;
				}else {
					i.getAnt().setProx(i.getProx());
					i.getProx().setAnt(i.getAnt());
				}
				if(i.getProx() == null || i.getProx().getInfo()> apagar) {
					break;
				}
				if(duplicados == false) {
					break;
				}
			}else if(i.getProx() == null || i.getProx().getInfo()> apagar) {
				break;
			}
			i = i.getProx();
		}
	}
	public boolean listaVazia() {
		if(ref == null) {
			return true;
		}else {
			return false;
		}
	}
}