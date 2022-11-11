// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import hg2.j;
import androidx.compose.ui.node.LayoutNode;
import rg2.l;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.b1;
import o2.u;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.unit.LayoutDirection;
import u1.a;
import n2.f$a;
import n2.g$a;
import m1.d;
import u2.b;
import androidx.compose.ui.platform.d0;
import k1.c;
import androidx.compose.ui.platform.h;

public interface m
{
    void d(final boolean p0);
    
    void e(final a p0);
    
    h getAccessibilityManager();
    
    c getAutofill();
    
    k1.h getAutofillTree();
    
    d0 getClipboardManager();
    
    b getDensity();
    
    d getFocusManager();
    
    g$a getFontFamilyResolver();
    
    f$a getFontLoader();
    
    u1.a getHapticFeedBack();
    
    v1.b getInputModeManager();
    
    LayoutDirection getLayoutDirection();
    
    z1.m getPointerIconService();
    
    f getSharedDrawScope();
    
    boolean getShowLayoutBounds();
    
    OwnerSnapshotObserver getSnapshotObserver();
    
    u getTextInputService();
    
    b1 getTextToolbar();
    
    h1 getViewConfiguration();
    
    l1 getWindowInfo();
    
    e2.l j(final rg2.a p0, final l p1);
    
    void k(final LayoutNode p0, final long p1);
    
    long l(final long p0);
    
    void n();
    
    long o(final long p0);
    
    void p(final LayoutNode p0);
    
    void q(final LayoutNode p0);
    
    void r(final LayoutNode p0, final boolean p1);
    
    boolean requestFocus();
    
    void s(final LayoutNode p0);
    
    void setShowLayoutBounds(final boolean p0);
    
    void t(final rg2.a<j> p0);
    
    void v(final LayoutNode p0);
    
    void x();
    
    void z(final LayoutNode p0, final boolean p1);
    
    public interface a
    {
        void f();
    }
}
