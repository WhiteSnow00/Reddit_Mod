// 
// Decompiled by Procyon v0.6.0
// 

package rb2;

import sg2.e;
import android.content.Context;
import android.content.ContextWrapper;

public final class b extends ContextWrapper
{
    public b(final Context context) {
        super(context);
    }
    
    public final Object getSystemService(final String s) {
        e.f((Object)s, "name");
        Object o;
        if (e.a((Object)s, (Object)"layout_inflater")) {
            final Context applicationContext = ((Context)this).getApplicationContext();
            e.c((Object)applicationContext);
            o = applicationContext.getSystemService(s);
        }
        else {
            o = super.getSystemService(s);
        }
        return o;
    }
}
