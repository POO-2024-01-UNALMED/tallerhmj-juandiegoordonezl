package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

  
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero"); 
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

   
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

   
    @Override
    public boolean jugarConLasManos() {
        return true; 
    }

   
    @Override
    public int compareTo(Futbolista f) {
        if (f instanceof Portero) {
            Portero otroPortero = (Portero) f;
            return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
        }
        return -1; 
    }


	public short getGolesRecibidos() {
		return golesRecibidos;
	}


	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}


	public byte getDorsal() {
		return dorsal;
	}


	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
    
}

