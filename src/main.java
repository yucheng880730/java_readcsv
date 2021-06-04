import java.io.*;
import java.util.ArrayList;



public class main {
    public static void main(String[] args) {


        ArrayList<creatures> land = new ArrayList<>();
        ArrayList<creatures> water = new ArrayList<>();

        try {

            BufferedReader isr = new BufferedReader(new FileReader("C:\\Users\\yucheng\\Desktop\\readcsv_test\\creatures2.csv"));
            BufferedReader reader = new BufferedReader(isr);

            String line;

            while ((line = reader.readLine()) != null) {

                String[] item = line.split(",");

                String data1 = item[0].trim();
                String data2 = item[1].trim();
                String data3 = item[2].trim();
                String data4 = item[3].trim();
                String data5 = item[4].trim();
                //System.out.println(data1+"\t"+ data2+"\t"+ data3+"\n"+data4+"\n"+data5+"\n");


                if (data5.equals("terrestrial")) {

                    creatures creatures = new creatures(data1, data2, data3, data4);
                    creatures.name = data1;
                    creatures.sound = data2;
                    creatures.consume = data3;
                    creatures.speed = data4;
                    land.add(creatures);

                } else if (data5.equals("aquatic")) {

                    creatures creatures2 = new creatures(data1, data2, data3, data4);
                    creatures2.name = data1;
                    creatures2.sound = data2;
                    creatures2.consume = data3;
                    creatures2.speed = data4;
                    water.add(creatures2);

                } else {

                    creatures creatures3 = new creatures(data1, data2, data3, data4);
                    creatures3.name = data1;
                    creatures3.sound = data2;
                    creatures3.consume = data3;
                    creatures3.speed = data4;

                }

            }

            System.out.println(land);
            System.out.println(water);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

