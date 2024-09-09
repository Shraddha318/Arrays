public class StringSearch {
    public static void main(String[] args) {
        String name="Shraddha";
        char key='a';
        System.out.println(search(name,key));
    }
    static boolean search(String str,char key){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==key){
                return true;
            }
        }
        return false;
    }
}
