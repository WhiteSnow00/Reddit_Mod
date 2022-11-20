// 
// Decompiled by Procyon v0.6.0
// 

package com.daasuu.mp4compose;

public enum VideoFormatMimeType
{
    private static final VideoFormatMimeType[] $VALUES;
    
    AUTO(""), 
    AVC("video/avc"), 
    H263("video/3gpp"), 
    HEVC("video/hevc"), 
    MPEG4("video/mp4v-es");
    
    private final String videoFormatMimeType;
    
    private VideoFormatMimeType(final String videoFormatMimeType) {
        this.videoFormatMimeType = videoFormatMimeType;
    }
    
    public String getFormat() {
        return this.videoFormatMimeType;
    }
}
