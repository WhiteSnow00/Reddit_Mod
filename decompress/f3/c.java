// 
// Decompiled by Procyon v0.6.0
// 

package f3;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.a;
import java.util.Iterator;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

public final class c extends WidgetRun
{
    public ArrayList<WidgetRun> k;
    public int l;
    
    public c(int n, ConstraintWidget k) {
        super(k);
        this.k = new ArrayList<WidgetRun>();
        super.f = n;
        ConstraintWidget b = super.b;
        ConstraintWidget i;
        for (k = b.k(n); k != null; k = i) {
            i = k.k(super.f);
            b = k;
        }
        super.b = b;
        final ArrayList<WidgetRun> j = this.k;
        n = super.f;
        Object o;
        if (n == 0) {
            o = b.d;
        }
        else if (n == 1) {
            o = b.e;
        }
        else {
            o = null;
        }
        j.add((WidgetRun)o);
        for (ConstraintWidget constraintWidget = b.j(super.f); constraintWidget != null; constraintWidget = constraintWidget.j(super.f)) {
            final ArrayList<WidgetRun> l = this.k;
            n = super.f;
            Object o2;
            if (n == 0) {
                o2 = constraintWidget.d;
            }
            else if (n == 1) {
                o2 = constraintWidget.e;
            }
            else {
                o2 = null;
            }
            l.add((WidgetRun)o2);
        }
        for (final WidgetRun widgetRun : this.k) {
            n = super.f;
            if (n == 0) {
                widgetRun.b.b = this;
            }
            else {
                if (n != 1) {
                    continue;
                }
                widgetRun.b.c = this;
            }
        }
        if (super.f == 0) {
            ((d)super.b.S).getClass();
        }
        if (super.f == 0) {
            n = super.b.h0;
        }
        else {
            n = super.b.i0;
        }
        this.l = n;
    }
    
