// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;
import f3.d;

public class DependencyNode implements d
{
    public WidgetRun a;
    public boolean b;
    public boolean c;
    public WidgetRun d;
    public Type e;
    public int f;
    public int g;
    public int h;
    public a i;
    public boolean j;
    public ArrayList k;
    public ArrayList l;
    
    public DependencyNode(final WidgetRun d) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = Type.UNKNOWN;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = d;
    }
    
    public final void a(final d d) {
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            if (!((DependencyNode)iterator.next()).j) {
                return;
            }
        }
        this.c = true;
        final WidgetRun a = this.a;
        if (a != null) {
            ((d)a).a((d)this);
        }
        if (this.b) {
            this.d.a((d)this);
            return;
        }
        DependencyNode dependencyNode = null;
        int n = 0;
        for (final DependencyNode dependencyNode2 : this.l) {
            if (dependencyNode2 instanceof a) {
                continue;
            }
            ++n;
            dependencyNode = dependencyNode2;
        }
        if (dependencyNode != null && n == 1 && dependencyNode.j) {
            final a i = this.i;
            if (i != null) {
                if (!i.j) {
                    return;
                }
                this.f = this.h * i.g;
            }
            this.d(dependencyNode.g + this.f);
        }
        final WidgetRun a2 = this.a;
        if (a2 != null) {
            ((d)a2).a((d)this);
        }
    }
    
    public final void b(final d d) {
        this.k.add(d);
        if (this.j) {
            d.a(d);
        }
    }
    
    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }
    
    public void d(final int g) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = g;
        for (final d d : this.k) {
            d.a(d);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        Serializable value;
        if (this.j) {
            value = this.g;
        }
        else {
            value = "unresolved";
        }
        sb.append(value);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
    
    public enum Type
    {
        private static final Type[] $VALUES;
        
        BASELINE, 
        BOTTOM, 
        HORIZONTAL_DIMENSION, 
        LEFT, 
        RIGHT, 
        TOP, 
        UNKNOWN, 
        VERTICAL_DIMENSION;
    }
}
