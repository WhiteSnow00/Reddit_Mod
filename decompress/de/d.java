// 
// Decompiled by Procyon v0.6.0
// 

package de;

import qd.m;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import id.c;
import android.content.Intent;
import id.a$b;
import qd.p;
import com.android.billingclient.api.d0;
import qd.p$a;
import xe.x;
import android.content.Context;
import com.google.android.gms.common.api.a$c;
import com.google.android.gms.common.api.b$a;
import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

public final class d extends b<id.d>
{
    public static final a<id.d> k;
    
    static {
        k = new a("Auth.Api.Identity.SignIn.API", (a.a)new e(), new a.f());
    }
    
    public d(final Activity activity, final id.d d) {
        final a<id.d> k = d.k;
        final id.d.a a = new id.d.a();
        final String f = d.f;
        if (f != null) {
            yd.a.P0(f);
            a.a = f;
        }
        final String a2 = de.i.a();
        yd.a.P0(a2);
        a.a = a2;
        super(activity, (com.google.android.gms.common.api.a<a$c>)k, (a$c)new id.d(a2), b$a.c);
    }
    
    public d(final Context context, final id.d d) {
        final a<id.d> k = d.k;
        final id.d.a a = new id.d.a();
        final String f = d.f;
        if (f != null) {
            yd.a.P0(f);
            a.a = f;
        }
        final String a2 = de.i.a();
        yd.a.P0(a2);
        a.a = a2;
        super(context, (com.google.android.gms.common.api.a<a$c>)k, (a$c)new id.d(a2), b$a.c);
    }
    
    public final x c(id.a a) {
        final id.a.a a2 = new id.a.a();
        final a$b g = a.g;
        yd.a.S0((Object)g);
        a2.b = g;
        final id.a$c f = a.f;
        yd.a.S0((Object)f);
        a2.a = f;
        final boolean i = a.i;
        a2.d = i;
        final String h = a.h;
        if (h != null) {
            a2.c = h;
        }
        final String f2 = ((id.d)super.d).f;
        a2.c = f2;
        a = new id.a(f, a2.b, f2, i);
        final p$a p$a = new p$a();
        p$a.c = new od.d[] { de.j.a };
        p$a.a = (m)new d0(2, (Object)this, (Object)a);
        p$a.b = false;
        return this.b(0, p$a.a());
    }
    
    public final c d(final Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.m);
        }
        final Status status = sd.c.a(intent, "status", (android.os.Parcelable$Creator<Status>)Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.o);
        }
        if (!status.f()) {
            throw new ApiException(status);
        }
        final c c = sd.c.a(intent, "sign_in_credential", (android.os.Parcelable$Creator<c>)id.c.CREATOR);
        if (c != null) {
            return c;
        }
        throw new ApiException(Status.m);
    }
}
