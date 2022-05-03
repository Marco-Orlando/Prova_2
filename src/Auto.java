
import java.util.*;

/**
 * Classe auto
 * @version 1.0
 */
public class Auto {    
	
    private String modello;
    private String targa;

    public Auto(String modello, String targa) {
		super();
		this.modello = modello;
		this.targa = targa;
	}

	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public String getTarga() {
		return targa;
	}


	public void setTarga(String targa) {
		this.targa = targa;
	}

	@Override
	public String toString() {
		return "Auto [modello=" + modello + ", targa=" + targa + "]";
	}

}
