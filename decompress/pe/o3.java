// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.content.SharedPreferences$Editor;
import lw0.b;

public final class o3
{
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ r3 e;
    
    public o3(final r3 e, final String a, final long b) {
        this.e = e;
        lw0.b.O(a);
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.Q().getLong(this.a, this.b);
        }
        return this.d;
    }
    
    public final void b(final long d) {
        final SharedPreferences$Editor edit = this.e.Q().edit();
        edit.putLong(this.a, d);
        edit.apply();
        this.d = d;
    }
}
