// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import b5.k;
import p1.h;
import java.util.Iterator;
import dg.l0;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.Collections;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackFragmentRandomAccessBox extends AbstractFullBox
{
    public static final String TYPE = "tfra";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_10;
    private static final a ajc$tjp_11;
    private static final a ajc$tjp_12;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    private List<Entry> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;
    
    static {
        ajc$preClinit();
    }
    
    public TrackFragmentRandomAccessBox() {
        super("tfra");
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.emptyList();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TrackFragmentRandomAccessBox.java", (Class)TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = (a)b.f(b.e("setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 145);
        ajc$tjp_1 = (a)b.f(b.e("setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        ajc$tjp_12 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = (a)b.f(b.e("setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = (a)b.f(b.e("setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = (a)b.f(b.e("getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 161);
        ajc$tjp_5 = (a)b.f(b.e("getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = (a)b.f(b.e("getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = (a)b.f(b.e("getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 173);
        ajc$tjp_8 = (a)b.f(b.e("getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = (a)b.f(b.e("getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 181);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.trackId = xd.a.U0(byteBuffer);
        final long u0 = xd.a.U0(byteBuffer);
        this.reserved = (int)(u0 >> 6);
        this.lengthSizeOfTrafNum = ((int)(0x3FL & u0) >> 4) + 1;
        this.lengthSizeOfTrunNum = ((int)(0xCL & u0) >> 2) + 1;
        this.lengthSizeOfSampleNum = (int)(u0 & 0x3L) + 1;
        final long u2 = xd.a.U0(byteBuffer);
        this.entries = new ArrayList<Entry>();
        for (int n = 0; n < u2; ++n) {
            final Entry entry = new Entry();
            if (this.getVersion() == 1) {
                Entry.access$0(entry, xd.a.V0(byteBuffer));
                Entry.access$1(entry, xd.a.V0(byteBuffer));
            }
            else {
                Entry.access$0(entry, xd.a.U0(byteBuffer));
                Entry.access$1(entry, xd.a.U0(byteBuffer));
            }
            Entry.access$2(entry, ah0.b.h1(this.lengthSizeOfTrafNum, byteBuffer));
            Entry.access$3(entry, ah0.b.h1(this.lengthSizeOfTrunNum, byteBuffer));
            Entry.access$4(entry, ah0.b.h1(this.lengthSizeOfSampleNum, byteBuffer));
            this.entries.add(entry);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.trackId);
        byteBuffer.putInt((int)((long)(this.reserved << 6) | (long)((this.lengthSizeOfTrafNum - 1 & 0x3) << 4) | (long)((this.lengthSizeOfTrunNum - 1 & 0x3) << 2) | (long)(this.lengthSizeOfSampleNum - 1 & 0x3)));
        byteBuffer.putInt(this.entries.size());
        for (final Entry entry : this.entries) {
            if (this.getVersion() == 1) {
                byteBuffer.putLong(Entry.access$5(entry));
                byteBuffer.putLong(Entry.access$6(entry));
            }
            else {
                byteBuffer.putInt((int)Entry.access$5(entry));
                byteBuffer.putInt((int)Entry.access$6(entry));
            }
            l0.t1(Entry.access$7(entry), this.lengthSizeOfTrafNum, byteBuffer);
            l0.t1(Entry.access$8(entry), this.lengthSizeOfTrunNum, byteBuffer);
            l0.t1(Entry.access$9(entry), this.lengthSizeOfSampleNum, byteBuffer);
        }
    }
    
    public long getContentSize() {
        int n;
        if (this.getVersion() == 1) {
            n = this.entries.size() * 16;
        }
        else {
            n = this.entries.size() * 8;
        }
        return 16L + n + this.entries.size() * this.lengthSizeOfTrafNum + this.entries.size() * this.lengthSizeOfTrunNum + this.entries.size() * this.lengthSizeOfSampleNum;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(TrackFragmentRandomAccessBox.ajc$tjp_10, (Object)this, (Object)this));
        return Collections.unmodifiableList((List<? extends Entry>)this.entries);
    }
    
    public int getLengthSizeOfSampleNum() {
        m5.a.s(b.b(TrackFragmentRandomAccessBox.ajc$tjp_8, (Object)this, (Object)this));
        return this.lengthSizeOfSampleNum;
    }
    
    public int getLengthSizeOfTrafNum() {
        m5.a.s(b.b(TrackFragmentRandomAccessBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.lengthSizeOfTrafNum;
    }
    
    public int getLengthSizeOfTrunNum() {
        m5.a.s(b.b(TrackFragmentRandomAccessBox.ajc$tjp_7, (Object)this, (Object)this));
        return this.lengthSizeOfTrunNum;
    }
    
    public long getNumberOfEntries() {
        m5.a.s(b.b(TrackFragmentRandomAccessBox.ajc$tjp_9, (Object)this, (Object)this));
        return this.entries.size();
    }
    
    public int getReserved() {
        m5.a.s(b.b(TrackFragmentRandomAccessBox.ajc$tjp_5, (Object)this, (Object)this));
        return this.reserved;
    }
    
    public long getTrackId() {
        m5.a.s(b.b(TrackFragmentRandomAccessBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.trackId;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(TrackFragmentRandomAccessBox.ajc$tjp_11, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public void setLengthSizeOfSampleNum(final int lengthSizeOfSampleNum) {
        m5.a.s(b.c(TrackFragmentRandomAccessBox.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(lengthSizeOfSampleNum)));
        this.lengthSizeOfSampleNum = lengthSizeOfSampleNum;
    }
    
    public void setLengthSizeOfTrafNum(final int lengthSizeOfTrafNum) {
        m5.a.s(b.c(TrackFragmentRandomAccessBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(lengthSizeOfTrafNum)));
        this.lengthSizeOfTrafNum = lengthSizeOfTrafNum;
    }
    
    public void setLengthSizeOfTrunNum(final int lengthSizeOfTrunNum) {
        m5.a.s(b.c(TrackFragmentRandomAccessBox.ajc$tjp_2, (Object)this, (Object)this, (Object)new Integer(lengthSizeOfTrunNum)));
        this.lengthSizeOfTrunNum = lengthSizeOfTrunNum;
    }
    
    public void setTrackId(final long trackId) {
        m5.a.s(b.c(TrackFragmentRandomAccessBox.ajc$tjp_0, (Object)this, (Object)this, (Object)new Long(trackId)));
        this.trackId = trackId;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(TrackFragmentRandomAccessBox.ajc$tjp_12, (Object)this, (Object)this), "TrackFragmentRandomAccessBox{trackId=");
        p.append(this.trackId);
        p.append(", entries=");
        return h.d(p, (List)this.entries, '}');
    }
    
    public static class Entry
    {
        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;
        
        public Entry() {
        }
        
        public Entry(final long time, final long moofOffset, final long trafNumber, final long trunNumber, final long sampleNumber) {
            this.moofOffset = moofOffset;
            this.sampleNumber = sampleNumber;
            this.time = time;
            this.trafNumber = trafNumber;
            this.trunNumber = trunNumber;
        }
        
        public static void access$0(final Entry entry, final long time) {
            entry.time = time;
        }
        
        public static void access$1(final Entry entry, final long moofOffset) {
            entry.moofOffset = moofOffset;
        }
        
        public static void access$2(final Entry entry, final long trafNumber) {
            entry.trafNumber = trafNumber;
        }
        
        public static void access$3(final Entry entry, final long trunNumber) {
            entry.trunNumber = trunNumber;
        }
        
        public static void access$4(final Entry entry, final long sampleNumber) {
            entry.sampleNumber = sampleNumber;
        }
        
        public static long access$5(final Entry entry) {
            return entry.time;
        }
        
        public static long access$6(final Entry entry) {
            return entry.moofOffset;
        }
        
        public static long access$7(final Entry entry) {
            return entry.trafNumber;
        }
        
        public static long access$8(final Entry entry) {
            return entry.trunNumber;
        }
        
        public static long access$9(final Entry entry) {
            return entry.sampleNumber;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final Entry entry = (Entry)o;
                return this.moofOffset == entry.moofOffset && this.sampleNumber == entry.sampleNumber && this.time == entry.time && this.trafNumber == entry.trafNumber && this.trunNumber == entry.trunNumber;
            }
            return false;
        }
        
        public long getMoofOffset() {
            return this.moofOffset;
        }
        
        public long getSampleNumber() {
            return this.sampleNumber;
        }
        
        public long getTime() {
            return this.time;
        }
        
        public long getTrafNumber() {
            return this.trafNumber;
        }
        
        public long getTrunNumber() {
            return this.trunNumber;
        }
        
        @Override
        public int hashCode() {
            final long time = this.time;
            final int n = (int)(time ^ time >>> 32);
            final long moofOffset = this.moofOffset;
            final int n2 = (int)(moofOffset ^ moofOffset >>> 32);
            final long trafNumber = this.trafNumber;
            final int n3 = (int)(trafNumber ^ trafNumber >>> 32);
            final long trunNumber = this.trunNumber;
            final int n4 = (int)(trunNumber ^ trunNumber >>> 32);
            final long sampleNumber = this.sampleNumber;
            return (((n * 31 + n2) * 31 + n3) * 31 + n4) * 31 + (int)(sampleNumber >>> 32 ^ sampleNumber);
        }
        
        public void setMoofOffset(final long moofOffset) {
            this.moofOffset = moofOffset;
        }
        
        public void setSampleNumber(final long sampleNumber) {
            this.sampleNumber = sampleNumber;
        }
        
        public void setTime(final long time) {
            this.time = time;
        }
        
        public void setTrafNumber(final long trafNumber) {
            this.trafNumber = trafNumber;
        }
        
        public void setTrunNumber(final long trunNumber) {
            this.trunNumber = trunNumber;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{time=");
            sb.append(this.time);
            sb.append(", moofOffset=");
            sb.append(this.moofOffset);
            sb.append(", trafNumber=");
            sb.append(this.trafNumber);
            sb.append(", trunNumber=");
            sb.append(this.trunNumber);
            sb.append(", sampleNumber=");
            return k.k(sb, this.sampleNumber, '}');
        }
    }
}
