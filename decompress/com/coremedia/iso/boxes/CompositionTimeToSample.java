// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.util.ArrayList;
import px0.c;
import java.nio.ByteBuffer;
import java.util.Iterator;
import mt2.b;
import java.util.Collections;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class CompositionTimeToSample extends AbstractFullBox
{
    public static final boolean $assertionsDisabled = false;
    public static final String TYPE = "ctts";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    public List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public CompositionTimeToSample() {
        super("ctts");
        this.entries = Collections.emptyList();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("CompositionTimeToSample.java", (Class)CompositionTimeToSample.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "", "void"), 61);
    }
    
    public static int[] blowupCompositionTimes(final List<Entry> list) {
        final Iterator<Entry> iterator = list.iterator();
        long n = 0L;
        while (iterator.hasNext()) {
            n += iterator.next().getCount();
        }
        final int[] array = new int[(int)n];
        final Iterator<Entry> iterator2 = list.iterator();
        int n2 = 0;
        while (iterator2.hasNext()) {
            final Entry entry = iterator2.next();
            for (int i = 0; i < entry.getCount(); ++i, ++n2) {
                array[n2] = entry.getOffset();
            }
        }
        return array;
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int d2 = c.D2(xd.a.U0(byteBuffer));
        this.entries = new ArrayList<Entry>(d2);
        for (int i = 0; i < d2; ++i) {
            this.entries.add(new Entry(c.D2(xd.a.U0(byteBuffer)), byteBuffer.getInt()));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final Entry entry : this.entries) {
            byteBuffer.putInt(entry.getCount());
            byteBuffer.putInt(entry.getOffset());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 8 + 8;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(CompositionTimeToSample.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(CompositionTimeToSample.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public static class Entry
    {
        public int count;
        public int offset;
        
        public Entry(final int count, final int offset) {
            this.count = count;
            this.offset = offset;
        }
        
        public int getCount() {
            return this.count;
        }
        
        public int getOffset() {
            return this.offset;
        }
        
        public void setCount(final int count) {
            this.count = count;
        }
        
        public void setOffset(final int offset) {
            this.offset = offset;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{count=");
            sb.append(this.count);
            sb.append(", offset=");
            return d.j(sb, this.offset, '}');
        }
    }
}
