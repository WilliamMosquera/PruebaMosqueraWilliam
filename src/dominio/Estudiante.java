
package dominio;

public class Estudiante {
    private String nombre;
    private char sexo;
    private double nota;

    public Estudiante(String nombre, char sexo, double nota) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString(){
        return this.nombre+"\n "+this.sexo+"\n "+this.nota;
    }
    
}
