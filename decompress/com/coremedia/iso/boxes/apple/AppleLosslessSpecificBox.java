// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.apple;

import ak0.n;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public final class AppleLosslessSpecificBox extends AbstractFullBox
{
    public static final String TYPE = "alac";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_10;
    private static final /* synthetic */ a ajc$tjp_11;
    private static final /* synthetic */ a ajc$tjp_12;
    private static final /* synthetic */ a ajc$tjp_13;
    private static final /* synthetic */ a ajc$tjp_14;
    private static final /* synthetic */ a ajc$tjp_15;
    private static final /* synthetic */ a ajc$tjp_16;
    private static final /* synthetic */ a ajc$tjp_17;
    private static final /* synthetic */ a ajc$tjp_18;
    private static final /* synthetic */ a ajc$tjp_19;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_20;
    private static final /* synthetic */ a ajc$tjp_21;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    private static final /* synthetic */ a ajc$tjp_6;
    private static final /* synthetic */ a ajc$tjp_7;
    private static final /* synthetic */ a ajc$tjp_8;
    private static final /* synthetic */ a ajc$tjp_9;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;
    
    static {
        ajc$preClinit();
    }
    
    public AppleLosslessSpecificBox() {
        super("alac");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("AppleLosslessSpecificBox.java", (Class)AppleLosslessSpecificBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 34);
        ajc$tjp_1 = (a)b.f(b.e("setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = (a)b.f(b.e("getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = (a)b.f(b.e("setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = (a)b.f(b.e("getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = (a)b.f(b.e("setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = (a)b.f(b.e("getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = (a)b.f(b.e("setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = (a)b.f(b.e("getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 98);
        ajc$tjp_17 = (a)b.f(b.e("setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = (a)b.f(b.e("getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 106);
        ajc$tjp_19 = (a)b.f(b.e("setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 110);
        ajc$tjp_2 = (a)b.f(b.e("getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = (a)b.f(b.e("getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 114);
        ajc$tjp_21 = (a)b.f(b.e("setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = (a)b.f(b.e("setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = (a)b.f(b.e("getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = (a)b.f(b.e("setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = (a)b.f(b.e("getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = (a)b.f(b.e("setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = (a)b.f(b.e("getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = (a)b.f(b.e("setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = c0.a0(byteBuffer);
        int value;
        final byte b = (byte)(value = byteBuffer.get());
        if (b < 0) {
            value = b + 256;
        }
        this.unknown1 = value;
        final byte value2 = byteBuffer.get();
        int sampleSize;
        if ((sampleSize = value2) < 0) {
            sampleSize = value2 + 256;
        }
        this.sampleSize = sampleSize;
        final byte value3 = byteBuffer.get();
        int historyMult;
        if ((historyMult = value3) < 0) {
            historyMult = value3 + 256;
        }
        this.historyMult = historyMult;
        final byte value4 = byteBuffer.get();
        int initialHistory;
        if ((initialHistory = value4) < 0) {
            initialHistory = value4 + 256;
        }
        this.initialHistory = initialHistory;
        final byte value5 = byteBuffer.get();
        int kModifier;
        if ((kModifier = value5) < 0) {
            kModifier = value5 + 256;
        }
        this.kModifier = kModifier;
        final byte value6 = byteBuffer.get();
        int channels;
        if ((channels = value6) < 0) {
            channels = value6 + 256;
        }
        this.channels = channels;
        this.unknown2 = c0.Y(byteBuffer);
        this.maxCodedFrameSize = c0.a0(byteBuffer);
        this.bitRate = c0.a0(byteBuffer);
        this.sampleRate = c0.a0(byteBuffer);
    }
    
    public long getBitRate() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_18, (Object)this, (Object)this));
        return this.bitRate;
    }
    
    public int getChannels() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_12, (Object)this, (Object)this));
        return this.channels;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.maxSamplePerFrame);
        byteBuffer.put((byte)(this.unknown1 & 0xFF));
        byteBuffer.put((byte)(this.sampleSize & 0xFF));
        byteBuffer.put((byte)(this.historyMult & 0xFF));
        byteBuffer.put((byte)(this.initialHistory & 0xFF));
        byteBuffer.put((byte)(this.kModifier & 0xFF));
        byteBuffer.put((byte)(this.channels & 0xFF));
        ah.a.m0(this.unknown2, byteBuffer);
        byteBuffer.putInt((int)this.maxCodedFrameSize);
        byteBuffer.putInt((int)this.bitRate);
        byteBuffer.putInt((int)this.sampleRate);
    }
    
    public long getContentSize() {
        return 28L;
    }
    
    public int getHistoryMult() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.historyMult;
    }
    
    public int getInitialHistory() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_8, (Object)this, (Object)this));
        return this.initialHistory;
    }
    
    public int getKModifier() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_10, (Object)this, (Object)this));
        return this.kModifier;
    }
    
    public long getMaxCodedFrameSize() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_16, (Object)this, (Object)this));
        return this.maxCodedFrameSize;
    }
    
    public long getMaxSamplePerFrame() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.maxSamplePerFrame;
    }
    
    public long getSampleRate() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_20, (Object)this, (Object)this));
        return this.sampleRate;
    }
    
    public int getSampleSize() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.sampleSize;
    }
    
    public int getUnknown1() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.unknown1;
    }
    
    public int getUnknown2() {
        n.x(b.b(AppleLosslessSpecificBox.ajc$tjp_14, (Object)this, (Object)this));
        return this.unknown2;
    }
    
    public void setBitRate(final int n) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_19, (Object)this, (Object)this, (Object)new Integer(n)));
        this.bitRate = n;
    }
    
    public void setChannels(final int channels) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_13, (Object)this, (Object)this, (Object)new Integer(channels)));
        this.channels = channels;
    }
    
    public void setHistoryMult(final int historyMult) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_7, (Object)this, (Object)this, (Object)new Integer(historyMult)));
        this.historyMult = historyMult;
    }
    
    public void setInitialHistory(final int initialHistory) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_9, (Object)this, (Object)this, (Object)new Integer(initialHistory)));
        this.initialHistory = initialHistory;
    }
    
    public void setKModifier(final int kModifier) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_11, (Object)this, (Object)this, (Object)new Integer(kModifier)));
        this.kModifier = kModifier;
    }
    
    public void setMaxCodedFrameSize(final int n) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_17, (Object)this, (Object)this, (Object)new Integer(n)));
        this.maxCodedFrameSize = n;
    }
    
    public void setMaxSamplePerFrame(final int n) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(n)));
        this.maxSamplePerFrame = n;
    }
    
    public void setSampleRate(final int n) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_21, (Object)this, (Object)this, (Object)new Integer(n)));
        this.sampleRate = n;
    }
    
    public void setSampleSize(final int sampleSize) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(sampleSize)));
        this.sampleSize = sampleSize;
    }
    
    public void setUnknown1(final int unknown1) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(unknown1)));
        this.unknown1 = unknown1;
    }
    
    public void setUnknown2(final int unknown2) {
        n.x(b.c(AppleLosslessSpecificBox.ajc$tjp_15, (Object)this, (Object)this, (Object)new Integer(unknown2)));
        this.unknown2 = unknown2;
    }
}
