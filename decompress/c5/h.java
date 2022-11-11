// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import hg2.j;
import rg2.p;
import java.util.concurrent.locks.ReentrantLock;
import a92.b;
import kotlinx.coroutines.channels.BufferOverflow;
import sg2.e;
import kotlinx.coroutines.flow.f;
import androidx.paging.LoadType;

public final class h
{
    public final b a;
    
    public h() {
        this.a = new b();
    }
    
    public final f a(final LoadType loadType) {
        e.f((Object)loadType, "loadType");
        final int n = c.a[loadType.ordinal()];
        f f;
        if (n != 1) {
            if (n != 2) {
                throw new IllegalArgumentException("invalid load type for hints");
            }
            f = this.a.b.b;
        }
        else {
            f = this.a.a.b;
        }
        return f;
    }
    
    public final class a
    {
        public b0 a;
        public final f b;
        
        public a(final h h) {
            e.f((Object)h, "this$0");
            this.b = a92.b.l(1, 0, BufferOverflow.DROP_OLDEST, 2);
        }
    }
    
    public final class b
    {
        public final a a;
        public final a b;
        public b0.a c;
        public final ReentrantLock d;
        
        public b(final h h) {
            e.f((Object)h, "this$0");
            this.a = new a();
            this.b = new a();
            this.d = new ReentrantLock();
        }
        
        public final void a(final b0.a c, final p<? super a, ? super a, j> p2) {
            final ReentrantLock d = this.d;
            d.lock();
            Label_0018: {
                if (c == null) {
                    break Label_0018;
                }
                try {
                    this.c = c;
                    p2.invoke(this.a, this.b);
                    final j a = j.a;
                }
                finally {
                    d.unlock();
                }
            }
        }
    }
}
