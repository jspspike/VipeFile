/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vipetablelogic;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author johnson_849323
 */
public class VipeTableLogic {
    
    private Directory dir;
    int colors = 0;
    Scanner keyboard = new Scanner(System.in);
    
    public VipeTableLogic() {
        /*int hard[] = new int[600];
        for (int i = 5; i < 20; i++) {
            hard[i] = 5;
        }*/
        dir = new Directory(new ArrayList<>(), new int[600]);
        while (true) {
            System.out.println("ViperTable Functions:");
            System.out.println("\t 1) Add File");
            System.out.println("\t 2) Delete File");
            System.out.println("\t 3) Import File");
            System.out.println("\t 4) Edit File");
            System.out.println("\t 5) Display Grid");
            System.out.println("\t 6) Display Files");
 
            

            
            String choice = keyboard.next();
            
            switch (new Integer(choice)) {
                case 1:
                    try {
                        writeFile();
                    }
                    catch(IOException e) {
                        System.out.println("You're an idiot");
                    }
                    break;
                case 2:
                    deleteFile();
                    break;
                case 3:
                    deleteFile();
                    break;
                case 4:
                    editData();
                    break;
                case 5:
                    System.out.println(dir);
                    break;
                case 6:
                    System.out.println(dir.files.toString());
            }
        }
    }
    
    private String getChunkString(int fileID) {
        return "";
    }
    
    private int getAvailableSize() {
        return 0;
    }
    
    
    private int getNextColor(){
        //ToDo once we make GUI
        return 0;
    }
    
    private void addFile(int size, String name) {
        Color col = new Color(255,255,255);
        
        
        dir.addFile(new VipeFile(size, name, col, getNextID()));
        
    }
    
    public void writeGrid() {
        
    }
    
    private void deleteFile() {
        System.out.println(dir.files.toString());
        System.out.println("\t 1) FileID");
        System.out.println("\t 2) Name");
        String choice = keyboard.next();
            
        switch (new Integer(choice)) {
            case 1:
                System.out.println("\t Please type file ID");
                choice = keyboard.next();
                dir.deleteFile(new Integer(choice));
                break;
            case 2:
                System.out.println("\t Please type file name");
                choice = keyboard.next();
                for (int i = 0; i < dir.files.size(); i++) {
                    if (choice.equals(dir.files.size())) {
                        dir.deleteFile(dir.files.get(i).getFileID());
                        break;
                    }
                }
                break;
        }

    }
    
    private void editFile(int fileID, int sectorChange) {
        System.out.println(dir.files.toString());
        System.out.println("\t 1) FileID");
        System.out.println("\t 2) Name");
        String choice = keyboard.next();
        String name;
        int size;
            
        switch (new Integer(choice)) {
            case 1:
                System.out.println("\t Please type file ID");
                choice = keyboard.next();
                System.out.println("\t Eneter the new name");
                name = keyboard.next();
                System.out.println("\t Eneter the new size");
                size = new Integer(keyboard.next());
                dir.editFile(new Integer(choice), size, name);
                
                break;
            case 2:
                System.out.println("\t Please type file name");
                choice = keyboard.next();
                for (int i = 0; i < dir.files.size(); i++) {
                    if (choice.equals(dir.files.size())) {
                        System.out.println("\t Eneter the new name");
                        name = keyboard.next();
                        System.out.println("\t Eneter the new size");
                        size = new Integer(keyboard.next());
                        dir.editFile(dir.files.get(i).getFileID(), size, name);
                        break;
                    }
                }
                break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VipeTableLogic v1 = new VipeTableLogic();
    }

    private void writeData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void writeFile() throws IOException{ 
        System.out.println("\nPlease give the file name:");
        String name = keyboard.next();
        System.out.println("\nPlease give the file size:");
        int size = Integer.parseInt(keyboard.next());
        addFile(size, name);
        
    }

    private void editData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int getNextID() {
        //
        int max = 0;
        for (int i = 0; i < dir.files.size(); i++) {
            if (max < dir.files.get(i).getFileID()) {
                max = dir.files.get(i).getFileID();
            }
        }
        return max + 1;
    }
    

}
