// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import b5.k;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class MovieFragmentHeaderBox extends AbstractFullBox
{
    public static final String TYPE = "mfhd";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private long sequenceNumber;
    
    static {
        ajc$preClinit();
    }
    
    public MovieFragmentHeaderBox() {
        super("mfhd");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("MovieFragmentHeaderBox.java", (Class)MovieFragmentHeaderBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        ajc$tjp_1 = (a)b.f(b.e("setSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 63);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.sequenceNumber = xd.a.U0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.sequenceNumber);
    }
    
    public long getContentSize() {
        return 8L;
    }
    
    public long getSequenceNumber() {
        m5.a.s(b.b(MovieFragmentHeaderBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.sequenceNumber;
    }
    
    public void setSequenceNumber(final long sequenceNumber) {
        m5.a.s(b.c(MovieFragmentHeaderBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Long(sequenceNumber)));
        this.sequenceNumber = sequenceNumber;
    }
    
    public String toString() {
        return k.k(b.p(b.b(MovieFragmentHeaderBox.ajc$tjp_2, (Object)this, (Object)this), "MovieFragmentHeaderBox{sequenceNumber="), this.sequenceNumber, '}');
    }
}
