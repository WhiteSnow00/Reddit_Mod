// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.dece;

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

public class TrickPlayBox extends AbstractFullBox
{
    public static final String TYPE = "trik";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public TrickPlayBox() {
        super("trik");
        this.entries = new ArrayList<Entry>();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("TrickPlayBox.java", (Class)TrickPlayBox.class);
        ajc$tjp_0 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 32);
        ajc$tjp_1 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
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
        m5.a.s(b.b(TrickPlayBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(TrickPlayBox.ajc$tjp_0, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final c b = mt2.b.b(TrickPlayBox.ajc$tjp_2, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("TrickPlayBox");
        sb.append("{entries=");
        return h.d(sb, (List)this.entries, '}');
    }
    
    public static class Entry
    {
        private int value;
        
        public Entry() {
        }
        
        public Entry(final int value) {
            this.value = value;
        }
        
        public static int access$0(final Entry entry) {
            return entry.value;
        }
        
        public int getDependencyLevel() {
            return this.value & 0x3F;
        }
        
        public int getPicType() {
            return this.value >> 6 & 0x3;
        }
        
        public void setDependencyLevel(final int n) {
            this.value |= (n & 0x3F);
        }
        
        public void setPicType(final int n) {
            this.value = ((n & 0x3) << 6 | (this.value & 0x1F));
        }
        
        @Override
        public String toString() {
            final StringBuilder q = android.support.v4.media.a.q("Entry", "{picType=");
            q.append(this.getPicType());
            q.append(",dependencyLevel=");
            q.append(this.getDependencyLevel());
            q.append('}');
            return q.toString();
        }
    }
}
