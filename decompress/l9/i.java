// 
// Decompiled by Procyon v0.6.0
// 

package l9;

public final class i
{
    public Class<?> a;
    public Class<?> b;
    public Class<?> c;
    
    public i() {
    }
    
    public i(final Class<?> a, final Class<?> b, final Class<?> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && i.class == o.getClass()) {
            final i i = (i)o;
            return this.a.equals(i.a) && this.b.equals(i.b) && j.b(this.c, i.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final Class<?> c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MultiClassKey{first=");
        k.append(this.a);
        k.append(", second=");
        k.append(this.b);
        k.append('}');
        return k.toString();
    }
}
