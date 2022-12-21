import javax.swing.*;

public class InputSum {
    Double num = 0.0;
    Double outInt = 0.0;

    //int sum=0;
    public void sum(Double d) {
        Double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += d;
        }
        this.num = sum;
        return ;
    }


    private void JOptionPaneEx( ){
        int answer = JOptionPane.showConfirmDialog(null, this.num, "confirm",JOptionPane.YES_NO_OPTION );
        if(answer==JOptionPane.YES_OPTION){  //사용자가 yes를 눌렀을 경우
            System.out.println("프로그램을 종료합니다.");
        } else{  //사용자가 Yes 이외의 값을 눌렀을 경우
            System.out.println("종료를 취소합니다.");
        }
    }//JOptionPaneEx
    /*

           public JOptionPaneEx(){
               JOptionPane.showMessageDialog(this, "조심하십시오!", "Message",JOptionPane.ERROR_MESSAGE );
           }

           public JOptionPaneEx(){
               JOptionPane.showMessageDialog(this, "조심하십시오!", "Message",JOptionPane.ERROR_MESSAGE );
           }

    */
    public static void main(String[] args) {
        //Scanner  sc = new Scanner(System.in);
        InputSum t = new InputSum();

        while (true) {
            try {
                //System.out.println("원하시는 값을 입력 해주세요");
                //String st = sc.nextLine();
                //int outInt = Integer.parseInt(st);
                String in = JOptionPane.showInputDialog("원하는 숫자를 입력해주세요");
                if (in != null) {
                    //t.outInt = Double.parseDouble(in);
                    double d =  Double.parseDouble(in);
                    t.sum(d);
                } else {

                }

                t.JOptionPaneEx();
                System.out.println("=============================");
                System.out.println("출력(" + t.num + ")값");
                System.out.println("=============================");
                break;
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }


        }//while
        //sc.close();

    }//main
}//class