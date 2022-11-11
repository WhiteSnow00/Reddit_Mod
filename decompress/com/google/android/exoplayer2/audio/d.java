// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

public final class d extends c
{
    public int[] i;
    public int[] j;
    
    public final void a(final ByteBuffer byteBuffer) {
        final int[] j = this.j;
        j.getClass();
        int i = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final ByteBuffer k = this.i((limit - i) / super.b.d * super.c.d);
        while (i < limit) {
            for (int length = j.length, l = 0; l < length; ++l) {
                k.putShort(byteBuffer.getShort(j[l] * 2 + i));
            }
            i += super.b.d;
        }
        byteBuffer.position(limit);
        k.flip();
    }
    
    public final AudioProcessor.a e(AudioProcessor.a e) throws AudioProcessor.UnhandledAudioFormatException {
        final int[] i = this.i;
        if (i == null) {
            return AudioProcessor.a.e;
        }
        if (e.c == 2) {
            boolean b;
            if (e.b != i.length) {
                b = true;
            }
            else {
                b = false;
            }
            for (int j = 0; j < i.length; ++j) {
                final int n = i[j];
                if (n >= e.b) {
                    throw new AudioProcessor.UnhandledAudioFormatException(e);
                }
                b |= (n != j);
            }
            if (b) {
                e = new AudioProcessor.a(e.a, i.length, 2);
            }
            else {
                e = AudioProcessor.a.e;
            }
            return e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(e);
    }
    
    public final void f() {
        this.j = this.i;
    }
    
    public final void h() {
        this.j = null;
        this.i = null;
    }
}
