// 
// Decompiled by Procyon v0.6.0
// 

package p2;

public final class c
{
    public final e a;
    
    public c(final e a) {
        ng2.e.f((Object)a, "platformLocale");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof c && (this == o || ng2.e.a((Object)this.a.a(), (Object)((c)o).a.a()));
    }
    
    @Override
    public final int hashCode() {
        return this.a.a().hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.a();
    }
}
