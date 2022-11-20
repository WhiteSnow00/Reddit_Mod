// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.BasicContainer;
import o9.b;
import java.util.Iterator;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import if0.a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class SampleDescriptionBox extends AbstractContainerBox implements FullBox
{
    public static final String TYPE = "stsd";
    private int flags;
    private int version;
    
    public SampleDescriptionBox() {
        super("stsd");
    }
    
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        a.o0(this.version, allocate);
        a.n0(this.flags, allocate);
        allocate.putInt(((BasicContainer)this).getBoxes().size());
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((BasicContainer)this).writeContainer(writableByteChannel);
    }
    
    public int getFlags() {
        return this.flags;
    }
    
    public AbstractSampleEntry getSampleEntry() {
        final Iterator iterator = ((BasicContainer)this).getBoxes((Class)AbstractSampleEntry.class).iterator();
        if (iterator.hasNext()) {
            return (AbstractSampleEntry)iterator.next();
        }
        return null;
    }
    
    public long getSize() {
        final long n = ((BasicContainer)this).getContainerSize() + 8L;
        int n2;
        if (!super.largeBox && 8L + n < 4294967296L) {
            n2 = 8;
        }
        else {
            n2 = 16;
        }
        return n + n2;
    }
    
    public int getVersion() {
        return this.version;
    }
    
    public void parse(final com.googlecode.mp4parser.a a, ByteBuffer allocate, final long n, final b b) throws IOException {
        allocate = ByteBuffer.allocate(8);
        a.read(allocate);
        allocate.rewind();
        int value;
        final byte b2 = (byte)(value = allocate.get());
        if (b2 < 0) {
            value = b2 + 256;
        }
        this.version = value;
        this.flags = xd.a.T0(allocate);
        this.initContainer(a, n - 8L, b);
    }
    
    public void setFlags(final int flags) {
        this.flags = flags;
    }
    
    public void setVersion(final int version) {
        this.version = version;
    }
}
