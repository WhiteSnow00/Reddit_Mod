// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import rg2.p;
import hg2.j;
import i2.n;
import rg2.l;
import java.util.List;
import androidx.compose.ui.semantics.SemanticsProperties;
import a81.e;
import androidx.compose.ui.semantics.a;
import zg2.k;

public final class o
{
    public static final /* synthetic */ k<Object>[] a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    
    static {
        a = new k[] { (k)a81.e.u((Class)o.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), (k)a81.e.u((Class)o.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), (k)a81.e.u((Class)o.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), (k)a81.e.u((Class)o.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), (k)a81.e.u((Class)o.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), (k)a81.e.u((Class)o.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), (k)a81.e.u((Class)o.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), (k)a81.e.u((Class)o.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), (k)a81.e.u((Class)o.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), (k)a81.e.u((Class)o.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), (k)a81.e.u((Class)o.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), (k)a81.e.u((Class)o.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), (k)a81.e.u((Class)o.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), (k)a81.e.u((Class)o.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), (k)a81.e.u((Class)o.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), (k)a81.e.u((Class)o.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), (k)a81.e.u((Class)o.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1) };
        final a<List<String>> a2 = SemanticsProperties.a;
        b = SemanticsProperties.c;
        c = SemanticsProperties.k;
        d = SemanticsProperties.m;
        e = SemanticsProperties.n;
        f = SemanticsProperties.p;
        g = SemanticsProperties.q;
        h = SemanticsProperties.s;
        i = SemanticsProperties.t;
        j = SemanticsProperties.u;
        k = SemanticsProperties.v;
        l = SemanticsProperties.f;
        m = SemanticsProperties.w;
        final a<h2.a<l<List<n>, Boolean>>> a3 = h2.i.a;
        n = h2.i.p;
    }
    
    public static final void a(final q q) {
        sg2.e.f((Object)q, "<this>");
        final a<List<String>> a = SemanticsProperties.a;
        q.a(SemanticsProperties.i, hg2.j.a);
    }
    
    public static final void b(final q q, final l<Object, Integer> l) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)l, "mapping");
        final a<List<String>> a = SemanticsProperties.a;
        q.a(SemanticsProperties.z, l);
    }
    
    public static final void c(final q q, final String s, final rg2.a<Boolean> a) {
        sg2.e.f((Object)q, "<this>");
        q.a(h2.i.b, new h2.a<rg2.a<Boolean>>(s, a));
    }
    
    public static void d(final q q, final p p2) {
        sg2.e.f((Object)q, "<this>");
        q.a(h2.i.d, new h2.a<p<Float, Float, Boolean>>(null, p2));
    }
    
    public static void e(final q q, final l l) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)l, "action");
        q.a(h2.i.e, new h2.a<l<Integer, Boolean>>(null, l));
    }
    
    public static final void f(final q q, final b b) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)b, "<set-?>");
        o.l.a(q, o.a[13], b);
    }
    
    public static final void g(final q q, final String s) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)s, "value");
        final a<List<String>> a = SemanticsProperties.a;
        q.a(SemanticsProperties.a, lw0.b.r1((Object)s));
    }
    
    public static final void h(final q q, final h h) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)h, "<set-?>");
        o.d.a(q, o.a[5], h);
    }
    
    public static final void i(final q q, final f f) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)f, "<set-?>");
        o.b.a(q, o.a[1], f);
    }
    
    public static final void j(final q q, final int n) {
        sg2.e.f((Object)q, "$this$role");
        o.f.a(q, o.a[7], new g(n));
    }
    
    public static final void k(final q q, final String s) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)s, "<set-?>");
        o.g.a(q, o.a[8], s);
    }
    
    public static final void l(final q q, final h h) {
        sg2.e.f((Object)q, "<this>");
        sg2.e.f((Object)h, "<set-?>");
        o.e.a(q, o.a[6], h);
    }
}
