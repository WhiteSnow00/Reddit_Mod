// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import px0.c;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleSizeBox extends AbstractFullBox
{
    public static final String TYPE = "stsz";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    public int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;
    
    static {
        ajc$preClinit();
    }
    
    public SampleSizeBox() {
        super("stsz");
        this.sampleSizes = new long[0];
    }
    
    private static void ajc$preClinit() {
        final b b = new b("SampleSizeBox.java", (Class)SampleSizeBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        ajc$tjp_1 = (a)b.f(b.e("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        ajc$tjp_2 = (a)b.f(b.e("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        ajc$tjp_3 = (a)b.f(b.e("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        ajc$tjp_4 = (a)b.f(b.e("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = (a)b.f(b.e("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.sampleSize = xd.a.U0(byteBuffer);
        final int d2 = c.D2(xd.a.U0(byteBuffer));
        this.sampleCount = d2;
        if (this.sampleSize == 0L) {
            this.sampleSizes = new long[d2];
            for (int i = 0; i < this.sampleCount; ++i) {
                this.sampleSizes[i] = xd.a.U0(byteBuffer);
            }
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.sampleSize);
        if (this.sampleSize == 0L) {
            byteBuffer.putInt(this.sampleSizes.length);
            final long[] sampleSizes = this.sampleSizes;
            for (int length = sampleSizes.length, i = 0; i < length; ++i) {
                byteBuffer.putInt((int)sampleSizes[i]);
            }
        }
        else {
            byteBuffer.putInt(this.sampleCount);
        }
    }
    
    public long getContentSize() {
        int n;
        if (this.sampleSize == 0L) {
            n = this.sampleSizes.length * 4;
        }
        else {
            n = 0;
        }
        return n + 12;
    }
    
    public long getSampleCount() {
        m5.a.s(b.b(SampleSizeBox.ajc$tjp_3, (Object)this, (Object)this));
        int n;
        if (this.sampleSize > 0L) {
            n = this.sampleCount;
        }
        else {
            n = this.sampleSizes.length;
        }
        return n;
    }
    
    public long getSampleSize() {
        m5.a.s(b.b(SampleSizeBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.sampleSize;
    }
    
    public long getSampleSizeAtIndex(final int n) {
        m5.a.s(b.c(SampleSizeBox.ajc$tjp_2, (Object)this, (Object)this, (Object)new Integer(n)));
        final long sampleSize = this.sampleSize;
        if (sampleSize > 0L) {
            return sampleSize;
        }
        return this.sampleSizes[n];
    }
    
    public long[] getSampleSizes() {
        m5.a.s(b.b(SampleSizeBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.sampleSizes;
    }
    
    public void setSampleSize(final long sampleSize) {
        m5.a.s(b.c(SampleSizeBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Long(sampleSize)));
        this.sampleSize = sampleSize;
    }
    
    public void setSampleSizes(final long[] sampleSizes) {
        m5.a.s(b.c(SampleSizeBox.ajc$tjp_5, (Object)this, (Object)this, (Object)sampleSizes));
        this.sampleSizes = sampleSizes;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(SampleSizeBox.ajc$tjp_6, (Object)this, (Object)this), "SampleSizeBox[sampleSize=");
        p.append(this.getSampleSize());
        p.append(";sampleCount=");
        p.append(this.getSampleCount());
        p.append("]");
        return p.toString();
    }
}
