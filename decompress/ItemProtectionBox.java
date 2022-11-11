// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.BasicContainer;
import mj2.c0;
import o9.b;
import java.io.IOException;
import ah.a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class ItemProtectionBox extends AbstractContainerBox implements FullBox
{
    public static final String TYPE = "ipro";
    private int flags;
    private int version;
    
    public ItemProtectionBox() {
        super("ipro");
    }
    
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(6);
        a.o0(this.version, allocate);
        a.n0(this.flags, allocate);
        a.m0(((BasicContainer)this).getBoxes().size(), allocate);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((BasicContainer)this).writeContainer(writableByteChannel);
    }
    
    public int getFlags() {
        return this.flags;
    }
    
    public SchemeInformationBox getItemProtectionScheme() {
        if (!((BasicContainer)this).getBoxes((Class)SchemeInformationBox.class).isEmpty()) {
            return ((BasicContainer)this).getBoxes((Class)SchemeInformationBox.class).get(0);
        }
        return null;
    }
    
    public long getSize() {
        final long n = ((BasicContainer)this).getContainerSize() + 6L;
        int n2;
        if (!super.largeBox && n < 4294967296L) {
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
        allocate = ByteBuffer.allocate(6);
        a.read(allocate);
        allocate.rewind();
        int value;
        final byte b2 = (byte)(value = allocate.get());
        if (b2 < 0) {
            value = b2 + 256;
        }
        this.version = value;
        this.flags = c0.Z(allocate);
        this.initContainer(a, n - 6L, b);
    }
    
    public void setFlags(final int flags) {
        this.flags = flags;
    }
    
    public void setVersion(final int version) {
        this.version = version;
    }
}
