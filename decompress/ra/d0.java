// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import android.content.Context;
import javax.inject.Provider;
import ma.b;

public final class d0 implements b<c0>
{
    public final Provider<Context> a;
    public final Provider<String> b;
    public final Provider<Integer> c;
    
    public d0(final Provider a) {
        final f a2 = f$a.a;
        final h a3 = h$a.a;
        this.a = (Provider<Context>)a;
        this.b = (Provider<String>)a2;
        this.c = (Provider<Integer>)a3;
    }
    
    public final Object get() {
        return new c0((Context)this.a.get(), (int)this.c.get(), (String)this.b.get());
    }
}
