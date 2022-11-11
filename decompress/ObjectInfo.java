// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class ObjectInfo
{
    public int bbox_bottom;
    public int bbox_left;
    public int bbox_right;
    public int bbox_top;
    public int label;
    
    static {
        Covode.recordClassIndex(2810);
    }
    
    public ObjectInfo() {
        this.label = -1;
        this.bbox_left = -1;
        this.bbox_top = -1;
        this.bbox_right = -1;
        this.bbox_bottom = -1;
    }
    
    public ObjectInfo(final int label, final int bbox_left, final int bbox_top, final int bbox_right, final int bbox_bottom) {
        this.label = label;
        this.bbox_left = bbox_left;
        this.bbox_top = bbox_top;
        this.bbox_right = bbox_right;
        this.bbox_bottom = bbox_bottom;
    }
    
    public int getBBoxBottom() {
        return this.bbox_bottom;
    }
    
    public int getBBoxLeft() {
        return this.bbox_left;
    }
    
    public int getBBoxRight() {
        return this.bbox_right;
    }
    
    public int getBboxTop() {
        return this.bbox_top;
    }
    
    public int getLabel() {
        return this.label;
    }
    
    public void logData() {
    }
    
    public void setBBox(final int bbox_left, final int bbox_top, final int bbox_right, final int bbox_bottom) {
        this.bbox_left = bbox_left;
        this.bbox_top = bbox_top;
        this.bbox_right = bbox_right;
        this.bbox_bottom = bbox_bottom;
    }
    
    public void setLabel(final int label) {
        this.label = label;
    }
}
