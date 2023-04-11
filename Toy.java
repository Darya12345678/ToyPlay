public class Toy{
    private String name;
    private String amount;

    
    public Toy(String name,String amount){     //конструктор 
        this.name = name;
        this.amount = amount;
    }
    public Toy(){
        this("0","0");
    }

    @Override
    public String toString() {
         return String.format("наименование %s количество %s ",name,amount.toString());  
}

    public String getName(){
    return name;
}

    public String getAmount(){
    return amount;
}

    @Override
    public boolean equals(Object obj){
    return(this.name.equals(((Toy)obj).name) && this.amount == (((Toy)obj).amount));
}
}