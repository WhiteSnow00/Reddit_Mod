// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import android.os.Bundle;
import ve.h;

public abstract class p<T>
{
    public final int a;
    public final h<T> b;
    public final int c;
    public final Bundle d;
    
    public p(final int a, final int c, final Bundle d) {
        this.b = (h<T>)new h();
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public abstract void a(final Bundle p0);
    
    public abstract boolean b();
    
    public final void c(final zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            final String value = String.valueOf(this);
            final String value2 = String.valueOf(zzq);
            Log.d("MessengerIpcClient", b.j(new StringBuilder(value.length() + 14 + value2.length()), "Failing ", value, " with ", value2));
        }
        this.b.a((Exception)zzq);
    }
    
    public final void d(final Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            final String value = String.valueOf(this);
            final String value2 = String.valueOf(bundle);
            Log.d("MessengerIpcClient", b.j(new StringBuilder(value.length() + 16 + value2.length()), "Finishing ", value, " with ", value2));
        }
        this.b.b((Object)bundle);
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(c);
        sb.append(" id=");
        sb.append(a);
        sb.append(" oneWay=");
        sb.append(this.b());
        sb.append("}");
        return sb.toString();
    }
}
