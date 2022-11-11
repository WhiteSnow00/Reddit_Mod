// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.importvault;

import android.text.Editable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import hg2.j;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lhg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class MnemonicInputHelper$attachViews$3 extends Lambda implements a<j>
{
    public final /* synthetic */ MnemonicEditText $editText;
    public final /* synthetic */ RecyclerView $recyclerView;
    public final /* synthetic */ o92.j this$0;
    
    public MnemonicInputHelper$attachViews$3(final MnemonicEditText $editText, final o92.j this$0, final RecyclerView $recyclerView) {
        this.$editText = $editText;
        this.this$0 = this$0;
        this.$recyclerView = $recyclerView;
        super(0);
    }
    
    public final void invoke() {
        final Editable text = ((androidx.appcompat.widget.j)this.$editText).getText();
        if (text != null) {
            final o92.j this$0 = this.this$0;
            final MnemonicEditText $editText = this.$editText;
            final RecyclerView $recyclerView = this.$recyclerView;
            this$0.getClass();
            o92.j.c(this$0, text, o92.j.d($editText));
            o92.j.b(this$0, o92.j.e($editText), $recyclerView);
            final Editable text2 = ((androidx.appcompat.widget.j)$editText).getText();
            String string;
            if (text2 != null) {
                string = text2.toString();
            }
            else {
                string = null;
            }
            o92.j.a(this$0, string);
        }
    }
}
