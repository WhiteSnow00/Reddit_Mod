// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.appcompat.widget.s0;

public final class f
{
    public final String a;
    public final boolean b;
    
    public f(final String a, final boolean b) {
        ah2.f.f((Object)a, "commentId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return ah2.f.a((Object)this.a, (Object)f.a) && this.b == f.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CommentMutationDataModel(commentId=");
        k.append(this.a);
        k.append(", isCollapsed=");
        return s0.o(k, this.b, ')');
    }
}
