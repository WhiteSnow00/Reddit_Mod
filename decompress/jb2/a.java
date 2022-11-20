// 
// Decompiled by Procyon v0.6.0
// 

package jb2;

import android.os.RemoteException;
import q.j;
import q.h;
import q.k;

public final class a implements c
{
    public k a;
    public h b;
    public b c;
    public a.a$b d;
    
    public final void a() {
        this.b = null;
        this.a = null;
        final a.a$b d = this.d;
        if (d != null) {
            d.b();
        }
    }
    
    public final void b(final j.j$a b) {
        this.b = b;
        while (true) {
            try {
                b.a.q0();
                final a.a$b d = this.d;
                if (d != null) {
                    d.a();
                }
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
}
