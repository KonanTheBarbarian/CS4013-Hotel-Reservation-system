package HotelReservationSystem;

import HotelReservationSystem.Reservation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadData{

  public readcsv() throws IOException{
        String file = "I4Hotels.csv";
        String line;
        ArrayList<String> lines = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                List values = Arrays.asList(line.split(", "));
                lines.add(values);
            }
            lines.forEach(l -> System.out.println(l));
        } catch (Exception e){
            System.out.println(e);
            }
        }
     }
