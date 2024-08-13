package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion); 
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public Jugador() {
        super("Maradona", 30, "delantero");
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

   
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }

    
    @Override
    public boolean jugarConLasManos() {
        return false; 
    }

    
    @Override
    public int compareTo(Futbolista f) {
        return Math.abs(this.getEdad() - f.getEdad());
    }
}

