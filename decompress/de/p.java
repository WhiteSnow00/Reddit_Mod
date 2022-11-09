// 
// Decompiled by Procyon v0.6.0
// 

package de;

import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.RemoteException;
import android.content.Context;
import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.api.Status;
import qd.a1;
import com.google.android.gms.common.api.internal.a;
import pd.c;

public abstract class p<R extends c> extends a<R, r>
{
    public p(final a1 a1) {
        super(gd.a.a, a1);
    }
    
    public final void l(final a$e a$e) throws RemoteException {
        final r r = (r)a$e;
        final Context m = r.m;
        final u u = r.C();
        final o o = (o)this;
        u.a0(new q((qd.c<Status>)o), new w(o.o));
    }
}
