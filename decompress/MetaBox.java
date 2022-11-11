// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.d;
import mj2.c0;
import mk2.e;
import o9.b;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MetaBox extends AbstractContainerBox
{
    public static final String TYPE = "meta";
    private int flags;
    private boolean isFullBox;
    private int version;
    
    public MetaBox() {
        super("meta");
        this.isFullBox = true;
    }
    
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        if (this.isFullBox) {
            final ByteBuffer allocate = ByteBuffer.allocate(4);
            this.writeVersionAndFlags(allocate);
            writableByteChannel.write((ByteBuffer)allocate.rewind());
        }
        ((BasicContainer)this).writeContainer(writableByteChannel);
    }
    
    public int getFlags() {
        return this.flags;
    }
    
    public long getSize() {
        final long containerSize = ((BasicContainer)this).getContainerSize();
        long n;
        if (this.isFullBox) {
            n = 4L;
        }
        else {
            n = 0L;
        }
        final long n2 = containerSize + n;
        int n3;
        if (!super.largeBox && n2 < 4294967296L) {
            n3 = 8;
        }
        else {
            n3 = 16;
        }
        return n2 + n3;
    }
    
    public int getVersion() {
        return this.version;
    }
    
    public void parse(final a a, ByteBuffer allocate, final long n, final b b) throws IOException {
        allocate = ByteBuffer.allocate(e.E(n));
        a.read(allocate);
        allocate.position(4);
        if ("hdlr".equals(c0.Q(allocate))) {
            this.isFullBox = false;
            this.initContainer((a)new d((ByteBuffer)allocate.rewind()), n, b);
        }
        else {
            this.isFullBox = true;
            this.parseVersionAndFlags((ByteBuffer)allocate.rewind());
            this.initContainer((a)new d(allocate), n - 4L, b);
        }
    }
    
    public final long parseVersionAndFlags(final ByteBuffer byteBuffer) {
        int value;
        final byte b = (byte)(value = byteBuffer.get());
        if (b < 0) {
            value = b + 256;
        }
        this.version = value;
        this.flags = c0.Z(byteBuffer);
        return 4L;
    }
    
    public void setFlags(final int flags) {
        this.flags = flags;
    }
    
    public void setVersion(final int version) {
        this.version = version;
    }
    
    public final void writeVersionAndFlags(final ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.version & 0xFF));
        ah.a.n0(this.flags, byteBuffer);
    }
}
