// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import java.util.concurrent.Executor;
import com.bytedance.covode.number.Covode;

public abstract class 1g6<Key, Value> extends 15P<Key, Value>
{
    public final Object LIZIZ;
    public Key LIZJ;
    public Key LIZLLL;
    
    static {
        Covode.recordClassIndex(1147);
    }
    
    public 1g6() {
        this.LIZIZ = new Object();
        this.LIZJ = null;
        this.LIZLLL = null;
    }
    
    private Key LIZIZ() {
        synchronized (this.LIZIZ) {
            return this.LIZLLL;
        }
    }
    
    private Key LIZJ() {
        synchronized (this.LIZIZ) {
            return this.LIZJ;
        }
    }
    
    @Override
    public final Key LIZ(final Value value) {
        return null;
    }
    
    @Override
    public final void LIZ(final int n, final boolean b, final Executor executor, final 0B5.a<Value> a) {
        final d d = new d((1g6<Key, Value>)this, (0B5.a<Value>)a);
        this.LIZ(new e<Key>(n), d);
        d.LIZ.LIZ(executor);
    }
    
    public abstract void LIZ(final e<Key> p0, final c<Key, Value> p1);
    
    public abstract void LIZ(final f<Key> p0, final a<Key, Value> p1);
    
    @Override
    public final void LIZ(final Value value, final int n, final Executor executor, final 0B5.a<Value> a) {
        final Key lizj = this.LIZJ();
        if (lizj != null) {
            this.LIZ(new f<Key>(lizj, n), (a<Key, Value>)new b((1g6<Object, Object>)this, 1, executor, (0B5.a<Object>)a));
            return;
        }
        a.LIZ(1, (0B5<Object>)0B5.LIZ);
    }
    
    @Override
    public final void LIZIZ(final Value value, final int n, final Executor executor, final 0B5.a<Value> a) {
        final Object liziz = this.LIZIZ();
        if (liziz != null) {
            new f(liziz, n);
            new b((1g6<Object, Value>)this, 2, executor, a);
            return;
        }
        a.LIZ(2, 0B5.LIZ);
    }
    
    public abstract static class a<Key, Value>
    {
        static {
            Covode.recordClassIndex(1148);
        }
        
        public abstract void LIZ(final List<Value> p0, final Key p1);
    }
    
    public abstract static class c<Key, Value>
    {
        static {
            Covode.recordClassIndex(1150);
        }
        
        public abstract void LIZ(final List<Value> p0, final Key p1);
    }
    
    public static final class e<Key>
    {
        public final int LIZ;
        
        static {
            Covode.recordClassIndex(1152);
        }
        
        public e(final int liz) {
            this.LIZ = liz;
        }
    }
    
    public static final class f<Key>
    {
        public final Key LIZ;
        public final int LIZIZ;
        
        static {
            Covode.recordClassIndex(1153);
        }
        
        public f(final Key liz, final int liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
    
    public static final class b<Key, Value> extends a<Key, Value>
    {
        public final 0Av.c<Value> LIZ;
        public final 1g6<Key, Value> LIZIZ;
        
        static {
            Covode.recordClassIndex(1149);
        }
        
        public b(final 1g6<Key, Value> liziz, final int n, final Executor executor, final 0B5.a<Value> a) {
            this.LIZ = (0Av.c<Value>)new 0Av.c(liziz, n, executor, (0B5.a<Object>)a);
            this.LIZIZ = liziz;
        }
        
        @Override
        public final void LIZ(final List<Value> list, final Key key) {
            if (!this.LIZ.LIZ()) {
                Label_0083: {
                    if (this.LIZ.LIZ == 1) {
                        final 1g6<Key, Value> liziz = this.LIZIZ;
                        synchronized (liziz.LIZIZ) {
                            liziz.LIZJ = key;
                            break Label_0083;
                        }
                    }
                    final 1g6<Key, Value> liziz2 = this.LIZIZ;
                    synchronized (liziz2.LIZIZ) {
                        liziz2.LIZLLL = key;
                    }
                }
                final List<Value> list2;
                this.LIZ.LIZ(new 0B5<Value>(list2, 0, 0));
            }
        }
    }
    
    public static final class d<Key, Value> extends c<Key, Value>
    {
        public final 0Av.c<Value> LIZ;
        public final 1g6<Key, Value> LIZIZ;
        
        static {
            Covode.recordClassIndex(1151);
        }
        
        public d(final 1g6<Key, Value> liziz, final 0B5.a<Value> a) {
            this.LIZ = (0Av.c<Value>)new 0Av.c(liziz, 0, null, (0B5.a<Object>)a);
            this.LIZIZ = liziz;
        }
        
        @Override
        public final void LIZ(final List<Value> list, final Key lizj) {
            if (!this.LIZ.LIZ()) {
                final 1g6<Key, Value> liziz = this.LIZIZ;
                synchronized (liziz.LIZIZ) {
                    liziz.LIZLLL = null;
                    liziz.LIZJ = lizj;
                }
                final List<Value> list2;
                this.LIZ.LIZ(new 0B5<Value>(list2, 0, 0));
            }
        }
    }
}
