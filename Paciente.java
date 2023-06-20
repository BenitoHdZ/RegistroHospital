public class Paciente {
    public String nombre;
    public int numPaciente;

    public Paciente(String nombre, int numPaciente) {
        this.nombre = nombre;
        this.numPaciente = numPaciente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumPaciente() {
        return numPaciente;
    }
    public void setNumPaciente(int numPaciente) {
        this.numPaciente = numPaciente;
    }
    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", numPaciente=" + numPaciente + "]";
    }
    

}
