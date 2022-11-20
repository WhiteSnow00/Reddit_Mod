// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import mt2.c;
import com.googlecode.mp4parser.e;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackFragmentHeaderBox extends AbstractFullBox
{
    public static final String TYPE = "tfhd";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_10;
    private static final a ajc$tjp_11;
    private static final a ajc$tjp_12;
    private static final a ajc$tjp_13;
    private static final a ajc$tjp_14;
    private static final a ajc$tjp_15;
    private static final a ajc$tjp_16;
    private static final a ajc$tjp_17;
    private static final a ajc$tjp_18;
    private static final a ajc$tjp_19;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_20;
    private static final a ajc$tjp_21;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;
    
    static {
        ajc$preClinit();
    }
    
    public TrackFragmentHeaderBox() {
        super("tfhd");
        this.baseDataOffset = -1L;
        this.defaultSampleDuration = -1L;
        this.defaultSampleSize = -1L;
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TrackFragmentHeaderBox.java", (Class)TrackFragmentHeaderBox.class);
        ajc$tjp_0 = (a)b.f(b.e("hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 126);
        ajc$tjp_1 = (a)b.f(b.e("hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        ajc$tjp_10 = (a)b.f(b.e("setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 171);
        ajc$tjp_11 = (a)b.f(b.e("getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 180);
        ajc$tjp_12 = (a)b.f(b.e("setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 184);
        ajc$tjp_13 = (a)b.f(b.e("getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 191);
        ajc$tjp_14 = (a)b.f(b.e("setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 195);
        ajc$tjp_15 = (a)b.f(b.e("getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 204);
        ajc$tjp_16 = (a)b.f(b.e("setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 208);
        ajc$tjp_17 = (a)b.f(b.e("isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 217);
        ajc$tjp_18 = (a)b.f(b.e("setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 221);
        ajc$tjp_19 = (a)b.f(b.e("isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 230);
        ajc$tjp_2 = (a)b.f(b.e("hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 134);
        ajc$tjp_20 = (a)b.f(b.e("setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), 234);
        ajc$tjp_21 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 244);
        ajc$tjp_3 = (a)b.f(b.e("hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 138);
        ajc$tjp_4 = (a)b.f(b.e("hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 142);
        ajc$tjp_5 = (a)b.f(b.e("getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 146);
        ajc$tjp_6 = (a)b.f(b.e("setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 150);
        ajc$tjp_7 = (a)b.f(b.e("getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 154);
        ajc$tjp_8 = (a)b.f(b.e("setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 158);
        ajc$tjp_9 = (a)b.f(b.e("getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 167);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.trackId = xd.a.U0(byteBuffer);
        if ((this.getFlags() & 0x1) == 0x1) {
            this.baseDataOffset = xd.a.V0(byteBuffer);
        }
        if ((this.getFlags() & 0x2) == 0x2) {
            this.sampleDescriptionIndex = xd.a.U0(byteBuffer);
        }
        if ((this.getFlags() & 0x8) == 0x8) {
            this.defaultSampleDuration = xd.a.U0(byteBuffer);
        }
        if ((this.getFlags() & 0x10) == 0x10) {
            this.defaultSampleSize = xd.a.U0(byteBuffer);
        }
        if ((this.getFlags() & 0x20) == 0x20) {
            this.defaultSampleFlags = new SampleFlags(byteBuffer);
        }
        if ((this.getFlags() & 0x10000) == 0x10000) {
            this.durationIsEmpty = true;
        }
        if ((this.getFlags() & 0x20000) == 0x20000) {
            this.defaultBaseIsMoof = true;
        }
    }
    
    public long getBaseDataOffset() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_7, (Object)this, (Object)this));
        return this.baseDataOffset;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.trackId);
        if ((this.getFlags() & 0x1) == 0x1) {
            byteBuffer.putLong(this.getBaseDataOffset());
        }
        if ((this.getFlags() & 0x2) == 0x2) {
            byteBuffer.putInt((int)this.getSampleDescriptionIndex());
        }
        if ((this.getFlags() & 0x8) == 0x8) {
            byteBuffer.putInt((int)this.getDefaultSampleDuration());
        }
        if ((this.getFlags() & 0x10) == 0x10) {
            byteBuffer.putInt((int)this.getDefaultSampleSize());
        }
        if ((this.getFlags() & 0x20) == 0x20) {
            this.defaultSampleFlags.getContent(byteBuffer);
        }
    }
    
    public long getContentSize() {
        final int flags = this.getFlags();
        long n;
        if ((flags & 0x1) == 0x1) {
            n = 16L;
        }
        else {
            n = 8L;
        }
        long n2 = n;
        if ((flags & 0x2) == 0x2) {
            n2 = n + 4L;
        }
        long n3 = n2;
        if ((flags & 0x8) == 0x8) {
            n3 = n2 + 4L;
        }
        long n4 = n3;
        if ((flags & 0x10) == 0x10) {
            n4 = n3 + 4L;
        }
        long n5 = n4;
        if ((flags & 0x20) == 0x20) {
            n5 = n4 + 4L;
        }
        return n5;
    }
    
    public long getDefaultSampleDuration() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_11, (Object)this, (Object)this));
        return this.defaultSampleDuration;
    }
    
    public SampleFlags getDefaultSampleFlags() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_15, (Object)this, (Object)this));
        return this.defaultSampleFlags;
    }
    
    public long getDefaultSampleSize() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_13, (Object)this, (Object)this));
        return this.defaultSampleSize;
    }
    
    public long getSampleDescriptionIndex() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_9, (Object)this, (Object)this));
        return this.sampleDescriptionIndex;
    }
    
    public long getTrackId() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_5, (Object)this, (Object)this));
        return this.trackId;
    }
    
    public boolean hasBaseDataOffset() {
        final c b = mt2.b.b(TrackFragmentHeaderBox.ajc$tjp_0, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x1) != 0x0;
    }
    
    public boolean hasDefaultSampleDuration() {
        final c b = mt2.b.b(TrackFragmentHeaderBox.ajc$tjp_2, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x8) != 0x0;
    }
    
    public boolean hasDefaultSampleFlags() {
        final c b = mt2.b.b(TrackFragmentHeaderBox.ajc$tjp_4, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x20) != 0x0;
    }
    
    public boolean hasDefaultSampleSize() {
        final c b = mt2.b.b(TrackFragmentHeaderBox.ajc$tjp_3, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x10) != 0x0;
    }
    
    public boolean hasSampleDescriptionIndex() {
        final c b = mt2.b.b(TrackFragmentHeaderBox.ajc$tjp_1, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x2) != 0x0;
    }
    
    public boolean isDefaultBaseIsMoof() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_19, (Object)this, (Object)this));
        return this.defaultBaseIsMoof;
    }
    
    public boolean isDurationIsEmpty() {
        m5.a.s(b.b(TrackFragmentHeaderBox.ajc$tjp_17, (Object)this, (Object)this));
        return this.durationIsEmpty;
    }
    
    public void setBaseDataOffset(final long baseDataOffset) {
        m5.a.s(b.c(TrackFragmentHeaderBox.ajc$tjp_8, (Object)this, (Object)this, (Object)new Long(baseDataOffset)));
        if (baseDataOffset == -1L) {
            this.setFlags(this.getFlags() & 0x7FFFFFFE);
        }
        else {
            this.setFlags(this.getFlags() | 0x1);
        }
        this.baseDataOffset = baseDataOffset;
    }
    
    public void setDefaultBaseIsMoof(final boolean defaultBaseIsMoof) {
        m5.a.s(b.c(TrackFragmentHeaderBox.ajc$tjp_20, (Object)this, (Object)this, (Object)new Boolean(defaultBaseIsMoof)));
        if (defaultBaseIsMoof) {
            this.setFlags(this.getFlags() | 0x20000);
        }
        else {
            this.setFlags(this.getFlags() & 0xFDFFFF);
        }
        this.defaultBaseIsMoof = defaultBaseIsMoof;
    }
    
    public void setDefaultSampleDuration(final long defaultSampleDuration) {
        final c c = b.c(TrackFragmentHeaderBox.ajc$tjp_12, (Object)this, (Object)this, (Object)new Long(defaultSampleDuration));
        e.a().getClass();
        e.b(c);
        this.setFlags(this.getFlags() | 0x8);
        this.defaultSampleDuration = defaultSampleDuration;
    }
    
    public void setDefaultSampleFlags(final SampleFlags defaultSampleFlags) {
        m5.a.s(b.c(TrackFragmentHeaderBox.ajc$tjp_16, (Object)this, (Object)this, (Object)defaultSampleFlags));
        if (defaultSampleFlags != null) {
            this.setFlags(this.getFlags() | 0x20);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFFDF);
        }
        this.defaultSampleFlags = defaultSampleFlags;
    }
    
    public void setDefaultSampleSize(final long defaultSampleSize) {
        m5.a.s(b.c(TrackFragmentHeaderBox.ajc$tjp_14, (Object)this, (Object)this, (Object)new Long(defaultSampleSize)));
        if (defaultSampleSize != -1L) {
            this.setFlags(this.getFlags() | 0x10);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFFEF);
        }
        this.defaultSampleSize = defaultSampleSize;
    }
    
    public void setDurationIsEmpty(final boolean durationIsEmpty) {
        m5.a.s(b.c(TrackFragmentHeaderBox.ajc$tjp_18, (Object)this, (Object)this, (Object)new Boolean(durationIsEmpty)));
        if (this.defaultBaseIsMoof) {
            this.setFlags(this.getFlags() | 0x10000);
        }
        else {
            this.setFlags(this.getFlags() & 0xFEFFFF);
        }
        this.durationIsEmpty = durationIsEmpty;
    }
    
    public void setSampleDescriptionIndex(final long sampleDescriptionIndex) {
        m5.a.s(b.c(TrackFragmentHeaderBox.ajc$tjp_10, (Object)this, (Object)this, (Object)new Long(sampleDescriptionIndex)));
        if (sampleDescriptionIndex == -1L) {
            this.setFlags(this.getFlags() & 0x7FFFFFFD);
        }
        else {
            this.setFlags(this.getFlags() | 0x2);
        }
        this.sampleDescriptionIndex = sampleDescriptionIndex;
    }
    
    public void setTrackId(final long trackId) {
        m5.a.s(b.c(TrackFragmentHeaderBox.ajc$tjp_6, (Object)this, (Object)this, (Object)new Long(trackId)));
        this.trackId = trackId;
    }
    
    public String toString() {
        final c b = mt2.b.b(TrackFragmentHeaderBox.ajc$tjp_21, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("TrackFragmentHeaderBox");
        sb.append("{trackId=");
        sb.append(this.trackId);
        sb.append(", baseDataOffset=");
        sb.append(this.baseDataOffset);
        sb.append(", sampleDescriptionIndex=");
        sb.append(this.sampleDescriptionIndex);
        sb.append(", defaultSampleDuration=");
        sb.append(this.defaultSampleDuration);
        sb.append(", defaultSampleSize=");
        sb.append(this.defaultSampleSize);
        sb.append(", defaultSampleFlags=");
        sb.append(this.defaultSampleFlags);
        sb.append(", durationIsEmpty=");
        sb.append(this.durationIsEmpty);
        sb.append(", defaultBaseIsMoof=");
        return d.n(sb, this.defaultBaseIsMoof, '}');
    }
}
