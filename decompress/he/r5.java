// 
// Decompiled by Procyon v0.6.0
// 

package he;

import org.json.JSONException;
import org.json.JSONObject;
import com.google.android.gms.common.api.Status;
import android.os.RemoteException;
import ih.i;
import com.google.android.gms.internal.firebase_auth_api.zzye;
import mg.d0;
import td.a;

public final class r5 implements bc, jc
{
    public final Object f;
    public final Object g;
    
    public r5(final e2 f) {
        this.f = f;
        this.g = null;
    }
    
    public r5(final fc f, final a g) {
        d0.y((Object)f);
        this.f = f;
        d0.y((Object)g);
        this.g = g;
    }
    
    public r5(final h2 g) {
        this.f = null;
        this.g = g;
    }
    
    public r5(final q5 g, final r5 f) {
        this.g = g;
        this.f = f;
    }
    
    public r5(final String g) {
        this.f = ((zzye)zzye.zza).toString();
        d0.v(g);
        this.g = g;
    }
    
    public final void a(final String s) {
        ((r5)this.f).d(i.a(s));
    }
    
    public final void b(final eb eb) {
        try {
            ((rb)this.f).d(eb);
        }
        catch (final RemoteException ex) {
            ((a)this.g).b((Exception)ex, "RemoteException when sending failure result for mfa", new Object[0]);
        }
    }
    
    public final void c(final cc cc) {
        final rd rd = (rd)cc;
        q5.g((q5)this.g, (r5)this.f, (jc)this, new bd(rd.g, rd.f, rd.h, "Bearer"), Boolean.valueOf(rd.i), (String)null);
    }
    
    public final void d(final Status status) {
        try {
            ((rb)this.f).a(status);
        }
        catch (final RemoteException ex) {
            ((a)this.g).b((Exception)ex, "RemoteException when sending failure result.", new Object[0]);
        }
    }
    
    public final String zza() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("grantType", (Object)this.f);
        jsonObject.put("refreshToken", (Object)this.g);
        return jsonObject.toString();
    }
}
