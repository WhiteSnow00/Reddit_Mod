// 
// Decompiled by Procyon v0.6.0
// 

package r2;

import android.graphics.Paint;
import java.util.Iterator;
import android.text.style.LocaleSpan;
import android.os.LocaleList;
import java.util.Arrays;
import java.util.Locale;
import p2.c;
import java.util.ArrayList;
import dg2.m;
import ng2.e;
import p2.d;

public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public final Object a(final d d) {
        e.f((Object)d, "localeList");
        final ArrayList list = new ArrayList(m.u4((Iterable)d, 10));
        for (final c c : d) {
            e.f((Object)c, "<this>");
            final p2.e a = c.a;
            e.d((Object)a, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            list.add(((p2.a)a).a);
        }
        final Locale[] array = list.toArray(new Locale[0]);
        e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final Locale[] array2 = array;
        return new LocaleSpan(new LocaleList((Locale[])Arrays.copyOf(array2, array2.length)));
    }
    
    public final void b(final q2.a a, final d d) {
        e.f((Object)a, "textPaint");
        e.f((Object)d, "localeList");
        final ArrayList list = new ArrayList(m.u4((Iterable)d, 10));
        for (final c c : d) {
            e.f((Object)c, "<this>");
            final p2.e a2 = c.a;
            e.d((Object)a2, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            list.add(((p2.a)a2).a);
        }
        final Locale[] array = list.toArray(new Locale[0]);
        e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final Locale[] array2 = array;
        ((Paint)a).setTextLocales(new LocaleList((Locale[])Arrays.copyOf(array2, array2.length)));
    }
}
