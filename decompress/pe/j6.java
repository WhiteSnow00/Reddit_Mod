// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.RemoteException;
import lw0.b;
import java.util.ArrayList;
import ie.w0;

public final class j6 implements Runnable
{
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ q7 h;
    public final /* synthetic */ w0 i;
    public final /* synthetic */ l6 j;
    
    public j6(final l6 j, final String f, final String g, final q7 h, final w0 i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        Object w;
        final ArrayList list = (ArrayList)(w = new ArrayList());
        try {
            try {
                final l6 j = this.j;
                w = list;
                final u2 i = j.i;
                if (i == null) {
                    w = list;
                    ((h4)j.f).h().k.c((Object)this.f, "Failed to get conditional properties; not connected to service", (Object)this.g);
                    w = this.j.f;
                }
                w = list;
                b.R((Object)this.h);
                w = list;
                w = n7.W(i.G0(this.f, this.g, this.h));
                this.j.X();
                w = this.j.f;
            }
            finally {}
        }
        catch (final RemoteException ex) {
            ((h4)this.j.f).h().k.d((Object)this.f, "Failed to get conditional properties; remote exception", (Object)this.g, (Object)ex);
            w = this.j.f;
        }
        final ArrayList list2;
        ((h4)w).y().f0(this.i, list2);
        return;
        ((h4)this.j.f).y().f0(this.i, (ArrayList)w);
    }
}
