// 
// Decompiled by Procyon v0.6.0
// 

package q6;

import java.util.Iterator;
import android.graphics.Rect;
import j0.f;
import w6.c;
import j0.j;
import w6.g;
import w6.b;
import com.airbnb.lottie.model.layer.Layer;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

public final class h
{
    public final j0 a;
    public final HashSet<String> b;
    public Map<String, List<Layer>> c;
    public Map<String, d0> d;
    public Map<String, b> e;
    public List<g> f;
    public j<c> g;
    public f<Layer> h;
    public List<Layer> i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public int o;
    
    public h() {
        this.a = new j0();
        this.b = new HashSet<String>();
        this.o = 0;
    }
    
    public final void a(final String s) {
        c7.c.b(s);
        this.b.add(s);
    }
    
    public final float b() {
        return (float)(long)((this.l - this.k) / this.m * 1000.0f);
    }
    
    public final g c(final String s) {
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final g g = this.f.get(i);
            final boolean equalsIgnoreCase = g.a.equalsIgnoreCase(s);
            boolean b = true;
            Label_0100: {
                if (!equalsIgnoreCase) {
                    if (g.a.endsWith("\r")) {
                        final String a = g.a;
                        if (a.substring(0, a.length() - 1).equalsIgnoreCase(s)) {
                            break Label_0100;
                        }
                    }
                    b = false;
                }
            }
            if (b) {
                return g;
            }
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LottieComposition:\n");
        final Iterator<Layer> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().a("\t"));
        }
        return sb.toString();
    }
}
