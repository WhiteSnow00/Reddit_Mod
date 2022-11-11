// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import java.util.concurrent.Executor;
import com.bytedance.covode.number.Covode;

public abstract class 1g5<Key, Value> extends 15P<Key, Value>
{
    static {
        Covode.recordClassIndex(1137);
    }
    
    @Override
    public final Key LIZ(final Value value) {
        if (value == null) {
            return null;
        }
        return this.LIZIZ(value);
    }
    
    @Override
    public final void LIZ(final int n, final boolean b, final Executor executor, final 0B5.a<Value> a) {
        final d d = new d(this, b, (0B5.a<Value>)a);
        this.LIZ(new e<Key>(), d);
        d.LIZ.LIZ(executor);
    }
    
    public abstract void LIZ(final e<Key> p0, final c<Value> p1);
    
    public abstract void LIZ(final f<Key> p0, final a<Value> p1);
    
    @Override
    public final void LIZ(final Value value, final int n, final Executor executor, final 0B5.a<Value> a) {
        this.LIZIZ(value);
        this.LIZ(new f<Key>(), (a<Value>)new b(this, 1, executor, (0B5.a<Object>)a));
    }
    
    public abstract Key LIZIZ(final Value p0);
    
    public abstract void LIZIZ(final f<Key> p0, final a<Value> p1);
    
    @Override
    public final void LIZIZ(final Value value, final int n, final Executor executor, final 0B5.a<Value> a) {
        this.LIZIZ(value);
        this.LIZIZ(new f<Key>(), (a<Value>)new b(this, 2, executor, (0B5.a<Object>)a));
    }
    
    public abstract static class a<Value>
    {
        static {
            Covode.recordClassIndex(1138);
        }
        
        public abstract void LIZ(final List<Value> p0);
    }
    
    public static final class e<Key>
    {
        static {
            Covode.recordClassIndex(1142);
        }
    }
    
    public static final class f<Key>
    {
        static {
            Covode.recordClassIndex(1143);
        }
    }
    
    public static final class b<Value> extends a<Value>
    {
        public final 0Av.c<Value> LIZ;
        
        static {
            Covode.recordClassIndex(1139);
        }
        
        public b(final 1g5 1g5, final int n, final Executor executor, final 0B5.a<Value> a) {
            this.LIZ = (0Av.c<Value>)new 0Av.c(1g5, n, executor, (0B5.a<Object>)a);
        }
        
        @Override
        public final void LIZ(final List<Value> list) {
            if (!this.LIZ.LIZ()) {
                this.LIZ.LIZ(new 0B5<Value>(list, 0, 0));
            }
        }
    }
    
    public abstract static class c<Value> extends a<Value>
    {
        static {
            Covode.recordClassIndex(1140);
        }
        
        public abstract void LIZ(final List<Value> p0, final int p1);
    }
    
    public static final class d<Value> extends c<Value>
    {
        public final 0Av.c<Value> LIZ;
        public final boolean LIZIZ;
        
        static {
            Covode.recordClassIndex(1141);
        }
        
        public d(final 1g5 1g5, final boolean liziz, final 0B5.a<Value> a) {
            this.LIZ = (0Av.c<Value>)new 0Av.c(1g5, 0, null, (0B5.a<Object>)a);
            this.LIZIZ = liziz;
        }
        
        @Override
        public final void LIZ(final List<Value> list) {
            if (!this.LIZ.LIZ()) {
                this.LIZ.LIZ(new 0B5<Value>(list, 0, 0));
            }
        }
        
        @Override
        public final void LIZ(final List<Value> list, final int n) {
            if (!this.LIZ.LIZ()) {
                if (list.size() + 0 > n) {
                    throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
                }
                if (list.size() == 0 && n > 0) {
                    throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
                }
                final int size = list.size();
                if (this.LIZIZ) {
                    this.LIZ.LIZ(new 0B5<Value>((List<Object>)list, n - 0 - size, 0));
                    return;
                }
                this.LIZ.LIZ(new 0B5<Value>((List<Object>)list));
            }
        }
    }
}
