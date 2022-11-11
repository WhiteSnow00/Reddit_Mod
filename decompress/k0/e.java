// 
// Decompiled by Procyon v0.6.0
// 

package k0;

public abstract class e
{
    public static final f a;
    
    static {
        a = new f(new t(null, null, null, null, 15));
    }
    
    public abstract t a();
    
    public final f b(final f f) {
        final t b = ((f)this).b;
        i i;
        if ((i = b.a) == null) {
            i = f.b.a;
        }
        q q;
        if ((q = b.b) == null) {
            q = f.b.b;
        }
        d d;
        if ((d = b.c) == null) {
            d = f.b.c;
        }
        m m;
        if ((m = b.d) == null) {
            m = f.b.d;
        }
        return new f(new t(i, q, d, m));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof e && sg2.e.a((Object)((e)o).a(), (Object)this.a());
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
}
