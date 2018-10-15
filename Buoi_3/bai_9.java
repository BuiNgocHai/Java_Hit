import java.util.Scanner;

public class bai_9{
    public static void main(String[] args){
        String str,str1= "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap: ");
        str = sc.nextLine();
        str = str.trim();
        str =str.replace(".", ". ");
        str = str.replace(" .", ".");
        str = str.replaceAll("\\s+"," ");
        
        str = str.toLowerCase();
        str1 += Character.toUpperCase(str.charAt(0));
        
        for(int i=1;i<str.length();i++){
            if(i>2 && str.charAt(i-2)=='.'){
                str1+= Character.toUpperCase(str.charAt(i));
            }
            else{
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}