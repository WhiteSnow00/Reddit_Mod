// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import ad.c0;
import java.nio.ByteBuffer;

public final class h extends c
{
    public final void a(final ByteBuffer byteBuffer) {
        int i = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - i;
        final int c = super.b.c;
        int n2 = n;
        int n3 = 0;
        Label_0100: {
            Label_0094: {
                if (c != 3) {
                    if (c != 4) {
                        n3 = n;
                        if (c == 268435456) {
                            break Label_0100;
                        }
                        if (c == 536870912) {
                            n2 = n / 3;
                            break Label_0094;
                        }
                        if (c != 805306368) {
                            throw new IllegalStateException();
                        }
                    }
                    n3 = n / 2;
                    break Label_0100;
                }
            }
            n3 = n2 * 2;
        }
        final ByteBuffer j = this.i(n3);
        final int c2 = super.b.c;
        int k = i;
        if (c2 != 3) {
            int l = i;
            if (c2 != 4) {
                int n4 = i;
                if (c2 != 268435456) {
                    int n5 = i;
                    if (c2 != 536870912) {
                        if (c2 != 805306368) {
                            throw new IllegalStateException();
                        }
                        while (i < limit) {
                            j.put(byteBuffer.get(i + 2));
                            j.put(byteBuffer.get(i + 3));
                            i += 4;
                        }
                    }
                    else {
                        while (n5 < limit) {
                            j.put(byteBuffer.get(n5 + 1));
                            j.put(byteBuffer.get(n5 + 2));
                            n5 += 3;
                        }
                    }
                }
                else {
                    while (n4 < limit) {
                        j.put(byteBuffer.get(n4 + 1));
                        j.put(byteBuffer.get(n4));
                        n4 += 2;
                    }
                }
            }
            else {
                while (l < limit) {
                    final short n6 = (short)(c0.h(byteBuffer.getFloat(l), -1.0f, 1.0f) * 32767.0f);
                    j.put((byte)(n6 & 0xFF));
                    j.put((byte)(n6 >> 8 & 0xFF));
                    l += 4;
                }
            }
        }
        else {
            while (k < limit) {
                j.put((byte)0);
                j.put((byte)((byteBuffer.get(k) & 0xFF) - 128));
                ++k;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }
    
    public final AudioProcessor.a e(AudioProcessor.a e) throws AudioProcessor.UnhandledAudioFormatException {
        final int c = e.c;
        if (c != 3 && c != 2 && c != 268435456 && c != 536870912 && c != 805306368 && c != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(e);
        }
        if (c != 2) {
            e = new AudioProcessor.a(e.a, e.b, 2);
        }
        else {
            e = AudioProcessor.a.e;
        }
        return e;
    }
}
