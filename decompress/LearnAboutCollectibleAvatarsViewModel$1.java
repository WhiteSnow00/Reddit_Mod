// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.collectibleavatars;

import kotlin.jvm.internal.AdaptedFunctionReference;
import hg2.d;
import hj2.f;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import sg2.e;
import ca2.c$a;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.vault.collectibleavatars.LearnAboutCollectibleAvatarsViewModel$1", f = "LearnAboutCollectibleAvatarsViewModel.kt", l = { 36 }, m = "invokeSuspend")
final class LearnAboutCollectibleAvatarsViewModel$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public int label;
    public final /* synthetic */ a this$0;
    
    public LearnAboutCollectibleAvatarsViewModel$1(final a this$0, final c<? super LearnAboutCollectibleAvatarsViewModel$1> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public static final Object access$invokeSuspend$handleEvent(final a a, final ca2.c c, final c c2) {
        a.getClass();
        if (e.a((Object)c, (Object)c$a.a)) {
            a.h.J(false, a.i);
        }
        return j.a;
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new LearnAboutCollectibleAvatarsViewModel$1(this.this$0, (c<? super LearnAboutCollectibleAvatarsViewModel$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LearnAboutCollectibleAvatarsViewModel$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final a this$0 = this.this$0;
            final kotlinx.coroutines.flow.f f = this$0.f;
            final f f2 = new f();
            this.label = 1;
            f.getClass();
            if (kotlinx.coroutines.flow.f.m(f, (f)f2, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
