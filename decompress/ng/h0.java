// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import java.util.Iterator;
import java.util.Collection;
import android.os.Bundle;
import java.util.List;
import z2.a;
import android.content.Intent;
import android.os.Looper;
import android.content.IntentFilter;
import dg.k;
import com.google.android.play.core.splitinstall.zzo;
import android.content.Context;
import java.util.LinkedHashSet;
import android.os.Handler;
import jg.c;

public final class h0 extends c<ng.c>
{
    public static h0 j;
    public final Handler g;
    public final w h;
    public final LinkedHashSet i;
    
    public h0(final Context context, final zzo h) {
        super(new k("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.h = (w)h;
    }
    
    @Override
    public final void a(final Context context, final Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        final e m = ng.c.m(bundleExtra);
        super.a.g("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[] { m });
        final x zza = this.h.zza();
        if (m.b == 3 && zza != null) {
            zza.a((List)m.i, (v)new a(this, m, intent, context));
            return;
        }
        this.d(m);
    }
    
    public final void d(final e e) {
        synchronized (this) {
            final Iterator iterator = new LinkedHashSet(this.i).iterator();
            while (iterator.hasNext()) {
                ((jg.a<e>)iterator.next()).a(e);
            }
            ((c<e>)this).c(e);
        }
    }
}
