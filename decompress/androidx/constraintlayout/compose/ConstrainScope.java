// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import y2.g;
import zg2.l;
import androidx.constraintlayout.core.state.State;
import ah2.f;
import java.util.ArrayList;
import zg2.p;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.a;
import zg2.q;

public final class ConstrainScope
{
    public static final q<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>[][] i;
    public static final p<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>[][] j;
    public static final p<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a> k;
    public final Object a;
    public final ArrayList b;
    public final y2.a c;
    public final VerticalAnchorable d;
    public final HorizontalAnchorable e;
    public final VerticalAnchorable f;
    public final HorizontalAnchorable g;
    public final a h;
    
    static {
        new b();
        i = new q[][] { { (q)ConstrainScope$Companion$verticalAnchorFunctions$1.INSTANCE, (q)ConstrainScope$Companion$verticalAnchorFunctions$2.INSTANCE }, { (q)ConstrainScope$Companion$verticalAnchorFunctions$3.INSTANCE, (q)ConstrainScope$Companion$verticalAnchorFunctions$4.INSTANCE } };
        j = new p[][] { { (p)ConstrainScope$Companion$horizontalAnchorFunctions.ConstrainScope$Companion$horizontalAnchorFunctions$1.INSTANCE, (p)ConstrainScope$Companion$horizontalAnchorFunctions.ConstrainScope$Companion$horizontalAnchorFunctions$2.INSTANCE }, { (p)ConstrainScope$Companion$horizontalAnchorFunctions.ConstrainScope$Companion$horizontalAnchorFunctions$3.INSTANCE, (p)ConstrainScope$Companion$horizontalAnchorFunctions$4.INSTANCE } };
        k = (p)ConstrainScope$Companion$baselineAnchorFunction.ConstrainScope$Companion$baselineAnchorFunction$1.INSTANCE;
    }
    
    public ConstrainScope(final Object a) {
        ah2.f.f(a, "id");
        this.a = a;
        this.b = new ArrayList();
        final Integer e = State.e;
        ah2.f.e((Object)e, "PARENT");
        this.c = new y2.a(e);
        this.d = new VerticalAnchorable(a, -2);
        new VerticalAnchorable(a, 0);
        this.e = new HorizontalAnchorable(a, 0);
        this.f = new VerticalAnchorable(a, -1);
        new VerticalAnchorable(a, 1);
        this.g = new HorizontalAnchorable(a, 1);
        this.h = new a(a);
        final Dimension$Companion$wrapContent$1 instance = Dimension$Companion$wrapContent$1.INSTANCE;
        new y2.f((l<? super g, ? extends c3.a>)instance);
        new y2.f((l<? super g, ? extends c3.a>)instance);
    }
    
    public static void c(final ConstrainScope constrainScope, final androidx.constraintlayout.compose.a.b b, final androidx.constraintlayout.compose.a.b b2, float n, float n2, float n3, final int n4) {
        if ((n4 & 0x4) != 0x0) {
            n = 0;
        }
        if ((n4 & 0x8) != 0x0) {
            n2 = 0;
        }
        if ((n4 & 0x10) != 0x0) {
            n3 = 0.5f;
        }
        constrainScope.b(b, b2, n, n2, n3);
    }
    
