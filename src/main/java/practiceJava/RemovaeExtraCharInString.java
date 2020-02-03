package practiceJava;

public class RemovaeExtraCharInString {

	public static void main(String[] args) {

    String str="ajjahwur543636848r12$###$*&";
    System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
