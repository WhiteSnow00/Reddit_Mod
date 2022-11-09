// 
// Decompiled by Procyon v0.6.0
// 

package pb;

import ab.a;
import java.nio.ByteBuffer;
import bd.d0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

public final class g extends DecoderInputBuffer
{
    public long n;
    public int o;
    public int p;
    
    public g() {
        super(2);
        this.p = 32;
    }
    
    public final void p() {
        super.p();
        this.o = 0;
    }
    
    public final boolean x(final DecoderInputBuffer decoderInputBuffer) {
        d0.c(((a)decoderInputBuffer).n(1073741824) ^ true);
        d0.c(((a)decoderInputBuffer).n(268435456) ^ true);
        d0.c(((a)decoderInputBuffer).n(4) ^ true);
        final int o = this.o;
        boolean b = false;
        Label_0127: {
            Label_0125: {
                if (o > 0) {
                    if (o < this.p) {
                        if (((a)decoderInputBuffer).o() == ((a)this).o()) {
                            final ByteBuffer h = decoderInputBuffer.h;
                            if (h == null) {
                                break Label_0125;
                            }
                            final ByteBuffer h2 = super.h;
                            if (h2 == null || h.remaining() + h2.position() <= 3072000) {
                                break Label_0125;
                            }
                        }
                    }
                    b = false;
                    break Label_0127;
                }
            }
            b = true;
        }
        if (!b) {
            return false;
        }
        if (this.o++ == 0) {
            super.j = decoderInputBuffer.j;
            if (((a)decoderInputBuffer).n(1)) {
                ((a)this).f = 1;
            }
        }
        if (((a)decoderInputBuffer).o()) {
            ((a)this).f = Integer.MIN_VALUE;
        }
        final ByteBuffer h3 = decoderInputBuffer.h;
        if (h3 != null) {
            this.v(h3.remaining());
            super.h.put(h3);
        }
        this.n = decoderInputBuffer.j;
        return true;
    }
}
