// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.content.SharedPreferences$Editor;
import lw0.b;

public final class m3
{
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ r3 e;
    
    public m3(final r3 e, final String a, final boolean b) {
        this.e = e;
        lw0.b.O(a);
        this.a = a;
        this.b = b;
    }
    
    public final void a(final boolean d) {
        final SharedPreferences$Editor edit = this.e.Q().edit();
        edit.putBoolean(this.a, d);
        edit.apply();
        this.d = d;
    }
    
    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.Q().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
