// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import b5.k;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;
import px0.c;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.Collections;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleToChunkBox extends AbstractFullBox
{
    public static final String TYPE = "stsc";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    public List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SampleToChunkBox() {
        super("stsc");
        this.entries = Collections.emptyList();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("SampleToChunkBox.java", (Class)SampleToChunkBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        ajc$tjp_3 = (a)b.f(b.e("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int d2 = c.D2(xd.a.U0(byteBuffer));
        this.entries = new ArrayList<Entry>(d2);
        for (int i = 0; i < d2; ++i) {
            this.entries.add(new Entry(xd.a.U0(byteBuffer), xd.a.U0(byteBuffer), xd.a.U0(byteBuffer)));
        }
    }
    
    public long[] blowup(int i) {
        m5.a.s(b.c(SampleToChunkBox.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(i)));
        final long[] array = new long[i];
        final LinkedList list = new LinkedList((Collection<? extends E>)this.entries);
        Collections.reverse(list);
        final Iterator iterator = list.iterator();
        Entry entry = (Entry)iterator.next();
        while (i > 1) {
            final int n = i - 1;
            array[n] = entry.getSamplesPerChunk();
            Entry entry2 = entry;
            if (i == entry.getFirstChunk()) {
                entry2 = (Entry)iterator.next();
            }
            i = n;
            entry = entry2;
        }
        array[0] = entry.getSamplesPerChunk();
        return array;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final Entry entry : this.entries) {
            byteBuffer.putInt((int)entry.getFirstChunk());
            byteBuffer.putInt((int)entry.getSamplesPerChunk());
            byteBuffer.putInt((int)entry.getSampleDescriptionIndex());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 12 + 8;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(SampleToChunkBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(SampleToChunkBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(SampleToChunkBox.ajc$tjp_2, (Object)this, (Object)this), "SampleToChunkBox[entryCount=");
        p.append(this.entries.size());
        p.append("]");
        return p.toString();
    }
    
    public static class Entry
    {
        public long firstChunk;
        public long sampleDescriptionIndex;
        public long samplesPerChunk;
        
        public Entry(final long firstChunk, final long samplesPerChunk, final long sampleDescriptionIndex) {
            this.firstChunk = firstChunk;
            this.samplesPerChunk = samplesPerChunk;
            this.sampleDescriptionIndex = sampleDescriptionIndex;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final Entry entry = (Entry)o;
                return this.firstChunk == entry.firstChunk && this.sampleDescriptionIndex == entry.sampleDescriptionIndex && this.samplesPerChunk == entry.samplesPerChunk;
            }
            return false;
        }
        
        public long getFirstChunk() {
            return this.firstChunk;
        }
        
        public long getSampleDescriptionIndex() {
            return this.sampleDescriptionIndex;
        }
        
        public long getSamplesPerChunk() {
            return this.samplesPerChunk;
        }
        
        @Override
        public int hashCode() {
            final long firstChunk = this.firstChunk;
            final int n = (int)(firstChunk ^ firstChunk >>> 32);
            final long samplesPerChunk = this.samplesPerChunk;
            final int n2 = (int)(samplesPerChunk ^ samplesPerChunk >>> 32);
            final long sampleDescriptionIndex = this.sampleDescriptionIndex;
            return (n * 31 + n2) * 31 + (int)(sampleDescriptionIndex >>> 32 ^ sampleDescriptionIndex);
        }
        
        public void setFirstChunk(final long firstChunk) {
            this.firstChunk = firstChunk;
        }
        
        public void setSampleDescriptionIndex(final long sampleDescriptionIndex) {
            this.sampleDescriptionIndex = sampleDescriptionIndex;
        }
        
        public void setSamplesPerChunk(final long samplesPerChunk) {
            this.samplesPerChunk = samplesPerChunk;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{firstChunk=");
            sb.append(this.firstChunk);
            sb.append(", samplesPerChunk=");
            sb.append(this.samplesPerChunk);
            sb.append(", sampleDescriptionIndex=");
            return k.k(sb, this.sampleDescriptionIndex, '}');
        }
    }
}
