// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

public final class k extends c
{
    public final a i;
    
    public k(final s12.c i) {
        i.getClass();
        this.i = (a)i;
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        final int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        this.i.a(byteBuffer.asReadOnlyBuffer());
        this.i(remaining).put(byteBuffer).flip();
    }
    
    public final AudioProcessor.a e(final AudioProcessor.a a) {
        return a;
    }
    
    public final void f() {
        this.j();
    }
    
    public final void g() {
        this.j();
    }
    
    public final void h() {
        this.j();
    }
    
    public final void j() {
        if (this.isActive()) {
            final a i = this.i;
            final AudioProcessor.a b = super.b;
            i.b(b.a, b.b, b.c);
        }
    }
    
    public interface a
    {
        void a(final ByteBuffer p0);
        
        void b(final int p0, final int p1, final int p2);
    }
}
