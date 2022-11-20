// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import aq2.a;

public final class d
{
    public static final d d;
    public final int a;
    public final int b;
    public final int c;
    
    static {
        d = new d();
    }
    
    public d() {
        this.a = 1;
        this.b = 3;
        this.c = 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final int a = this.a;
        final d d = (d)o;
        return a == d.a && this.b == d.b && this.c == d.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + aq2.a.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("LineBreak(strategy=");
        t.append((Object)t2.d.a.a(this.a));
        t.append(", strictness=");
        t.append((Object)t2.d.b.a(this.b));
        t.append(", wordBreak=");
        final int c = this.c;
        final int n = 0;
        String s;
        if (c == 1) {
            s = "WordBreak.None";
        }
        else {
            int n2 = n;
            if (c == 2) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "WordBreak.Phrase";
            }
            else {
                s = "Invalid";
            }
        }
        t.append((Object)s);
        t.append(')');
        return t.toString();
    }
    
    public static final class a
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
        
        public static String a(final int n) {
            final int n2 = 0;
            String s;
            if (n == 1) {
                s = "Strategy.Simple";
            }
            else if (n == 2) {
                s = "Strategy.HighQuality";
            }
            else {
                int n3 = n2;
                if (n == 3) {
                    n3 = 1;
                }
                if (n3 != 0) {
                    s = "Strategy.Balanced";
                }
                else {
                    s = "Invalid";
                }
            }
            return s;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final int a = this.a;
            final boolean b = o instanceof a;
            boolean b2 = false;
            if (b) {
                if (a == ((a)o).a) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.a);
        }
        
        @Override
        public final String toString() {
            return a(this.a);
        }
    }
    
    public static final class b
    {
        public final int a;
        
        public b(final int a) {
            this.a = a;
        }
        
        public static String a(final int n) {
            final int n2 = 0;
            String s;
            if (n == 1) {
                s = "Strictness.None";
            }
            else if (n == 2) {
                s = "Strictness.Loose";
            }
            else if (n == 3) {
                s = "Strictness.Normal";
            }
            else {
                int n3 = n2;
                if (n == 4) {
                    n3 = 1;
                }
                if (n3 != 0) {
                    s = "Strictness.Strict";
                }
                else {
                    s = "Invalid";
                }
            }
            return s;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final int a = this.a;
            final boolean b = o instanceof b;
            boolean b2 = false;
            if (b) {
                if (a == ((b)o).a) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.a);
        }
        
        @Override
        public final String toString() {
            return a(this.a);
        }
    }
    
    public static final class c
    {
        public final int a;
        
        public c(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final int a = this.a;
            final boolean b = o instanceof c;
            boolean b2 = false;
            if (b) {
                if (a == ((c)o).a) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.a);
        }
        
        @Override
        public final String toString() {
            final int a = this.a;
            final int n = 0;
            String s;
            if (a == 1) {
                s = "WordBreak.None";
            }
            else {
                int n2 = n;
                if (a == 2) {
                    n2 = 1;
                }
                if (n2 != 0) {
                    s = "WordBreak.Phrase";
                }
                else {
                    s = "Invalid";
                }
            }
            return s;
        }
    }
}
