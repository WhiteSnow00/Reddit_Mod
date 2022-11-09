// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.v5;
import wu2.w;
import tg2.c;
import r20.d;
import a4.u1;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import nf2.c0;
import javax.inject.Inject;
import ah2.f;
import com.reddit.data.remote.RemoteAccountSettingsDataSource;
import d60.j;
import r20.a;
import ge0.v;

public final class k1 implements v
{
    public final a a;
    public final j b;
    public final RemoteAccountSettingsDataSource c;
    
    @Inject
    public k1(final a a, final j b, final RemoteAccountSettingsDataSource c) {
        f.f((Object)a, "backgroundThread");
        f.f((Object)b, "remoteGql");
        f.f((Object)c, "remote");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final c0<PostResponseWithErrors> a(final String s) {
        f.f((Object)s, "email");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.c.recoverUsername(s, "json"), (d)this.a);
    }
    
    public final c0<PostResponseWithErrors> b(final String s, final String s2) {
        f.f((Object)s, "currentPassword");
        f.f((Object)s2, "email");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.c.updateEmail(s, s2, "json"), (d)this.a);
    }
    
    public final Object c(final String s, final String s2, final c<? super w<PostResponseWithErrors>> c) {
        return this.c.updatePassword(s, s2, s2, "json", c);
    }
    
    public final c0<PostResponseWithErrors> d(final String s, final String s2) {
        f.f((Object)s, "name");
        f.f((Object)s2, "email");
        return (c0<PostResponseWithErrors>)u1.j1((c0)this.c.resetPassword(s, s2, "json"), (d)this.a);
    }
    
    public final Object e(final c<? super pg2.j> c) {
        Object o = e$a.b(14, (k)new v5(), (e)this.b.a, (RetryAlgo)null, (Map)null, (c)c, (OkHttpClient)null);
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o != coroutine_SUSPENDED) {
            o = pg2.j.a;
        }
        if (o == coroutine_SUSPENDED) {
            return o;
        }
        return pg2.j.a;
    }
    
    public final nf2.a sendVerificationEmail() {
        return o72.f.t(this.c.sendVerificationEmail(), (d)this.a);
    }
}
