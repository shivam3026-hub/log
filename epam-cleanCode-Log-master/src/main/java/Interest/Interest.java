package Interest;

public class Interest {
    private double principle;
    private double rate;
    private int time;

    public Interest(double principle, double rate, int time){
        this.principle=principle;
        this.rate=rate;
        this.time=time;
    }

    public double getSimpleInt(){
        return (principle*rate*time)/100;
    }

    public double getCompoundInt(){
        return principle*Math.pow(1+rate/100,time)-principle;
    }

}
