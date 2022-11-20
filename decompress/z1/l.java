// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import android.view.MotionEvent;
import a01.a;
import ng2.e;
import java.util.List;

public final class l
{
    public final List<p> a;
    public final g b;
    public int c;
    
    public l(final List<p> list) {
        e.f((Object)list, "changes");
        this(list, null);
    }
    
    public l(final List<p> a, final g b) {
        e.f((Object)a, "changes");
        this.a = a;
        this.b = b;
        final MotionEvent motionEvent = null;
        MotionEvent b2;
        if (b != null) {
            b2 = b.b.b;
        }
        else {
            b2 = null;
        }
        int n = 0;
        int c = 0;
        if (b2 != null) {
            b2.getButtonState();
        }
        MotionEvent b3;
        if (b != null) {
            b3 = b.b.b;
        }
        else {
            b3 = null;
        }
        if (b3 != null) {
            b3.getMetaState();
        }
        MotionEvent b4 = motionEvent;
        if (b != null) {
            b4 = b.b.b;
        }
        final int n2 = 3;
        if (b4 != null) {
            final int actionMasked = b4.getActionMasked();
            Label_0207: {
                Label_0205: {
                    if (actionMasked != 0) {
                        Label_0200: {
                            if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    switch (actionMasked) {
                                        default: {
                                            break Label_0207;
                                        }
                                        case 10: {
                                            c = 5;
                                            break Label_0207;
                                        }
                                        case 9: {
                                            c = 4;
                                            break Label_0207;
                                        }
                                        case 8: {
                                            c = 6;
                                            break Label_0207;
                                        }
                                        case 7: {
                                            break;
                                        }
                                        case 6: {
                                            break Label_0200;
                                        }
                                        case 5: {
                                            break Label_0205;
                                        }
                                    }
                                }
                                c = 3;
                                break Label_0207;
                            }
                        }
                        c = 2;
                        break Label_0207;
                    }
                }
                c = 1;
            }
        }
        else {
            final int size = a.size();
            while (true) {
                c = n2;
                if (n >= size) {
                    break;
                }
                final p p2 = a.get(n);
                if (a01.a.v(p2)) {
                    c = 2;
                    break;
                }
                if (a01.a.u(p2)) {
                    c = 1;
                    break;
                }
                ++n;
            }
        }
        this.c = c;
    }
}
