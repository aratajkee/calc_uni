package operations;

public class HexOrDec {

    private boolean isHex(char c) {
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

    private boolean isDec(char c) {
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

    private boolean checkIsHex(String input) {
        boolean isHex = true;
        for (char c : input.toCharArray()) {
            if (!isHex(c)) {
                isHex = false;
                break;
            }
        }
        return isHex;
    }

    private boolean checkIsDec(String input) {
        boolean isDec = true;
        for (char c : input.toCharArray()) {
            if (!isDec(c)) {
                isDec = false;
                break;
            }
        }
        return isDec;
    }

    public int checkIsHexOrDec(String input){

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

}
