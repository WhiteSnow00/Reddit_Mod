// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.content.SharedPreferences$Editor;
import lw0.b;

public final class q3
{
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ r3 d;
    
    public q3(final r3 d, final String a) {
        this.d = d;
        lw0.b.O(a);
        this.a = a;
    }
    
    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.Q().getString(this.a, (String)null);
        }
        return this.c;
    }
    
    public final void b(final String c) {
        final SharedPreferences$Editor edit = this.d.Q().edit();
        edit.putString(this.a, c);
        edit.apply();
        this.c = c;
    }
}
