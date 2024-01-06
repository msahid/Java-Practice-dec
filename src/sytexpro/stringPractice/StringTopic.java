package sytexpro.stringPractice;

public class StringTopic {
    public static void main(String[] args) {
        String syntex = "Syentex";
        String code = "pro";

        String brand = syntex + code;
        System.out.println(brand);

        System.out.println(brand.isBlank());
        System.out.println(brand.toLowerCase());
    }
}
