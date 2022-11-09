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
import java.util.ArrayList;
import java.util.List;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SubSampleInformationBox extends AbstractFullBox
{
    public static final String TYPE = "subs";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private List<SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry> entries;
    
    static {
        ajc$preClinit();
    }
    
    public SubSampleInformationBox() {
        super("subs");
        this.entries = new ArrayList<SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("SubSampleInformationBox.java", (Class)SubSampleInformationBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = (a)b.f(b.e("setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        ajc$tjp_2 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final long a0 = c0.a0(byteBuffer);
        for (int n = 0; n < a0; ++n) {
            final SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry subSampleInformationBox$SubSampleEntry = new SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry();
            subSampleInformationBox$SubSampleEntry.setSampleDelta(c0.a0(byteBuffer));
            for (int y = c0.Y(byteBuffer), i = 0; i < y; ++i) {
                final SubSampleInformationBox$SubSampleEntry$SubsampleEntry subSampleInformationBox$SubSampleEntry$SubsampleEntry = new SubSampleInformationBox$SubSampleEntry$SubsampleEntry();
                long a2;
                if (this.getVersion() == 1) {
                    a2 = c0.a0(byteBuffer);
                }
                else {
                    a2 = c0.Y(byteBuffer);
                }
                subSampleInformationBox$SubSampleEntry$SubsampleEntry.setSubsampleSize(a2);
                int value;
                final byte b = (byte)(value = byteBuffer.get());
                if (b < 0) {
                    value = b + 256;
                }
                subSampleInformationBox$SubSampleEntry$SubsampleEntry.setSubsamplePriority(value);
                final byte value2 = byteBuffer.get();
                int discardable;
                if ((discardable = value2) < 0) {
                    discardable = value2 + 256;
                }
                subSampleInformationBox$SubSampleEntry$SubsampleEntry.setDiscardable(discardable);
                subSampleInformationBox$SubSampleEntry$SubsampleEntry.setReserved(c0.a0(byteBuffer));
                subSampleInformationBox$SubSampleEntry.getSubsampleEntries().add(subSampleInformationBox$SubSampleEntry$SubsampleEntry);
            }
            this.entries.add(subSampleInformationBox$SubSampleEntry);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.entries.size());
        for (final SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry subSampleInformationBox$SubSampleEntry : this.entries) {
            byteBuffer.putInt((int)subSampleInformationBox$SubSampleEntry.getSampleDelta());
            ah.a.m0(subSampleInformationBox$SubSampleEntry.getSubsampleCount(), byteBuffer);
            for (final SubSampleInformationBox$SubSampleEntry$SubsampleEntry subSampleInformationBox$SubSampleEntry$SubsampleEntry : subSampleInformationBox$SubSampleEntry.getSubsampleEntries()) {
                if (this.getVersion() == 1) {
                    byteBuffer.putInt((int)subSampleInformationBox$SubSampleEntry$SubsampleEntry.getSubsampleSize());
                }
                else {
                    ah.a.m0(e.E(subSampleInformationBox$SubSampleEntry$SubsampleEntry.getSubsampleSize()), byteBuffer);
                }
                byteBuffer.put((byte)(subSampleInformationBox$SubSampleEntry$SubsampleEntry.getSubsamplePriority() & 0xFF));
                byteBuffer.put((byte)(subSampleInformationBox$SubSampleEntry$SubsampleEntry.getDiscardable() & 0xFF));
                byteBuffer.putInt((int)subSampleInformationBox$SubSampleEntry$SubsampleEntry.getReserved());
            }
        }
    }
    
    public long getContentSize() {
        final Iterator<SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry> iterator = this.entries.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            final SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry subSampleInformationBox$SubSampleEntry = iterator.next();
            n = n + 4L + 2L;
            for (int i = 0; i < subSampleInformationBox$SubSampleEntry.getSubsampleEntries().size(); ++i) {
                long n2;
                if (this.getVersion() == 1) {
                    n2 = n + 4L;
                }
                else {
                    n2 = n + 2L;
                }
                n = n2 + 2L + 4L;
            }
        }
        return n;
    }
    
    public List<SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry> getEntries() {
        n.x(b.b(SubSampleInformationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.entries;
    }
    
    public void setEntries(final List<SubSampleInformationBox.SubSampleInformationBox$SubSampleEntry> entries) {
        n.x(b.c(SubSampleInformationBox.ajc$tjp_1, (Object)this, (Object)this, (Object)entries));
        this.entries = entries;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(SubSampleInformationBox.ajc$tjp_2, (Object)this, (Object)this), "SubSampleInformationBox{entryCount=");
        q.append(this.entries.size());
        q.append(", entries=");
        return m.n(q, (List)this.entries, '}');
    }
}
