public class Sueldo {
    private String nombreCompleto;
    private String dni;
    private String categoria;
    private int faltas;

    public Sueldo(String nombreCompleto, String dni, String categoria, int faltas) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.categoria = categoria;
        this.faltas = faltas;
    }

    public Sueldo() {
        this.nombreCompleto = "";
        this.dni = "";
        this.categoria = "";

    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }



    public int faltas(){
        if (getFaltas() == 0)
            return 100;
        else if (getFaltas() == 1)
            return 50;
        else return 0;
    }

    public int calculoSueldo(){

        int sueldo = 0;
        if (getCategoria().equals("Gerente"))
            sueldo = 1000;
        else
            sueldo = 1500;
        return (sueldo + faltas() + getBonofijo());
    }

    @Override
    public String toString() {
        return "Sueldo{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", categoria='" + categoria + '\'' +
                ", faltas=" + faltas +
                '}';
    }

}