    public static void d(final ConstrainScope constrainScope, final androidx.constraintlayout.compose.a.c c, final androidx.constraintlayout.compose.a.c c2, float n, float n2, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = 0;
        }
        float n4;
        if ((n3 & 0x10) != 0x0) {
            n4 = 0.5f;
        }
        else {
            n4 = 0.0f;
        }
        constrainScope.getClass();
        f.f((Object)c, "start");
        f.f((Object)c2, "end");
        constrainScope.d.a(c, n);
        constrainScope.f.a(c2, n2);
        constrainScope.b.add(new ConstrainScope$linkTo$1(constrainScope, n4));
    }
    
    public final void a(final y2.a a) {
        ah2.f.f((Object)a, "other");
        c(this, a.c, a.e, 0.0f, 0.0f, 0.0f, 28);
    }
    
    public final void b(final androidx.constraintlayout.compose.a.b b, final androidx.constraintlayout.compose.a.b b2, final float n, final float n2, final float n3) {
        ah2.f.f((Object)b, "top");
        ah2.f.f((Object)b2, "bottom");
        this.e.a(b, n);
        this.g.a(b2, n2);
        this.b.add(new ConstrainScope$linkTo$2(this, n3));
    }
    
    public final void e(final y2.f f) {
        this.b.add(new ConstrainScope$height$1(this, (c)f));
    }
    
    public final void f(final y2.f f) {
        this.b.add(new ConstrainScope$width$1(this, (c)f));
    }
    
    public final class HorizontalAnchorable
    {
        public final Object a;
        public final int b;
        
        public HorizontalAnchorable(final Object a, final int b) {
            ah2.f.f((Object)ConstrainScope.this, "this$0");
            ah2.f.f(a, "tag");
            this.a = a;
            this.b = b;
        }
        
        public static void b(final HorizontalAnchorable horizontalAnchorable, final androidx.constraintlayout.compose.a.b b) {
            horizontalAnchorable.a(b, 0);
        }
        
        public final void a(final androidx.constraintlayout.compose.a.b b, final float n) {
            ah2.f.f((Object)b, "anchor");
            final ConstrainScope c = ConstrainScope.this;
            c.b.add(new ConstrainScope$HorizontalAnchorable$linkTo$1(c, this, b, n));
        }
    }
    
    public final class VerticalAnchorable
    {
        public final Object a;
        public final int b;
        
        public VerticalAnchorable(final Object a, final int b) {
            ah2.f.f((Object)ConstrainScope.this, "this$0");
            ah2.f.f(a, "id");
            this.a = a;
            this.b = b;
        }
        
        public static void b(final VerticalAnchorable verticalAnchorable, final androidx.constraintlayout.compose.a.c c) {
            verticalAnchorable.a(c, 0);
        }
        
        public final void a(final androidx.constraintlayout.compose.a.c c, final float n) {
            ah2.f.f((Object)c, "anchor");
            ConstrainScope.this.b.add(new ConstrainScope$VerticalAnchorable$linkTo$1(this, c, n));
        }
    }
    
    public final class a
    {
        public final Object a;
        public final /* synthetic */ ConstrainScope b;
        
        public a(final Object a) {
            ah2.f.f((Object)ConstrainScope.this, "this$0");
            ah2.f.f(a, "id");
            this.a = a;
        }
        
        public static void a(final a a, final androidx.constraintlayout.compose.a.a a2) {
            final float n = 0;
            a.getClass();
            ah2.f.f((Object)a2, "anchor");
            a.b.b.add(new ConstrainScope$BaselineAnchorable$linkTo$1(a, a2, n));
        }
    }
    
    public static final class b
    {
        public static final void a(final androidx.constraintlayout.core.state.a a, final LayoutDirection layoutDirection) {
            final q<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>[][] i = ConstrainScope.i;
            a.getClass();
            a.z = State.Constraint.LEFT_TO_LEFT;
            a.l = null;
            a.z = State.Constraint.LEFT_TO_RIGHT;
            a.m = null;
            final int n = b.a.a[layoutDirection.ordinal()];
            if (n != 1) {
                if (n == 2) {
                    a.z = State.Constraint.END_TO_START;
                    a.r = null;
                    a.z = State.Constraint.END_TO_END;
                    a.s = null;
                }
            }
            else {
                a.z = State.Constraint.START_TO_START;
                a.p = null;
                a.z = State.Constraint.START_TO_END;
                a.q = null;
            }
        }
        
        public static final void b(final androidx.constraintlayout.core.state.a a, final LayoutDirection layoutDirection) {
            final q<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>[][] i = ConstrainScope.i;
            a.getClass();
            a.z = State.Constraint.RIGHT_TO_LEFT;
            a.n = null;
            a.z = State.Constraint.RIGHT_TO_RIGHT;
            a.o = null;
            final int n = b.a.a[layoutDirection.ordinal()];
            if (n != 1) {
                if (n == 2) {
                    a.z = State.Constraint.START_TO_START;
                    a.p = null;
                    a.z = State.Constraint.START_TO_END;
                    a.q = null;
                }
            }
            else {
                a.z = State.Constraint.END_TO_START;
                a.r = null;
                a.z = State.Constraint.END_TO_END;
                a.s = null;
            }
        }
    }
}
