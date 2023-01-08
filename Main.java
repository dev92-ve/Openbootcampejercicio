public class Main {
    public static void main (String[]args){
        int resultado; //guarda el resultado
        resultado = suma(5, 20, 30); //van inmerso acá los valores que se pasan a parametros
                System.out.println(resultado);

    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}
