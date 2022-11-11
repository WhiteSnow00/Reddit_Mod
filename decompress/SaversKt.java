// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text;

import h1.f;
import rg2.p;
import rg2.l;
import androidx.compose.runtime.saveable.SaverKt;
import h1.e;

public final class SaversKt
{
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;
    public static final e n;
    public static final e o;
    public static final e p;
    public static final e q;
    public static final e r;
    
    static {
        a = SaverKt.a((l)SaversKt$AnnotatedStringSaver$2.INSTANCE, (p)SaversKt$AnnotatedStringSaver$1.INSTANCE);
        b = SaverKt.a((l)SaversKt$AnnotationRangeListSaver$2.INSTANCE, (p)SaversKt$AnnotationRangeListSaver$1.INSTANCE);
        c = SaverKt.a((l)SaversKt$AnnotationRangeSaver$2.INSTANCE, (p)SaversKt$AnnotationRangeSaver$1.INSTANCE);
        d = SaverKt.a((l)SaversKt$VerbatimTtsAnnotationSaver$2.INSTANCE, (p)SaversKt$VerbatimTtsAnnotationSaver$1.INSTANCE);
        e = SaverKt.a((l)SaversKt$ParagraphStyleSaver$2.INSTANCE, (p)SaversKt$ParagraphStyleSaver$1.INSTANCE);
        f = SaverKt.a((l)SaversKt$SpanStyleSaver$2.INSTANCE, (p)SaversKt$SpanStyleSaver$1.INSTANCE);
        g = SaverKt.a((l)SaversKt$TextDecorationSaver$2.INSTANCE, (p)SaversKt$TextDecorationSaver$1.INSTANCE);
        h = SaverKt.a((l)SaversKt$TextGeometricTransformSaver$2.INSTANCE, (p)SaversKt$TextGeometricTransformSaver$1.INSTANCE);
        i = SaverKt.a((l)SaversKt$TextIndentSaver$2.INSTANCE, (p)SaversKt$TextIndentSaver$1.INSTANCE);
        j = SaverKt.a((l)SaversKt$FontWeightSaver$2.INSTANCE, (p)SaversKt$FontWeightSaver$1.INSTANCE);
        k = SaverKt.a((l)SaversKt$BaselineShiftSaver$2.INSTANCE, (p)SaversKt$BaselineShiftSaver$1.INSTANCE);
        l = SaverKt.a((l)SaversKt$TextRangeSaver$2.INSTANCE, (p)SaversKt$TextRangeSaver$1.INSTANCE);
        m = SaverKt.a((l)SaversKt$ShadowSaver$2.INSTANCE, (p)SaversKt$ShadowSaver$1.INSTANCE);
        n = SaverKt.a((l)SaversKt$ColorSaver$2.INSTANCE, (p)SaversKt$ColorSaver$1.INSTANCE);
        o = SaverKt.a((l)SaversKt$TextUnitSaver$2.INSTANCE, (p)SaversKt$TextUnitSaver$1.INSTANCE);
        p = SaverKt.a((l)SaversKt$OffsetSaver$2.INSTANCE, (p)SaversKt$OffsetSaver$1.INSTANCE);
        q = SaverKt.a((l)SaversKt$LocaleListSaver$2.INSTANCE, (p)SaversKt$LocaleListSaver$1.INSTANCE);
        r = SaverKt.a((l)SaversKt$LocaleSaver$2.INSTANCE, (p)SaversKt$LocaleSaver$1.INSTANCE);
    }
    
    public static final Object a(Object o, final e e, final f f) {
        sg2.e.f((Object)e, "saver");
        sg2.e.f((Object)f, "scope");
        if (o == null || (o = e.a(f, o)) == null) {
            o = Boolean.FALSE;
        }
        return o;
    }
}
