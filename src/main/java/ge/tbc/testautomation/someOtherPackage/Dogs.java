package ge.tbc.testautomation.someOtherPackage;

import ge.tbc.testautomation.somePackage.Animals;

public class Dogs extends Animals {
    private String barkWhat;
    public void bark(){
        System.out.println("WHAFF");
    }

    public Dogs(){
        super("DOG");
//        this("WHAFF"); // AR SHEIDZLEBAA!!!
    }

    public Dogs(String barkWhat){
        this.barkWhat = barkWhat;
    }
}
