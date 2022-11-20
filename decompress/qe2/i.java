// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import io.branch.referral.f0;
import io.branch.referral.k$a;
import android.text.TextUtils;
import io.branch.referral.k;
import android.content.Context;
import io.branch.referral.m;
import java.util.concurrent.CountDownLatch;

public final class i implements Runnable
{
    public final CountDownLatch f;
    public final m g;
    
    public i(final m g, final CountDownLatch f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final Context context = (Context)this.g.a.get();
        if (context != null) {
            this.g.getClass();
            try {
                final Class<?> forName = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
                int b = 1;
                final Object invoke = forName.getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                final String string = invoke.getClass().getDeclaredMethod("getId", (Class<?>[])new Class[0]).invoke(invoke, new Object[0]).toString();
                final Boolean b2 = (Boolean)invoke.getClass().getDeclaredMethod("isLimitAdTrackingEnabled", (Class<?>[])new Class[0]).invoke(invoke, new Object[0]);
                k c;
                if ((c = k.c()) == null) {
                    c = new k(context);
                }
                final k$a a = c.a;
                ((f0)a).a = string;
                if (!b2) {
                    b = 0;
                }
                ((f0)a).b = b;
                if (TextUtils.isEmpty((CharSequence)string) || string.equals("00000000-0000-0000-0000-000000000000") || b2) {
                    ((f0)a).a = null;
                }
            }
            catch (final Exception ex) {
                ex.toString();
            }
        }
        this.f.countDown();
    }
}
