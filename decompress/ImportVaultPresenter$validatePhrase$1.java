// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.importvault;

import com.reddit.vault.data.mapper.MnemonicMapper;
import kotlin.jvm.internal.Lambda;
import rg2.a;
import x82.m;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o92.e;
import x82.u;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.registration.importvault.ImportVaultPresenter$validatePhrase$1", f = "ImportVaultPresenter.kt", l = { 38 }, m = "invokeSuspend")
final class ImportVaultPresenter$validatePhrase$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ u $mnemonicPhrase;
    public int label;
    public final /* synthetic */ e this$0;
    
    public ImportVaultPresenter$validatePhrase$1(final e this$0, final u $mnemonicPhrase, final c<? super ImportVaultPresenter$validatePhrase$1> c) {
        this.this$0 = this$0;
        this.$mnemonicPhrase = $mnemonicPhrase;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new ImportVaultPresenter$validatePhrase$1(this.this$0, this.$mnemonicPhrase, (c<? super ImportVaultPresenter$validatePhrase$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((ImportVaultPresenter$validatePhrase$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object c) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(c);
        }
        else {
            b.k0(c);
            final MnemonicMapper n = this.this$0.n;
            final u $mnemonicPhrase = this.$mnemonicPhrase;
            this.label = 1;
            if ((c = n.c($mnemonicPhrase, (c)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        if (!sg2.e.a((Object)((m)c).i, (Object)this.this$0.j.a)) {
            this.this$0.k.x(false);
            final e this$0 = this.this$0;
            this$0.m.l((a)new a<j>() {
                public final /* synthetic */ u $mnemonicPhrase = ImportVaultPresenter$validatePhrase$1.this.$mnemonicPhrase;
                
                public final void invoke() {
                    this$0.l.Qn(this.$mnemonicPhrase);
                }
            });
        }
        else {
            this.this$0.l.Qn(this.$mnemonicPhrase);
        }
        return j.a;
    }
}
