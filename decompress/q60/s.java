// 
// Decompiled by Procyon v0.6.0
// 

package q60;

import com.reddit.data.snoovatar.entity.OutfitJson;
import com.reddit.queries.k$u;
import com.reddit.queries.k$e;
import com.reddit.queries.k$w;
import com.reddit.queries.k$b;
import com.reddit.queries.k$p;
import com.reddit.queries.k$h;
import ie0.o;
import com.reddit.queries.k$s;
import javax.inject.Inject;
import ng2.e;
import ox1.a;

public final class s implements p
{
    public final a a;
    
    @Inject
    public s(final a a) {
        e.f((Object)a, "fakeSnoovatarRepository");
        this.a = a;
    }
    
    public final o a(final k$s k$s) {
        final boolean i = this.a.i(k$s.b);
        final o o = null;
        o o2;
        if (i) {
            o2 = new o("Cometa #1", (String)null, "test_fake_inventory_item_id", "test reddit artist");
        }
        else {
            final String j = k$s.i;
            final k$h l = k$s.l;
            Object b;
            if (l != null) {
                b = l.b;
            }
            else {
                b = null;
            }
            String s;
            if (b instanceof String) {
                s = (String)b;
            }
            else {
                s = null;
            }
            final k$p m = k$s.m;
            String b2;
            if (m != null) {
                b2 = m.b;
            }
            else {
                b2 = null;
            }
            String c2 = null;
            Label_0186: {
                if (m != null) {
                    final k$b c = m.c;
                    if (c != null) {
                        final k$w b3 = c.b;
                        if (b3 != null) {
                            final k$e d = b3.d;
                            String b4 = null;
                            Label_0157: {
                                if (d != null) {
                                    final k$u d2 = d.d;
                                    if (d2 != null) {
                                        b4 = d2.b;
                                        break Label_0157;
                                    }
                                }
                                b4 = null;
                            }
                            if (!px1.a.f0((CharSequence)b4)) {
                                b4 = null;
                            }
                            c2 = b4;
                            if (b4 == null) {
                                c2 = b3.c;
                            }
                            break Label_0186;
                        }
                    }
                }
                c2 = null;
            }
            final o o3 = new o(j, s, b2, c2);
            o2 = o;
            if (i10.a.g(o3) ^ true) {
                o2 = o3;
            }
        }
        return o2;
    }
    
    public final o b(final OutfitJson outfitJson) {
        final boolean i = this.a.i(outfitJson.a);
        final o o = null;
        o o2;
        if (i) {
            o2 = new o("Cometa #1", (String)null, "test_fake_inventory_item_id", "test reddit artist");
        }
        else {
            final o o3 = new o(outfitJson.i, outfitJson.k, outfitJson.r, (String)null);
            o2 = o;
            if (i10.a.g(o3) ^ true) {
                o2 = o3;
            }
        }
        return o2;
    }
}
