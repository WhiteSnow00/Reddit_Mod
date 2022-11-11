// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;
import fc2.i;
import fc2.k;
import fc2.h;
import java.util.Map;
import fc2.g;
import java.util.HashMap;

public final class m3
{
    public final String a;
    public final String b;
    public final HashMap c;
    
    public m3(final g g) {
        this.c = new HashMap();
        final i p = g.p();
        final boolean p2 = p.P("vendor");
        final String s = "";
        String c;
        if (p2) {
            c = p.L("vendor").C();
        }
        else {
            c = "";
        }
        this.a = c;
        String c2 = s;
        if (p.P("type")) {
            c2 = p.L("type").C();
        }
        this.b = c2;
        if (p.P("detail")) {
            for (final Map.Entry<K, g> entry : p.L("detail").p().entrySet()) {
                if (entry.getValue() != null) {
                    final g g2 = entry.getValue();
                    g2.getClass();
                    if (g2 instanceof h) {
                        continue;
                    }
                    final g g3 = entry.getValue();
                    g3.getClass();
                    if (g3 instanceof k) {
                        this.c.put(entry.getKey(), entry.getValue().C());
                    }
                    else {
                        this.c.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Plugin{vendor='");
        a.z(r, this.a, '\'', ", type='");
        a.z(r, this.b, '\'', ", detail=");
        r.append(this.c);
        r.append('}');
        return r.toString();
    }
}
