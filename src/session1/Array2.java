package session1;

public class Array2 {
    public static void main(String[] args) {
        char hexChar = 'a';
        int dec;

        if(hexChar >= '0' && hexChar<='9'){
            dec = hexChar -'0';
        }else if(hexChar >= 'A' && hexChar<= 'F'){
            dec =hexChar - 'A' +10;
        }else if (hexChar >= 'a' && hexChar <= 'f'){
            dec = hexChar - 'a' + 10 ;
        }else{
            
        }
    }
}
