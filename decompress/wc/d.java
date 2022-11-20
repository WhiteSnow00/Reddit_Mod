// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import java.util.Collections;
import java.util.Set;

public final class d
{
    public String a;
    public String b;
    public Set<String> c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public boolean q;
    
    public d() {
        this.a = "";
        this.b = "";
        this.c = Collections.emptySet();
        this.d = "";
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.p = -1;
        this.q = false;
    }
    
    public static int a(final int n, final int n2, final String s, final String s2) {
        if (!s.isEmpty()) {
            int n3 = -1;
            if (n != -1) {
                if (s.equals(s2)) {
                    n3 = n + n2;
                }
                return n3;
            }
        }
        return n;
    }
}
