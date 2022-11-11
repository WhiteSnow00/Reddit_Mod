// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class h extends f$h
{
    public final /* synthetic */ f$h a;
    public final /* synthetic */ ThreadPoolExecutor b;
    
    public h(final f$h a, final ThreadPoolExecutor b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Throwable t) {
        try {
            this.a.a(t);
        }
        finally {
            this.b.shutdown();
        }
    }
    
    public final void b(final n n) {
        try {
            this.a.b(n);
        }
        finally {
            this.b.shutdown();
        }
    }
}
