// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import b5.k;
import p1.h;
import java.util.Iterator;
import px0.c;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.ArrayList;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SubSampleInformationBox extends AbstractFullBox
{
    public static final String TYPE = "subs";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private List<SubSampleEntry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SubSampleInformationBox() {
        super("subs");
        this.entries = new ArrayList<SubSampleEntry>();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("SubSampleInformationBox.java", (Class)SubSampleInformationBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final long u0 = xd.a.U0(byteBuffer);
        for (int n = 0; n < u0; ++n) {
            final SubSampleEntry subSampleEntry = new SubSampleEntry();
            subSampleEntry.setSampleDelta(xd.a.U0(byteBuffer));
            for (int s0 = xd.a.S0(byteBuffer), i = 0; i < s0; ++i) {
                final SubSampleEntry.SubsampleEntry subsampleEntry = new SubSampleEntry.SubsampleEntry();
                long u2;
                if (this.getVersion() == 1) {
                    u2 = xd.a.U0(byteBuffer);
                }
                else {
                    u2 = xd.a.S0(byteBuffer);
                }
                subsampleEntry.setSubsampleSize(u2);
                int value;
                final byte b = (byte)(value = byteBuffer.get());
                if (b < 0) {
                    value = b + 256;
                }
                subsampleEntry.setSubsamplePriority(value);
                final byte value2 = byteBuffer.get();
                int discardable;
                if ((discardable = value2) < 0) {
                    discardable = value2 + 256;
                }
                subsampleEntry.setDiscardable(discardable);
                subsampleEntry.setReserved(xd.a.U0(byteBuffer));
                subSampleEntry.getSubsampleEntries().add(subsampleEntry);
            }
            this.entries.add(subSampleEntry);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final SubSampleEntry subSampleEntry : this.entries) {
            byteBuffer.putInt((int)subSampleEntry.getSampleDelta());
            if0.a.m0(subSampleEntry.getSubsampleCount(), byteBuffer);
            for (final SubSampleEntry.SubsampleEntry subsampleEntry : subSampleEntry.getSubsampleEntries()) {
                if (this.getVersion() == 1) {
                    byteBuffer.putInt((int)subsampleEntry.getSubsampleSize());
                }
                else {
                    if0.a.m0(c.D2(subsampleEntry.getSubsampleSize()), byteBuffer);
                }
                byteBuffer.put((byte)(subsampleEntry.getSubsamplePriority() & 0xFF));
                byteBuffer.put((byte)(subsampleEntry.getDiscardable() & 0xFF));
                byteBuffer.putInt((int)subsampleEntry.getReserved());
            }
        }
    }
    
    public long getContentSize() {
        final Iterator<SubSampleEntry> iterator = this.entries.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            final SubSampleEntry subSampleEntry = iterator.next();
            n = n + 4L + 2L;
            for (int i = 0; i < subSampleEntry.getSubsampleEntries().size(); ++i) {
                long n2;
                if (this.getVersion() == 1) {
                    n2 = n + 4L;
                }
                else {
                    n2 = n + 2L;
                }
                n = n2 + 2L + 4L;
            }
        }
        return n;
    }
    
    public List<SubSampleEntry> getEntries() {
        m5.a.s(b.b(SubSampleInformationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<SubSampleEntry> entries) {
        m5.a.s(b.c(SubSampleInformationBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(SubSampleInformationBox.ajc$tjp_2, (Object)this, (Object)this), "SubSampleInformationBox{entryCount=");
        p.append(this.entries.size());
        p.append(", entries=");
        return h.d(p, (List)this.entries, '}');
    }
    
    public static class SubSampleEntry
    {
        private long sampleDelta;
        private List<SubsampleEntry> subsampleEntries;
        
        public SubSampleEntry() {
            this.subsampleEntries = new ArrayList<SubsampleEntry>();
        }
        
        public long getSampleDelta() {
            return this.sampleDelta;
        }
        
        public int getSubsampleCount() {
            return this.subsampleEntries.size();
        }
        
        public List<SubsampleEntry> getSubsampleEntries() {
            return this.subsampleEntries;
        }
        
        public void setSampleDelta(final long sampleDelta) {
            this.sampleDelta = sampleDelta;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("SampleEntry{sampleDelta=");
            sb.append(this.sampleDelta);
            sb.append(", subsampleCount=");
            sb.append(this.subsampleEntries.size());
            sb.append(", subsampleEntries=");
            return h.d(sb, (List)this.subsampleEntries, '}');
        }
        
        public static class SubsampleEntry
        {
            private int discardable;
            private long reserved;
            private int subsamplePriority;
            private long subsampleSize;
            
            public int getDiscardable() {
                return this.discardable;
            }
            
            public long getReserved() {
                return this.reserved;
            }
            
            public int getSubsamplePriority() {
                return this.subsamplePriority;
            }
            
            public long getSubsampleSize() {
                return this.subsampleSize;
            }
            
            public void setDiscardable(final int discardable) {
                this.discardable = discardable;
            }
            
            public void setReserved(final long reserved) {
                this.reserved = reserved;
            }
            
            public void setSubsamplePriority(final int subsamplePriority) {
                this.subsamplePriority = subsamplePriority;
            }
            
            public void setSubsampleSize(final long subsampleSize) {
                this.subsampleSize = subsampleSize;
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("SubsampleEntry{subsampleSize=");
                sb.append(this.subsampleSize);
                sb.append(", subsamplePriority=");
                sb.append(this.subsamplePriority);
                sb.append(", discardable=");
                sb.append(this.discardable);
                sb.append(", reserved=");
                return k.k(sb, this.reserved, '}');
            }
        }
    }
}
