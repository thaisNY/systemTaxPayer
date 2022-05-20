package entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;

    public TaxPayer(){

    }
    public TaxPayer(String name, Double anualIncome){
        super();
        this.anualIncome = anualIncome;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Double getAnualIncome(){
        return anualIncome;
    }
    public void setAnualIncome(Double anualIncome){
        this.anualIncome = anualIncome;
    }

    public abstract double tax();
}