    @Override
    public final void a(final f3.d d) {
        if (super.h.j) {
            if (super.i.j) {
                final ConstraintWidget s = super.b.S;
                if (s instanceof d) {
                    ((d)s).getClass();
                }
                final int n = super.i.g - super.h.g;
                final int size = this.k.size();
                int n2 = 0;
                int n3;
                int n4;
                while (true) {
                    n3 = -1;
                    if (n2 >= size) {
                        n4 = -1;
                        break;
                    }
                    n4 = n2;
                    if (this.k.get(n2).b.f0 != 8) {
                        break;
                    }
                    ++n2;
                }
                int n6;
                final int n5 = n6 = size - 1;
                int n7;
                while (true) {
                    n7 = n3;
                    if (n6 < 0) {
                        break;
                    }
                    if (this.k.get(n6).b.f0 != 8) {
                        n7 = n6;
                        break;
                    }
                    --n6;
                }
                int i = 0;
                while (true) {
                    while (i < 2) {
                        int j = 0;
                        int n8 = 0;
                        int n9 = 0;
                        int n10 = 0;
                        float n11 = 0.0f;
                        while (j < size) {
                            final WidgetRun widgetRun = this.k.get(j);
                            final ConstraintWidget b = widgetRun.b;
                            int n12;
                            if (b.f0 == 8) {
                                n12 = n9;
                            }
                            else {
                                final int n13 = n10 + 1;
                                int n14 = n8;
                                if (j > 0) {
                                    n14 = n8;
                                    if (j >= n4) {
                                        n14 = n8 + widgetRun.h.f;
                                    }
                                }
                                final a e = widgetRun.e;
                                final int g = ((DependencyNode)e).g;
                                final boolean b2 = widgetRun.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                int m = 0;
                                int n15 = 0;
                                Label_0418: {
                                    Label_0406: {
                                        if (!b2) {
                                            if (widgetRun.a == 1 && i == 0) {
                                                m = e.m;
                                                ++n9;
                                            }
                                            else {
                                                if (!((DependencyNode)e).j) {
                                                    break Label_0406;
                                                }
                                                m = g;
                                            }
                                            n15 = 1;
                                            break Label_0418;
                                        }
                                        final int f = super.f;
                                        if (f == 0 && !((DependencyNode)((WidgetRun)b.d).e).j) {
                                            return;
                                        }
                                        if (f == 1 && !((DependencyNode)((WidgetRun)b.e).e).j) {
                                            return;
                                        }
                                    }
                                    final int n16 = b2 ? 1 : 0;
                                    m = g;
                                    n15 = n16;
                                }
                                int n19;
                                float n20;
                                if (n15 == 0) {
                                    final int n17 = n9 + 1;
                                    final float n18 = b.j0[super.f];
                                    n19 = n14;
                                    n9 = n17;
                                    n20 = n11;
                                    if (n18 >= 0.0f) {
                                        n20 = n11 + n18;
                                        n19 = n14;
                                        n9 = n17;
                                    }
                                }
                                else {
                                    n19 = n14 + m;
                                    n20 = n11;
                                }
                                n8 = n19;
                                n12 = n9;
                                n10 = n13;
                                n11 = n20;
                                if (j < n5) {
                                    n8 = n19;
                                    n12 = n9;
                                    n10 = n13;
                                    n11 = n20;
                                    if (j < n7) {
                                        n8 = n19 + -widgetRun.i.f;
                                        n11 = n20;
                                        n10 = n13;
                                        n12 = n9;
                                    }
                                }
                            }
                            ++j;
                            n9 = n12;
                        }
                        int n21 = n8;
                        int n22 = n9;
                        int n23 = n10;
                        float n24 = n11;
                        if (n8 >= n) {
                            if (n9 != 0) {
                                ++i;
                                continue;
                            }
                            n21 = n8;
                            n22 = n9;
                            n23 = n10;
                            n24 = n11;
                        }
                        int g2;
                        final int n25 = g2 = super.h.g;
                        if (n21 > n) {
                            g2 = n25 - (int)((n21 - n) / 2.0f + 0.5f);
                        }
                        int n43;
                        if (n22 > 0) {
                            final float n26 = (float)(n - n21);
                            final int n27 = (int)(n26 / n22 + 0.5f);
                            int k = 0;
                            final int n28 = 0;
                            final int n29 = n21;
                            int n30 = n28;
                            final int n31 = g2;
                            while (k < size) {
                                final WidgetRun widgetRun2 = this.k.get(k);
                                final ConstraintWidget b3 = widgetRun2.b;
                                if (b3.f0 != 8) {
                                    if (widgetRun2.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        final a e2 = widgetRun2.e;
                                        if (!((DependencyNode)e2).j) {
                                            int n32;
                                            if (n24 > 0.0f) {
                                                n32 = (int)(b3.j0[super.f] * n26 / n24 + 0.5f);
                                            }
                                            else {
                                                n32 = n27;
                                            }
                                            int n33;
                                            int n34;
                                            if (super.f == 0) {
                                                n33 = b3.w;
                                                n34 = b3.v;
                                            }
                                            else {
                                                n33 = b3.z;
                                                n34 = b3.y;
                                            }
                                            int min;
                                            if (widgetRun2.a == 1) {
                                                min = Math.min(n32, e2.m);
                                            }
                                            else {
                                                min = n32;
                                            }
                                            int n36;
                                            final int n35 = n36 = Math.max(n34, min);
                                            if (n33 > 0) {
                                                n36 = Math.min(n33, n35);
                                            }
                                            int n37 = n32;
                                            int n38 = n30;
                                            if (n36 != n32) {
                                                n38 = n30 + 1;
                                                n37 = n36;
                                            }
                                            widgetRun2.e.d(n37);
                                            n30 = n38;
                                        }
                                    }
                                }
                                ++k;
                            }
                            int n40;
                            if (n30 > 0) {
                                final int n39 = n22 - n30;
                                int l = 0;
                                n40 = 0;
                                while (l < size) {
                                    final WidgetRun widgetRun3 = this.k.get(l);
                                    if (widgetRun3.b.f0 != 8) {
                                        int n41 = n40;
                                        if (l > 0) {
                                            n41 = n40;
                                            if (l >= n4) {
                                                n41 = n40 + widgetRun3.h.f;
                                            }
                                        }
                                        final int n42 = n40 = n41 + ((DependencyNode)widgetRun3.e).g;
                                        if (l < n5) {
                                            n40 = n42;
                                            if (l < n7) {
                                                n40 = n42 + -widgetRun3.i.f;
                                            }
                                        }
                                    }
                                    ++l;
                                }
                                n22 = n39;
                            }
                            else {
                                n40 = n29;
                            }
                            if (this.l == 2 && n30 == 0) {
                                this.l = 0;
                                n21 = n40;
                                n43 = n22;
                                g2 = n31;
                            }
                            else {
                                n21 = n40;
                                n43 = n22;
                                g2 = n31;
                            }
                        }
                        else {
                            n43 = n22;
                        }
                        final int n44 = 0;
                        final int n45 = 0;
                        final int n46 = 0;
                        if (n21 > n) {
                            this.l = 2;
                        }
                        if (n23 > 0 && n43 == 0 && n4 == n7) {
                            this.l = 2;
                        }
                        final int l2 = this.l;
                        if (l2 == 1) {
                            int n47;
                            if (n23 > 1) {
                                n47 = (n - n21) / (n23 - 1);
                            }
                            else if (n23 == 1) {
                                n47 = (n - n21) / 2;
                            }
                            else {
                                n47 = 0;
                            }
                            int n48 = n47;
                            if (n43 > 0) {
                                n48 = 0;
                            }
                            int n49 = g2;
                            int n51;
                            for (int n50 = n46; n50 < size; ++n50, n49 = n51) {
                                final WidgetRun widgetRun4 = this.k.get(n50);
                                if (widgetRun4.b.f0 == 8) {
                                    widgetRun4.h.d(n49);
                                    widgetRun4.i.d(n49);
                                    n51 = n49;
                                }
                                else {
                                    int n52 = n49;
                                    if (n50 > 0) {
                                        n52 = n49 + n48;
                                    }
                                    int n53 = n52;
                                    if (n50 > 0) {
                                        n53 = n52;
                                        if (n50 >= n4) {
                                            n53 = n52 + widgetRun4.h.f;
                                        }
                                    }
                                    widgetRun4.h.d(n53);
                                    final a e3 = widgetRun4.e;
                                    int n54 = ((DependencyNode)e3).g;
                                    if (widgetRun4.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        n54 = n54;
                                        if (widgetRun4.a == 1) {
                                            n54 = e3.m;
                                        }
                                    }
                                    final int n55 = n53 + n54;
                                    widgetRun4.i.d(n55);
                                    widgetRun4.g = true;
                                    n51 = n55;
                                    if (n50 < n5) {
                                        n51 = n55;
                                        if (n50 < n7) {
                                            n51 = n55 + -widgetRun4.i.f;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        if (l2 == 0) {
                            int n56 = (n - n21) / (n23 + 1);
                            if (n43 > 0) {
                                n56 = 0;
                            }
                            for (int n57 = n44; n57 < size; ++n57) {
                                final WidgetRun widgetRun5 = this.k.get(n57);
                                if (widgetRun5.b.f0 == 8) {
                                    widgetRun5.h.d(g2);
                                    widgetRun5.i.d(g2);
                                }
                                else {
                                    int n59;
                                    final int n58 = n59 = g2 + n56;
                                    if (n57 > 0) {
                                        n59 = n58;
                                        if (n57 >= n4) {
                                            n59 = n58 + widgetRun5.h.f;
                                        }
                                    }
                                    widgetRun5.h.d(n59);
                                    final a e4 = widgetRun5.e;
                                    int n61;
                                    final int n60 = n61 = ((DependencyNode)e4).g;
                                    if (widgetRun5.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        n61 = n60;
                                        if (widgetRun5.a == 1) {
                                            n61 = Math.min(n60, e4.m);
                                        }
                                    }
                                    final int n62 = n59 + n61;
                                    widgetRun5.i.d(n62);
                                    g2 = n62;
                                    if (n57 < n5) {
                                        g2 = n62;
                                        if (n57 < n7) {
                                            g2 = n62 + -widgetRun5.i.f;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        if (l2 == 2) {
                            float n63;
                            if (super.f == 0) {
                                n63 = super.b.c0;
                            }
                            else {
                                n63 = super.b.d0;
                            }
                            int n64 = (int)((n - n21) * n63 + 0.5f);
                            if (n64 < 0 || n43 > 0) {
                                n64 = 0;
                            }
                            int n65 = g2 + n64;
                            for (int n66 = n45; n66 < size; ++n66) {
                                final WidgetRun widgetRun6 = this.k.get(n66);
                                if (widgetRun6.b.f0 == 8) {
                                    widgetRun6.h.d(n65);
                                    widgetRun6.i.d(n65);
                                }
                                else {
                                    int n67 = n65;
                                    if (n66 > 0) {
                                        n67 = n65;
                                        if (n66 >= n4) {
                                            n67 = n65 + widgetRun6.h.f;
                                        }
                                    }
                                    widgetRun6.h.d(n67);
                                    final a e5 = widgetRun6.e;
                                    int n68 = ((DependencyNode)e5).g;
                                    if (widgetRun6.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.a == 1) {
                                        n68 = e5.m;
                                    }
                                    final int n69 = n67 + n68;
                                    widgetRun6.i.d(n69);
                                    n65 = n69;
                                    if (n66 < n5) {
                                        n65 = n69;
                                        if (n66 < n7) {
                                            n65 = n69 + -widgetRun6.i.f;
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    int n21 = 0;
                    int n22 = 0;
                    int n23 = 0;
                    float n24 = 0.0f;
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void d() {
        final Iterator<WidgetRun> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        final int size = this.k.size();
        if (size < 1) {
            return;
        }
        final ConstraintWidget b = this.k.get(0).b;
        final ConstraintWidget b2 = this.k.get(size - 1).b;
        if (super.f == 0) {
            final ConstraintAnchor g = b.G;
            final ConstraintAnchor i = b2.I;
            final DependencyNode h = WidgetRun.h(g, 0);
            int n = g.d();
            final ConstraintWidget j = this.j();
            if (j != null) {
                n = j.G.d();
            }
            if (h != null) {
                WidgetRun.b(super.h, h, n);
            }
            final DependencyNode h2 = WidgetRun.h(i, 0);
            int n2 = i.d();
            final ConstraintWidget k = this.k();
            if (k != null) {
                n2 = k.I.d();
            }
            if (h2 != null) {
                WidgetRun.b(super.i, h2, -n2);
            }
        }
        else {
            final ConstraintAnchor h3 = b.H;
            final ConstraintAnchor l = b2.J;
            final DependencyNode h4 = WidgetRun.h(h3, 1);
            int n3 = h3.d();
            final ConstraintWidget m = this.j();
            if (m != null) {
                n3 = m.H.d();
            }
            if (h4 != null) {
                WidgetRun.b(super.h, h4, n3);
            }
            final DependencyNode h5 = WidgetRun.h(l, 1);
            int n4 = l.d();
            final ConstraintWidget k2 = this.k();
            if (k2 != null) {
                n4 = k2.J.d();
            }
            if (h5 != null) {
                WidgetRun.b(super.i, h5, -n4);
            }
        }
        super.h.a = this;
        super.i.a = this;
    }
    
    @Override
    public final void e() {
        super.c = null;
        final Iterator<WidgetRun> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            iterator.next().e();
        }
    }
    
    public final ConstraintWidget j() {
        for (int i = 0; i < this.k.size(); ++i) {
            final ConstraintWidget b = this.k.get(i).b;
            if (b.f0 != 8) {
                return b;
            }
        }
        return null;
    }
    
    public final ConstraintWidget k() {
        for (int i = this.k.size() - 1; i >= 0; --i) {
            final ConstraintWidget b = this.k.get(i).b;
            if (b.f0 != 8) {
                return b;
            }
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ChainRun ");
        String s;
        if (super.f == 0) {
            s = "horizontal : ";
        }
        else {
            s = "vertical : ";
        }
        sb.append(s);
        for (final WidgetRun widgetRun : this.k) {
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }
}
