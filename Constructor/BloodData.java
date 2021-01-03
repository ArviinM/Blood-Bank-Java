class BloodData {
    //Static String fields
    static String bloodType; //A, B, AB or O //A
    static String rhFactor; //+ or -

    //Default constructor with default values
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }

    //Overloaded Constructor
    public BloodData(String bt, String rh){
        this.bloodType = bt; //B
        this.rhFactor = rh; //-
    }

    public void display(){
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}
