// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.deactivatedvault;

import com.reddit.vault.domain.ClearUpVaultForSignOutUseCase;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import da2.d;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.vault.deactivatedvault.DeactivatedVaultAlertPresenter$onConfirm$1", f = "DeactivatedVaultAlertPresenter.kt", l = { 22 }, m = "invokeSuspend")
final class DeactivatedVaultAlertPresenter$onConfirm$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public int label;
    public final /* synthetic */ da2.d this$0;
    
    public DeactivatedVaultAlertPresenter$onConfirm$1(final da2.d this$0, final c<? super DeactivatedVaultAlertPresenter$onConfirm$1> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new DeactivatedVaultAlertPresenter$onConfirm$1(this.this$0, (c<? super DeactivatedVaultAlertPresenter$onConfirm$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((DeactivatedVaultAlertPresenter$onConfirm$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
        }
        else {
            b.k0(o);
            final ClearUpVaultForSignOutUseCase k = this.this$0.k;
            this.label = 1;
            if (k.a((c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        this.this$0.j.q();
        return j.a;
    }
}
