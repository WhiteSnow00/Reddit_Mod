// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import ng2.e;
import n82.d0;
import android.view.ViewGroup;
import kotlin.Metadata;
import cg2.j;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lcg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class ToastManagerImpl$displayToast$5 extends Lambda implements a<j>
{
    public final ViewGroup $contentView;
    public final d0 $toast;
    public final int $translationY;
    public final com.reddit.vault.feature.toast.a this$0;
    
    public ToastManagerImpl$displayToast$5(final com.reddit.vault.feature.toast.a this$0, final d0 $toast, final ViewGroup $contentView, final int $translationY) {
        this.this$0 = this$0;
        this.$toast = $toast;
        this.$contentView = $contentView;
        this.$translationY = $translationY;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return j.a;
    }
    
    public final void invoke() {
        final com.reddit.vault.feature.toast.a this$0 = this.this$0;
        final ConstraintLayout a = this.$toast.a;
        e.e((Object)a, "toast.root");
        final ViewGroup $contentView = this.$contentView;
        final int $translationY = this.$translationY;
        final int c = com.reddit.vault.feature.toast.a.c;
        this$0.getClass();
        com.reddit.vault.feature.toast.a.b($translationY, a, $contentView);
    }
}
