package com.maplestory;

public class MagicShield{
    private double radius;
    private double thickness;
    private String elementType;
    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_THICKNESS =5.0;
    private static int shieldCount = 0;
    public MagicShield(){
        this.radius=MagicShield.DEFAULT_RADIUS;
        this.thickness=MagicShield.DEFAULT_THICKNESS;
        this.elementType="Neutral";
        MagicShield.shieldCount++;
    }
    public MagicShield(double radius, double thickness, String elementType){
        if (MagicShield.isValidSize(radius)){
            this.radius=radius;
        }else{
            throw new IllegalArgumentException("Invalid radius");
        }
        if (MagicShield.isValidSize(thickness)){
            this.thickness=thickness;
        }else{
            throw new IllegalArgumentException("Invalid thickness");
        }
        if(elementType==null || elementType.equals("")){
            this.elementType="Neutral";
        }else{
            this.elementType=elementType;
        }
        MagicShield.shieldCount++;
    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        if (radius>=0){
            this.radius=radius;
        }else{
            throw new IllegalArgumentException("Invalid radius");
        }
    }

    public double getThickness(){
        return this.thickness;
    }

    public void setThickness(double thickness){
        if (thickness>=0){
            this.thickness=thickness;
        }else{
            throw new IllegalArgumentException("Invalid thickness");
        }
    }

    public String getElementType(){
        return this.elementType;
    }

    public void setElementType(String type){
        if (type==null || type.equals("")){
            this.elementType="Neutral";
        }else{
            this.elementType=type;
        }
    }

    public static double checkCoefficient(String elementType){
        double coefficient;
        if (elementType.equals("Fire")){
            coefficient=1.1;
        }else if(elementType.equals("Ice")){
            coefficient=1.2;
        }else if(elementType.equals("Light")){
            coefficient=1.3;
        }else if(elementType.equals("Dark")){
            coefficient=1.4;
        }else{
            coefficient=1.0;
        }
        return coefficient;
    }

    public double calculateDefensePower(){
        double defensePower = (this.radius*this.thickness)*checkCoefficient(this.elementType);
        return defensePower;
    }

    public double calculateManaCost(){
        double manaCost=this.radius*10+this.thickness*2;
        return manaCost;
    }

    public static int getShieldCount(){
        return MagicShield.shieldCount; //not using this here because it is a static method
    }

    public static boolean isValidSize(double size){
        return (size>=0); //double is primitive datatype, cannot be null so didn't check
    }

    public static double calculateDefensePower(double radius, double thickness, String elementType){
        double defensePower = (radius*thickness)*checkCoefficient(elementType);
        return defensePower;
    }

    public static double calculateManaCost(double radius, double thickness){
        double manaCost=radius*10+thickness*2;
        return manaCost;
    }

    @Override //this means that we are going to override this function (it is optional but is my habit)
    public String toString(){ //we can't use void to print here directly because toString is a method from object class, it must return String value
        return ("[MagicShield Info]\nElement Type: "+this.elementType+"\nRadius: "+this.radius+" m\nThickness: "+this.thickness+" cm\nDefense Power: "+calculateDefensePower()+"\nMana Cost: "+calculateManaCost()+"\n");
    }
}