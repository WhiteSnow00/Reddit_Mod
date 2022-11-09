// 
// Decompiled by Procyon v0.6.0
// 

package i60;

public final class d
{
    public final e a;
    public final f b;
    
    public d(final e a, final f b) {
        ah2.f.f((Object)a, "commentDataModel");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return ah2.f.a((Object)this.a, (Object)d.a) && ah2.f.a((Object)this.b, (Object)d.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final f b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CommentAndMutations(commentDataModel=");
        k.append(this.a);
        k.append(", mutations=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
