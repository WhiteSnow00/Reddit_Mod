// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import com.google.android.play.core.assetpacks.j;
import ie.w0;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzah;
import cg.t1;
import c6.h;
import cg.q0;
import te2.e;
import com.google.android.play.core.assetpacks.AssetPackState;
import qd.a;
import cg.w;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.b;

public final class q4 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g = g;
    public final /* synthetic */ Object h = h;
    public final /* synthetic */ Object i = i;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final b b = (b)this.g;
                final Bundle bundle = (Bundle)this.h;
                final AssetPackState assetPackState = (AssetPackState)this.i;
                final j g = b.g;
                g.getClass();
                if (g.c((q0)new e(5, (Object)g, (Object)bundle))) {
                    b.o.post((Runnable)new h(1, b, assetPackState));
                    ((t1)b.i.zza()).b();
                }
                return;
            }
            case 1: {
                Object k0 = null;
                String s2;
                final String s = s2 = null;
                Object o = null;
                Label_0186: {
                    try {
                        try {
                            if (!((h4)((l6)this.i).f).r().S().f(zzah.zzb)) {
                                s2 = s;
                                ((h4)((l6)this.i).f).h().p.a("Analytics storage consent denied; will not get app instance id");
                                s2 = s;
                                ((h4)((l6)this.i).f).t().l.set(null);
                                s2 = s;
                                ((h4)((l6)this.i).f).r().k.b(null);
                                final h4 h4 = (h4)((l6)this.i).f;
                            }
                            break Label_0186;
                        }
                        finally {}
                    }
                    catch (final RemoteException ex) {
                        ((h4)((l6)this.i).f).h().k.b((Object)ex, "Failed to get app instance id");
                        final h4 h5 = (h4)((l6)this.i).f;
                        k0 = o;
                        o = h5;
                        Label_0262: {
                            lw0.b.R((Object)this.g);
                        }
                        u2 i = null;
                        k0 = i.k0((q7)this.g);
                        iftrue(Label_0361:)(k0 == null);
                        ((h4)((l6)this.i).f).t().l.set(k0);
                        ((h4)((l6)this.i).f).r().k.b((String)k0);
                        while (true) {
                            Label_0361: {
                                break Label_0361;
                                final l6 l6;
                                ((h4)l6.f).h().k.a("Failed to get app instance id");
                                o = ((l6)this.i).f;
                                break Label_0186;
                            }
                            ((l6)this.i).X();
                            o = ((l6)this.i).f;
                            break Label_0186;
                            final l6 l6 = (l6)this.i;
                            i = l6.i;
                            iftrue(Label_0262:)(i != null);
                            continue;
                        }
                    }
                }
                ((h4)o).y().k0((String)k0, (w0)this.h);
                return;
                ((h4)((l6)this.i).f).y().k0(s2, (w0)this.h);
                break;
            }
            case 0: {
                ((u4)this.i).a.a();
                ((u4)this.i).a.f((t)this.g, (String)this.h);
            }
        }
    }
}
