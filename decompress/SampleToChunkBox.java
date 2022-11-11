// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import ak0.n;
import java.util.ArrayList;
import mk2.e;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import java.util.Collections;
import java.util.List;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleToChunkBox extends AbstractFullBox
{
    public static final String TYPE = "stsc";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    public List<SampleToChunkBox.SampleToChunkBox$Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SampleToChunkBox() {
        super("stsc");
        this.entries = Collections.emptyList();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("SampleToChunkBox.java", (Class)SampleToChunkBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        ajc$tjp_3 = (a)b.f(b.e("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int e = mk2.e.E(c0.a0(byteBuffer));
        this.entries = new ArrayList<SampleToChunkBox.SampleToChunkBox$Entry>(e);
        for (int i = 0; i < e; ++i) {
            this.entries.add(new SampleToChunkBox.SampleToChunkBox$Entry(c0.a0(byteBuffer), c0.a0(byteBuffer), c0.a0(byteBuffer)));
        }
    }
    
    public long[] blowup(int i) {
        n.x(b.c(SampleToChunkBox.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(i)));
        final long[] array = new long[i];
        final LinkedList list = new LinkedList((Collection<? extends E>)this.entries);
        Collections.reverse(list);
        final Iterator iterator = list.iterator();
        SampleToChunkBox.SampleToChunkBox$Entry sampleToChunkBox$Entry = (SampleToChunkBox.SampleToChunkBox$Entry)iterator.next();
        while (i > 1) {
            final int n = i - 1;
            array[n] = sampleToChunkBox$Entry.getSamplesPerChunk();
            SampleToChunkBox.SampleToChunkBox$Entry sampleToChunkBox$Entry2 = sampleToChunkBox$Entry;
            if (i == sampleToChunkBox$Entry.getFirstChunk()) {
                sampleToChunkBox$Entry2 = (SampleToChunkBox.SampleToChunkBox$Entry)iterator.next();
            }
            i = n;
            sampleToChunkBox$Entry = sampleToChunkBox$Entry2;
        }
        array[0] = sampleToChunkBox$Entry.getSamplesPerChunk();
        return array;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final SampleToChunkBox.SampleToChunkBox$Entry sampleToChunkBox$Entry : this.entries) {
            byteBuffer.putInt((int)sampleToChunkBox$Entry.getFirstChunk());
            byteBuffer.putInt((int)sampleToChunkBox$Entry.getSamplesPerChunk());
            byteBuffer.putInt((int)sampleToChunkBox$Entry.getSampleDescriptionIndex());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 12 + 8;
    }
    
    public List<SampleToChunkBox.SampleToChunkBox$Entry> getEntries() {
        n.x(b.b(SampleToChunkBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<SampleToChunkBox.SampleToChunkBox$Entry> entries) {
        n.x(b.c(SampleToChunkBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(SampleToChunkBox.ajc$tjp_2, (Object)this, (Object)this), "SampleToChunkBox[entryCount=");
        q.append(this.entries.size());
        q.append("]");
        return q.toString();
    }
}
