// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Bundle;

public abstract class m0 extends v0<Boolean>
{
    public final int d;
    public final Bundle e;
    public final b f;
    
    public m0(final b f, final int d, final Bundle e) {
        super(this.f = f, Boolean.TRUE);
        this.d = d;
        this.e = e;
    }
    
    public final /* bridge */ void a() {
        final int d = this.d;
        PendingIntent pendingIntent = null;
        if (d == 0) {
            if (!this.d()) {
                this.f.K(1, (IInterface)null);
                this.c(new nd.b(8, (PendingIntent)null));
            }
            return;
        }
        this.f.K(1, (IInterface)null);
        final Bundle e = this.e;
        if (e != null) {
            pendingIntent = (PendingIntent)e.getParcelable("pendingIntent");
        }
        this.c(new nd.b(this.d, pendingIntent));
    }
    
    public final void b() {
    }
    
    public abstract void c(final nd.b p0);
    
    public abstract boolean d();
}
