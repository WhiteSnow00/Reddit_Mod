// 
// Decompiled by Procyon v0.6.0
// 

package c9;

import java.util.Iterator;
import java.util.ArrayList;

public final class c
{
    public final ArrayList a;
    
    public c() {
        this.a = new ArrayList();
    }
    
    public final ArrayList a(final Class clazz, final Class clazz2) {
        synchronized (this) {
            final ArrayList<Class> list = new ArrayList<Class>();
            if (clazz2.isAssignableFrom(clazz)) {
                list.add(clazz2);
                return list;
            }
            for (final a a : this.a) {
                if (a.a.isAssignableFrom(clazz) && clazz2.isAssignableFrom(a.b)) {
                    list.add(clazz2);
                }
            }
            return list;
        }
    }
    
    public static final class a<Z, R>
    {
        public final Class<Z> a;
        public final Class<R> b;
        public final b<Z, R> c;
        
        public a(final Class<Z> a, final Class<R> b, final b<Z, R> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
