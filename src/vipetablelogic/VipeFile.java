package vipetablelogic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author johnson_849323
 */
public class VipeFile implements Serializable{
    /*A data class that keeps track of chunks as they are allowcated across the directory
    then displayed in the directory. Will contain file id, name, color, size and chunks
    */

   ArrayList<Chunk> chunks;
   int fileSize;
   String fileName;
   Color sectorColor;
   int fileID;

    public VipeFile(int size, String name, Color color, int fileID) {
        setFileSize(size);
        setFileName(name);
        setSectorColor(color);
        this.fileID = fileID;
        
        chunks = new ArrayList<Chunk>();
        
        // Serialize fileID
        
        
    }
   
    public ArrayList<Chunk> getChunks() {
        return chunks;
    }
    
    public Chunk getChunk(int ind) {
        return chunks.get(ind);
    }
    
    public void setChunks(ArrayList<Chunk> chunks) {
        this.chunks = chunks;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Color getSectorColor() {
        return sectorColor;
    }

    public void setSectorColor(Color sectorColor) {
        this.sectorColor = sectorColor;
    }

    public int getFileID() {
        return fileID;
    }
    
    private String getColorName(Color col) {
        if (col.getRed() == 255 && col.getRed() == 255 && col.getRed() == 255)
            return "White";
        return "";
    }

   @Override
   public String toString() {
       /* Dispays file id, name, color, size and chunks
       <fileID> <fileName> (<sectorColor>, <fileSize>s)
          <chunks...>
       Example:
        1 Quiz.doc (Red, 15s)
        [0-6] [12-18] [39-40]
       */
       String cstrings = "";
       for (int i = 0; i < chunks.size(); i++) {
           cstrings += "<" + chunks.get(i) + "> ";
       }
       return "" + fileID + " " + fileName + " (" + getColorName(sectorColor) + ", " + fileSize + "s) " + cstrings;
   }
}
