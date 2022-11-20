// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.decoder;

import wa.x;
import java.nio.ByteBuffer;
import ab.c;
import ab.a;

public class DecoderInputBuffer extends a
{
    public final c g;
    public ByteBuffer h;
    public boolean i;
    public long j;
    public ByteBuffer k;
    public final int l;
    public final int m;
    
    static {
        x.a("goog.exo.decoder");
    }
    
    public DecoderInputBuffer(final int l) {
        super(0);
        this.g = new c();
        this.l = l;
        this.m = 0;
    }
    
    public void p() {
        super.f = 0;
        final ByteBuffer h = this.h;
        if (h != null) {
            h.clear();
        }
        final ByteBuffer k = this.k;
        if (k != null) {
            k.clear();
        }
        this.i = false;
    }
    
    public final ByteBuffer t(final int n) {
        final int l = this.l;
        if (l == 1) {
            return ByteBuffer.allocate(n);
        }
        if (l == 2) {
            return ByteBuffer.allocateDirect(n);
        }
        final ByteBuffer h = this.h;
        int capacity;
        if (h == null) {
            capacity = 0;
        }
        else {
            capacity = h.capacity();
        }
        throw new DecoderInputBuffer.DecoderInputBuffer$InsufficientCapacityException(capacity, n);
    }
    
    public final void v(int position) {
        final int n = position + this.m;
        final ByteBuffer h = this.h;
        if (h == null) {
            this.h = this.t(n);
            return;
        }
        final int capacity = h.capacity();
        position = h.position();
        final int n2 = n + position;
        if (capacity >= n2) {
            this.h = h;
            return;
        }
        final ByteBuffer t = this.t(n2);
        t.order(h.order());
        if (position > 0) {
            h.flip();
            t.put(h);
        }
        this.h = t;
    }
    
    public final void w() {
        final ByteBuffer h = this.h;
        if (h != null) {
            h.flip();
        }
        final ByteBuffer k = this.k;
        if (k != null) {
            k.flip();
        }
    }
}
