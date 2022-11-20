// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import xc.e;
import bc.t;
import com.google.android.exoplayer2.z;
import zc.b;

public interface y
{
    b getAllocator();
    
    long getBackBufferDurationUs();
    
    void onPrepared();
    
    void onReleased();
    
    void onStopped();
    
    void onTracksSelected(final z[] p0, final t p1, final e[] p2);
    
    boolean retainBackBufferFromKeyframe();
    
    boolean shouldContinueLoading(final long p0, final long p1, final float p2);
    
    boolean shouldStartPlayback(final long p0, final float p1, final boolean p2, final long p3);
}
