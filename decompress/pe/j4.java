// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import z0.d1;
import z0.c1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import lw0.b;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import android.content.ComponentName;

public final class j4 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    
    @Override
    public final void run() {
        Label_0359: {
            switch (this.f) {
                default: {
                    break Label_0359;
                }
                case 4: {
                    l6.a0(((k6)this.g).h, (ComponentName)this.h);
                    return;
                }
                case 3: {
                    final AtomicReference atomicReference = (AtomicReference)this.h;
                    monitorenter(atomicReference);
                    try {
                        final AtomicReference atomicReference2 = (AtomicReference)this.h;
                        final Object g = this.g;
                        atomicReference2.set(((h4)((d1)g).f).l.S(((h4)((d1)g).f).o().R(), r2.M));
                        return;
                    }
                    finally {
                        this.h.notify();
                    }
                    try {}
                    finally {
                        monitorexit(atomicReference);
                    }
                }
                case 1: {
                    break Label_0359;
                }
                case 2: {
                    final o5 o5 = (o5)this.g;
                    final Bundle bundle = (Bundle)this.h;
                    ((l2)o5).M();
                    ((i3)o5).N();
                    b.R((Object)bundle);
                    final String string = ((BaseBundle)bundle).getString("name");
                    b.O(string);
                    if (!((h4)((d1)o5).f).d()) {
                        ((h4)((d1)o5).f).h().s.a("Conditional property not cleared since app measurement is disabled");
                        return;
                    }
                }
                case 0: {
                    Label_0416: {
                        break Label_0416;
                        final String string;
                        final j7 j7 = new j7(0L, null, string, "");
                        try {
                            final o5 o5;
                            final n7 y = ((h4)((d1)o5).f).y();
                            final Bundle bundle;
                            ((BaseBundle)bundle).getString("app_id");
                            ((h4)((d1)o5).f).v().R(new c(((BaseBundle)bundle).getString("app_id"), "", j7, ((BaseBundle)bundle).getLong("creation_timestamp"), ((BaseBundle)bundle).getBoolean("active"), ((BaseBundle)bundle).getString("trigger_event_name"), null, ((BaseBundle)bundle).getLong("trigger_timeout"), null, ((BaseBundle)bundle).getLong("time_to_live"), y.S0(((BaseBundle)bundle).getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", ((BaseBundle)bundle).getLong("creation_timestamp"), true)));
                            return;
                            g7 a2 = null;
                            c c = null;
                            q7 y2 = null;
                            Block_13: {
                                g7 a3 = null;
                                c c2 = null;
                                q7 y3 = null;
                            Block_12:
                                while (true) {
                                Block_11:
                                    while (true) {
                                        final c1 i;
                                        b.W(i == null, "EventInterceptor already set.");
                                        Label_0612: {
                                            break Label_0612;
                                            ((u4)this.g).a.a();
                                            final g7 a = ((u4)this.g).a;
                                            final q7 q7 = (q7)this.h;
                                            a.b().M();
                                            a.c();
                                            b.O(q7.f);
                                            a.I(q7);
                                            return;
                                            ((u4)this.g).a.a();
                                            iftrue(Label_0497:)(((c)this.h).h.q() != null);
                                            break Block_11;
                                            Label_0497: {
                                                a2 = ((u4)this.g).a;
                                            }
                                            c = (c)this.h;
                                            a2.getClass();
                                            final String f = c.f;
                                            b.R((Object)f);
                                            y2 = a2.y(f);
                                            iftrue(Label_0546:)(y2 == null);
                                            break Block_13;
                                        }
                                        final o5 t;
                                        final c1 k;
                                        t.i = k;
                                        return;
                                        i = t.i;
                                        iftrue(Label_0612:)(k == i);
                                        continue;
                                    }
                                    a3 = ((u4)this.g).a;
                                    c2 = (c)this.h;
                                    a3.getClass();
                                    final String f2 = c2.f;
                                    b.R((Object)f2);
                                    y3 = a3.y(f2);
                                    iftrue(Label_0546:)(y3 == null);
                                    break Block_12;
                                    Label_0546: {
                                        return;
                                    }
                                    final o5 t = ((AppMeasurementDynamiteService)this.g).a.t();
                                    final c1 k = (c1)this.h;
                                    ((l2)t).M();
                                    ((i3)t).N();
                                    iftrue(Label_0612:)(k == null);
                                    continue;
                                }
                                a3.m(c2, y3);
                                return;
                            }
                            a2.p(c, y2);
                            return;
                        }
                        catch (final IllegalArgumentException ex) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
}
