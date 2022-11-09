// 
// Decompiled by Procyon v0.6.0
// 

package u6;

import java.util.Iterator;
import java.util.ArrayList;
import ah2.f;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.ColorFilter;
import d7.d;
import android.graphics.PointF;
import com.airbnb.lottie.compose.b;
import java.util.List;

public final class e
{
    public final List<b<Integer>> a;
    public final List<b<PointF>> b;
    public final List<b<Float>> c;
    public final List<b<d>> d;
    public final List<b<ColorFilter>> e;
    public final List<b<Object[]>> f;
    public final List<b<Typeface>> g;
    public final List<b<Bitmap>> h;
    public final List<b<CharSequence>> i;
    
    public e() {
        throw null;
    }
    
    public e(final List<? extends b<?>> list) {
        ah2.f.f((Object)list, "properties");
        final ArrayList a = new ArrayList();
        for (final b next : list) {
            if (next.a instanceof Integer) {
                a.add(next);
            }
        }
        final ArrayList<b> b = new ArrayList<b>();
        for (final b next2 : list) {
            if (next2.a instanceof PointF) {
                b.add(next2);
            }
        }
        final ArrayList<b> c = new ArrayList<b>();
        for (final b next3 : list) {
            if (next3.a instanceof Float) {
                c.add(next3);
            }
        }
        final ArrayList<b> d = new ArrayList<b>();
        for (final b next4 : list) {
            if (next4.a instanceof d) {
                d.add(next4);
            }
        }
        final ArrayList<b> e = new ArrayList<b>();
        for (final b next5 : list) {
            if (next5.a instanceof ColorFilter) {
                e.add(next5);
            }
        }
        final ArrayList<b> f = new ArrayList<b>();
        for (final b next6 : list) {
            if (next6.a instanceof Object[]) {
                f.add(next6);
            }
        }
        final ArrayList<b> g = new ArrayList<b>();
        for (final b next7 : list) {
            if (next7.a instanceof Typeface) {
                g.add(next7);
            }
        }
        final ArrayList<b> h = new ArrayList<b>();
        for (final b next8 : list) {
            if (next8.a instanceof Bitmap) {
                h.add(next8);
            }
        }
        final ArrayList<b> i = new ArrayList<b>();
        for (final b next9 : list) {
            if (next9.a instanceof CharSequence) {
                i.add(next9);
            }
        }
        this.a = a;
        this.b = (List<b<PointF>>)b;
        this.c = (List<b<Float>>)c;
        this.d = (List<b<d>>)d;
        this.e = (List<b<ColorFilter>>)e;
        this.f = (List<b<Object[]>>)f;
        this.g = (List<b<Typeface>>)g;
        this.h = (List<b<Bitmap>>)h;
        this.i = (List<b<CharSequence>>)i;
    }
}
