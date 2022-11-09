// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Bundle;

public abstract class m0 extends v0<Boolean>
{
    public final int d;
    public final Bundle e;
    public final /* synthetic */ b f;
    
    public m0(final b f, final int d, final Bundle e) {
        this.f = f;
        super(f, Boolean.TRUE);
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void b() {
    }
    
    public abstract void c(final od.b p0);
    
    public abstract boolean d();
}
