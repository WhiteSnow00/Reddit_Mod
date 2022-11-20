// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import p1.h;
import java.util.Iterator;
import px0.c;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.LinkedList;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class EditListBox extends AbstractFullBox
{
    public static final String TYPE = "elst";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public EditListBox() {
        super("elst");
        this.entries = new LinkedList<Entry>();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("EditListBox.java", (Class)EditListBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int d2 = c.D2(xd.a.U0(byteBuffer));
        this.entries = new LinkedList<Entry>();
        for (int i = 0; i < d2; ++i) {
            this.entries.add(new Entry(this, byteBuffer));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        final Iterator<Entry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            iterator.next().getContent(byteBuffer);
        }
    }
    
    public long getContentSize() {
        int n;
        if (this.getVersion() == 1) {
            n = this.entries.size() * 20;
        }
        else {
            n = this.entries.size() * 12;
        }
        return n + 8L;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(EditListBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(EditListBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        return h.d(b.p(b.b(EditListBox.ajc$tjp_2, (Object)this, (Object)this), "EditListBox{entries="), (List)this.entries, '}');
    }
    
    public static class Entry
    {
        public EditListBox editListBox;
        private double mediaRate;
        private long mediaTime;
        private long segmentDuration;
        
        public Entry(final EditListBox editListBox, final long segmentDuration, final long mediaTime, final double mediaRate) {
            this.segmentDuration = segmentDuration;
            this.mediaTime = mediaTime;
            this.mediaRate = mediaRate;
            this.editListBox = editListBox;
        }
        
        public Entry(final EditListBox editListBox, final ByteBuffer byteBuffer) {
            if (editListBox.getVersion() == 1) {
                this.segmentDuration = xd.a.V0(byteBuffer);
                this.mediaTime = byteBuffer.getLong();
                this.mediaRate = xd.a.M0(byteBuffer);
            }
            else {
                this.segmentDuration = xd.a.U0(byteBuffer);
                this.mediaTime = byteBuffer.getInt();
                this.mediaRate = xd.a.M0(byteBuffer);
            }
            this.editListBox = editListBox;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final Entry entry = (Entry)o;
                return this.mediaTime == entry.mediaTime && this.segmentDuration == entry.segmentDuration;
            }
            return false;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            if (this.editListBox.getVersion() == 1) {
                byteBuffer.putLong(this.segmentDuration);
                byteBuffer.putLong(this.mediaTime);
            }
            else {
                byteBuffer.putInt(c.D2(this.segmentDuration));
                byteBuffer.putInt(c.D2(this.mediaTime));
            }
            if0.a.j0(byteBuffer, this.mediaRate);
        }
        
        public double getMediaRate() {
            return this.mediaRate;
        }
        
        public long getMediaTime() {
            return this.mediaTime;
        }
        
        public long getSegmentDuration() {
            return this.segmentDuration;
        }
        
        @Override
        public int hashCode() {
            final long segmentDuration = this.segmentDuration;
            final int n = (int)(segmentDuration ^ segmentDuration >>> 32);
            final long mediaTime = this.mediaTime;
            return n * 31 + (int)(mediaTime >>> 32 ^ mediaTime);
        }
        
        public void setMediaRate(final double mediaRate) {
            this.mediaRate = mediaRate;
        }
        
        public void setMediaTime(final long mediaTime) {
            this.mediaTime = mediaTime;
        }
        
        public void setSegmentDuration(final long segmentDuration) {
            this.segmentDuration = segmentDuration;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{segmentDuration=");
            sb.append(this.segmentDuration);
            sb.append(", mediaTime=");
            sb.append(this.mediaTime);
            sb.append(", mediaRate=");
            return a.p(sb, this.mediaRate, '}');
        }
    }
}
