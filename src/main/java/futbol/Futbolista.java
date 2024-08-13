package futbol;
	public abstract class Futbolista implements Comparable<Futbolista>{
	    private String nombre;
	    private int edad;
	    private final String posicion;

	    public Futbolista(String nombre, int edad, String posicion) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.posicion = posicion;
	    }

	    public Futbolista() {
	        this.nombre="Maradona";
	        this.posicion="delantero";
	        this.edad=30;
	    }

	    @Override
	    public String toString() {
	        return "El futbolista " + nombre + " tiene " + edad + " años, y juega de " + posicion;
	    }

	    public boolean equals(Futbolista f) {
	        return this==f;
	    }

	    public abstract boolean jugarConLasManos();

	    @Override
	    public int compareTo(Futbolista f) {
	        return this.nombre.compareTo(f.nombre);
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getPosicion() {
			return posicion;
		}
	}
	
