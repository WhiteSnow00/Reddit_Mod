// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class h extends androidx.emoji2.text.f.h
{
    public final /* synthetic */ androidx.emoji2.text.f.h a;
    public final /* synthetic */ ThreadPoolExecutor b;
    
    public h(final androidx.emoji2.text.f.h a, final ThreadPoolExecutor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        try {
            this.a.a(t);
        }
        finally {
            this.b.shutdown();
        }
    }
    
    @Override
    public final void b(final n n) {
        try {
            this.a.b(n);
        }
        finally {
            this.b.shutdown();
        }
    }
}
