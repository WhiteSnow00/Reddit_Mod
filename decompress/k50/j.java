// 
// Decompiled by Procyon v0.6.0
// 

package k50;

import se2.e;
import q90.h$b;
import com.reddit.session.o;
import android.content.Context;
import javax.inject.Provider;
import se2.d;

public final class j implements d<i>
{
    public final Provider<Context> a;
    public final Provider<o> b;
    
    public j(final h$b a, final e b) {
        this.a = (Provider<Context>)a;
        this.b = (Provider<o>)b;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        sg2.e.e(value, "context.get()");
        final Context context = (Context)value;
        final Object value2 = this.b.get();
        sg2.e.e(value2, "sessionManager.get()");
        return new i(context, (o)value2);
    }
}
