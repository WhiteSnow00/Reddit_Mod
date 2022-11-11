// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.m;
import ak0.n;
import java.util.Iterator;
import mj2.c0;
import java.util.LinkedList;
import java.nio.ByteBuffer;
import yt2.b;
import java.util.Collections;
import java.util.List;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class ProgressiveDownloadInformationBox extends AbstractFullBox
{
    public static final String TYPE = "pdin";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    public List<ProgressiveDownloadInformationBox.ProgressiveDownloadInformationBox$Entry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public ProgressiveDownloadInformationBox() {
        super("pdin");
        this.entries = Collections.emptyList();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("ProgressiveDownloadInformationBox.java", (Class)ProgressiveDownloadInformationBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.entries = new LinkedList<ProgressiveDownloadInformationBox.ProgressiveDownloadInformationBox$Entry>();
        while (byteBuffer.remaining() >= 8) {
            this.entries.add(new ProgressiveDownloadInformationBox.ProgressiveDownloadInformationBox$Entry(c0.a0(byteBuffer), c0.a0(byteBuffer)));
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        for (final ProgressiveDownloadInformationBox.ProgressiveDownloadInformationBox$Entry progressiveDownloadInformationBox$Entry : this.entries) {
            byteBuffer.putInt((int)progressiveDownloadInformationBox$Entry.getRate());
            byteBuffer.putInt((int)progressiveDownloadInformationBox$Entry.getInitialDelay());
        }
    }
    
    public long getContentSize() {
        return this.entries.size() * 8 + 4;
    }
    
    public List<ProgressiveDownloadInformationBox.ProgressiveDownloadInformationBox$Entry> getEntries() {
        n.x(b.b(ProgressiveDownloadInformationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<ProgressiveDownloadInformationBox.ProgressiveDownloadInformationBox$Entry> entries) {
        n.x(b.c(ProgressiveDownloadInformationBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        return m.n(ag0.a.q(b.b(ProgressiveDownloadInformationBox.ajc$tjp_2, (Object)this, (Object)this), "ProgressiveDownloadInfoBox{entries="), (List)this.entries, '}');
    }
}
