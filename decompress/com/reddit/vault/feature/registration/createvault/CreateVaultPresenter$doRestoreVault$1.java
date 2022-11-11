// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import com.reddit.vault.data.remote.RemoteVaultDataSource;
import com.reddit.vault.model.vault.Web3Keyfile;
import p92.g;
import ab2.a$b;
import p92.l;
import com.reddit.vault.model.vault.Web3KeyfileWrapper;
import sg2.e;
import java.util.Locale;
import nu2.w;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import x82.a;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.registration.createvault.CreateVaultPresenter$doRestoreVault$1", f = "CreateVaultPresenter.kt", l = { 289 }, m = "invokeSuspend")
final class CreateVaultPresenter$doRestoreVault$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ a $address;
    public int label;
    public final /* synthetic */ CreateVaultPresenter this$0;
    
    public CreateVaultPresenter$doRestoreVault$1(final CreateVaultPresenter this$0, final a $address, final c<? super CreateVaultPresenter$doRestoreVault$1> c) {
        this.this$0 = this$0;
        this.$address = $address;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new CreateVaultPresenter$doRestoreVault$1(this.this$0, this.$address, (c<? super CreateVaultPresenter$doRestoreVault$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((CreateVaultPresenter$doRestoreVault$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        final Web3Keyfile web3Keyfile = null;
        Label_0038: {
            if (label == 0) {
                break Label_0038;
            }
            Label_0028: {
                if (label != 1) {
                    break Label_0028;
                }
                try {
                    b.k0(o);
                    Label_0118: {
                        o = ((w)o).b;
                    }
                    break Label_0038;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    b.k0(o);
                    final RemoteVaultDataSource o2 = this.this$0.o;
                    final String c = this.$address.c();
                    final Locale root = Locale.ROOT;
                    e.e((Object)root, "ROOT");
                    final String lowerCase = c.toLowerCase(root);
                    e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    this.label = 1;
                    iftrue(Label_0118:)((o = o2.getVaultBackup(lowerCase, (c)this)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                    o = null;
                }
            }
        }
        final Web3KeyfileWrapper web3KeyfileWrapper = (Web3KeyfileWrapper)o;
        Web3Keyfile a = web3Keyfile;
        if (web3KeyfileWrapper != null) {
            a = web3KeyfileWrapper.a;
        }
        if (a != null) {
            final k92.b a2 = this.this$0.j.a;
            final a $address = this.$address;
            a2.getClass();
            e.f((Object)$address, "address");
            final l l = new l(new k92.a(a2.f, $address), a);
            final CreateVaultPresenter this$0 = this.this$0;
            this$0.v.x((g)l, this$0.r, (ab2.a)new a$b(), (rg2.a)new CreateVaultPresenter$doRestoreVault$1$1(this$0));
        }
        else {
            final CreateVaultPresenter this$2 = this.this$0;
            this$2.v.g(this.$address, this$2.r, (ab2.a)new a$b(), (rg2.a)new CreateVaultPresenter$doRestoreVault$1$2(this$2));
        }
        return j.a;
    }
}
