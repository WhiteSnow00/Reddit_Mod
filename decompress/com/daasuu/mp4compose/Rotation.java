// 
// Decompiled by Procyon v0.6.0
// 

package com.daasuu.mp4compose;

public enum Rotation
{
    private static final Rotation[] $VALUES;
    
    NORMAL(0), 
    ROTATION_180(180), 
    ROTATION_270(270), 
    ROTATION_90(90);
    
    private final int rotation;
    
    private Rotation(final int rotation) {
        this.rotation = rotation;
    }
    
    public static Rotation fromInt(int i) {
        int n = i;
        if (i > 360) {
            n = i - 360;
        }
        final Rotation[] values = values();
        int length;
        Rotation rotation;
        for (length = values.length, i = 0; i < length; ++i) {
            rotation = values[i];
            if (n == rotation.getRotation()) {
                return rotation;
            }
        }
        return Rotation.NORMAL;
    }
    
    public int getRotation() {
        return this.rotation;
    }
}
