// 
// Decompiled by Procyon v0.6.0
// 

package fb2;

import java.util.Arrays;
import javax.inject.Inject;
import sg2.e;
import android.content.Context;
import rg2.a;

public class n implements m
{
    public final a<Context> a;
    
    @Inject
    public n(final a<? extends Context> a) {
        e.f((Object)a, "context");
        this.a = (a<Context>)a;
    }
    
    public final String a(final int n, final Object... array) {
        final String quantityString = this.a.invoke().getResources().getQuantityString(2131820552, n, Arrays.copyOf(array, array.length));
        e.e((Object)quantityString, "context().resources.getQ\u2026ng(id, quantity, *params)");
        return quantityString;
    }
    
    public final String b(final int n, final Object... array) {
        final String string = this.a.invoke().getString(n, Arrays.copyOf(array, array.length));
        e.e((Object)string, "context().getString(id, *params)");
        return string;
    }
    
    public final String c(final int n) {
        final String string = this.a.invoke().getString(n);
        e.e((Object)string, "context().getString(id)");
        return string;
    }
}
