// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import mt2.c;
import com.googlecode.mp4parser.e;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public abstract class ChunkOffsetBox extends AbstractFullBox
{
    private static final a ajc$tjp_0;
    
    static {
        ajc$preClinit();
    }
    
    public ChunkOffsetBox(final String s) {
        super(s);
    }
    
    private static void ajc$preClinit() {
        final b b = new b("ChunkOffsetBox.java", (Class)ChunkOffsetBox.class);
        ajc$tjp_0 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }
    
    public abstract long[] getChunkOffsets();
    
    public abstract void setChunkOffsets(final long[] p0);
    
    public String toString() {
        final c b = mt2.b.b(ChunkOffsetBox.ajc$tjp_0, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("[entryCount=");
        return a.q(sb, this.getChunkOffsets().length, "]");
    }
}
