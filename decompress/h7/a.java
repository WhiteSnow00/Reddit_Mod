// 
// Decompiled by Procyon v0.6.0
// 

package h7;

import ah2.f;
import com.apollographql.apollo.api.a$b;

public final class a implements com.apollographql.apollo.api.a
{
    public final com.apollographql.apollo.api.a b;
    public final a$b c;
    
    public a(final com.apollographql.apollo.api.a b, final a$b c) {
        f.g((Object)b, "left");
        f.g((Object)c, "element");
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final com.apollographql.apollo.api.a a(final c<?> c) {
        f.g((Object)c, "key");
        if (this.c.c((c)c) == null) {
            final com.apollographql.apollo.api.a a = this.b.a(c);
            Object c2;
            if (a == this.b) {
                c2 = this;
            }
            else if (a == d.b) {
                c2 = this.c;
            }
            else {
                c2 = new a(a, this.c);
            }
            return (com.apollographql.apollo.api.a)c2;
        }
        return this.b;
    }
    
    @Override
    public final com.apollographql.apollo.api.a b(final q7.a a) {
        return a.a(this, a);
    }
}
