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
        WidgetRun widgetRun;
        if (n == 0) {
            widgetRun = b.d;
        }
        else if (n == 1) {
            widgetRun = b.e;
        }
        else {
            widgetRun = null;
        }
        j.add(widgetRun);
        for (ConstraintWidget constraintWidget = b.j(super.f); constraintWidget != null; constraintWidget = constraintWidget.j(super.f)) {
            final ArrayList<WidgetRun> l = this.k;
            n = super.f;
            WidgetRun widgetRun2;
            if (n == 0) {
                widgetRun2 = constraintWidget.d;
            }
            else if (n == 1) {
                widgetRun2 = constraintWidget.e;
            }
            else {
                widgetRun2 = null;
            }
            l.add(widgetRun2);
        }
        for (final WidgetRun widgetRun3 : this.k) {
            n = super.f;
            if (n == 0) {
                widgetRun3.b.b = this;
            }
            else {
                if (n != 1) {
                    continue;
                }
                widgetRun3.b.c = this;
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
                                final int g = e.g;
                                final boolean b2 = widgetRun.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                int m = 0;
                                boolean b3 = false;
                                Label_0416: {
                                    Label_0408: {
                                        if (!b2) {
                                            if (widgetRun.a == 1 && i == 0) {
                                                m = e.m;
                                                ++n9;
                                            }
                                            else {
                                                if (!e.j) {
                                                    break Label_0408;
                                                }
                                                m = g;
                                            }
                                            b3 = true;
                                            break Label_0416;
                                        }
                                        final int f = super.f;
                                        if (f == 0 && !b.d.e.j) {
                                            return;
                                        }
                                        if (f == 1 && !b.e.e.j) {
                                            return;
                                        }
                                    }
                                    b3 = b2;
                                    m = g;
                                }
                                int n17;
                                float n18;
                                if (!b3) {
                                    final int n15 = n9 + 1;
                                    final float n16 = b.j0[super.f];
                                    n17 = n14;
                                    n9 = n15;
                                    n18 = n11;
                                    if (n16 >= 0.0f) {
                                        n18 = n11 + n16;
                                        n17 = n14;
                                        n9 = n15;
                                    }
                                }
                                else {
                                    n17 = n14 + m;
                                    n18 = n11;
                                }
                                n8 = n17;
                                n12 = n9;
                                n10 = n13;
                                n11 = n18;
                                if (j < n5) {
                                    n8 = n17;
                                    n12 = n9;
                                    n10 = n13;
                                    n11 = n18;
                                    if (j < n7) {
                                        n8 = n17 + -widgetRun.i.f;
                                        n11 = n18;
                                        n10 = n13;
                                        n12 = n9;
                                    }
                                }
                            }
                            ++j;
                            n9 = n12;
                        }
                        int n19 = n8;
                        int n20 = n9;
                        int n21 = n10;
                        float n22 = n11;
                        if (n8 >= n) {
                            if (n9 != 0) {
                                ++i;
                                continue;
                            }
                            n19 = n8;
                            n20 = n9;
                            n21 = n10;
                            n22 = n11;
                        }
                        int g2;
                        final int n23 = g2 = super.h.g;
                        if (n19 > n) {
                            g2 = n23 - (int)((n19 - n) / 2.0f + 0.5f);
                        }
                        int n41;
                        if (n20 > 0) {
                            final float n24 = (float)(n - n19);
                            final int n25 = (int)(n24 / n20 + 0.5f);
                            int k = 0;
                            final int n26 = 0;
                            final int n27 = n19;
                            int n28 = n26;
                            final int n29 = g2;
                            while (k < size) {
                                final WidgetRun widgetRun2 = this.k.get(k);
                                final ConstraintWidget b4 = widgetRun2.b;
                                if (b4.f0 != 8) {
                                    if (widgetRun2.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        final a e2 = widgetRun2.e;
                                        if (!e2.j) {
                                            int n30;
                                            if (n22 > 0.0f) {
                                                n30 = (int)(b4.j0[super.f] * n24 / n22 + 0.5f);
                                            }
                                            else {
                                                n30 = n25;
                                            }
                                            int n31;
                                            int n32;
                                            if (super.f == 0) {
                                                n31 = b4.w;
                                                n32 = b4.v;
                                            }
                                            else {
                                                n31 = b4.z;
                                                n32 = b4.y;
                                            }
                                            int min;
                                            if (widgetRun2.a == 1) {
                                                min = Math.min(n30, e2.m);
                                            }
                                            else {
                                                min = n30;
                                            }
                                            int n34;
                                            final int n33 = n34 = Math.max(n32, min);
                                            if (n31 > 0) {
                                                n34 = Math.min(n31, n33);
                                            }
                                            int n35 = n30;
                                            int n36 = n28;
                                            if (n34 != n30) {
                                                n36 = n28 + 1;
                                                n35 = n34;
                                            }
                                            widgetRun2.e.d(n35);
                                            n28 = n36;
                                        }
                                    }
                                }
                                ++k;
                            }
                            int n38;
                            if (n28 > 0) {
                                final int n37 = n20 - n28;
                                int l = 0;
                                n38 = 0;
                                while (l < size) {
                                    final WidgetRun widgetRun3 = this.k.get(l);
                                    if (widgetRun3.b.f0 != 8) {
                                        int n39 = n38;
                                        if (l > 0) {
                                            n39 = n38;
                                            if (l >= n4) {
                                                n39 = n38 + widgetRun3.h.f;
                                            }
                                        }
                                        final int n40 = n38 = n39 + widgetRun3.e.g;
                                        if (l < n5) {
                                            n38 = n40;
                                            if (l < n7) {
                                                n38 = n40 + -widgetRun3.i.f;
                                            }
                                        }
                                    }
                                    ++l;
                                }
                                n20 = n37;
                            }
                            else {
                                n38 = n27;
                            }
                            if (this.l == 2 && n28 == 0) {
                                this.l = 0;
                                n19 = n38;
                                n41 = n20;
                                g2 = n29;
                            }
                            else {
                                n19 = n38;
                                n41 = n20;
                                g2 = n29;
                            }
                        }
                        else {
                            n41 = n20;
                        }
                        final int n42 = 0;
                        final int n43 = 0;
                        final int n44 = 0;
                        if (n19 > n) {
                            this.l = 2;
                        }
                        if (n21 > 0 && n41 == 0 && n4 == n7) {
                            this.l = 2;
                        }
                        final int l2 = this.l;
                        if (l2 == 1) {
                            int n45;
                            if (n21 > 1) {
                                n45 = (n - n19) / (n21 - 1);
                            }
                            else if (n21 == 1) {
                                n45 = (n - n19) / 2;
                            }
                            else {
                                n45 = 0;
                            }
                            int n46 = n45;
                            if (n41 > 0) {
                                n46 = 0;
                            }
                            int n47 = g2;
                            for (int n48 = n44; n48 < size; ++n48) {
                                final WidgetRun widgetRun4 = this.k.get(n48);
                                if (widgetRun4.b.f0 == 8) {
                                    widgetRun4.h.d(n47);
                                    widgetRun4.i.d(n47);
                                }
                                else {
                                    int n49 = n47;
                                    if (n48 > 0) {
                                        n49 = n47 + n46;
                                    }
                                    int n50 = n49;
                                    if (n48 > 0) {
                                        n50 = n49;
                                        if (n48 >= n4) {
                                            n50 = n49 + widgetRun4.h.f;
                                        }
                                    }
                                    widgetRun4.h.d(n50);
                                    final a e3 = widgetRun4.e;
                                    int n51 = e3.g;
                                    if (widgetRun4.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        n51 = n51;
                                        if (widgetRun4.a == 1) {
                                            n51 = e3.m;
                                        }
                                    }
                                    final int n52 = n50 + n51;
                                    widgetRun4.i.d(n52);
                                    widgetRun4.g = true;
                                    n47 = n52;
                                    if (n48 < n5) {
                                        n47 = n52;
                                        if (n48 < n7) {
                                            n47 = n52 + -widgetRun4.i.f;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        if (l2 == 0) {
                            int n53 = (n - n19) / (n21 + 1);
                            if (n41 > 0) {
                                n53 = 0;
                            }
                            for (int n54 = n42; n54 < size; ++n54) {
                                final WidgetRun widgetRun5 = this.k.get(n54);
                                if (widgetRun5.b.f0 == 8) {
                                    widgetRun5.h.d(g2);
                                    widgetRun5.i.d(g2);
                                }
                                else {
                                    int n56;
                                    final int n55 = n56 = g2 + n53;
                                    if (n54 > 0) {
                                        n56 = n55;
                                        if (n54 >= n4) {
                                            n56 = n55 + widgetRun5.h.f;
                                        }
                                    }
                                    widgetRun5.h.d(n56);
                                    final a e4 = widgetRun5.e;
                                    int n58;
                                    final int n57 = n58 = e4.g;
                                    if (widgetRun5.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        n58 = n57;
                                        if (widgetRun5.a == 1) {
                                            n58 = Math.min(n57, e4.m);
                                        }
                                    }
                                    final int n59 = n56 + n58;
                                    widgetRun5.i.d(n59);
                                    g2 = n59;
                                    if (n54 < n5) {
                                        g2 = n59;
                                        if (n54 < n7) {
                                            g2 = n59 + -widgetRun5.i.f;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        if (l2 == 2) {
                            float n60;
                            if (super.f == 0) {
                                n60 = super.b.c0;
                            }
                            else {
                                n60 = super.b.d0;
                            }
                            int n61 = (int)((n - n19) * n60 + 0.5f);
                            if (n61 < 0 || n41 > 0) {
                                n61 = 0;
                            }
                            int n62 = g2 + n61;
                            for (int n63 = n43; n63 < size; ++n63) {
                                final WidgetRun widgetRun6 = this.k.get(n63);
                                if (widgetRun6.b.f0 == 8) {
                                    widgetRun6.h.d(n62);
                                    widgetRun6.i.d(n62);
                                }
                                else {
                                    int n64 = n62;
                                    if (n63 > 0) {
                                        n64 = n62;
                                        if (n63 >= n4) {
                                            n64 = n62 + widgetRun6.h.f;
                                        }
                                    }
                                    widgetRun6.h.d(n64);
                                    final a e5 = widgetRun6.e;
                                    int n65 = e5.g;
                                    if (widgetRun6.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.a == 1) {
                                        n65 = e5.m;
                                    }
                                    final int n66 = n64 + n65;
                                    widgetRun6.i.d(n66);
                                    n62 = n66;
                                    if (n63 < n5) {
                                        n62 = n66;
                                        if (n63 < n7) {
                                            n62 = n66 + -widgetRun6.i.f;
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    int n19 = 0;
                    int n20 = 0;
                    int n21 = 0;
                    float n22 = 0.0f;
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
