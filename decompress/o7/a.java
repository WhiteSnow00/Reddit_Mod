// 
// Decompiled by Procyon v0.6.0
// 

package o7;

import lg2.c;
import kotlin.Result;
import yd.b;
import sg2.e;
import com.apollographql.apollo.exception.ApolloException;
import ej2.l;
import h7.n;
import ej2.k;
import java.util.concurrent.atomic.AtomicBoolean;
import com.apollographql.apollo.ApolloCall$b;

public final class a extends ApolloCall$b<Object>
{
    public final AtomicBoolean a;
    public final /* synthetic */ k<n<Object>> b;
    
    public a(final l b) {
        this.b = (k<n<Object>>)b;
        this.a = new AtomicBoolean(false);
    }
    
    public final void a(final ApolloException ex) {
        e.g((Object)ex, "e");
        if (!this.a.getAndSet(true)) {
            ((c)this.b).resumeWith(Result.constructor-impl((Object)yd.b.o((Throwable)ex)));
        }
    }
    
    public final void b(final n<Object> n) {
        e.g((Object)n, "response");
        if (!this.a.getAndSet(true)) {
            ((c)this.b).resumeWith(Result.constructor-impl((Object)n));
        }
    }
}
