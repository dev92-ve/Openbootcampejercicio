public class ejercicio3Openbootcamp {
    public static void main (String[]args){
    Coche miCoche = new Coche();
    miCoche.colocarPuertas();
    System.out.println(miCoche.puertas);
}

       static class Coche {
            public int puertas = 4;
            public void colocarPuertas() {
                this.puertas++;
            }
        }

}

