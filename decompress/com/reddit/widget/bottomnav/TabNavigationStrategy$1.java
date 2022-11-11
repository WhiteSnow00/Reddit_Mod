// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.widget.bottomnav;

import com.bluelinelabs.conductor.c;
import d8.b;
import com.reddit.screen.Routing;
import com.bluelinelabs.conductor.Controller;
import b8.e$a;
import kotlin.Metadata;
import b8.e;
import com.reddit.screen.BaseScreen;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lcom/reddit/screen/BaseScreen;", "it", "Lb8/e;", "invoke", "(Lcom/reddit/screen/BaseScreen;)Lb8/e;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class TabNavigationStrategy$1 extends Lambda implements l<BaseScreen, e>
{
    public static final TabNavigationStrategy$1 INSTANCE;
    
    static {
        INSTANCE = new TabNavigationStrategy$1();
    }
    
    public TabNavigationStrategy$1() {
        super(1);
    }
    
    public final e invoke(final BaseScreen baseScreen) {
        sg2.e.f((Object)baseScreen, "it");
        final e a = e$a.a((Controller)baseScreen);
        Routing.a.getClass();
        a.c((c)new b());
        a.a((c)new b());
        a.d(baseScreen.getClass().getName());
        return a;
    }
}
