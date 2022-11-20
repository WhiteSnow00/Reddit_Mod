// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import b5.k;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox
{
    public static final String TYPE = "tfdt";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private long baseMediaDecodeTime;
    
    static {
        ajc$preClinit();
    }
    
    public TrackFragmentBaseMediaDecodeTimeBox() {
        super("tfdt");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TrackFragmentBaseMediaDecodeTimeBox.java", (Class)TrackFragmentBaseMediaDecodeTimeBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "long"), 65);
        ajc$tjp_1 = (a)b.f(b.e("setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "long", "baseMediaDecodeTime", "", "void"), 69);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            this.baseMediaDecodeTime = xd.a.V0(byteBuffer);
        }
        else {
            this.baseMediaDecodeTime = xd.a.U0(byteBuffer);
        }
    }
    
    public long getBaseMediaDecodeTime() {
        m5.a.s(b.b(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.baseMediaDecodeTime;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            byteBuffer.putLong(this.baseMediaDecodeTime);
        }
        else {
            byteBuffer.putInt((int)this.baseMediaDecodeTime);
        }
    }
    
    public long getContentSize() {
        int n;
        if (this.getVersion() == 0) {
            n = 8;
        }
        else {
            n = 12;
        }
        return n;
    }
    
    public void setBaseMediaDecodeTime(final long baseMediaDecodeTime) {
        m5.a.s(b.c(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Long(baseMediaDecodeTime)));
        this.baseMediaDecodeTime = baseMediaDecodeTime;
    }
    
    public String toString() {
        return k.k(b.p(b.b(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_2, (Object)this, (Object)this), "TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime="), this.baseMediaDecodeTime, '}');
    }
}
