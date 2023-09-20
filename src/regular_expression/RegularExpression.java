package regular_expression;

import java.util.regex.*;

public class RegularExpression {

    public void patternTest01() {
        String[] data = {"cat", "cAt", "c#", "cA", "co", "c1", "c12A", "disc",
                "abc", "bcd", "grade", "a", "g", "oo e", "c", "안녕하세요", "반갑습니다."};
        String[] patterns = {".*", "c[a-z]*", "c\\d", "c\\w", "c[a-zA-Z0-9]",
                "c.", "c.*", "[b-f].*", "[^a-d]", ".*a.*", ".*a.+", "[a-z]",
                ".*[a-c].*", ".*[^a-d].*", "^[a-z]*$", "^[ㄱ-ㅎ가-힣]*$",
                "^[ㄱ-ㅎ가-힣\\W]*$", "^[^ㄱ-ㅎ가-힣]*$"};

        for (String pattern : patterns) {
            Pattern  p = Pattern.compile(pattern);
            System.out.print("Pattern : " + pattern + "\n결과: ");

            for (String d : data) {
                Matcher m = p.matcher(d);
                if (m.matches()) System.out.print(d + ", ");
            }
            System.out.println();
        }
    }

    public void patternTest02() {
        String[] data = {"cat", "cAt", "c#", "cA", "co", "c1", "c12A", "disc",
                "abc", "bcd", "grade", "a", "g", "oo e", "c", "123", " .  ", "   ", "."};
        String[] patterns = {
                "^[\\w]*$", "^[\\W]*$", "^[\\d]*$", "^[\\D]*$", "^[\\s]*$", "^[\\S]*$"
        };

        for (String pattern : patterns) {
            Pattern  p = Pattern.compile(pattern);
            System.out.print("Pattern : " + pattern + ", 결과: ");

            for (String d : data) {
                Matcher m = p.matcher(d);
                if (m.matches()) System.out.print(d + ", ");
            }
            System.out.println();
        }

    }

    public void patternTest03() {
        String[] data = {"ccc", "abc","1", "12", "123", "1234", "12345", "a123"};
        String[] patterns = {
                "\\d{2,4}", "\\w\\d{3}", ".*\\d+", "[a-z]{1,}[0-9]+"
        };

        for (String pattern : patterns) {
            Pattern  p = Pattern.compile(pattern);
            System.out.print("Pattern : " + pattern + ", 결과: ");

            for (String d : data) {
                Matcher m = p.matcher(d);
                if (m.matches()) System.out.print(d + ", ");
            }
            System.out.println();
        }

    }

    public void patternTest04() {
        String[] data = {
                "a", "A", "c", "3", "f",
                "a2", "A1", "a!",
                "cat1", "a123", "a1234", "abc123", "abc!as", "dog!!cat",
                "123", "!g", "abc", "Abc", "coat", "cow", "c#", "boat", "dog",
                "강아지", "안녕하세요."
        };
        String[] patterns = {
                "[a-z]", "[c-z]", "[a-zA-Z]", "\\w", "[cf]",
                "[a-z][0-9]", "[a-zA-Z][0-9]", "\\w\\W", "c\\W", "[a-z]+",
                "[a-z]+\\d+", "[a-z]{1}\\d+", "[a-z]+\\d{2,3}", "\\w*[\\W]{1}\\w*", ".*\\W+.*",
                ".*", "c.*", "^[a-z]*$", "^[a-zA-Z]*$", "c[a-z].*", "[bd].*", "^[bd][\\w]*$",
                "^[ㄱ-ㅎ가-힣]*$", "^[ㄱ-ㅎ가-힣\\W]*$"
        };

        for (String pattern : patterns) {
            Pattern  p = Pattern.compile(pattern);
            System.out.print("Pattern : " + pattern + ", 결과: ");

            for (String d : data) {
                Matcher m = p.matcher(d);
                if (m.matches()) System.out.print(d + ", ");
            }
            System.out.println();
        }

    }

    public void splitTest() {
        String equation = "5+4-1*7+4-10+0";

        String[] split = equation.split("\\D");

        for (String sp : split) {
            System.out.println("sp = " + sp);
        }
    }

    public void replaceTest() {
        String eq1 = "5+4-";
        
        eq1 = eq1.replaceAll("[^0-9]", ".");
        System.out.println("eq1 = " + eq1);
    }

}
