package src.Lv1.q72410;

class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        new_id = new_id.replaceAll("[^a-z0-9-_.]","");
        new_id = new_id.replaceAll("[.]+",".");
        new_id = new_id.replaceAll("^\\.","");
        new_id = new_id.replaceAll("\\.$","");

        if(new_id.length()==0){
            new_id = "a";
        }
        if(new_id.length()>15) {
            new_id = new_id.substring(0, 15);
        }
        System.out.println(new_id);
        new_id = new_id.replaceAll("\\.$","");
        System.out.println(new_id);
        if (new_id.length()<3){
            while(new_id.length()<3){
                new_id += new_id.charAt(new_id.length()-1);
            }
        }



        return new_id;
    }
}

public class Main {
    public static void main(String[] args) {
//        String new_id = "...!@BaT#*..y.abcdefghijklm";
//        String new_id = "abcdefghijklmn.p";
        String new_id = "=.=";
        Solution solution = new Solution();
        System.out.println(solution.solution(new_id));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
