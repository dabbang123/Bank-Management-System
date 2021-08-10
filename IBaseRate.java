package bankAccountApp;

public interface IBaseRate {

    //Method to return base rate
    default double getBaseRate(){
        return 2.5;
    }



}
