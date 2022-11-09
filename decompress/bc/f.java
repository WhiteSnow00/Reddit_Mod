// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import ab.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.android.billingclient.api.d0;

public final class f implements p
{
    @Override
    public final void b() {
    }
    
    @Override
    public final boolean isReady() {
        return true;
    }
    
    @Override
    public final int k(final d0 d0, final DecoderInputBuffer decoderInputBuffer, final int n) {
        ((a)decoderInputBuffer).f = 4;
        return -4;
    }
    
    @Override
    public final int m(final long n) {
        return 0;
    }
}
