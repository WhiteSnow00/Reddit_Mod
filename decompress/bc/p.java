// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.android.billingclient.api.d0;
import java.io.IOException;

public interface p
{
    void b() throws IOException;
    
    boolean isReady();
    
    int k(final d0 p0, final DecoderInputBuffer p1, final int p2);
    
    int m(final long p0);
}
