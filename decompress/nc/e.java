// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import ab.a;
import java.nio.ByteBuffer;
import bd.d0;
import ab.f;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import ab.h;

public abstract class e extends h<i, j, SubtitleDecoderException> implements g
{
    public e() {
        super((DecoderInputBuffer[])new i[2], (f[])new j[2]);
        final int g = super.g;
        final int length = super.e.length;
        int i = 0;
        d0.f(g == length);
        for (DecoderInputBuffer[] e = super.e; i < e.length; ++i) {
            e[i].v(1024);
        }
    }
    
    public final void b(final long n) {
    }
    
    public final SubtitleDecoderException e(DecoderInputBuffer decoderInputBuffer, final f f, final boolean b) {
        decoderInputBuffer = decoderInputBuffer;
        final j j = (j)f;
        try {
            final ByteBuffer h = decoderInputBuffer.h;
            h.getClass();
            j.t(decoderInputBuffer.j, this.g(h.array(), h.limit(), b), ((i)decoderInputBuffer).n);
            ((a)j).f &= Integer.MAX_VALUE;
            decoderInputBuffer = null;
        }
        catch (final SubtitleDecoderException ex) {}
        return (SubtitleDecoderException)decoderInputBuffer;
    }
    
    public abstract nc.f g(final byte[] p0, final int p1, final boolean p2) throws SubtitleDecoderException;
}
