// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.util.Objects;

public class TextMetadataCue extends Cue
{
    public static final String INBAND_METADATA_ID = "inband.metadata.live-video.net";
    public static final String METADATA_ID = "metadata.live-video.net";
    public final String description;
    public final String owner;
    public final String text;
    
    public TextMetadataCue(final long n, final long n2, final String description, final String text, final String owner) {
        super(n, n2);
        this.description = description;
        this.text = text;
        this.owner = owner;
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final TextMetadataCue textMetadataCue = (TextMetadataCue)o;
        if (!this.description.equals(textMetadataCue.description) || !this.text.equals(textMetadataCue.text) || !this.owner.equals(textMetadataCue.owner)) {
            b = false;
        }
        return b;
    }
    
    public int hashCode() {
        return Objects.hash(super.startTime, super.endTime, this.description, this.text, this.owner);
    }
}
