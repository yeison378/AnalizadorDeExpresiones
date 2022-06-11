public class Main {
    public static void main(String[] args) throws Excepciones {
        Analizador analizador = new Analizador();
        System.out.println(analizador.evaluar("(2*2)^2"));
        System.out.println(analizador.evaluar("1+4*3-2^3"));
    }
}
