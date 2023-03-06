public class Main {
    private static boolean isHex(char c) {
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return true;
            default:
                return false;
        }
    }

    private static boolean isDec(char c) {
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    public static boolean checkIsHex(String input) {
        boolean isHex = true;
        for (char c : input.toCharArray()) {
            if (!isHex(c)) {
                isHex = false;
                break;
            }
        }
        return isHex;
    }

    public static boolean checkIsDec(String input) {
        boolean isDec = true;
        for (char c : input.toCharArray()) {
            if (!isDec(c)) {
                isDec = false;
                break;
            }
        }
        return isDec;
    }

    public static int checkIsHexOrDec(String input){

        if(checkIsHex(input)){
            if(checkIsDec(input)){
                return 2;
            }else {
                return 1;
            }
        }else {
            if(checkIsDec(input)){
                return 2;
            }else {return 0;}
        }
    }
    public static void main(String[] args) {

        String inp = "98312475619238746";
        switch (checkIsHexOrDec(inp)){
            case 2:
                System.out.println(inp + " is decimal");
                break;

            case 1:
                System.out.println(inp + " is hex");
                break;
            case 0:
                System.out.println(inp + " is wrong input");
                break;
        }
    }
}
