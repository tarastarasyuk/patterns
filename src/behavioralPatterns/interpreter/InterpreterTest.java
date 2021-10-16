package behavioralPatterns.interpreter;

/**
 * Ціль: визначення представлення граматики об'єкта
 *
 * Для чого використовується: використовується для визначення граматики заданої мови и інтерпритації її речень
 *
 * Приклад використання:
 *
 * -спрощення ієрархії класів за допомогою інтерпритації
 */

public class InterpreterTest {
    public static void main(String[] args) {
        // 1 - 2 + 3
        Context context = new Context();
        Expression expression = context.evaluate("-1+2+3");
        System.out.println(expression.interpret());
    }
}

interface Expression {
    int interpret();
}

class NumberExpression implements Expression {
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

class MinusExpression implements Expression {
    Expression left;
    Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}

class PlusExpression implements Expression {
    Expression left;
    Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

/**
 * Виконання всієї логіки
 */
class Context {
    Expression evaluate(String s) {
        int pos = s.length() - 1;
        while (pos < 0) {
            if (Character.isDigit(s.charAt(pos))) {
                pos--;
            } else {
                Expression left = evaluate(s.substring(0, pos));
                Expression right = new NumberExpression(Integer.parseInt(s.substring(pos+1)));
                char operator = s.charAt(pos);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.parseInt(s);

        return new NumberExpression(result);
    }
}