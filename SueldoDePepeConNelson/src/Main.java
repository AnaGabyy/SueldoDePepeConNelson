public class Main {
    public static void main(String[] args) {
        System.out.println("HOLAholaHOLAholaHola");


        Bono pepe = new Bono("Pepe Pepesito", "321", "Gerente", 0, 80);


        System.out.println("-----------");
        System.out.println("Nombre: " + pepe.getNombreCompleto() + "\nCategoría: " +  pepe.getCategoria() + "\nFaltas: " + pepe.getFaltas() +
                "\nBono fijo: ");
        System.out.println("-----------");
        System.out.println(pepe.totalPagar());


    }


}