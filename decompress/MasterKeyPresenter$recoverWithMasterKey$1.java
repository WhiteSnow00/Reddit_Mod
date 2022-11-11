// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.masterkey;

import com.reddit.vault.h;
import y82.d;
import y82.f;
import x82.k0;
import ab2.g;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import com.reddit.vault.data.mapper.MnemonicMapper;
import com.reddit.vault.data.analytics.Action;
import com.reddit.vault.domain.repository.RedditBackupState;
import a4.a0;
import java.util.List;
import hj2.e;
import com.reddit.vault.navigation.NavStyle;
import com.reddit.vault.feature.errors.ErrorScreen$a;
import ab2.g$a;
import ab2.a$a;
import com.reddit.vault.data.analytics.Noun;
import e92.c$a;
import o82.b$a;
import com.reddit.vault.data.remote.RemoteVaultDataSourceKt;
import com.reddit.vault.model.vault.Web3KeyfileUtils;
import x82.u;
import x82.m;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import k92.a;
import com.reddit.vault.model.vault.Web3Keyfile;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.registration.masterkey.MasterKeyPresenter$recoverWithMasterKey$1", f = "MasterKeyPresenter.kt", l = { 311, 320, 322, 333, 334, 337 }, m = "invokeSuspend")
final class MasterKeyPresenter$recoverWithMasterKey$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ Web3Keyfile $keyfile;
    public final /* synthetic */ a $state;
    public Object L$0;
    public int label;
    public final /* synthetic */ MasterKeyPresenter this$0;
    
    public MasterKeyPresenter$recoverWithMasterKey$1(final Web3Keyfile $keyfile, final MasterKeyPresenter this$0, final a $state, final c<? super MasterKeyPresenter$recoverWithMasterKey$1> c) {
        this.$keyfile = $keyfile;
        this.this$0 = this$0;
        this.$state = $state;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new MasterKeyPresenter$recoverWithMasterKey$1(this.$keyfile, this.this$0, this.$state, (c<? super MasterKeyPresenter$recoverWithMasterKey$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((MasterKeyPresenter$recoverWithMasterKey$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        Label_0500: {
            m i = null;
            Label_0467: {
                m l$0 = null;
                Label_0397: {
                    Label_0284: {
                        Label_0123: {
                            switch (this.label) {
                                default: {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                case 6: {
                                    b.k0(o);
                                    break Label_0500;
                                }
                                case 5: {
                                    final m m = (m)this.L$0;
                                    b.k0(o);
                                    i = m;
                                    break Label_0467;
                                }
                                case 4: {
                                    l$0 = (m)this.L$0;
                                    b.k0(o);
                                    break Label_0397;
                                }
                                case 3: {
                                    l$0 = (m)this.L$0;
                                    b.k0(o);
                                    break Label_0284;
                                }
                                case 2: {
                                    b.k0(o);
                                    break;
                                }
                                case 1: {
                                    break Label_0123;
                                }
                                case 0: {
                                    u u = null;
                                    Label_0130: {
                                        break Label_0130;
                                        try {
                                            b.k0(o);
                                            Label_0168: {
                                                u = (u)o;
                                            }
                                            break Label_0130;
                                            b.k0(o);
                                            final Web3Keyfile $keyfile = this.$keyfile;
                                            final String b = this.this$0.B;
                                            this.label = 1;
                                            iftrue(Label_0168:)((o = Web3KeyfileUtils.d($keyfile, b, (c)this)) != coroutine_SUSPENDED);
                                            return coroutine_SUSPENDED;
                                        }
                                        catch (final Exception ex) {
                                            u = null;
                                        }
                                    }
                                    if (u == null) {
                                        this.this$0.k.tn(MasterKeyContract$VaultStatus.Invisible);
                                        this.this$0.k.uf();
                                        return j.a;
                                    }
                                    final MnemonicMapper w = this.this$0.w;
                                    this.label = 2;
                                    if ((o = w.c(u, (c)this)) == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    break;
                                }
                            }
                        }
                        l$0 = (m)o;
                        final RemoteVaultDataSource o2 = this.this$0.o;
                        this.L$0 = l$0;
                        this.label = 3;
                        if ((o = RemoteVaultDataSourceKt.a(o2, l$0, (c)this)) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    final o82.b b2 = (o82.b)o;
                    if (b2 instanceof b$a) {
                        this.this$0.k.tn(MasterKeyContract$VaultStatus.Invisible);
                        final g v = this.this$0.v;
                        final e92.c.b j = e92.c.j;
                        g$a.a(v, c$a.b(((b$a)b2).a, (Noun)null, 6), (ErrorScreen$a)null, (NavStyle)null, new a$a(), 6);
                        return hg2.j.a;
                    }
                    final e<List<k0>> b3 = this.this$0.p.b();
                    this.L$0 = l$0;
                    this.label = 4;
                    if ((o = kotlinx.coroutines.flow.a.z(b3, (c)this)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final List list = (List)o;
                x82.a m2;
                if (list != null) {
                    m2 = a0.m0(list);
                }
                else {
                    m2 = null;
                }
                i = l$0;
                if (!sg2.e.a((Object)m2, (Object)l$0.i)) {
                    final f p = this.this$0.p;
                    this.L$0 = l$0;
                    this.label = 5;
                    i = l$0;
                    if (p.a((c<? super j>)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
            }
            final y82.d n = this.this$0.n;
            this.L$0 = null;
            this.label = 6;
            if (n.c(i, (c<? super j>)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        this.this$0.m.p(RedditBackupState.BACKED_UP);
        i82.a.a(this.this$0.q, Noun.VAULT_RECOVERY, Action.COMPLETE, (String)null, (String)null, (String)null, "password", (String)null, (Long)null, 220);
        final h a = this.this$0.A;
        if (a != null) {
            a.i5();
        }
        this.this$0.z.a(this.$state.f);
        return j.a;
    }
}
