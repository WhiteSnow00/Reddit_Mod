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
import java.util.WeakHashMap;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class TimeToSampleBox extends AbstractFullBox
{
    public static final String TYPE = "stts";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    public static Map<List<TimeToSampleBox.TimeToSampleBox$Entry>, SoftReference<long[]>> cache;
    public List<TimeToSampleBox.TimeToSampleBox$Entry> entries;
    
    static {
        ajc$preClinit();
        TimeToSampleBox.cache = new WeakHashMap<List<TimeToSampleBox.TimeToSampleBox$Entry>, SoftReference<long[]>>();
    }
    
    public TimeToSampleBox() {
        super("stts");
        this.entries = Collections.emptyList();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("TimeToSampleBox.java", (Class)TimeToSampleBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }
    
    public static long[] blowupTimeToSamples(final List<TimeToSampleBox.TimeToSampleBox$Entry> list) {
        synchronized (TimeToSampleBox.class) {
            final SoftReference softReference = TimeToSampleBox.cache.get(list);
            if (softReference != null) {
                final long[] array = (long[])softReference.get();
                if (array != null) {
                    return array;
                }
            }
            long n = 0L;
            final Iterator<TimeToSampleBox.TimeToSampleBox$Entry> iterator = list.iterator();
            while (iterator.hasNext()) {
                n += iterator.next().getCount();
            }
            final long[] array2 = new long[(int)n];
            final Iterator<TimeToSampleBox.TimeToSampleBox$Entry> iterator2 = list.iterator();
            int n2 = 0;
            while (iterator2.hasNext()) {
                final TimeToSampleBox.TimeToSampleBox$Entry timeToSampleBox$Entry = iterator2.next();
                for (int n3 = 0; n3 < timeToSampleBox$Entry.getCount(); ++n3, ++n2) {
                    array2[n2] = timeToSampleBox$Entry.getDelta();
                }
            }
            TimeToSampleBox.cache.put(list, new SoftReference<long[]>(array2));
            return array2;
        }
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int e = mk2.e.E(c0.a0(byteBuffer));
        this.entries = new ArrayList<TimeToSampleBox.TimeToSampleBox$Entry>(e);
        for (int i = 0; i < e; ++i) {
            this.entries.add(new TimeToSampleBox.TimeToSampleBox$Entry(c0.a0(byteBuffer), c0.a0(byteBuffer)));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final TimeToSampleBox.TimeToSampleBox$Entry timeToSampleBox$Entry : this.entries) {
            byteBuffer.putInt((int)timeToSampleBox$Entry.getCount());
            byteBuffer.putInt((int)timeToSampleBox$Entry.getDelta());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 8 + 8;
    }
    
    public List<TimeToSampleBox.TimeToSampleBox$Entry> getEntries() {
        n.x(b.b(TimeToSampleBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<TimeToSampleBox.TimeToSampleBox$Entry> entries) {
        n.x(b.c(TimeToSampleBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(TimeToSampleBox.ajc$tjp_2, (Object)this, (Object)this), "TimeToSampleBox[entryCount=");
        q.append(this.entries.size());
        q.append("]");
        return q.toString();
    }
}
