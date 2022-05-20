package entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployee;
    public Company(){

    }
    public Company(String name, Double anualIncome, Integer numberOfEmployee){
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }
    public Integer getNumberOfEmployee(){
        return numberOfEmployee;
    }
    public void setNumberOfEmployee(){
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public double tax(){
        if(getNumberOfEmployee() > 10){
            return getAnualIncome() * 0.14;
        }
        else{
            return getAnualIncome() * 0.16;
        }
    }
}
