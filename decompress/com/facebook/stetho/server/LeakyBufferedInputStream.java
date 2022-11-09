// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;

public class LeakyBufferedInputStream extends BufferedInputStream
{
    private boolean mLeaked;
    private boolean mMarked;
    
    public LeakyBufferedInputStream(final InputStream inputStream, final int n) {
        super(inputStream, n);
    }
    
    private byte[] clearBufferLocked() {
        final int n = super.count - super.pos;
        final byte[] array = new byte[n];
        System.arraycopy(super.buf, super.pos, array, 0, n);
        super.pos = 0;
        super.count = 0;
        return array;
    }
    
    private void throwIfLeaked() {
        if (!this.mLeaked) {
            return;
        }
        throw new IllegalStateException();
    }
    
    private void throwIfMarked() {
        if (!this.mMarked) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public InputStream leakBufferAndStream() {
        synchronized (this) {
            this.throwIfLeaked();
            this.throwIfMarked();
            this.mLeaked = true;
            return new CompositeInputStream(new InputStream[] { new ByteArrayInputStream(this.clearBufferLocked()), super.in });
        }
    }
    
    @Override
    public void mark(final int n) {
        synchronized (this) {
            this.throwIfLeaked();
            this.mMarked = true;
            super.mark(n);
        }
    }
    
    @Override
    public boolean markSupported() {
        return true;
    }
    
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            this.throwIfLeaked();
            this.mMarked = false;
            super.reset();
        }
    }
}
