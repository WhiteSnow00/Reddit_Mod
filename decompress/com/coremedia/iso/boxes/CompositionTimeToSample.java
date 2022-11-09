// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import java.util.ArrayList;
import mk2.e;
import mj2.c0;
import java.nio.ByteBuffer;
import java.util.Iterator;
import yt2.b;
import java.util.Collections;
import java.util.List;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class CompositionTimeToSample extends AbstractFullBox
{
    public static final String TYPE = "ctts";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    public List<CompositionTimeToSample.CompositionTimeToSample$Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public CompositionTimeToSample() {
        super("ctts");
        this.entries = Collections.emptyList();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("CompositionTimeToSample.java", (Class)CompositionTimeToSample.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "", "void"), 61);
    }
    
    public static int[] blowupCompositionTimes(final List<CompositionTimeToSample.CompositionTimeToSample$Entry> list) {
        final Iterator<CompositionTimeToSample.CompositionTimeToSample$Entry> iterator = list.iterator();
        long n = 0L;
        while (iterator.hasNext()) {
            n += iterator.next().getCount();
        }
        final int[] array = new int[(int)n];
        final Iterator<CompositionTimeToSample.CompositionTimeToSample$Entry> iterator2 = list.iterator();
        int n2 = 0;
        while (iterator2.hasNext()) {
            final CompositionTimeToSample.CompositionTimeToSample$Entry compositionTimeToSample$Entry = iterator2.next();
            for (int i = 0; i < compositionTimeToSample$Entry.getCount(); ++i, ++n2) {
                array[n2] = compositionTimeToSample$Entry.getOffset();
            }
        }
        return array;
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int e = mk2.e.E(c0.a0(byteBuffer));
        this.entries = new ArrayList<CompositionTimeToSample.CompositionTimeToSample$Entry>(e);
        for (int i = 0; i < e; ++i) {
            this.entries.add(new CompositionTimeToSample.CompositionTimeToSample$Entry(mk2.e.E(c0.a0(byteBuffer)), byteBuffer.getInt()));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final CompositionTimeToSample.CompositionTimeToSample$Entry compositionTimeToSample$Entry : this.entries) {
            byteBuffer.putInt(compositionTimeToSample$Entry.getCount());
            byteBuffer.putInt(compositionTimeToSample$Entry.getOffset());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 8 + 8;
    }
    
    public List<CompositionTimeToSample.CompositionTimeToSample$Entry> getEntries() {
        n.x(b.b(CompositionTimeToSample.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<CompositionTimeToSample.CompositionTimeToSample$Entry> entries) {
        n.x(b.c(CompositionTimeToSample.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
}
