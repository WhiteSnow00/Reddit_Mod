// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.graphics.vector;

import java.util.Map;
import s1.c;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.r;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class VectorPainterKt$rememberVectorPainter$3 extends Lambda implements r<Float, Float, d, Integer, j>
{
    public final /* synthetic */ c $image;
    
    public VectorPainterKt$rememberVectorPainter$3(final c $image) {
        this.$image = $image;
        super(4);
    }
    
    public final void invoke(final float n, final float n2, final d d, final int n3) {
        if ((n3 & 0xB) == 0x2 && d.b()) {
            d.j();
        }
        else {
            VectorPainterKt.a(this.$image.f, (Map)null, d, 0, 2);
        }
    }
}
