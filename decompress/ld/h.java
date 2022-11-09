// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.Handler;
import fe.f;
import java.util.Iterator;
import java.util.Set;
import qd.e;
import com.google.android.gms.common.api.c;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.content.Context;
import ud.a;

public final class h
{
    public static a a;
    
    static {
        h.a = new a("GoogleSignInCommon", new String[0]);
    }
    
    public static Intent a(final Context context, final GoogleSignInOptions googleSignInOptions) {
        h.a.a("getSignInIntent()", new Object[0]);
        final SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        final Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, (Class)SignInHubActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("config", (Parcelable)signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }
    
    public static void b(final Context context) {
        n.b(context).a();
        final Set f = c.f;
        synchronized (f) {
            monitorexit(f);
            final Iterator iterator = f.iterator();
            while (iterator.hasNext()) {
                ((c)iterator.next()).b();
            }
            synchronized (e.w) {
                final e x = e.x;
                if (x != null) {
                    x.n.incrementAndGet();
                    final f s = x.s;
                    ((Handler)s).sendMessageAtFrontOfQueue(((Handler)s).obtainMessage(10));
                }
            }
        }
    }
}
