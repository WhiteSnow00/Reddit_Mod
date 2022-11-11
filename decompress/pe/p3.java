// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.content.SharedPreferences$Editor;
import lw0.b;

public final class p3
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ r3 e;
    
    public final void a() {
        this.e.M();
        ((h4)this.e.f).s.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final SharedPreferences$Editor edit = this.e.Q().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }
}
