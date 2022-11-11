// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import n9.b;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.util.Iterator;
import java.nio.channels.WritableByteChannel;
import cg.m0;
import java.util.LinkedList;
import java.util.List;
import java.nio.ByteBuffer;

public class FreeBox implements Box
{
    public static final String TYPE = "free";
    public ByteBuffer data;
    private long offset;
    private Container parent;
    public List<Box> replacers;
    
    public FreeBox() {
        this.replacers = new LinkedList<Box>();
        this.data = ByteBuffer.wrap(new byte[0]);
    }
    
    public FreeBox(final int n) {
        this.replacers = new LinkedList<Box>();
        this.data = ByteBuffer.allocate(n);
    }
    
    public void addAndReplace(final Box box) {
        this.data.position(m0.K(box.getSize()));
        this.data = this.data.slice();
        this.replacers.add(box);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final FreeBox freeBox = (FreeBox)o;
            if (this.getData() != null) {
                if (this.getData().equals(freeBox.getData())) {
                    return true;
                }
            }
            else if (freeBox.getData() == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        final Iterator<Box> iterator = this.replacers.iterator();
        while (iterator.hasNext()) {
            iterator.next().getBox(writableByteChannel);
        }
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(this.data.limit() + 8);
        allocate.put("free".getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }
    
    public ByteBuffer getData() {
        final ByteBuffer data = this.data;
        if (data != null) {
            return (ByteBuffer)data.duplicate().rewind();
        }
        return null;
    }
    
    public long getOffset() {
        return this.offset;
    }
    
    public Container getParent() {
        return this.parent;
    }
    
    public long getSize() {
        final Iterator<Box> iterator = this.replacers.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            n += iterator.next().getSize();
        }
        return n + this.data.limit();
    }
    
    public String getType() {
        return "free";
    }
    
    @Override
    public int hashCode() {
        final ByteBuffer data = this.data;
        int hashCode;
        if (data != null) {
            hashCode = data.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public void parse(final a a, ByteBuffer allocate, final long n, final b b) throws IOException {
        this.offset = a.position() - allocate.remaining();
        if (n > 1048576L) {
            this.data = a.map(a.position(), n);
            a.position(a.position() + n);
        }
        else {
            allocate = ByteBuffer.allocate(m0.K(n));
            a.read(this.data = allocate);
        }
    }
    
    public void setData(final ByteBuffer data) {
        this.data = data;
    }
    
    public void setParent(final Container parent) {
        this.parent = parent;
    }
}
