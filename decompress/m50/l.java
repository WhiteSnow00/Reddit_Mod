// 
// Decompiled by Procyon v0.6.0
// 

package m50;

import ne2.e;
import q90.h;
import com.reddit.session.n;
import android.content.Context;
import javax.inject.Provider;
import ne2.d;

public final class l implements d<k>
{
    public final Provider<Context> a;
    public final Provider<n> b;
    
    public l(final h.b a, final e b) {
        this.a = (Provider<Context>)a;
        this.b = (Provider<n>)b;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        ng2.e.e(value, "context.get()");
        final Context context = (Context)value;
        final Object value2 = this.b.get();
        ng2.e.e(value2, "sessionManager.get()");
        return new k(context, (n)value2);
    }
}
