// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import pg2.j;
import java.util.ArrayList;
import kotlin.a;
import android.view.Choreographer$FrameCallback;
import java.util.List;
import qg2.h;
import android.os.Handler;
import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import pg2.f;
import kotlinx.coroutines.CoroutineDispatcher;

public final class AndroidUiDispatcher extends CoroutineDispatcher
{
    public static final f<CoroutineContext> r;
    public static final AndroidUiDispatcher$a s;
    public final Choreographer h;
    public final Handler i;
    public final Object j;
    public final h<Runnable> k;
    public List<Choreographer$FrameCallback> l;
    public List<Choreographer$FrameCallback> m;
    public boolean n;
    public boolean o;
    public final AndroidUiDispatcher$b p;
    public final AndroidUiFrameClock q;
    
    static {
        r = a.b((zg2.a)AndroidUiDispatcher$Companion$Main.AndroidUiDispatcher$Companion$Main$2.INSTANCE);
        s = new AndroidUiDispatcher$a();
    }
    
    public AndroidUiDispatcher(final Choreographer h, final Handler i) {
        this.h = h;
        this.i = i;
        this.j = new Object();
        this.k = (h<Runnable>)new h();
        this.l = new ArrayList<Choreographer$FrameCallback>();
        this.m = new ArrayList<Choreographer$FrameCallback>();
        this.p = new AndroidUiDispatcher$b(this);
        this.q = new AndroidUiFrameClock(h);
    }
    
    public static final void c0(final AndroidUiDispatcher androidUiDispatcher) {
        while (true) {
            synchronized (androidUiDispatcher.j) {
                final h<Runnable> k = androidUiDispatcher.k;
                Object removeFirst;
                if (k.isEmpty()) {
                    removeFirst = null;
                }
                else {
                    removeFirst = k.removeFirst();
                }
                Object o = removeFirst;
                monitorexit(androidUiDispatcher.j);
                while (o != null) {
                    ((Runnable)o).run();
                    final Object j = androidUiDispatcher.j;
                    synchronized (androidUiDispatcher.j) {
                        o = androidUiDispatcher.k;
                        if (((h)o).isEmpty()) {
                            o = null;
                        }
                        else {
                            o = ((h)o).removeFirst();
                        }
                        o = o;
                        continue;
                    }
                    break;
                }
                synchronized (androidUiDispatcher.j) {
                    final boolean empty = androidUiDispatcher.k.isEmpty();
                    boolean b = false;
                    if (empty) {
                        androidUiDispatcher.n = false;
                    }
                    else {
                        b = true;
                    }
                    monitorexit(androidUiDispatcher.j);
                    if (!b) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    public final void Z(final CoroutineContext coroutineContext, final Runnable runnable) {
        ah2.f.f((Object)coroutineContext, "context");
        ah2.f.f((Object)runnable, "block");
        synchronized (this.j) {
            this.k.addLast((Object)runnable);
            if (!this.n) {
                this.n = true;
                this.i.post((Runnable)this.p);
                if (!this.o) {
                    this.o = true;
                    this.h.postFrameCallback((Choreographer$FrameCallback)this.p);
                }
            }
            final j a = pg2.j.a;
        }
    }
}
