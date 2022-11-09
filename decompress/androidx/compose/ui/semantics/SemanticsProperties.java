// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import zg2.p;
import zg2.l;
import androidx.compose.ui.state.ToggleableState;
import o2.i;
import i2.o;
import h2.g;
import h2.h;
import h2.e;
import h2.c;
import h2.b;
import pg2.j;
import h2.f;
import java.util.List;

public final class SemanticsProperties
{
    public static final a<List<String>> a;
    public static final a<String> b;
    public static final a<f> c;
    public static final a<String> d;
    public static final a<j> e;
    public static final a<b> f;
    public static final a<c> g;
    public static final a<j> h;
    public static final a<j> i;
    public static final a<e> j;
    public static final a<Boolean> k;
    public static final a<j> l;
    public static final a<h> m;
    public static final a<h> n;
    public static final a<j> o;
    public static final a<g> p;
    public static final a<String> q;
    public static final a<List<i2.a>> r;
    public static final a<i2.a> s;
    public static final a<o> t;
    public static final a<i> u;
    public static final a<Boolean> v;
    public static final a<ToggleableState> w;
    public static final a<j> x;
    public static final a<String> y;
    public static final a<l<Object, Integer>> z;
    
    static {
        a = new a<List<String>>("ContentDescription", (zg2.p<? super List<String>, ? super List<String>, ? extends List<String>>)SemanticsProperties$ContentDescription.SemanticsProperties$ContentDescription$1.INSTANCE);
        b = new a<String>("StateDescription");
        c = new a<f>("ProgressBarRangeInfo");
        d = new a<String>("PaneTitle", (zg2.p<? super String, ? super String, ? extends String>)SemanticsProperties$PaneTitle.SemanticsProperties$PaneTitle$1.INSTANCE);
        e = new a<j>("SelectableGroup");
        f = new a<b>("CollectionInfo");
        g = new a<c>("CollectionItemInfo");
        h = new a<j>("Heading");
        i = new a<j>("Disabled");
        j = new a<e>("LiveRegion");
        k = new a<Boolean>("Focused");
        l = new a<j>("InvisibleToUser", (zg2.p<? super j, ? super j, ? extends j>)SemanticsProperties$InvisibleToUser.SemanticsProperties$InvisibleToUser$1.INSTANCE);
        m = new a<h>("HorizontalScrollAxisRange");
        n = new a<h>("VerticalScrollAxisRange");
        o = new a<j>("IsPopup", (zg2.p<? super j, ? super j, ? extends j>)SemanticsProperties$IsPopup.SemanticsProperties$IsPopup$1.INSTANCE);
        new a("IsDialog", (p)SemanticsProperties$IsDialog.SemanticsProperties$IsDialog$1.INSTANCE);
        p = new a<g>("Role", (zg2.p<? super g, ? super g, ? extends g>)SemanticsProperties$Role.SemanticsProperties$Role$1.INSTANCE);
        q = new a<String>("TestTag", (zg2.p<? super String, ? super String, ? extends String>)SemanticsProperties$TestTag.SemanticsProperties$TestTag$1.INSTANCE);
        r = new a<List<i2.a>>("Text", (zg2.p<? super List<i2.a>, ? super List<i2.a>, ? extends List<i2.a>>)SemanticsProperties$Text.SemanticsProperties$Text$1.INSTANCE);
        s = new a<i2.a>("EditableText");
        t = new a<o>("TextSelectionRange");
        u = new a<i>("ImeAction");
        v = new a<Boolean>("Selected");
        w = new a<ToggleableState>("ToggleableState");
        x = new a<j>("Password");
        y = new a<String>("Error");
        z = new a<l<Object, Integer>>("IndexForKey");
    }
}
