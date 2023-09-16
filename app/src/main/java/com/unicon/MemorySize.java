package com.unicon;

public abstract class MemorySize {

    protected double value;


    static double kilo = 1024;
    static double mega = kilo * kilo;
    static double giga = mega * kilo;
    static double tera = giga * kilo;

    public MemorySize(double value){
        this.value = value;
    }

    abstract double toBits();
    abstract double toByte();
    abstract double toKb();
    abstract double toMb();
    abstract double toGb();
    abstract double toTb();

}

class Bits extends MemorySize{
    public Bits(double value) {
        super(value);
    }

    public double toBits(){
        return value;
    }

    public double toByte(){
        return value / 8;
    }

    public double toKb(){

        return (value / 8) / kilo;
    }

    public double toMb(){

        return (value / 8) / mega;

    }

    public double toGb(){

        return (value / 8) / giga;
    }

    public double toTb() {

        return (value / 8) / tera;
    }
}

class Byte extends MemorySize{
    public Byte(double value) {
        super(value);
    }

    public double toBits(){

        return value * 8;
    }

    public double toByte(){

        return value;
    }

    public double toKb(){

        return value / kilo;
    }

    public double toMb(){

        return value / mega;
    }

    public double toGb(){

        return value / giga;
    }

    public double toTb(){

        return value / tera;
    }
}

class KiloBytes extends MemorySize{

    public KiloBytes(double value) {
        super(value);
    }

    public double toBits(){

        return value * mega * 8;
    }

    public double toByte(){

        return value * kilo;
    }

    public double toKb(){

        return value;
    }

    public double toMb(){

        return value / kilo;
    }

    public double toGb(){

        return value / mega;
    }

    public double toTb(){

        return value / giga;
    }
}

class MegaByte extends MemorySize{
    public MegaByte(double value) {
        super(value);
    }

    public double toBits(){

        return value / mega * 8;

    }

    public double toByte(){

        return value * mega;
    }

    public double toKb(){

        return value * kilo;
    }

    public double toMb(){

        return value;
    }

    public double toGb(){

        return value / kilo;
    }

    public double toTb(){

        return value / mega;
    }

}

class GigaByte extends MemorySize{

    public GigaByte(double value) {
        super(value);
    }

    public double toBits(){

        return value * giga * 8;
    }

    public double toByte(){

        return value * giga;
    }

    public double toKb(){

        return value * mega;
    }

    public double toMb(){

        return value * kilo;
    }

    public double toGb(){

        return value;
    }

    public double toTb(){

        return value / kilo;
    }
}

class TeraByte extends MemorySize{
    public TeraByte(double value) {
        super(value);
    }

    public double toBits(){

        return value * tera * 8;
    }

    public double toByte(){

        return value * tera;

    }

    public double toKb(){

        return value * giga;
    }

    public double toMb(){

        return value * mega;
    }

    public double toGb(){

        return value * kilo;
    }

    public double toTb(){

        return value;
    }
}
