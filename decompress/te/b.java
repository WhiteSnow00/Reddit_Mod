// 
// Decompiled by Procyon v0.6.0
// 

package te;

import android.os.BaseBundle;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.api.c;
import qd.d;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.a;

public final class b extends a<ue.a, te.a>
{
    @Override
    public final a$e b(final Context context, final Looper looper, final d d, final Object o, final c.b b, final c.c c) {
        final te.a a = (te.a)o;
        final Integer i = d.i;
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)d.a);
        if (i != null) {
            ((BaseBundle)bundle).putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", (int)i);
        }
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.serverClientId", (String)null);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.hostedDomain", (String)null);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.logSessionId", (String)null);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return (a$e)new ue.a(context, looper, d, bundle, b, c);
    }
}
