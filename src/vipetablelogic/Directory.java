package vipetablelogic;

import java.io.Serializable;
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
public class Directory implements Serializable{

    ArrayList<VipeFile> files;
    int[] sectors;

    public Directory(ArrayList<VipeFile> file, int[] sect) {
        files = file;
        sectors = sect;
    }

    public ArrayList<VipeFile> getFiles() {
        return files;
    }

    public ArrayList<Chunk> getChunks(int fileID) {
        ArrayList<Chunk> chunks = new ArrayList<>();
        boolean startedChunk = false;
        int start = 0;
        int end = 0;
        for (int i = 0; i < sectors.length; i++) {
            if (sectors[i] == fileID && !startedChunk) {
               start = i;
               startedChunk = true;
            }
            if (i < sectors.length - 1 && sectors[i+1] != fileID && startedChunk) {
                end = i;
                startedChunk = false;
                chunks.add(new Chunk(start + 1, end + 1));
            }
        }

        return chunks;
    }

    public void addFile(VipeFile file) {
        
        
        int size = file.getFileSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sectors.length; j++) {
                if (sectors[j] == 0) {
                    sectors[j] = file.getFileID();
                    break;
                }
            }
        }
        
        file.setChunks(getChunks(file.getFileID()));
        
        files.add(file);

    }
    
    public void deleteFile(int id) {
        for (int i = 0; i < sectors.length; i++) {
            if (sectors[i] == id) {
                sectors[i] = 0;
            }
        }
        
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getFileID() == id) {
                files.remove(i);
            }
        }
    }
    
    public void editFile(int id, int size, String name) {
        int diff;
        int index = -1;
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getFileID() == id) {
                index = i;
                break;
            }
        }
        
       
        
        if (files.get(index).getFileSize() == size)
            return;
        
        if (files.get(index).getFileSize() < size) {
            diff = size - files.get(index).getFileSize();
            
            for (int i = 0; i < diff; i++) {
                if (sectors[files.get(index).getChunk(files.get(index).chunks.size() - 1).getEndIndex() + i] != 0) {
                    diff++;
                }
                else {
                    sectors[files.get(index).getChunk(files.get(index).chunks.size() - 1).getEndIndex() + i] = id;
                }
            }
            
            /*for (int i = 0; i < diff; i++) {
                for (int j = 0; j < sectors.length; j++) {
                    if (sectors[j] == 0) {
                        sectors[j] = id;
                        break;
                    }
                }
            }*/
        }
        
        else {
            int endofdelete = 0;
            diff = files.get(index).getFileSize() - size;
            for (int i = diff; i > endofdelete; i--) {
                if (sectors[files.get(index).getChunk(files.get(index).chunks.size() - 1).getEndIndex() - 1] != id) {
                    endofdelete--;
                }
                else {
                    sectors[files.get(index).getChunk(files.get(index).chunks.size() - 1).getEndIndex() - i] = 0; 
                }
            }
        }
        
        files.get(index).setFileName(name);
        files.get(index).setFileSize(size);
        files.get(index).setChunks(getChunks(id));
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
