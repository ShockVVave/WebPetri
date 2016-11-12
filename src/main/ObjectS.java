package main;

import java.util.ArrayList;

/**
 * Created by Денис on 05.11.2016.
 */
public class ObjectS {

    private float ownVer;
    private ArrayList <ArrayList> ObjectListS= new ArrayList<ArrayList>();
    private float tekVer;

    public float getTekVer() {
        return tekVer;
    }

    public void setTekVer(float tekVer) {
        this.tekVer = tekVer;
    }

    public float getOwnVer() {
        return ownVer;
    }

    public void setOwnVer(float ownVer) {
        this.ownVer = ownVer;
    }

    public ArrayList<ArrayList> getObjectListS() {
        return ObjectListS;
    }

    public void setObjectListS(ArrayList<ArrayList> objectListS) {
        ObjectListS = objectListS;
    }


ObjectS(float ownVer){
    this.ownVer=ownVer;
    ArrayList own = new ArrayList();
    own.add(this);
    own.add(ownVer);
    ObjectListS.add(own);
    System.out.println(ownVer);
}

public void addObjectS(ObjectS a, float b){
    ArrayList them = new ArrayList();
    them.add(a);
    them.add(b);
    ObjectListS.add(them);
    }
    public void printS(){
        for(ArrayList  b:ObjectListS){
            for(Object c: b){
                System.out.println (c);
            }
        }
    }


}
