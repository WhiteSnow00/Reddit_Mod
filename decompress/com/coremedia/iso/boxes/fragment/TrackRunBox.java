// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import b5.k;
import com.googlecode.mp4parser.e;
import java.util.Iterator;
import px0.c;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.ArrayList;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackRunBox extends AbstractFullBox
{
    public static final String TYPE = "trun";
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
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    private int dataOffset;
    private List<Entry> entries;
    private SampleFlags firstSampleFlags;
    
    static {
        ajc$preClinit();
    }
    
    public TrackRunBox() {
        super("trun");
        this.entries = new ArrayList<Entry>();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TrackRunBox.java", (Class)TrackRunBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = (a)b.f(b.e("setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), 120);
        ajc$tjp_10 = (a)b.f(b.e("setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 267);
        ajc$tjp_11 = (a)b.f(b.e("setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 275);
        ajc$tjp_12 = (a)b.f(b.e("setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 283);
        ajc$tjp_13 = (a)b.f(b.e("setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 292);
        ajc$tjp_14 = (a)b.f(b.e("setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 300);
        ajc$tjp_15 = (a)b.f(b.e("getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), 309);
        ajc$tjp_16 = (a)b.f(b.e("getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 313);
        ajc$tjp_17 = (a)b.f(b.e("setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), 317);
        ajc$tjp_18 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 327);
        ajc$tjp_19 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 342);
        ajc$tjp_2 = (a)b.f(b.e("getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 129);
        ajc$tjp_3 = (a)b.f(b.e("getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"), 238);
        ajc$tjp_4 = (a)b.f(b.e("isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 242);
        ajc$tjp_5 = (a)b.f(b.e("isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 246);
        ajc$tjp_6 = (a)b.f(b.e("isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 251);
        ajc$tjp_7 = (a)b.f(b.e("isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 255);
        ajc$tjp_8 = (a)b.f(b.e("isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 259);
        ajc$tjp_9 = (a)b.f(b.e("isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 263);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final long u0 = xd.a.U0(byteBuffer);
        if ((this.getFlags() & 0x1) == 0x1) {
            this.dataOffset = c.D2(xd.a.U0(byteBuffer));
        }
        else {
            this.dataOffset = -1;
        }
        if ((this.getFlags() & 0x4) == 0x4) {
            this.firstSampleFlags = new SampleFlags(byteBuffer);
        }
        for (int n = 0; n < u0; ++n) {
            final Entry entry = new Entry();
            if ((this.getFlags() & 0x100) == 0x100) {
                Entry.access$4(entry, xd.a.U0(byteBuffer));
            }
            if ((this.getFlags() & 0x200) == 0x200) {
                Entry.access$5(entry, xd.a.U0(byteBuffer));
            }
            if ((this.getFlags() & 0x400) == 0x400) {
                Entry.access$6(entry, new SampleFlags(byteBuffer));
            }
            if ((this.getFlags() & 0x800) == 0x800) {
                Entry.access$7(entry, byteBuffer.getInt());
            }
            this.entries.add(entry);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        final int flags = this.getFlags();
        if ((flags & 0x1) == 0x1) {
            byteBuffer.putInt(this.dataOffset);
        }
        if ((flags & 0x4) == 0x4) {
            this.firstSampleFlags.getContent(byteBuffer);
        }
        for (final Entry entry : this.entries) {
            if ((flags & 0x100) == 0x100) {
                byteBuffer.putInt((int)Entry.access$0(entry));
            }
            if ((flags & 0x200) == 0x200) {
                byteBuffer.putInt((int)Entry.access$1(entry));
            }
            if ((flags & 0x400) == 0x400) {
                Entry.access$2(entry).getContent(byteBuffer);
            }
            if ((flags & 0x800) == 0x800) {
                if (this.getVersion() == 0) {
                    byteBuffer.putInt((int)Entry.access$3(entry));
                }
                else {
                    byteBuffer.putInt((int)Entry.access$3(entry));
                }
            }
        }
    }
    
    public long getContentSize() {
        final int flags = this.getFlags();
        long n;
        if ((flags & 0x1) == 0x1) {
            n = 12L;
        }
        else {
            n = 8L;
        }
        long n2 = n;
        if ((flags & 0x4) == 0x4) {
            n2 = n + 4L;
        }
        long n3 = 0L;
        if ((flags & 0x100) == 0x100) {
            n3 = 4L;
        }
        long n4 = n3;
        if ((flags & 0x200) == 0x200) {
            n4 = n3 + 4L;
        }
        long n5 = n4;
        if ((flags & 0x400) == 0x400) {
            n5 = n4 + 4L;
        }
        long n6 = n5;
        if ((flags & 0x800) == 0x800) {
            n6 = n5 + 4L;
        }
        return n6 * this.entries.size() + n2;
    }
    
    public int getDataOffset() {
        m5.a.s(b.b(TrackRunBox.ajc$tjp_15, (Object)this, (Object)this));
        return this.dataOffset;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(TrackRunBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public SampleFlags getFirstSampleFlags() {
        m5.a.s(b.b(TrackRunBox.ajc$tjp_16, (Object)this, (Object)this));
        return this.firstSampleFlags;
    }
    
    public long[] getSampleCompositionTimeOffsets() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_2, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        if (this.isSampleCompositionTimeOffsetPresent()) {
            final int size = this.entries.size();
            final long[] array = new long[size];
            for (int i = 0; i < size; ++i) {
                array[i] = this.entries.get(i).getSampleCompositionTimeOffset();
            }
            return array;
        }
        return null;
    }
    
    public long getSampleCount() {
        m5.a.s(b.b(TrackRunBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.entries.size();
    }
    
    public boolean isDataOffsetPresent() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_4, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x1) == 0x1;
    }
    
    public boolean isFirstSampleFlagsPresent() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_5, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x4) == 0x4;
    }
    
    public boolean isSampleCompositionTimeOffsetPresent() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_9, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x800) == 0x800;
    }
    
    public boolean isSampleDurationPresent() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_7, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x100) == 0x100;
    }
    
    public boolean isSampleFlagsPresent() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_8, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x400) == 0x400;
    }
    
    public boolean isSampleSizePresent() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_6, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        return (this.getFlags() & 0x200) == 0x200;
    }
    
    public void setDataOffset(final int dataOffset) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(dataOffset)));
        if (dataOffset == -1) {
            this.setFlags(this.getFlags() & 0xFFFFFE);
        }
        else {
            this.setFlags(this.getFlags() | 0x1);
        }
        this.dataOffset = dataOffset;
    }
    
    public void setDataOffsetPresent(final boolean b) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_10, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x1);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFFFE);
        }
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_19, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public void setFirstSampleFlags(final SampleFlags firstSampleFlags) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_17, (Object)this, (Object)this, (Object)firstSampleFlags));
        if (firstSampleFlags == null) {
            this.setFlags(this.getFlags() & 0xFFFFFB);
        }
        else {
            this.setFlags(this.getFlags() | 0x4);
        }
        this.firstSampleFlags = firstSampleFlags;
    }
    
    public void setSampleCompositionTimeOffsetPresent(final boolean b) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_14, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x800);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFF7FF);
        }
    }
    
    public void setSampleDurationPresent(final boolean b) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_12, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x100);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFEFF);
        }
    }
    
    public void setSampleFlagsPresent(final boolean b) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_13, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x400);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFBFF);
        }
    }
    
    public void setSampleSizePresent(final boolean b) {
        m5.a.s(b.c(TrackRunBox.ajc$tjp_11, (Object)this, (Object)this, (Object)new Boolean(b)));
        if (b) {
            this.setFlags(this.getFlags() | 0x200);
        }
        else {
            this.setFlags(this.getFlags() & 0xFFFDFF);
        }
    }
    
    public String toString() {
        final mt2.c b = mt2.b.b(TrackRunBox.ajc$tjp_18, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("TrackRunBox");
        sb.append("{sampleCount=");
        sb.append(this.entries.size());
        sb.append(", dataOffset=");
        sb.append(this.dataOffset);
        sb.append(", dataOffsetPresent=");
        sb.append(this.isDataOffsetPresent());
        sb.append(", sampleSizePresent=");
        sb.append(this.isSampleSizePresent());
        sb.append(", sampleDurationPresent=");
        sb.append(this.isSampleDurationPresent());
        sb.append(", sampleFlagsPresentPresent=");
        sb.append(this.isSampleFlagsPresent());
        sb.append(", sampleCompositionTimeOffsetPresent=");
        sb.append(this.isSampleCompositionTimeOffsetPresent());
        sb.append(", firstSampleFlags=");
        sb.append(this.firstSampleFlags);
        sb.append('}');
        return sb.toString();
    }
    
    public static class Entry
    {
        private long sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;
        
        public Entry() {
        }
        
        public Entry(final long sampleDuration, final long sampleSize, final SampleFlags sampleFlags, final int n) {
            this.sampleDuration = sampleDuration;
            this.sampleSize = sampleSize;
            this.sampleFlags = sampleFlags;
            this.sampleCompositionTimeOffset = n;
        }
        
        public static long access$0(final Entry entry) {
            return entry.sampleDuration;
        }
        
        public static long access$1(final Entry entry) {
            return entry.sampleSize;
        }
        
        public static SampleFlags access$2(final Entry entry) {
            return entry.sampleFlags;
        }
        
        public static long access$3(final Entry entry) {
            return entry.sampleCompositionTimeOffset;
        }
        
        public static void access$4(final Entry entry, final long sampleDuration) {
            entry.sampleDuration = sampleDuration;
        }
        
        public static void access$5(final Entry entry, final long sampleSize) {
            entry.sampleSize = sampleSize;
        }
        
        public static void access$6(final Entry entry, final SampleFlags sampleFlags) {
            entry.sampleFlags = sampleFlags;
        }
        
        public static void access$7(final Entry entry, final long sampleCompositionTimeOffset) {
            entry.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }
        
        public long getSampleCompositionTimeOffset() {
            return this.sampleCompositionTimeOffset;
        }
        
        public long getSampleDuration() {
            return this.sampleDuration;
        }
        
        public SampleFlags getSampleFlags() {
            return this.sampleFlags;
        }
        
        public long getSampleSize() {
            return this.sampleSize;
        }
        
        public void setSampleCompositionTimeOffset(final int n) {
            this.sampleCompositionTimeOffset = n;
        }
        
        public void setSampleDuration(final long sampleDuration) {
            this.sampleDuration = sampleDuration;
        }
        
        public void setSampleFlags(final SampleFlags sampleFlags) {
            this.sampleFlags = sampleFlags;
        }
        
        public void setSampleSize(final long sampleSize) {
            this.sampleSize = sampleSize;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{duration=");
            sb.append(this.sampleDuration);
            sb.append(", size=");
            sb.append(this.sampleSize);
            sb.append(", dlags=");
            sb.append(this.sampleFlags);
            sb.append(", compTimeOffset=");
            return k.k(sb, this.sampleCompositionTimeOffset, '}');
        }
    }
}
