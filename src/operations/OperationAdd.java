package operations;

public class OperationAdd implements IOperation{
    HexOrDec checker;
    In
    @Override
    public void calculate(String a, String b){
        checker = new HexOrDec();

        int behavior = checker.checkIsHexOrDec(a);

        switch (behavior){
            case 2:
                System.out.println("Результат сложения десятичных чисел " + a +" и " +b " = " (a+));
        }
    }
}
