package com.unicon;

public abstract class Angle {

    //attributes
    protected double value;
    protected final double pi = Math.PI;

    //constructor
    public Angle(double value) {
        this.value = value;
    }

    //abstract methods headers
    public abstract double toDegree();
    public abstract double toRadian();
}

//create subclass of Angle
class Degree extends Angle{
    //constructor that creates Degree object and assign the value measurement
    public Degree(double value){
        super(value);
    }

    //abstract methods with calculations (body)
    public double toDegree(){
        return value;
    }
    public double toRadian(){
        return (value * pi / 180);
    }
}

//create subclass of Angle
class Radian extends Angle{
    //constructor that creates Degree object and assign the value measurement
    public Radian(double value) {
        super(value);
    }

    //abstract methods with calculations (body)
    public double toDegree(){
        return(value * 180 / pi);
    }
    public double toRadian(){
        return value;
    }
}

