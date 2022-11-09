// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

class CountingOutputStream extends FilterOutputStream
{
    private long mCount;
    
    public CountingOutputStream(final OutputStream outputStream) {
        super(outputStream);
    }
    
    public long getCount() {
        return this.mCount;
    }
    
    @Override
    public void write(final int n) throws IOException {
        super.out.write(n);
        ++this.mCount;
    }
    
    @Override
    public void write(final byte[] array) throws IOException {
        this.write(array, 0, array.length);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) throws IOException {
        super.out.write(array, n, n2);
        this.mCount += n2;
    }
}
