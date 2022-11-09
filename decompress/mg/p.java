// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import android.util.Log;

public final class p implements Runnable
{
    public final /* synthetic */ a f;
    
    public p(final a f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        try {
            this.f.a.c();
        }
        catch (final Exception ex) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", (Throwable)ex);
        }
    }
}
