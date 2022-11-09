// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import yt2.c;
import ak0.m;
import com.googlecode.mp4parser.e;
import ak0.n;
import java.util.Iterator;
import java.nio.ByteBuffer;
import yt2.b;
import java.util.ArrayList;
import java.util.List;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleDependencyTypeBox extends AbstractFullBox
{
    public static final String TYPE = "sdtp";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private List<SampleDependencyTypeBox.SampleDependencyTypeBox$Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SampleDependencyTypeBox() {
        super("sdtp");
        this.entries = new ArrayList<SampleDependencyTypeBox.SampleDependencyTypeBox$Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("SampleDependencyTypeBox.java", (Class)SampleDependencyTypeBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            final List<SampleDependencyTypeBox.SampleDependencyTypeBox$Entry> entries = this.entries;
            final byte value = byteBuffer.get();
            int n;
            if ((n = value) < 0) {
                n = value + 256;
            }
            entries.add(new SampleDependencyTypeBox.SampleDependencyTypeBox$Entry(n));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        final Iterator<SampleDependencyTypeBox.SampleDependencyTypeBox$Entry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            byteBuffer.put((byte)(SampleDependencyTypeBox.SampleDependencyTypeBox$Entry.access$0((SampleDependencyTypeBox.SampleDependencyTypeBox$Entry)iterator.next()) & 0xFF));
        }
    }
    
    public long getContentSize() {
        return this.entries.size() + 4;
    }
    
    public List<SampleDependencyTypeBox.SampleDependencyTypeBox$Entry> getEntries() {
        n.x(b.b(SampleDependencyTypeBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<SampleDependencyTypeBox.SampleDependencyTypeBox$Entry> entries) {
        n.x(b.c(SampleDependencyTypeBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final c b = yt2.b.b(SampleDependencyTypeBox.ajc$tjp_2, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("SampleDependencyTypeBox");
        sb.append("{entries=");
        return m.n(sb, (List)this.entries, '}');
    }
}
