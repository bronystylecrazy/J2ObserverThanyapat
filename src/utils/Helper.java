package utils;

import java.io.*;
import java.util.Scanner;

public class Helper {
    public static Helper instance;
    private Scanner scanner = new Scanner(System.in);

    public Helper(){
        instance = this;
    }

    public static Helper getInstance() {
        if(instance != null) return instance;
        return new Helper();
    }

    public static Scanner getScanner(){
        return getInstance().scanner;
    }

    public static int getIntegerInput(){
        return Integer.valueOf(getInput()); // This is a bad way to do this. I'll fix it later.
    }

    public static String getInput(){
        System.out.print("> ");
        return getScanner().nextLine();
    }

    public static String limit(String text, int count){
        if (text == null || text.isEmpty()) return "-";
        if (text.length() <= count) return text;
        return text.substring(0, Math.min(text.length(), count) - 3) + "...";
    }

    public static void writeObjectsToFile(String fileName, Object[] objects){
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(objects);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + fileName + ". Wrote " + objects.length + " object(s).");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object[] readObjectsFromFile(String fileName){
        try{
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object[] objects = (Object[]) in.readObject();
            in.close();
            fileIn.close();
            return objects;
        } catch (IOException e) {
            writeObjectsToFile(fileName, new Object[]{}); // Create file if not exists
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void clearScreen(){
        for(var i = 0; i < 50; i++) System.out.println();
    }
}
