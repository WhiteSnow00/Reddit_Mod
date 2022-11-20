// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class MovieFragmentRandomAccessOffsetBox extends AbstractFullBox
{
    public static final String TYPE = "mfro";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private long mfraSize;
    
    static {
        ajc$preClinit();
    }
    
    public MovieFragmentRandomAccessOffsetBox() {
        super("mfro");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("MovieFragmentRandomAccessOffsetBox.java", (Class)MovieFragmentRandomAccessOffsetBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", "", "", "", "long"), 56);
        ajc$tjp_1 = (a)b.f(b.e("setMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", "long", "mfraSize", "", "void"), 60);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.mfraSize = xd.a.U0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.mfraSize);
    }
    
    public long getContentSize() {
        return 8L;
    }
    
    public long getMfraSize() {
        m5.a.s(b.b(MovieFragmentRandomAccessOffsetBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.mfraSize;
    }
    
    public void setMfraSize(final long mfraSize) {
        m5.a.s(b.c(MovieFragmentRandomAccessOffsetBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Long(mfraSize)));
        this.mfraSize = mfraSize;
    }
}
