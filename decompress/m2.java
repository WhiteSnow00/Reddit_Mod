// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import a4.u1;
import sf2.o;
import qw.d;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import j91.dk;
import nf2.c0;
import javax.inject.Inject;
import ah2.f;
import d60.z;
import r20.a;
import ge0.r0;

public final class m2 implements r0
{
    public final a a;
    public final z b;
    
    @Inject
    public m2(final a a, final z b) {
        f.f((Object)a, "backgroundThread");
        f.f((Object)b, "remoteGql");
        this.a = a;
        this.b = b;
    }
    
    public final c0<Boolean> a(final String s) {
        f.f((Object)s, "username");
        final z b = this.b;
        b.getClass();
        final c0 w = e$a.a((e)b.a, (k)new dk(s), (OkHttpClient)null, (Map)null, 14).w((o)new d(13));
        f.e((Object)w, "graphQlClient\n      .exe\u2026 it.isUsernameAvailable }");
        return (c0<Boolean>)u1.j1(w, (r20.d)this.a);
    }
}
