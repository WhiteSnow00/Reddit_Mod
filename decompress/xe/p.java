// 
// Decompiled by Procyon v0.6.0
// 

package xe;

public final class p implements Runnable
{
    public final /* synthetic */ q f;
    
    public p(final q f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final Object c = this.f.c;
        monitorenter(c);
        Label_0041: {
            try {
                final Object d = this.f.d;
                if (d != null) {
                    ((b)d).onCanceled();
                }
                break Label_0041;
            }
            finally {
                monitorexit(c);
                monitorexit(c);
            }
        }
    }
}
