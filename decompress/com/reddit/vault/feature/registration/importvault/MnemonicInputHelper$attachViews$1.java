// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.importvault;

import o92.k;
import android.text.Editable;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "", "it", "Lhg2/j;", "invoke", "(Ljava/lang/String;)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class MnemonicInputHelper$attachViews$1 extends Lambda implements l<String, j>
{
    public final /* synthetic */ MnemonicEditText $editText;
    public final /* synthetic */ o92.j this$0;
    
    public MnemonicInputHelper$attachViews$1(final o92.j this$0, final MnemonicEditText $editText) {
        this.this$0 = this$0;
        this.$editText = $editText;
        super(1);
    }
    
    public final void invoke(final String s) {
        e.f((Object)s, "it");
        final o92.j this$0 = this.this$0;
        final MnemonicEditText $editText = this.$editText;
        this$0.getClass();
        final Editable text = ((androidx.appcompat.widget.j)$editText).getText();
        final k e = o92.j.e($editText);
        if (e != null) {
            String f = s;
            if (((CharSequence)text).length() == e.c) {
                f = b.f(s, ' ');
            }
            text.replace(e.b, e.c, (CharSequence)f);
        }
    }
}
