package vipetablelogic;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnson_849323
 */
public class Chunk implements Serializable {
    private int startIndex;
    private int endIndex;
    
    public Chunk(int s, int e) {
        setStartIndex(s);
        setEndIndex(e);
    }
    
    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    @Override 
    public String toString() {
        /* Holds index reference for specific span of sector data
        [<startIndex>-<endIndex>]
		Example: [0-6] 
        */
        return "[" + startIndex + "-" + endIndex + "]";
    }
}
