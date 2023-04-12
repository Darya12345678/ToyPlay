import java.util.Random;
import java.util.stream.IntStream;
import java.io.*;




public class Main {
    public static void main(String[] args) {
        ReceivingToy receiving = new ReceivingToy();
        
        receiving.addToy(new Toy("Pigeon", "1"));
        receiving.addToy(new Toy("Fish", "1"));
        receiving.addToy(new Toy("Spider", "1"));
        receiving.addToy(new Toy("Kakapo", "1"));
        receiving.addToy(new Toy("Nunchaku", "1"));
        receiving.addToy(new Toy("AfroBarbie", "1"));
        receiving.addToy(new Toy("Snake", "1"));
        receiving.addToy(new Toy("JackieChanDoll", "1"));
        receiving.addToy(new Toy("SocketsToy", "1"));
        receiving.addToy(new Toy("UFO", "1"));
    


    
        String[] number = new String[] {"Pigeon", "Fish", "Spider", "Kakapo", "AfroBarbie", "Snake", "JackieChanDoll", "SocketsToy", "UFO", "NunChaku"}; // Игрушки
        int[] chance = new int[] {5, 5, 5, 5, 1, 5, 5, 4, 7, 10}; // Количество выпаданий игрушки

        int count = IntStream.of(chance).sum(); // Подсчёт количества элементов списка

        // Вывод вероятностей:
        for (int i = 0; i < chance.length; i++) {
            System.out.println("Вероятность выпадания игрушки \"" + number[i] + "\":  \t" + (chance[i]*100d/count) + "%");
        }
        
        // Генерация случайного числа
        Random random = new Random();
        for (int randomNumsCount = 0; randomNumsCount < 10; randomNumsCount++) {
            
            int index = random.nextInt(count); 

            for (int i = 0; i < chance.length; i++) { 
                index -= chance[i];
                if(index < 0) {
                    
                System.out.println("Выдана игрушка: " + receiving.outputToy(receiving.findToy(number[i]).get(0)));
                try(FileWriter writer = new FileWriter("notes.txt", false))
        {
            String text = "Выдана игрушка: " + number[i];
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 

                break;
            }
            
            
        }
       }
    }
}

