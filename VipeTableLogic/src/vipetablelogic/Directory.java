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
        sect = sect;
    }

    public ArrayList<VipeFile> getFiles() {
        return files;
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
