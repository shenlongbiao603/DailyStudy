package utils;

/**
 * alphabet handling utils
 */
public class AlphabetUtils {

    // eg:aabcccbbad
    public static void removeTheSameAlphabet(String inputStr) {
        StringBuffer stringBuffer = new StringBuffer(inputStr);
        StringBuffer alphabets = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        boolean flag;
        do{
            flag = false;
            int i = 0;
            while (i<stringBuffer.length()){
                String index = "";
                int j = i;
                while (j<stringBuffer.length() && stringBuffer.charAt(j)== stringBuffer.charAt(i)) {
                    index = stringBuffer.charAt(j)+"";
                    j++;
                }
                int count = j-i;
                if (count >= 3) {
                    String substring = stringBuffer.substring(i, j);
                    int i1 = 0;
                    if (alphabets.indexOf(index) > 0) {
                        i1 = alphabets.indexOf(index) - 1;
                    }
                    char replace = alphabets.charAt(i1);
                    if (i == 0 && i1 == 0) {
                        stringBuffer = stringBuffer.replace(i,j,"");
                    } else {
                        stringBuffer = stringBuffer.replace(i,j,replace+"");
                    }
                    flag = true;
                    System.out.println(stringBuffer.toString()+","+substring+" is replaced by "+replace);
                    i = 0;
                } else i++;
            }
        } while (flag);
    }

    public static void replaceTheSameAlphabet(String inputStr) {
        StringBuffer stringBuffer = new StringBuffer(inputStr);
        boolean flag;
        do{
            flag = false;
            int i = 0;
            while (i<stringBuffer.length()){
                int j = i;
                while (j<stringBuffer.length() && stringBuffer.charAt(j)== stringBuffer.charAt(i)) {
                    j++;
                }
                int count = j-i;
                if (count >= 3) {
                    stringBuffer.delete(i,j);
                    flag = true;
                    System.out.println(stringBuffer.toString());
                    i = 0;
                } else i++;
            }
        } while (flag);
    }



}
