// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import b5.k;
import java.util.ArrayList;
import px0.c;
import java.nio.ByteBuffer;
import java.util.Iterator;
import mt2.b;
import java.util.Collections;
import java.util.WeakHashMap;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TimeToSampleBox extends AbstractFullBox
{
    public static final boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    public static Map<List<Entry>, SoftReference<long[]>> cache;
    public List<Entry> entries;
    
    static {
        ajc$preClinit();
        TimeToSampleBox.cache = new WeakHashMap<List<Entry>, SoftReference<long[]>>();
    }
    
    public TimeToSampleBox() {
        super("stts");
        this.entries = Collections.emptyList();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TimeToSampleBox.java", (Class)TimeToSampleBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }
    
    public static long[] blowupTimeToSamples(final List<Entry> list) {
        synchronized (TimeToSampleBox.class) {
            final SoftReference softReference = TimeToSampleBox.cache.get(list);
            if (softReference != null) {
                final long[] array = (long[])softReference.get();
                if (array != null) {
                    return array;
                }
            }
            long n = 0L;
            final Iterator<Entry> iterator = list.iterator();
            while (iterator.hasNext()) {
                n += iterator.next().getCount();
            }
            final long[] array2 = new long[(int)n];
            final Iterator<Entry> iterator2 = list.iterator();
            int n2 = 0;
            while (iterator2.hasNext()) {
                final Entry entry = iterator2.next();
                for (int n3 = 0; n3 < entry.getCount(); ++n3, ++n2) {
                    array2[n2] = entry.getDelta();
                }
            }
            TimeToSampleBox.cache.put(list, new SoftReference<long[]>(array2));
            return array2;
        }
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int d2 = c.D2(xd.a.U0(byteBuffer));
        this.entries = new ArrayList<Entry>(d2);
        for (int i = 0; i < d2; ++i) {
            this.entries.add(new Entry(xd.a.U0(byteBuffer), xd.a.U0(byteBuffer)));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final Entry entry : this.entries) {
            byteBuffer.putInt((int)entry.getCount());
            byteBuffer.putInt((int)entry.getDelta());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 8 + 8;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(TimeToSampleBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(TimeToSampleBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final StringBuilder p = b.p(b.b(TimeToSampleBox.ajc$tjp_2, (Object)this, (Object)this), "TimeToSampleBox[entryCount=");
        p.append(this.entries.size());
        p.append("]");
        return p.toString();
    }
    
    public static class Entry
    {
        public long count;
        public long delta;
        
        public Entry(final long count, final long delta) {
            this.count = count;
            this.delta = delta;
        }
        
        public long getCount() {
            return this.count;
        }
        
        public long getDelta() {
            return this.delta;
        }
        
        public void setCount(final long count) {
            this.count = count;
        }
        
        public void setDelta(final long delta) {
            this.delta = delta;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{count=");
            sb.append(this.count);
            sb.append(", delta=");
            return k.k(sb, this.delta, '}');
        }
    }
}
