// 
// Decompiled by Procyon v0.6.0
// 

package kf;

import android.util.Property;
import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;

public interface d
{
    void a();
    
    void b();
    
    int getCircularRevealScrimColor();
    
    d getRevealInfo();
    
    void setCircularRevealOverlayDrawable(final Drawable p0);
    
    void setCircularRevealScrimColor(final int p0);
    
    void setRevealInfo(final d p0);
    
    public static final class a implements TypeEvaluator<d>
    {
        public static final a b;
        public final d a;
        
        static {
            b = new a();
        }
        
        public a() {
            this.a = new d();
        }
        
        public final Object evaluate(final float n, final Object o, final Object o2) {
            final d d = (d)o;
            final d d2 = (d)o2;
            final d a = this.a;
            final float a2 = d.a;
            final float a3 = d2.a;
            final float n2 = 1.0f - n;
            final float b = d.b;
            final float b2 = d2.b;
            final float c = d.c;
            final float c2 = d2.c;
            a.a = a3 * n + a2 * n2;
            a.b = b2 * n + b * n2;
            a.c = n * c2 + n2 * c;
            return a;
        }
    }
    
    public static final class b extends Property<d, d>
    {
        public static final b a;
        
        static {
            a = new b();
        }
        
        public b() {
            super((Class)d.class, "circularReveal");
        }
        
        public final Object get(final Object o) {
            return ((d)o).getRevealInfo();
        }
        
        public final void set(final Object o, final Object o2) {
            ((d)o).setRevealInfo((d)o2);
        }
    }
    
    public static final class c extends Property<d, Integer>
    {
        public static final c a;
        
        static {
            a = new c();
        }
        
        public c() {
            super((Class)Integer.class, "circularRevealScrimColor");
        }
        
        public final Object get(final Object o) {
            return ((d)o).getCircularRevealScrimColor();
        }
        
        public final void set(final Object o, final Object o2) {
            ((d)o).setCircularRevealScrimColor((int)o2);
        }
    }
    
    public static final class d
    {
        public float a;
        public float b;
        public float c;
        
        public d() {
        }
        
        public d(final float a, final float b, final float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
