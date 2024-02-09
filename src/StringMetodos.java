public class StringMetodos {
    public static void main(String[] args) {

        String nome = "Eduardo Lima";
        System.out.println(nome);
        System.out.println("nome.equals(\"Eduardo\") = " + nome.equals("Eduardo"));
        System.out.println("nome.length() = " + nome.length());
        System.out.println("nome.charAt(0) = " + nome.charAt(0));
        System.out.println("nome.indexOf('d') = " + nome.indexOf('d'));
        System.out.println("nome.isEmpty = " + nome.isEmpty());
        System.out.println("nome.isBlank = " + nome.isBlank());
        System.out.println("nome.toUpperCase() = " + nome.toUpperCase());
        System.out.println("nome.toLowerCase() = " + nome.toLowerCase());
        System.out.println("nome.trim() = " + nome.trim());
        System.out.println("nome.replace('a', 'o') = " + nome.replace('a', 'o'));
    }
}
