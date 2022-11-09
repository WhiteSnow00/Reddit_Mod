// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import sf2.o;
import ge0.d$a;
import nf2.g0;
import nf2.c0;
import a4.u1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.AccountPreferences$AcceptPrivateMessagesPolicy;
import com.reddit.domain.model.AccountPreferencesPatch;
import javax.inject.Inject;
import ah2.f;
import r20.a;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import ge0.d;

public final class r implements d
{
    public final RemoteAccountPreferenceDataSource a;
    public final a b;
    
    @Inject
    public r(final RemoteAccountPreferenceDataSource a, final a b) {
        f.f((Object)a, "remoteAccountPreferenceDataSource");
        f.f((Object)b, "backgroundThread");
        this.a = a;
        this.b = b;
    }
    
    public final nf2.a a(final boolean b) {
        final nf2.a k = this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, Boolean.valueOf(b ^ true), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194239, (DefaultConstructorMarker)null)).K();
        f.e((Object)k, "remoteAccountPreferenceD\u2026))\n      .toCompletable()");
        return k;
    }
    
    public final nf2.a b(final boolean b) {
        final nf2.a k = u1.j1((c0)this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4190207, (DefaultConstructorMarker)null)), (r20.d)this.b).K();
        f.e((Object)k, "remoteAccountPreferenceD\u2026d)\n      .toCompletable()");
        return k;
    }
    
    public final nf2.a c(final boolean b) {
        final nf2.a k = u1.j1((c0)this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4192255, (DefaultConstructorMarker)null)), (r20.d)this.b).K();
        f.e((Object)k, "remoteAccountPreferenceD\u2026d)\n      .toCompletable()");
        return k;
    }
    
    public final nf2.a d(final boolean b) {
        final nf2.a k = u1.j1((c0)this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4193279, (DefaultConstructorMarker)null)), (r20.d)this.b).K();
        f.e((Object)k, "remoteAccountPreferenceD\u2026d)\n      .toCompletable()");
        return k;
    }
    
    public final nf2.a e(final boolean b) {
        final nf2.a r = nf2.a.r((g0)u1.j1((c0)this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4063231, (DefaultConstructorMarker)null)), (r20.d)this.b));
        f.e((Object)r, "fromSingle(\n      remote\u2026(backgroundThread),\n    )");
        return r;
    }
    
    public final nf2.a f(final boolean b) {
        final nf2.a k = u1.j1((c0)this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4177919, (DefaultConstructorMarker)null)), (r20.d)this.b).K();
        f.e((Object)k, "remoteAccountPreferenceD\u2026d)\n      .toCompletable()");
        return k;
    }
    
    public final nf2.a g(final boolean b) {
        final nf2.a r = nf2.a.r((g0)u1.j1((c0)this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (String)null, (Boolean)null, 3932159, (DefaultConstructorMarker)null)), (r20.d)this.b));
        f.e((Object)r, "fromSingle(\n      remote\u2026(backgroundThread),\n    )");
        return r;
    }
    
    public final c0<d$a> h() {
        final c0 w = this.a.getPreferences().w((o)new u(3));
        f.e((Object)w, "remoteAccountPreferenceD\u2026tionRepository::Settings)");
        return (c0<d$a>)u1.j1(w, (r20.d)this.b);
    }
    
    public final nf2.a i(final boolean b) {
        final nf2.a k = u1.j1((c0)this.a.patchPreferences(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194175, (DefaultConstructorMarker)null)), (r20.d)this.b).K();
        f.e((Object)k, "remoteAccountPreferenceD\u2026d)\n      .toCompletable()");
        return k;
    }
}
