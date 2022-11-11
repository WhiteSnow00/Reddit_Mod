// 
// Decompiled by Procyon v0.6.0
// 

package ac;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.android.billingclient.api.d0;
import java.io.IOException;

public interface p
{
    void b() throws IOException;
    
    int i(final d0 p0, final DecoderInputBuffer p1, final int p2);
    
    boolean isReady();
    
    int k(final long p0);
}
