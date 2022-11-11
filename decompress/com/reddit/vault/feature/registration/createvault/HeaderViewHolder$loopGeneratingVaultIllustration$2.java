// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import c7.d;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import n92.q;
import com.airbnb.lottie.LottieAnimationView;
import sg2.e;
import n92.r;
import kotlin.Metadata;
import hg2.j;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lhg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class HeaderViewHolder$loopGeneratingVaultIllustration$2 extends Lambda implements a<j>
{
    public final /* synthetic */ a<j> $animationCompleteListener;
    public final /* synthetic */ r this$0;
    
    public HeaderViewHolder$loopGeneratingVaultIllustration$2(final r this$0, final a<j> $animationCompleteListener) {
        this.this$0 = this$0;
        this.$animationCompleteListener = $animationCompleteListener;
        super(0);
    }
    
    public final void invoke() {
        final r this$0 = this.this$0;
        final a<j> $animationCompleteListener = this.$animationCompleteListener;
        if (!e.a((Object)this$0.k, (Object)"generating_vault.json")) {
            this$0.k = "generating_vault.json";
            ((LottieAnimationView)this$0.f.f).setAnimation("generating_vault.json");
        }
        ((LottieAnimationView)this$0.f.f).setMaxFrame(362);
        ((LottieAnimationView)this$0.f.f).n.g.addListener((Animator$AnimatorListener)new q(this$0, (a)$animationCompleteListener));
        final View f = this$0.f.f;
        final c7.d g = ((LottieAnimationView)f).n.g;
        if (g == null || !g.p) {
            ((LottieAnimationView)f).h();
        }
        ((LottieAnimationView)this$0.f.f).setRepeatCount(0);
    }
}
