import java.util.*;

public class PasswordGenerator {
    public static List<Character> specialChars = new ArrayList<>(Arrays.asList('_', '!', ';', ':', ','));
    public static List<Character> numericChars = new ArrayList<>();
    public static List<Character> uppercaseChars = new ArrayList<>();
    public static List<Character> lowercaseChars = new ArrayList<>();

    static {
        for (char c = '0'; c <= '9'; ++c) {
            numericChars.add(c);
        }
        for (char c = 'A'; c <= 'Z'; ++c) {
            uppercaseChars.add(c);
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            lowercaseChars.add(c);
        } 
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int lenPass= Integer.parseInt(myObj.nextLine());
        System.out.println(lenPass);
        int lenFourth = Math.floorDiv(lenPass,4);
        System.out.println(lenFourth);
        List<Character> Password = new ArrayList<>();
        for (int i = 0; i < lenFourth;i++){
            Random randomizer = new Random();
            char random = uppercaseChars.get(randomizer.nextInt(uppercaseChars.size()));
            Password.add(random);
        }
        for (int i = 0; i < lenFourth;i++){
            Random randomizer = new Random();
            char random = numericChars.get(randomizer.nextInt(numericChars.size()));
            Password.add(random);
        }
        for (int i = 0; i < lenFourth;i++){
            Random randomizer = new Random();
            char random = specialChars.get(randomizer.nextInt(specialChars.size()));
            Password.add(random);
        }
        for (int i = 0; i < lenPass - 3*lenFourth;i++){
            Random randomizer = new Random();
            char random = lowercaseChars.get(randomizer.nextInt(lowercaseChars.size()));
            Password.add(random);
        }
        
        System.out.println(Password);
        Collections.shuffle(Password);
        StringBuilder sb = new StringBuilder();
 
        // Appends characters one by one
        for (Character ch : Password) {
            sb.append(ch);
        }
 
        // convert in string
        String string = sb.toString();
        System.out.println(string);
  }

}
