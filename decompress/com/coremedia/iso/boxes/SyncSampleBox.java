// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import px0.c;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SyncSampleBox extends AbstractFullBox
{
    public static final String TYPE = "stss";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private long[] sampleNumber;
    
    static {
        ajc$preClinit();
    }
    
    public SyncSampleBox() {
        super("stss");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("SyncSampleBox.java", (Class)SyncSampleBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        ajc$tjp_1 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        ajc$tjp_2 = (a)b.f(b.e("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int d2 = c.D2(xd.a.U0(byteBuffer));
        this.sampleNumber = new long[d2];
        for (int i = 0; i < d2; ++i) {
            this.sampleNumber[i] = xd.a.U0(byteBuffer);
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
        m5.a.s(b.b(SyncSampleBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.sampleNumber;
    }
    
    public void setSampleNumber(final long[] sampleNumber) {
        m5.a.s(b.c(SyncSampleBox.ajc$tjp_2, (Object)this, (Object)this, (Object)sampleNumber));
        this.sampleNumber = sampleNumber;
    }
    
    public String toString() {
        return a.q(b.p(b.b(SyncSampleBox.ajc$tjp_1, (Object)this, (Object)this), "SyncSampleBox[entryCount="), this.sampleNumber.length, "]");
    }
}
