public class demo11{
    public static void main(String[] args) {
        int qcode = 4;
        int scode = 1;
        int yop = 2027;
        double perc = 75.4;
        if((qcode == 1|| qcode ==2) && (scode ==1 || scode ==2 || scode == 5) && (yop == 2025 || yop == 2026) && (perc >=60))
        {
            System.out.println("Eligible for interview");
        }
        else {
            System.out.println("Not eligible for interview");
            if(qcode!=2 && qcode!=1) {System.out.println("qualification not matching");}
            if(scode!=1 && scode!=2 && scode!=5){System.out.println("stream not matching");}
            if(yop!=2025 && yop!=2026){System.out.println("yop not matching");}
            if(perc<60){System.out.println("percentage not matching");}
        }
    }
}