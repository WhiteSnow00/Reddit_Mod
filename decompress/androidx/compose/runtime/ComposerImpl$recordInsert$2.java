// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import ah2.f;
import z0.x0;
import java.util.List;
import z0.b;
import kotlin.Metadata;
import pg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "Lz0/c;", "applier", "Lz0/y0;", "slots", "Lz0/t0;", "rememberManager", "Lpg2/j;", "invoke", "(Lz0/c;Lz0/y0;Lz0/t0;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$recordInsert$2 extends Lambda implements q<c<?>, y0, t0, j>
{
    public final /* synthetic */ b $anchor;
    public final /* synthetic */ List<q<c<?>, y0, t0, j>> $fixups;
    public final /* synthetic */ x0 $insertTable;
    
    public ComposerImpl$recordInsert$2(final x0 $insertTable, final b $anchor, final List<q<c<?>, y0, t0, j>> $fixups) {
        this.$insertTable = $insertTable;
        this.$anchor = $anchor;
        this.$fixups = $fixups;
        super(3);
    }
    
    public final void invoke(final c<?> c, final y0 y0, final t0 t0) {
        androidx.viewpager.widget.c.t(c, "applier", y0, "slots", t0, "rememberManager");
        final x0 $insertTable = this.$insertTable;
        final List<q<c<?>, y0, t0, j>> $fixups = this.$fixups;
        final y0 d = $insertTable.d();
        try {
            for (int size = $fixups.size(), i = 0; i < size; ++i) {
                ((q)$fixups.get(i)).invoke((Object)c, (Object)d, (Object)t0);
            }
            final j a = j.a;
            d.f();
            y0.e();
            final x0 $insertTable2 = this.$insertTable;
            final b $anchor = this.$anchor;
            $anchor.getClass();
            f.f((Object)$insertTable2, "slots");
            y0.t($insertTable2, $insertTable2.a($anchor));
            y0.j();
        }
        finally {
            d.f();
        }
    }
}
