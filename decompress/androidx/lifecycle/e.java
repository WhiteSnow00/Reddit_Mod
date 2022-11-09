// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.ArrayDeque;

public final class e
{
    public boolean a;
    public boolean b;
    public boolean c;
    public final ArrayDeque d;
    
    public e() {
        this.a = true;
        this.d = new ArrayDeque();
    }
    
    public final void a() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while ((this.d.isEmpty() ^ true) && (this.b || !this.a)) {
                final Runnable runnable = this.d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        finally {
            this.c = false;
        }
    }
}
