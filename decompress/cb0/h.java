// 
// Decompiled by Procyon v0.6.0
// 

package cb0;

import javax.inject.Inject;
import ah2.f;
import android.content.Context;
import javax.inject.Singleton;

@Singleton
public final class h
{
    public final Context a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    
    @Inject
    public h(final Context a) {
        f.f((Object)a, "context");
        this.a = a;
        this.b = a.getResources().getDisplayMetrics().widthPixels;
        this.c = a.getResources().getDisplayMetrics().heightPixels;
        this.d = a.getResources().getDisplayMetrics().density;
        this.e = a.getResources().getConfiguration().orientation;
    }
}
