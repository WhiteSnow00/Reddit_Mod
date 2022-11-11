// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import java.util.List;
import x82.u;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.registration.createvault.CreateVaultPresenter$generateMnemonic$2", f = "CreateVaultPresenter.kt", l = {}, m = "invokeSuspend")
final class CreateVaultPresenter$generateMnemonic$2 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public int label;
    public final /* synthetic */ CreateVaultPresenter this$0;
    
    public CreateVaultPresenter$generateMnemonic$2(final CreateVaultPresenter this$0, final c<? super CreateVaultPresenter$generateMnemonic$2> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new CreateVaultPresenter$generateMnemonic$2(this.this$0, (c<? super CreateVaultPresenter$generateMnemonic$2>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((CreateVaultPresenter$generateMnemonic$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.k0(o);
            this.this$0.A = new u((List)fb2.j.b());
            return j.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
