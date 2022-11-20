// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import mt2.c;
import p1.h;
import com.googlecode.mp4parser.e;
import java.util.Iterator;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.ArrayList;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleDependencyTypeBox extends AbstractFullBox
{
    public static final String TYPE = "sdtp";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SampleDependencyTypeBox() {
        super("sdtp");
        this.entries = new ArrayList<Entry>();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("SampleDependencyTypeBox.java", (Class)SampleDependencyTypeBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            final List<Entry> entries = this.entries;
            final byte value = byteBuffer.get();
            int n;
            if ((n = value) < 0) {
                n = value + 256;
            }
            entries.add(new Entry(n));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        final Iterator<Entry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            byteBuffer.put((byte)(Entry.access$0(iterator.next()) & 0xFF));
        }
    }
    
    public long getContentSize() {
        return this.entries.size() + 4;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(SampleDependencyTypeBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(SampleDependencyTypeBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final c b = mt2.b.b(SampleDependencyTypeBox.ajc$tjp_2, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("SampleDependencyTypeBox");
        sb.append("{entries=");
        return h.d(sb, (List)this.entries, '}');
    }
    
    public static class Entry
    {
        private int value;
        
        public Entry(final int value) {
            this.value = value;
        }
        
        public static int access$0(final Entry entry) {
            return entry.value;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && this.getClass() == o.getClass() && this.value == ((Entry)o).value);
        }
        
        public int getIsLeading() {
            return this.value >> 6 & 0x3;
        }
        
        public int getSampleDependsOn() {
            return this.value >> 4 & 0x3;
        }
        
        public int getSampleHasRedundancy() {
            return this.value & 0x3;
        }
        
        public int getSampleIsDependentOn() {
            return this.value >> 2 & 0x3;
        }
        
        @Override
        public int hashCode() {
            return this.value;
        }
        
        public void setIsLeading(final int n) {
            this.value = ((n & 0x3) << 6 | (this.value & 0x3F));
        }
        
        public void setSampleDependsOn(final int n) {
            this.value = ((n & 0x3) << 4 | (this.value & 0xCF));
        }
        
        public void setSampleHasRedundancy(final int n) {
            this.value = ((n & 0x3) | (this.value & 0xFC));
        }
        
        public void setSampleIsDependentOn(final int n) {
            this.value = ((n & 0x3) << 2 | (this.value & 0xF3));
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{isLeading=");
            sb.append(this.getIsLeading());
            sb.append(", sampleDependsOn=");
            sb.append(this.getSampleDependsOn());
            sb.append(", sampleIsDependentOn=");
            sb.append(this.getSampleIsDependentOn());
            sb.append(", sampleHasRedundancy=");
            sb.append(this.getSampleHasRedundancy());
            sb.append('}');
            return sb.toString();
        }
    }
}
