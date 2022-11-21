public class Porcentaje extends Sueldo {

    private float bonoSobreElNeto;

    public Porcentaje(String nombreCompleto, String dni, String categoria, int faltas, float bonoSobreElNeto) {
        super(nombreCompleto, dni, categoria, faltas);
        this.bonoSobreElNeto = bonoSobreElNeto;
    }

    public float getBonoSobreElNeto() {
        return bonoSobreElNeto;
    }

    public void setBonoSobreElNeto(float bonoSobreElNeto) {
        this.bonoSobreElNeto = bonoSobreElNeto;
    }


}
