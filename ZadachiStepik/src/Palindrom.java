// Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//    Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая
//    читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки
//    должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
//    Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
//    Т.е. русских, китайских и прочих экзотических символов в строке не будет.
//    Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//    Подсказки (не читайте, если хотите решить сами):
//    для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением
//    "[^a-zA-Z0-9]"; найдите в классе String метод, выполняющий замену по регулярному выражению;
//    для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в
//    классе StringBuilder;
//    в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
//    Sample Input:
//    Madam, I'm Adam!
//    Sample Output:
//           true

/**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param  //text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */

class Palindrome {

    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

    public static void main(String[] args) {
        isPalindrome("kazak");
        System.out.println(isPalindrome("kazak"));
    }
}



//class Strb {
//
//    static public void main(String...string)  {
//        StringBuilder s1 = new StringBuilder("Test");
//        StringBuilder s2 = new StringBuilder("Test1");
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2)); //Line 1
//        System.out.println(s1.toString()==s2.toString()); //Line 2
//        if(s1.toString()==s2.toString())System.out.println("True"); //Line 3
//
//        isPalindrome("kazak");
//    }
//
//    public static boolean isPalindrome(String text) {
//        return ...; // your implementation here














