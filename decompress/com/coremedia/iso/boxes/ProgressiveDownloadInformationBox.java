// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import b5.k;
import p1.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.Collections;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class ProgressiveDownloadInformationBox extends AbstractFullBox
{
    public static final String TYPE = "pdin";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    public List<Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public ProgressiveDownloadInformationBox() {
        super("pdin");
        this.entries = Collections.emptyList();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("ProgressiveDownloadInformationBox.java", (Class)ProgressiveDownloadInformationBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.entries = new LinkedList<Entry>();
        while (byteBuffer.remaining() >= 8) {
            this.entries.add(new Entry(xd.a.U0(byteBuffer), xd.a.U0(byteBuffer)));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        for (final Entry entry : this.entries) {
            byteBuffer.putInt((int)entry.getRate());
            byteBuffer.putInt((int)entry.getInitialDelay());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 8 + 4;
    }
    
    public List<Entry> getEntries() {
        m5.a.s(b.b(ProgressiveDownloadInformationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<Entry> entries) {
        m5.a.s(b.c(ProgressiveDownloadInformationBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        return h.d(b.p(b.b(ProgressiveDownloadInformationBox.ajc$tjp_2, (Object)this, (Object)this), "ProgressiveDownloadInfoBox{entries="), (List)this.entries, '}');
    }
    
    public static class Entry
    {
        public long initialDelay;
        public long rate;
        
        public Entry(final long rate, final long initialDelay) {
            this.rate = rate;
            this.initialDelay = initialDelay;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final Entry entry = (Entry)o;
                return this.initialDelay == entry.initialDelay && this.rate == entry.rate;
            }
            return false;
        }
        
        public long getInitialDelay() {
            return this.initialDelay;
        }
        
        public long getRate() {
            return this.rate;
        }
        
        @Override
        public int hashCode() {
            final long rate = this.rate;
            final int n = (int)(rate ^ rate >>> 32);
            final long initialDelay = this.initialDelay;
            return n * 31 + (int)(initialDelay >>> 32 ^ initialDelay);
        }
        
        public void setInitialDelay(final long initialDelay) {
            this.initialDelay = initialDelay;
        }
        
        public void setRate(final long rate) {
            this.rate = rate;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{rate=");
            sb.append(this.rate);
            sb.append(", initialDelay=");
            return k.k(sb, this.initialDelay, '}');
        }
    }
}
