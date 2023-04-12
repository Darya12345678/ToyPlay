
import java.util.ArrayList;
import java.util.List;

public class ReceivingToy {
    protected List<Toy> localList = new ArrayList<Toy>();  //список игрушек

    public List<Toy> getLocalList(){
        return localList;                                         //получение списка
    }


    public ReceivingToy addToy(Toy inputToy){
    localList.add(inputToy); 
    return this;
    } // добавление игрушки


    @Override
    public String toString(){
        StringBuilder localString = new StringBuilder();
        for (Toy toy : localList){
            localString.append(toy.toString());       
            localString.append("\n");
        }
        return localString.toString();
    }


    public List<Toy> findToy(String name){
        List<Toy> foundToy = new ArrayList<>();
        for(Toy toy : localList){
            {
                foundToy.add(toy);
            }
        }
        return foundToy;
    }

    public Toy outputToy(Toy outputingToy) {
        Toy outputToy = new Toy();                         //создается выдаваемая игрушка 
        if (localList.contains(outputingToy)) {
            for (int i = 0; i < localList.size(); i++) {
                if (localList.get(i) == outputingToy) {
                    outputToy = localList.get(i);
                    localList.remove(i);
                    
                    return outputToy;
                }
            }
        }
    
        return outputToy;
     }
}



