// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

public class Statistics
{
    private int bitRate;
    private int decodedFrames;
    private int droppedFrames;
    private int frameRate;
    private int renderedFrames;
    
    public int getDecodedFrames() {
        return this.decodedFrames;
    }
    
    public int getDroppedFrames() {
        return this.droppedFrames;
    }
    
    public int getFrameRate() {
        return this.frameRate;
    }
    
    public int getRenderedFrames() {
        return this.renderedFrames;
    }
    
    public int getVideoBitRate() {
        return this.bitRate;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Statistics: , bitRate=");
        k.append(this.bitRate);
        k.append(", frameRate=");
        k.append(this.frameRate);
        k.append(", decodedFrames=");
        k.append(this.decodedFrames);
        k.append(", droppedFrames=");
        k.append(this.droppedFrames);
        k.append(", renderedFrames=");
        k.append(this.renderedFrames);
        return k.toString();
    }
}
