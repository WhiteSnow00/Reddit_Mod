// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.util.Locale;
import java.util.Objects;

public final class Quality
{
    private final int bitrate;
    private final String codecs;
    private final float framerate;
    private final int height;
    private final String name;
    private final int width;
    
    public Quality(final String name, final String codecs, final int bitrate, final int width, final int height, final float framerate) {
        this.name = name;
        this.codecs = codecs;
        this.bitrate = bitrate;
        this.width = width;
        this.height = height;
        this.framerate = framerate;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && Quality.class == o.getClass()) {
            final Quality quality = (Quality)o;
            if (this.bitrate != quality.bitrate || this.width != quality.width || this.height != quality.height || Float.compare(quality.framerate, this.framerate) != 0 || !this.name.equals(quality.name) || !this.codecs.equals(quality.codecs)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public int getBitrate() {
        return this.bitrate;
    }
    
    public String getCodecs() {
        return this.codecs;
    }
    
    public float getFramerate() {
        return this.framerate;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.codecs, this.bitrate, this.width, this.height, this.framerate);
    }
    
    @Override
    public String toString() {
        return String.format(Locale.ROOT, "name: %s, codecs %s, bitrate %d, resolution %d x %d framerate %.2f", this.name, this.codecs, this.bitrate, this.width, this.height, this.framerate);
    }
}
