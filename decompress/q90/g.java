// 
// Decompiled by Procyon v0.6.0
// 

package q90;

import android.content.Context;
import ne2.h;
import ne2.e;
import android.content.SharedPreferences;
import javax.inject.Provider;
import jw.b;
import android.app.Application;

public final class g implements a
{
    public final Application a;
    public b b;
    public Provider<SharedPreferences> c;
    public Provider<p20.b> d;
    
    public g(final Application a) {
        this.a = a;
        final b b = new b((Provider)e.a((Object)a), 15);
        this.b = b;
        this.c = (Provider<SharedPreferences>)h.a((Provider)new dt.b((Provider)b, 21));
        this.d = (Provider<p20.b>)h.a((Provider)new ox.a((Provider)this.b, 21));
    }
    
    public final SharedPreferences a() {
        return (SharedPreferences)this.c.get();
    }
    
    public final p20.b b() {
        return (p20.b)this.d.get();
    }
    
    public final Application c() {
        return this.a;
    }
    
    public final Context getContext() {
        final Application a = this.a;
        ng2.e.f((Object)a, "application");
        final Context applicationContext = ((Context)a).getApplicationContext();
        ng2.e.e((Object)applicationContext, "application.applicationContext");
        return applicationContext;
    }
}
