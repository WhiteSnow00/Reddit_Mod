// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import sg2.k;
import sg2.e;
import z0.d;
import rg2.p;
import kotlin.Metadata;
import hg2.j;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lhg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$doCompose$2$5 extends Lambda implements a<j>
{
    public final /* synthetic */ p<z0.d, Integer, j> $content;
    public final /* synthetic */ Object $savedContent;
    public final /* synthetic */ ComposerImpl this$0;
    
    public ComposerImpl$doCompose$2$5(final p<? super z0.d, ? super Integer, j> $content, final ComposerImpl this$0, final Object $savedContent) {
        this.$content = (p<z0.d, Integer, j>)$content;
        this.this$0 = this$0;
        this.$savedContent = $savedContent;
        super(0);
    }
    
    public final void invoke() {
        if (this.$content != null) {
            this.this$0.w0(200, ComposerKt.f);
            final ComposerImpl this$0 = this.this$0;
            final p<z0.d, Integer, j> $content = this.$content;
            e.f((Object)this$0, "composer");
            e.f((Object)$content, "composable");
            k.e(2, (Object)$content);
            $content.invoke((z0.d)this$0, 1);
            this.this$0.R(false);
        }
        else {
            this.this$0.getClass();
            this.this$0.s0();
        }
    }
}
