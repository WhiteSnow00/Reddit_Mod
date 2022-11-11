// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import pg2.d;
import h2.i;
import h2.o;
import ah2.f;
import h2.g;
import zg2.a;
import kotlin.Metadata;
import pg2.j;
import h2.q;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lh2/q;", "Lpg2/j;", "invoke", "(Lh2/q;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ClickableKt$genericClickableWithoutGesture$clickSemantics$1 extends Lambda implements l<q, j>
{
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ a<j> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ a<j> $onLongClick;
    public final /* synthetic */ String $onLongClickLabel;
    public final /* synthetic */ g $role;
    
    public ClickableKt$genericClickableWithoutGesture$clickSemantics$1(final g $role, final String $onClickLabel, final a<j> $onLongClick, final String $onLongClickLabel, final boolean $enabled, final a<j> $onClick) {
        this.$role = $role;
        this.$onClickLabel = $onClickLabel;
        this.$onLongClick = $onLongClick;
        this.$onLongClickLabel = $onLongClickLabel;
        this.$enabled = $enabled;
        this.$onClick = $onClick;
        super(1);
    }
    
    public final void invoke(final q q) {
        f.f((Object)q, "$this$semantics");
        final g $role = this.$role;
        if ($role != null) {
            o.j(q, $role.a);
        }
        o.c(q, this.$onClickLabel, (a)new a<Boolean>() {
            public final /* synthetic */ a<j> $onClick = ClickableKt$genericClickableWithoutGesture$clickSemantics$1.this.$onClick;
            
            public final Boolean invoke() {
                this.$onClick.invoke();
                return Boolean.TRUE;
            }
        });
        final a<j> $onLongClick = this.$onLongClick;
        if ($onLongClick != null) {
            q.a(i.c, (Object)new h2.a(this.$onLongClickLabel, (d)new a<Boolean>() {
                public final Boolean invoke() {
                    $onLongClick.invoke();
                    return Boolean.TRUE;
                }
            }));
        }
        if (!this.$enabled) {
            o.a(q);
        }
    }
}
