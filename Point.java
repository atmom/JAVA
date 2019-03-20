package lesson6;

public class Point {
    public static void main(String[] args) {


        String s = "Предложение  один     Теперь предложение    два   Предложение   три";
        String s1 = s.replaceAll(" +", " ");
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s2.toString());
        for (int i = 1; i < s1.length(); i++) {

            if (s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {

               s2.setCharAt(i - 1, '.');

            }

        }
        for (int i = 0; i<s2.length(); i++){
          if(s2.charAt(i) == '.'){
              s2.insert(i+1," ");
          }
        }

        s2.append('.');
        System.out.println(s2.toString());
    }
}

