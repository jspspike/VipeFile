package vipetablelogic;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnson_849323
 */
public class Directory {

    ArrayList<VipeFile> files;
    int[] sectors;
    
    
    
    public Directory(ArrayList<VipeFile> file, int[] sect) {
        files = file;
        sectors = sect;
    }

    public ArrayList<VipeFile> getFiles() {
        return files;
    }
    
    public void addFile(VipeFile file) {
        int chunkEnd = 0;
        ArrayList<Chunk> temp = new ArrayList<>();
        int start = 0, end = 0;
        int size = file.getFileSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sectors.length; j++) {
                if (sectors[j] == 0) {
                    if (chunkEnd == 0) {
                        start = j;
                        chunkEnd++;
                    }
                    
                    else if (sectors[j + 1] != 0) {
                        end = j;
                        chunkEnd = 0;
                        temp.add(new Chunk(start + 1, end + 1));
                    }
                    sectors[j] = file.getFileID();
                    break;
                }
            }
        }
        
        
        file.setChunks(temp);
        
        files.add(file);
        
        
        
        System.out.println(toString());
    }
    
    public void setFiles(ArrayList<VipeFile> files) {
        this.files = files;
    }

    public int[] getSectors() {
        return sectors;
    }

    public void setSectors(int[] sectors) {
        this.sectors = sectors;
    }

    @Override
    public String toString() {
        //Display @D array of directory values
        String output = "";
        
        for (int i = 0; i < sectors.length; i++) {
            if (i % 30 == 0) {
                output += "\n";
            }
            output += sectors[i];
        }
        return output;
    }
}
