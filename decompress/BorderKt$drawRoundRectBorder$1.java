// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import q1.d;
import n1.a;
import q1.e;
import ah2.f;
import o1.n;
import q1.i;
import kotlin.Metadata;
import pg2.j;
import q1.c;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lq1/c;", "Lpg2/j;", "invoke", "(Lq1/c;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class BorderKt$drawRoundRectBorder$1 extends Lambda implements l<c, j>
{
    public final /* synthetic */ long $borderSize;
    public final /* synthetic */ i $borderStroke;
    public final /* synthetic */ n $brush;
    public final /* synthetic */ long $cornerRadius;
    public final /* synthetic */ boolean $fillArea;
    public final /* synthetic */ float $halfStroke;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $topLeft;
    
    public BorderKt$drawRoundRectBorder$1(final boolean $fillArea, final n $brush, final long $cornerRadius, final float $halfStroke, final float $strokeWidth, final long $topLeft, final long $borderSize, final i $borderStroke) {
        this.$fillArea = $fillArea;
        this.$brush = $brush;
        this.$cornerRadius = $cornerRadius;
        this.$halfStroke = $halfStroke;
        this.$strokeWidth = $strokeWidth;
        this.$topLeft = $topLeft;
        this.$borderSize = $borderSize;
        this.$borderStroke = $borderStroke;
        super(1);
    }
    
    public final void invoke(final c c) {
        f.f((Object)c, "$this$onDrawWithContent");
        c.c0();
        if (this.$fillArea) {
            e.h0(c, this.$brush, 0L, 0L, this.$cornerRadius, null, 246);
        }
        else {
            final float b = a.b(this.$cornerRadius);
            final float $halfStroke = this.$halfStroke;
            if (b < $halfStroke) {
                final float $strokeWidth = this.$strokeWidth;
                final float e = n1.f.e(c.b());
                final float $strokeWidth2 = this.$strokeWidth;
                final float c2 = n1.f.c(c.b());
                final float $strokeWidth3 = this.$strokeWidth;
                final n $brush = this.$brush;
                final long $cornerRadius = this.$cornerRadius;
                final d y = c.Y();
                final long b2 = y.b();
                y.a().save();
                y.a.b($strokeWidth, $strokeWidth, e - $strokeWidth2, c2 - $strokeWidth3, 0);
                q1.e.h0(c, $brush, 0L, 0L, $cornerRadius, null, 246);
                y.a().restore();
                y.c(b2);
            }
            else {
                e.h0(c, this.$brush, this.$topLeft, this.$borderSize, androidx.compose.foundation.a.c($halfStroke, this.$cornerRadius), this.$borderStroke, 208);
            }
        }
    }
}
