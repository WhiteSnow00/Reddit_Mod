// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import com.reddit.data.room.model.CommentDataModelType;

public final class e
{
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final CommentDataModelType g;
    
    public e(final String a, final String b, final String c, final int d, final String e, final String f, final CommentDataModelType g) {
        ah2.f.f((Object)a, "commentId");
        ah2.f.f((Object)b, "parentId");
        ah2.f.f((Object)e, "commentJson");
        ah2.f.f((Object)f, "sortType");
        ah2.f.f((Object)g, "type");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return ah2.f.a((Object)this.a, (Object)e.a) && ah2.f.a((Object)this.b, (Object)e.b) && ah2.f.a((Object)this.c, (Object)e.c) && this.d == e.d && ah2.f.a((Object)this.e, (Object)e.e) && ah2.f.a((Object)this.f, (Object)e.f) && this.g == e.g;
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return this.g.hashCode() + ag0.a.f(this.f, ag0.a.f(this.e, s0.e(this.d, (f + hashCode) * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CommentDataModel(commentId=");
        k.append(this.a);
        k.append(", parentId=");
        k.append(this.b);
        k.append(", linkId=");
        k.append(this.c);
        k.append(", listingPosition=");
        k.append(this.d);
        k.append(", commentJson=");
        k.append(this.e);
        k.append(", sortType=");
        k.append(this.f);
        k.append(", type=");
        k.append(this.g);
        k.append(')');
        return k.toString();
    }
}
