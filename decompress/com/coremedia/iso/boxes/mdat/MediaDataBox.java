// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.mdat;

import n9.b;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.a;
import com.coremedia.iso.boxes.Box;

public final class MediaDataBox implements Box
{
    public static final String TYPE = "mdat";
    private a dataSource;
    private long offset;
    public Container parent;
    private long size;
    
    private static void transfer(final a a, final long n, final long n2, final WritableByteChannel writableByteChannel) throws IOException {
        for (long n3 = 0L; n3 < n2; n3 += a.transferTo(n + n3, Math.min(67076096L, n2 - n3), writableByteChannel)) {}
    }
    
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }
    
    public long getOffset() {
        return this.offset;
    }
    
    public Container getParent() {
        return this.parent;
    }
    
    public long getSize() {
        return this.size;
    }
    
    public String getType() {
        return "mdat";
    }
    
    public void parse(final a dataSource, final ByteBuffer byteBuffer, final long n, final b b) throws IOException {
        this.offset = dataSource.position() - byteBuffer.remaining();
        this.dataSource = dataSource;
        this.size = byteBuffer.remaining() + n;
        dataSource.position(dataSource.position() + n);
    }
    
    public void setParent(final Container parent) {
        this.parent = parent;
    }
    
    @Override
    public String toString() {
        return b.i(new StringBuilder("MediaDataBox{size="), this.size, '}');
    }
}
