public class stringmethod {
    public static void main(String[] args) {
        String stringVariable="loream ipsum";
        System.out.println(stringVariable.contains("lorggggg"));
        System.out.println(stringVariable.equalsIgnoreCase("LOREM IPSUM"));
        System.out.println(stringVariable.indexOf("l"));
        System.out.println(stringVariable.isEmpty());
        System.out.println(stringVariable.length());
        System.out.println(stringVariable.substring(6));
        String trimmedString=stringVariable.trim();
        System.out.println(trimmedString);
    }   
}
