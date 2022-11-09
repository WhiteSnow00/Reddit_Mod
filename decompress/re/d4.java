// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;

public final class d4 implements UncaughtExceptionHandler
{
    public final String a;
    public final /* synthetic */ g4 b;
    
    public d4(final g4 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        synchronized (this) {
            ((h4)((w)this.b).f).f().k.b(t, this.a);
        }
    }
}
