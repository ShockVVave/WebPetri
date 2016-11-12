package main;

/**
 * Created by Денис on 05.11.2016.
 */
public class Main {



    public static void main(String []arg){

        ObjectS S1=new ObjectS(3f/8f);
        ObjectS S2=new ObjectS(3f/5f);
        ObjectS S3=new ObjectS(1f/2f);
        ObjectS S4=new ObjectS(1f/2f);
        S1.addObjectS(S2,1f/8f);
        S1.addObjectS(S3,1f/2f);
        S2.addObjectS(S1,1f/5f);
        S2.addObjectS(S4,1f/5f);
        S3.addObjectS(S1,3f/8f);
        S3.addObjectS(S4,1f/8f);
        S4.addObjectS(S2,1f/6f);
        S4.addObjectS(S3,1f/3f);

        S1.printS();
    }
}
/*public class Prog {
    float S[][]={{3f/8f,1f/8f,1f/2f,0f},{1f/5f,3f/5f,0f,1f/5f},{3f/8f,0f,1f/2f,1f/8f },{0,1f/6f,1f/3f,1f/2f}};
    public int shag=5;

    public void shag( float tekVer[]) {
        int i;
        for(i = 0; i<S.length; i++)
            System.out.printf("%7.3f", tekVer[i]);
        float promVer[] = {0f, 0f, 0f, 0f};
        System.out.println();

        for (int j = 0; j < tekVer.length; j++) {
            for ( i = 0; i < S.length; i++) {
                promVer[i] = promVer[i] + tekVer[j] * S[j][i];

            };

        }
        for(i = 0; i<S.length; i++)
        System.out.printf("%7.3f", promVer[i]);
        tekVer=promVer;
        System.out.println();
    }


}
public class Main2 {
    static Prog a =new Prog();
    static void cycle(float k[]){
        for(int i=0;i<9;i++){
            a.shag(k);
        }
    };
    public static void main(String[] args) {
        float tekVer1[]={1f,0f,0f,0f},tekVer2[]={0f,1f,0f,0f},tekVer3[]={0f,0f,1f,0f},tekVer4[]={0f,0f,0f,1f};
        cycle(tekVer1);
        cycle(tekVer2);
        cycle(tekVer3);
        cycle(tekVer3);




    }
}*/