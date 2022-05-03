
import java.util.*;

/**
 * 
 */
public class Persona {

    

	

	/**
     * 
     */
    private String nome;

    /**
     * 
     */
    private String cognome;

    /**
     * 
     */
    private String indirizzo;

    /**
     * 
     */
    private Auto[ ] autoPossedute;

    /**
     * 
     */
    private int autoMax;

    /**
     * 
     */
    private int contaAuto;

	public Persona(String nome, String cognome, String indirizzo, int autoMax) {
			this.nome = nome;
			this.cognome = cognome;
			this.indirizzo = indirizzo;
			this.autoMax = autoMax;
			autoPossedute=new Auto [autoMax];
			contaAuto=0;
	}
    
    
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
    public boolean aggiungiAuto(Auto a) {
        if(contaAuto<autoMax) {
        	autoPossedute[contaAuto]=a;
        	contaAuto++;
        	return true;
        }
        return false;
    }

    /**
     * @param t 
     * @return
     */
    public boolean cancellaAuto(String t) {
    	for(int i=0;i<contaAuto;i++) {
    		if(autoPossedute[i].getTarga().compareToIgnoreCase(t)==0) {
    			for(int y=i;y<contaAuto-1;y++){
    				autoPossedute[y]=autoPossedute[y+1];	
    			}
    			contaAuto--;
    			return true;
    		}
    	}
    	return false;
    }

    /**
     * @param m 
     * @param t 
     * @return
     */
    public boolean aggiungiAuto(String m, String t) {
        Auto a=new Auto(m,t);
        return aggiungiAuto(a);
    }
    
    public Auto cercaAuto(String t) {
    	for(int i=0;i<contaAuto;i++) {
    		if(autoPossedute[i].getTarga().compareToIgnoreCase(t)==0) {
    			return autoPossedute[i];
    		}
    	}
    	return null;
    }
    
    public Auto [] cercaVetAuto(String t){
    	Auto vet[]=new Auto [contaAuto];
    	int pos=0;
    	for(int i=0;i<contaAuto;i++) {
    		if(autoPossedute[i].getTarga().contains(t)) {
    			vet[pos]=autoPossedute[i];
    			pos++;
    		}
    	}
    	Auto vetGiusto[]=new Auto[pos];
    	for(int i=0;i<pos;i++) {
    		vetGiusto[i]=vet[i];
    	}
    	return vetGiusto;
    }

	@Override
	public String toString() {
		String auto="\nNessun auto posseduta";
		if(contaAuto!=0) {
			auto="\nAuto possedute:";
			for(int i=0;i<contaAuto;i++) {
				auto+="\n"+autoPossedute[i];
			}
		}
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + "]"+auto;
	}

    


}