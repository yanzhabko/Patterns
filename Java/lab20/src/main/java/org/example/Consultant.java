package org.example;

public class Consultant {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity(){
        if(activity instanceof Advise){
            activity=new Create();
        }else if( activity instanceof Create){
            activity=new Repair();
        }else if(activity instanceof Repair){
            activity=new Rest();
        }else if(activity instanceof Rest){
            activity=new Advise();
        }
    }
    public void doWork(){
        activity.doActivity();
    }
}
