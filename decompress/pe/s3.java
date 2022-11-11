// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import android.os.Bundle;
import android.content.ServiceConnection;
import ie.l0;
import android.os.IInterface;

public final class s3 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ IInterface g = g;
    public final /* synthetic */ Object h = h;
    public final /* synthetic */ Object i = i;
    
    public s3(final t3 i, final l0 g, final ServiceConnection h) {
        this.f = 0;
        this.i = i;
        this.g = (IInterface)g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final u4 u4 = (u4)this.g;
                final String s = (String)this.h;
                final Bundle bundle = (Bundle)this.i;
                final k h = u4.a.h;
                g7.H((b7)h);
                h.M();
                h.N();
                final o o = new o((h4)h.f, "", s, "dep", 0L, bundle);
                final i7 l = h.g.l;
                g7.H((b7)l);
                final byte[] i = l.e0(o).i();
                ((h4)h.f).h().s.c((Object)((h4)h.f).r.d(s), "Saving default event parameters, appId, data size", (Object)i.length);
                final ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", s);
                contentValues.put("parameters", i);
                try {
                    if (h.f0().insertWithOnConflict("default_event_params", (String)null, contentValues, 5) == -1L) {
                        ((h4)h.f).h().k.b((Object)d3.V(s), "Failed to insert default event parameters (got -1). appId");
                    }
                }
                catch (final SQLiteException ex) {
                    ((h4)h.f).h().k.c((Object)d3.V(s), "Error storing default event parameters. appId", (Object)ex);
                }
                return;
            }
            case 0: {
                final t3 t3 = (t3)this.i;
                final u3 g = t3.g;
                final String f = t3.f;
                final l0 l2 = (l0)this.g;
                g.a.b().M();
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putString("package_name", f);
                try {
                    if (l2.c(bundle2) == null) {
                        g.a.h().k.a("Install Referrer Service returned a null response");
                    }
                }
                catch (final Exception ex2) {
                    g.a.h().k.b((Object)ex2.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                g.a.b().M();
                throw new IllegalStateException("Unexpected call on client side");
            }
        }
    }
}
