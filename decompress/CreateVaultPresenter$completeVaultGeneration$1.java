// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import com.reddit.vault.h;
import java.util.List;
import com.reddit.vault.navigation.NavStyle;
import vl.a;
import sg2.e;
import n92.v;
import n92.d;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import n92.o;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.registration.createvault.CreateVaultPresenter$completeVaultGeneration$1", f = "CreateVaultPresenter.kt", l = { 364 }, m = "invokeSuspend")
final class CreateVaultPresenter$completeVaultGeneration$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ o $headerItem;
    public int label;
    public final /* synthetic */ CreateVaultPresenter this$0;
    
    public CreateVaultPresenter$completeVaultGeneration$1(final CreateVaultPresenter this$0, final o $headerItem, final c<? super CreateVaultPresenter$completeVaultGeneration$1> c) {
        this.this$0 = this$0;
        this.$headerItem = $headerItem;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new CreateVaultPresenter$completeVaultGeneration$1(this.this$0, this.$headerItem, (c<? super CreateVaultPresenter$completeVaultGeneration$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((CreateVaultPresenter$completeVaultGeneration$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final CreateVaultPresenter this$0 = this.this$0;
            final List s1 = lw0.b.s1((Object[])new n92.d[] { (n92.d)this.$headerItem, (n92.d)new v(2131954527, (Integer)null) });
            this$0.getClass();
            e.f((Object)s1, "<set-?>");
            this$0.G = s1;
            this.this$0.k.Oi();
            this.label = 1;
            if (a.G(2000L, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final CreateVaultPresenter this$2 = this.this$0;
        if (this$2.C) {
            this$2.z.a(this$2.j.a.f);
            final h y = this.this$0.y;
            if (y != null) {
                y.i5();
            }
        }
        else {
            final k92.b a = this$2.j.a;
            final x82.a b = this$2.B;
            e.c((Object)b);
            a.getClass();
            final k92.a a2 = new k92.a(a.f, b);
            this.this$0.v.m(new x82.b0(a2.g, a2.f, true, true, true, false), NavStyle.PUSH);
        }
        return j.a;
    }
}
