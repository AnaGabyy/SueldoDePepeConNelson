public class Bono extends Sueldo{

    private int bonoFijo;

    public Bono(String nombreCompleto, String dni, String categoria, int faltas, int bonoFijo) {
        super(nombreCompleto, dni, categoria, faltas);
        this.bonoFijo = bonoFijo;
    }

    public int getBonoFijo() {
        return bonoFijo;
    }

    public void setBonoFijo(int bonoFijo) {
        this.bonoFijo = bonoFijo;
    }


    //neto + bono x presentismo + bono x resultados
    public int totalPagar(){
        int sueldo = super.calculoSueldo();
        int bonoAsistencia = super.faltas();

        return (sueldo + bonoAsistencia + this.getBonoFijo());
    }


}
