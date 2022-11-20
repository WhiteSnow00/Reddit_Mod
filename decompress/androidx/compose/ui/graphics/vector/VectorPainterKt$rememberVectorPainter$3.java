// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.graphics.vector;

import mg2.q;
import java.util.Map;
import androidx.compose.runtime.ComposerKt;
import s1.c;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.r;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class VectorPainterKt$rememberVectorPainter$3 extends Lambda implements r<Float, Float, d, Integer, j>
{
    public final c $image;
    
    public VectorPainterKt$rememberVectorPainter$3(final c $image) {
        this.$image = $image;
        super(4);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4) {
        this.invoke(((Number)o).floatValue(), ((Number)o2).floatValue(), (d)o3, ((Number)o4).intValue());
        return j.a;
    }
    
    public final void invoke(final float n, final float n2, final d d, final int n3) {
        if ((n3 & 0xB) == 0x2 && d.d()) {
            d.j();
        }
        else {
            final q a = ComposerKt.a;
            VectorPainterKt.a(this.$image.f, (Map)null, d, 0, 2);
        }
    }
}
