// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import mk2.e;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SyncSampleBox extends AbstractFullBox
{
    public static final String TYPE = "stss";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private long[] sampleNumber;
    
    static {
        ajc$preClinit();
    }
    
    public SyncSampleBox() {
        super("stss");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("SyncSampleBox.java", (Class)SyncSampleBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        ajc$tjp_1 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        ajc$tjp_2 = (a)b.f(b.e("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int e = mk2.e.E(c0.a0(byteBuffer));
        this.sampleNumber = new long[e];
        for (int i = 0; i < e; ++i) {
            this.sampleNumber[i] = c0.a0(byteBuffer);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.sampleNumber.length);
        final long[] sampleNumber = this.sampleNumber;
        for (int length = sampleNumber.length, i = 0; i < length; ++i) {
            byteBuffer.putInt((int)sampleNumber[i]);
        }
    }
    
    public long getContentSize() {
        return this.sampleNumber.length * 4 + 8;
    }
    
    public long[] getSampleNumber() {
        n.x(b.b(SyncSampleBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.sampleNumber;
    }
    
    public void setSampleNumber(final long[] sampleNumber) {
        n.x(b.c(SyncSampleBox.ajc$tjp_2, (Object)this, (Object)this, (Object)sampleNumber));
        this.sampleNumber = sampleNumber;
    }
    
    public String toString() {
        return d.l(ag0.a.q(b.b(SyncSampleBox.ajc$tjp_1, (Object)this, (Object)this), "SyncSampleBox[entryCount="), this.sampleNumber.length, "]");
    }
}
