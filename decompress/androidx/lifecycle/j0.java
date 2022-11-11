// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.os.Handler;

public final class j0
{
    public final r a;
    public final Handler b;
    public a c;
    
    public j0(final q q) {
        this.a = new r(q);
        this.b = new Handler();
    }
    
    public final void a(final Lifecycle.Event event) {
        final a c = this.c;
        if (c != null) {
            c.run();
        }
        final a c2 = new a(this.a, event);
        this.c = c2;
        this.b.postAtFrontOfQueue((Runnable)c2);
    }
    
    public static final class a implements Runnable
    {
        public final r f;
        public final Lifecycle.Event g;
        public boolean h;
        
        public a(final r f, final Lifecycle.Event g) {
            this.h = false;
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final void run() {
            if (!this.h) {
                this.f.f(this.g);
                this.h = true;
            }
        }
    }
}
