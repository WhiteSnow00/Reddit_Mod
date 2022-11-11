// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.info;

import rg2.p;
import z0.r0;
import hg2.j;
import z0.t0;
import z0.y0;
import rg2.q;
import androidx.compose.runtime.ComposerImpl;
import com.reddit.vault.feature.vault.info.composables.WhatIsNetworkFeeContentKt;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import com.bluelinelabs.conductor.Controller;
import sg2.e;
import com.bluelinelabs.conductor.ControllerChangeType;
import com.bluelinelabs.conductor.c;
import com.reddit.screen.BaseScreen$Presentation;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;
import com.reddit.screen.BaseScreen$Presentation$a;
import com.reddit.screen.ComposeScreen;

public final class WhatIsNetworkFeeScreen extends ComposeScreen
{
    public final BaseScreen$Presentation$a g0;
    
    public WhatIsNetworkFeeScreen() {
        this(null);
    }
    
    public WhatIsNetworkFeeScreen(final Bundle bundle) {
        super(bundle);
        this.g0 = new BaseScreen$Presentation$a(true, false);
    }
    
    public static final void hC(final WhatIsNetworkFeeScreen whatIsNetworkFeeScreen) {
        final View q = ((Controller)whatIsNetworkFeeScreen).q;
        Object parent;
        if (q != null) {
            parent = q.getParent();
        }
        else {
            parent = null;
        }
        View view;
        if (parent instanceof View) {
            view = (View)parent;
        }
        else {
            view = null;
        }
        Object parent2;
        if (view != null) {
            parent2 = view.getParent();
        }
        else {
            parent2 = null;
        }
        Object o;
        if (parent2 instanceof ViewGroup) {
            o = parent2;
        }
        else {
            o = null;
        }
        if (o != null) {
            final Toolbar toolbar = (Toolbar)((View)o).findViewById(2131431792);
            if (toolbar != null) {
                toolbar.setTitle((CharSequence)null);
            }
        }
    }
    
    public final BaseScreen$Presentation L4() {
        return (BaseScreen$Presentation)this.g0;
    }
    
    public final void RA(final c c, final ControllerChangeType controllerChangeType) {
        e.f((Object)controllerChangeType, "changeType");
        if (controllerChangeType.isEnter && !((Controller)this).i) {
            if (((Controller)this).k) {
                hC(this);
            }
            else {
                ((Controller)this).vA((Controller.e)new Controller.e() {
                    public final /* synthetic */ Controller f;
                    public final /* synthetic */ WhatIsNetworkFeeScreen g;
                    
                    @Override
                    public final void i(final Controller controller, final View view) {
                        sg2.e.f((Object)controller, "controller");
                        sg2.e.f((Object)view, "view");
                        this.f.jB((Controller.e)this);
                        WhatIsNetworkFeeScreen.hC(this.g);
                    }
                });
            }
        }
    }
    
    public final void gC(final d d, final int n) {
        final ComposerImpl s = d.s(-554497076);
        if ((n & 0x1) == 0x0 && s.c()) {
            s.k();
        }
        else {
            final q<z0.c<?>, y0, t0, j> a = ComposerKt.a;
            WhatIsNetworkFeeContentKt.a((d)s, 0);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new WhatIsNetworkFeeScreen$Content.WhatIsNetworkFeeScreen$Content$1(this, n);
        }
    }
}
