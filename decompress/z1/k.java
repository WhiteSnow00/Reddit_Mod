// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import android.view.MotionEvent;
import yd.a;
import java.util.List;

public final class k
{
    public final List<o> a;
    public final f b;
    public int c;
    
    public k(final List<o> list) {
        ah2.f.f((Object)list, "changes");
        this(list, null);
    }
    
    public k(final List<o> a, final f b) {
        ah2.f.f((Object)a, "changes");
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
            Label_0213: {
                Label_0210: {
                    if (actionMasked != 0) {
                        Label_0204: {
                            if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    switch (actionMasked) {
                                        default: {
                                            break Label_0213;
                                        }
                                        case 10: {
                                            c = 5;
                                            break Label_0213;
                                        }
                                        case 9: {
                                            c = 4;
                                            break Label_0213;
                                        }
                                        case 8: {
                                            c = 6;
                                            break Label_0213;
                                        }
                                        case 7: {
                                            break;
                                        }
                                        case 6: {
                                            break Label_0204;
                                        }
                                        case 5: {
                                            break Label_0210;
                                        }
                                    }
                                }
                                c = 3;
                                break Label_0213;
                            }
                        }
                        c = 2;
                        break Label_0213;
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
                final o o = a.get(n);
                if (yd.a.I0(o)) {
                    c = 2;
                    break;
                }
                if (yd.a.H0(o)) {
                    c = 1;
                    break;
                }
                ++n;
            }
        }
        this.c = c;
    }
}
