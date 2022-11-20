// 
// Decompiled by Procyon v0.6.0
// 

package gd;

import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.api.c;
import qd.d;
import android.os.Looper;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import ld.h;
import com.google.android.gms.common.api.a;

public final class f extends a<h, GoogleSignInOptions>
{
    public final List a() {
        return Collections.emptyList();
    }
    
    @Override
    public final a$e b(final Context context, final Looper looper, final d d, final Object o, final c.b b, final c.c c) {
        return (a$e)new h(context, looper, d, (GoogleSignInOptions)o, b, c);
    }
}
