package main;

public class Prog {
    float S[][]={{3f/8f,1f/8f,1f/2f,0f},{1f/5f,3f/5f,0f,1f/5f},{3f/8f,0f,1f/2f,1f/8f },{0,1f/6f,1f/3f,1f/2f}};
    public int shag=5;

    public float[]  shag( float tekVer[]) {
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

        tekVer=promVer;
        return tekVer;
    }


}