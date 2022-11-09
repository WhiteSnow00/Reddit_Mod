// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import android.os.Message;
import bc.q;
import android.os.Handler;
import java.util.ArrayList;

public final class y implements k
{
    public static final ArrayList b;
    public final Handler a;
    
    static {
        b = new ArrayList(50);
    }
    
    public y(final Handler a) {
        this.a = a;
    }
    
    public static a l() {
        final ArrayList b = y.b;
        synchronized (b) {
            a a;
            if (b.isEmpty()) {
                a = new a();
            }
            else {
                a = b.remove(b.size() - 1);
            }
            return a;
        }
    }
    
    @Override
    public final boolean a() {
        return this.a.hasMessages(0);
    }
    
    @Override
    public final a b(final int n) {
        final a l = l();
        l.a = this.a.obtainMessage(n);
        return l;
    }
    
    @Override
    public final void c() {
        this.a.removeCallbacksAndMessages((Object)null);
    }
    
    @Override
    public final a d(final int n, final Object o) {
        final a l = l();
        l.a = this.a.obtainMessage(n, o);
        return l;
    }
    
    @Override
    public final a e(final int n, final int n2, final int n3) {
        final a l = l();
        l.a = this.a.obtainMessage(n, n2, n3);
        return l;
    }
    
    @Override
    public final a f(final q q, final int n) {
        final a l = l();
        l.a = this.a.obtainMessage(20, 0, n, (Object)q);
        return l;
    }
    
    @Override
    public final boolean g(final k.a a) {
        final a a2 = (a)a;
        final Handler a3 = this.a;
        final Message a4 = a2.a;
        a4.getClass();
        final boolean sendMessageAtFrontOfQueue = a3.sendMessageAtFrontOfQueue(a4);
        a2.a = null;
        final ArrayList b = y.b;
        synchronized (b) {
            if (b.size() < 50) {
                b.add(a2);
            }
            return sendMessageAtFrontOfQueue;
        }
    }
    
    @Override
    public final void h() {
        this.a.removeMessages(2);
    }
    
    @Override
    public final boolean i(final Runnable runnable) {
        return this.a.post(runnable);
    }
    
    @Override
    public final boolean j(final long n) {
        return this.a.sendEmptyMessageAtTime(2, n);
    }
    
    @Override
    public final boolean k(final int n) {
        return this.a.sendEmptyMessage(n);
    }
    
    public static final class a implements k.a
    {
        public Message a;
        
        public final void a() {
            final Message a = this.a;
            a.getClass();
            a.sendToTarget();
            this.a = null;
            final ArrayList b = y.b;
            synchronized (b) {
                if (b.size() < 50) {
                    b.add(this);
                }
            }
        }
    }
}
