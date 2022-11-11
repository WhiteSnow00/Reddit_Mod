// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.m;
import ak0.n;
import java.util.Iterator;
import mk2.e;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import java.util.LinkedList;
import java.util.List;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class EditListBox extends AbstractFullBox
{
    public static final String TYPE = "elst";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private List<EditListBox.EditListBox$Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public EditListBox() {
        super("elst");
        this.entries = new LinkedList<EditListBox.EditListBox$Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("EditListBox.java", (Class)EditListBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final int e = mk2.e.E(c0.a0(byteBuffer));
        this.entries = new LinkedList<EditListBox.EditListBox$Entry>();
        for (int i = 0; i < e; ++i) {
            this.entries.add(new EditListBox.EditListBox$Entry(this, byteBuffer));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        final Iterator<EditListBox.EditListBox$Entry> iterator = this.entries.iterator();
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
    
    public List<EditListBox.EditListBox$Entry> getEntries() {
        n.x(b.b(EditListBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<EditListBox.EditListBox$Entry> entries) {
        n.x(b.c(EditListBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        return m.n(ag0.a.q(b.b(EditListBox.ajc$tjp_2, (Object)this, (Object)this), "EditListBox{entries="), (List)this.entries, '}');
    }
}
