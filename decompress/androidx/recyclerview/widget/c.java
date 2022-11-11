// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

public final class c<T>
{
    public final Executor a;
    public final n.f<T> b;
    
    public c(final Executor a, final n.f b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a<T>
    {
        public static final Object c;
        public static ExecutorService d;
        public Executor a;
        public final n.f<T> b;
        
        static {
            c = new Object();
        }
        
        public a(final n.f<T> b) {
            this.b = b;
        }
        
        public final c<T> a() {
            if (this.a == null) {
                final Object c = androidx.recyclerview.widget.c.a.c;
                monitorenter(c);
                Label_0033: {
                    try {
                        if (androidx.recyclerview.widget.c.a.d == null) {
                            androidx.recyclerview.widget.c.a.d = Executors.newFixedThreadPool(2);
                        }
                        break Label_0033;
                    }
                    finally {
                        monitorexit(c);
                        monitorexit(c);
                        this.a = androidx.recyclerview.widget.c.a.d;
                    }
                }
            }
            return new c<T>(this.a, this.b);
        }
    }
}
