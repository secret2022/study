public class Wrapper {


    public static void main(String[] args){

        String sc = Character.toString('1');
        String sd = Double.toString(12.14);
        String ss = Long.toString(1234567890);

        String si = Integer.toString(12345);
        int it =  Integer.parseInt(si);
        Integer It = Integer.valueOf(it);

        System.out.println("Wrapper : "+It+" 입니다.");

    }//main
}//Wrapper