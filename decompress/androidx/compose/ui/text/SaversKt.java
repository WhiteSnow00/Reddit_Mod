// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text;

import h1.f;
import zg2.p;
import zg2.l;
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
        a = SaverKt.a((l)SaversKt$AnnotatedStringSaver.SaversKt$AnnotatedStringSaver$2.INSTANCE, (p)SaversKt$AnnotatedStringSaver.SaversKt$AnnotatedStringSaver$1.INSTANCE);
        b = SaverKt.a((l)SaversKt$AnnotationRangeListSaver.SaversKt$AnnotationRangeListSaver$2.INSTANCE, (p)SaversKt$AnnotationRangeListSaver.SaversKt$AnnotationRangeListSaver$1.INSTANCE);
        c = SaverKt.a((l)SaversKt$AnnotationRangeSaver.SaversKt$AnnotationRangeSaver$2.INSTANCE, (p)SaversKt$AnnotationRangeSaver.SaversKt$AnnotationRangeSaver$1.INSTANCE);
        d = SaverKt.a((l)SaversKt$VerbatimTtsAnnotationSaver.SaversKt$VerbatimTtsAnnotationSaver$2.INSTANCE, (p)SaversKt$VerbatimTtsAnnotationSaver.SaversKt$VerbatimTtsAnnotationSaver$1.INSTANCE);
        e = SaverKt.a((l)SaversKt$ParagraphStyleSaver.SaversKt$ParagraphStyleSaver$2.INSTANCE, (p)SaversKt$ParagraphStyleSaver.SaversKt$ParagraphStyleSaver$1.INSTANCE);
        f = SaverKt.a((l)SaversKt$SpanStyleSaver.SaversKt$SpanStyleSaver$2.INSTANCE, (p)SaversKt$SpanStyleSaver.SaversKt$SpanStyleSaver$1.INSTANCE);
        g = SaverKt.a((l)SaversKt$TextDecorationSaver.SaversKt$TextDecorationSaver$2.INSTANCE, (p)SaversKt$TextDecorationSaver.SaversKt$TextDecorationSaver$1.INSTANCE);
        h = SaverKt.a((l)SaversKt$TextGeometricTransformSaver.SaversKt$TextGeometricTransformSaver$2.INSTANCE, (p)SaversKt$TextGeometricTransformSaver.SaversKt$TextGeometricTransformSaver$1.INSTANCE);
        i = SaverKt.a((l)SaversKt$TextIndentSaver.SaversKt$TextIndentSaver$2.INSTANCE, (p)SaversKt$TextIndentSaver.SaversKt$TextIndentSaver$1.INSTANCE);
        j = SaverKt.a((l)SaversKt$FontWeightSaver.SaversKt$FontWeightSaver$2.INSTANCE, (p)SaversKt$FontWeightSaver.SaversKt$FontWeightSaver$1.INSTANCE);
        k = SaverKt.a((l)SaversKt$BaselineShiftSaver.SaversKt$BaselineShiftSaver$2.INSTANCE, (p)SaversKt$BaselineShiftSaver.SaversKt$BaselineShiftSaver$1.INSTANCE);
        l = SaverKt.a((l)SaversKt$TextRangeSaver.SaversKt$TextRangeSaver$2.INSTANCE, (p)SaversKt$TextRangeSaver.SaversKt$TextRangeSaver$1.INSTANCE);
        m = SaverKt.a((l)SaversKt$ShadowSaver.SaversKt$ShadowSaver$2.INSTANCE, (p)SaversKt$ShadowSaver.SaversKt$ShadowSaver$1.INSTANCE);
        n = SaverKt.a((l)SaversKt$ColorSaver.SaversKt$ColorSaver$2.INSTANCE, (p)SaversKt$ColorSaver.SaversKt$ColorSaver$1.INSTANCE);
        o = SaverKt.a((l)SaversKt$TextUnitSaver.SaversKt$TextUnitSaver$2.INSTANCE, (p)SaversKt$TextUnitSaver.SaversKt$TextUnitSaver$1.INSTANCE);
        p = SaverKt.a((l)SaversKt$OffsetSaver.SaversKt$OffsetSaver$2.INSTANCE, (p)SaversKt$OffsetSaver.SaversKt$OffsetSaver$1.INSTANCE);
        q = SaverKt.a((l)SaversKt$LocaleListSaver.SaversKt$LocaleListSaver$2.INSTANCE, (p)SaversKt$LocaleListSaver.SaversKt$LocaleListSaver$1.INSTANCE);
        r = SaverKt.a((l)SaversKt$LocaleSaver.SaversKt$LocaleSaver$2.INSTANCE, (p)SaversKt$LocaleSaver.SaversKt$LocaleSaver$1.INSTANCE);
    }
    
    public static final Object a(Object o, final e e, final f f) {
        ah2.f.f((Object)e, "saver");
        ah2.f.f((Object)f, "scope");
        if (o == null || (o = e.a(f, o)) == null) {
            o = Boolean.FALSE;
        }
        return o;
    }
}
