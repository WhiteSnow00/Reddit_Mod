// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class MovieExtendsHeaderBox extends AbstractFullBox
{
    public static final String TYPE = "mehd";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private long fragmentDuration;
    
    static {
        ajc$preClinit();
    }
    
    public MovieExtendsHeaderBox() {
        super("mehd");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("MovieExtendsHeaderBox.java", (Class)MovieExtendsHeaderBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "", "", "", "long"), 65);
        ajc$tjp_1 = (a)b.f(b.e("setFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "long", "fragmentDuration", "", "void"), 69);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        long fragmentDuration;
        if (this.getVersion() == 1) {
            fragmentDuration = xd.a.V0(byteBuffer);
        }
        else {
            fragmentDuration = xd.a.U0(byteBuffer);
        }
        this.fragmentDuration = fragmentDuration;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            byteBuffer.putLong(this.fragmentDuration);
        }
        else {
            byteBuffer.putInt((int)this.fragmentDuration);
        }
    }
    
    public long getContentSize() {
        int n;
        if (this.getVersion() == 1) {
            n = 12;
        }
        else {
            n = 8;
        }
        return n;
    }
    
    public long getFragmentDuration() {
        m5.a.s(b.b(MovieExtendsHeaderBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.fragmentDuration;
    }
    
    public void setFragmentDuration(final long fragmentDuration) {
        m5.a.s(b.c(MovieExtendsHeaderBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Long(fragmentDuration)));
        this.fragmentDuration = fragmentDuration;
    }
}
