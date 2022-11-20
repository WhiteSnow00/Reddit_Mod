// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackExtendsBox extends AbstractFullBox
{
    public static final String TYPE = "trex";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_10;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;
    
    static {
        ajc$preClinit();
    }
    
    public TrackExtendsBox() {
        super("trex");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TrackExtendsBox.java", (Class)TrackExtendsBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 72);
        ajc$tjp_1 = (a)b.f(b.e("getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 76);
        ajc$tjp_10 = (a)b.f(b.e("setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        ajc$tjp_2 = (a)b.f(b.e("getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 80);
        ajc$tjp_3 = (a)b.f(b.e("getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 84);
        ajc$tjp_4 = (a)b.f(b.e("getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        ajc$tjp_5 = (a)b.f(b.e("getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        ajc$tjp_6 = (a)b.f(b.e("setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "trackId", "", "void"), 96);
        ajc$tjp_7 = (a)b.f(b.e("setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"), 100);
        ajc$tjp_8 = (a)b.f(b.e("setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"), 104);
        ajc$tjp_9 = (a)b.f(b.e("setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleSize", "", "void"), 108);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.trackId = xd.a.U0(byteBuffer);
        this.defaultSampleDescriptionIndex = xd.a.U0(byteBuffer);
        this.defaultSampleDuration = xd.a.U0(byteBuffer);
        this.defaultSampleSize = xd.a.U0(byteBuffer);
        this.defaultSampleFlags = new SampleFlags(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.trackId);
        byteBuffer.putInt((int)this.defaultSampleDescriptionIndex);
        byteBuffer.putInt((int)this.defaultSampleDuration);
        byteBuffer.putInt((int)this.defaultSampleSize);
        this.defaultSampleFlags.getContent(byteBuffer);
    }
    
    public long getContentSize() {
        return 24L;
    }
    
    public long getDefaultSampleDescriptionIndex() {
        m5.a.s(b.b(TrackExtendsBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.defaultSampleDescriptionIndex;
    }
    
    public long getDefaultSampleDuration() {
        m5.a.s(b.b(TrackExtendsBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.defaultSampleDuration;
    }
    
    public SampleFlags getDefaultSampleFlags() {
        m5.a.s(b.b(TrackExtendsBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.defaultSampleFlags;
    }
    
    public String getDefaultSampleFlagsStr() {
        m5.a.s(b.b(TrackExtendsBox.ajc$tjp_5, (Object)this, (Object)this));
        return this.defaultSampleFlags.toString();
    }
    
    public long getDefaultSampleSize() {
        m5.a.s(b.b(TrackExtendsBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.defaultSampleSize;
    }
    
    public long getTrackId() {
        m5.a.s(b.b(TrackExtendsBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.trackId;
    }
    
    public void setDefaultSampleDescriptionIndex(final long defaultSampleDescriptionIndex) {
        m5.a.s(b.c(TrackExtendsBox.ajc$tjp_7, (Object)this, (Object)this, (Object)new Long(defaultSampleDescriptionIndex)));
        this.defaultSampleDescriptionIndex = defaultSampleDescriptionIndex;
    }
    
    public void setDefaultSampleDuration(final long defaultSampleDuration) {
        m5.a.s(b.c(TrackExtendsBox.ajc$tjp_8, (Object)this, (Object)this, (Object)new Long(defaultSampleDuration)));
        this.defaultSampleDuration = defaultSampleDuration;
    }
    
    public void setDefaultSampleFlags(final SampleFlags defaultSampleFlags) {
        m5.a.s(b.c(TrackExtendsBox.ajc$tjp_10, (Object)this, (Object)this, (Object)defaultSampleFlags));
        this.defaultSampleFlags = defaultSampleFlags;
    }
    
    public void setDefaultSampleSize(final long defaultSampleSize) {
        m5.a.s(b.c(TrackExtendsBox.ajc$tjp_9, (Object)this, (Object)this, (Object)new Long(defaultSampleSize)));
        this.defaultSampleSize = defaultSampleSize;
    }
    
    public void setTrackId(final long trackId) {
        m5.a.s(b.c(TrackExtendsBox.ajc$tjp_6, (Object)this, (Object)this, (Object)new Long(trackId)));
        this.trackId = trackId;
    }
}
