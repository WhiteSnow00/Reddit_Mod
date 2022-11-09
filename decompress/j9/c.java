// 
// Decompiled by Procyon v0.6.0
// 

package j9;

import com.bumptech.glide.load.DataSource;

public final class c<R> implements d<R>
{
    public static final c<?> a;
    public static final a b;
    
    static {
        a = new c<Object>();
        b = new a();
    }
    
    @Override
    public final boolean a(final Object o, final d.a a) {
        return false;
    }
    
    public static final class a<R> implements e<R>
    {
        @Override
        public final d a(final DataSource dataSource) {
            return c.a;
        }
    }
}
