package Encapsulation;

class BloodData {
    //Instance Variables String fields
    private String bloodType; //A, B, AB or O //A
    private String rhFactor; //+ or -

    //setter methods
    public void setBloodType(String bt){
        this.bloodType = bt;
    }
    public void setRhFactor(String rh){
        this.rhFactor = rh;
    }

    //getter methods
    public String getBloodType(){
        return bloodType;
    }
    public String getRhFactor(){
        return rhFactor;
    }

}
