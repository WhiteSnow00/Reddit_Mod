// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.sampleentry;

import com.googlecode.mp4parser.e;
import ak0.n;
import mj2.c0;
import o9.c;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractBox;

public class AmrSpecificBox extends AbstractBox
{
    public static final String TYPE = "damr";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    private static final /* synthetic */ a ajc$tjp_6;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;
    
    static {
        ajc$preClinit();
    }
    
    public AmrSpecificBox() {
        super("damr");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("AmrSpecificBox.java", (Class)AmrSpecificBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = (a)b.f(b.e("getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = (a)b.f(b.e("getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = (a)b.f(b.e("getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = (a)b.f(b.e("getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = (a)b.f(b.e("getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        this.vendor = c.b(array);
        int value;
        final byte b = (byte)(value = byteBuffer.get());
        if (b < 0) {
            value = b + 256;
        }
        this.decoderVersion = value;
        this.modeSet = c0.Y(byteBuffer);
        final byte value2 = byteBuffer.get();
        int modeChangePeriod;
        if ((modeChangePeriod = value2) < 0) {
            modeChangePeriod = value2 + 256;
        }
        this.modeChangePeriod = modeChangePeriod;
        final byte value3 = byteBuffer.get();
        int framesPerSample;
        if ((framesPerSample = value3) < 0) {
            framesPerSample = value3 + 256;
        }
        this.framesPerSample = framesPerSample;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        n.x(b.c(AmrSpecificBox.ajc$tjp_5, (Object)this, (Object)this, (Object)byteBuffer));
        byteBuffer.put(c.f(this.vendor));
        byteBuffer.put((byte)(this.decoderVersion & 0xFF));
        ah.a.m0(this.modeSet, byteBuffer);
        byteBuffer.put((byte)(this.modeChangePeriod & 0xFF));
        byteBuffer.put((byte)(this.framesPerSample & 0xFF));
    }
    
    public long getContentSize() {
        return 9L;
    }
    
    public int getDecoderVersion() {
        n.x(b.b(AmrSpecificBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.decoderVersion;
    }
    
    public int getFramesPerSample() {
        n.x(b.b(AmrSpecificBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.framesPerSample;
    }
    
    public int getModeChangePeriod() {
        n.x(b.b(AmrSpecificBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.modeChangePeriod;
    }
    
    public int getModeSet() {
        n.x(b.b(AmrSpecificBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.modeSet;
    }
    
    public String getVendor() {
        n.x(b.b(AmrSpecificBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.vendor;
    }
    
    public String toString() {
        final yt2.c b = yt2.b.b(AmrSpecificBox.ajc$tjp_6, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("AmrSpecificBox[vendor=");
        sb.append(this.getVendor());
        sb.append(";decoderVersion=");
        sb.append(this.getDecoderVersion());
        sb.append(";modeSet=");
        sb.append(this.getModeSet());
        sb.append(";modeChangePeriod=");
        sb.append(this.getModeChangePeriod());
        sb.append(";framesPerSample=");
        sb.append(this.getFramesPerSample());
        sb.append("]");
        return sb.toString();
    }
}
