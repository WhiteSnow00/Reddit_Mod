// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import java.util.WeakHashMap;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class b0
{
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;
    
    public b0(final View c) {
        this.c = c;
    }
    
    public final boolean a(final float n, final float n2, final boolean b) {
        final boolean d = this.d;
        boolean a;
        final boolean b2 = a = false;
        if (d) {
            final ViewParent g = this.g(0);
            a = b2;
            if (g != null) {
                final View c = this.c;
                try {
                    a = p1.a(g, c, n, n2, b);
                }
                catch (final AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(g);
                    sb.append(" does not implement interface method onNestedFling");
                    Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                    a = b2;
                }
            }
        }
        return a;
    }
    
    public final boolean b(final float n, final float n2) {
        final boolean d = this.d;
        boolean b2;
        final boolean b = b2 = false;
        if (d) {
            final ViewParent g = this.g(0);
            b2 = b;
            if (g != null) {
                final View c = this.c;
                try {
                    b2 = p1.b(g, c, n, n2);
                }
                catch (final AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(g);
                    sb.append(" does not implement interface method onNestedPreFling");
                    Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                    b2 = b;
                }
            }
        }
        return b2;
    }
    
    public final boolean c(final int n, final int n2, int[] e, final int[] array, final int n3) {
        final boolean d = this.d;
        boolean b2;
        final boolean b = b2 = false;
        if (d) {
            final ViewParent g = this.g(n3);
            if (g == null) {
                return false;
            }
            if (n == 0 && n2 == 0) {
                b2 = b;
                if (array != null) {
                    array[1] = (array[0] = 0);
                    b2 = b;
                }
            }
            else {
                int n4;
                int n5;
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    n4 = array[0];
                    n5 = array[1];
                }
                else {
                    n4 = (n5 = 0);
                }
                if (e == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    e = this.e;
                }
                e[1] = (e[0] = 0);
                final View c = this.c;
                if (g instanceof c0) {
                    ((c0)g).l(c, n, n2, e, n3);
                }
                else if (n3 == 0) {
                    try {
                        p1.c(g, c, n, n2, e);
                    }
                    catch (final AbstractMethodError abstractMethodError) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("ViewParent ");
                        sb.append(g);
                        sb.append(" does not implement interface method onNestedPreScroll");
                        Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                    }
                }
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    array[0] -= n4;
                    array[1] -= n5;
                }
                if (e[0] == 0) {
                    b2 = b;
                    if (e[1] == 0) {
                        return b2;
                    }
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void d(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, final int[] array2) {
        this.f(n, n2, n3, n4, array, n5, array2);
    }
    
    public final boolean e(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.f(n, n2, n3, n4, array, 0, null);
    }
    
    public final boolean f(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, int[] e) {
        if (this.d) {
            final ViewParent g = this.g(n5);
            if (g == null) {
                return false;
            }
            if (n != 0 || n2 != 0 || n3 != 0 || n4 != 0) {
                int n6;
                int n7;
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    n6 = array[0];
                    n7 = array[1];
                }
                else {
                    n7 = (n6 = 0);
                }
                if (e == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    e = this.e;
                    e[1] = (e[0] = 0);
                }
                final View c = this.c;
                if (g instanceof d0) {
                    ((d0)g).n(c, n, n2, n3, n4, n5, e);
                }
                else {
                    e[0] += n3;
                    e[1] += n4;
                    if (g instanceof c0) {
                        ((c0)g).j(c, n, n2, n3, n4, n5);
                    }
                    else if (n5 == 0) {
                        try {
                            p1.d(g, c, n, n2, n3, n4);
                        }
                        catch (final AbstractMethodError abstractMethodError) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("ViewParent ");
                            sb.append(g);
                            sb.append(" does not implement interface method onNestedScroll");
                            Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                        }
                    }
                }
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    array[0] -= n6;
                    array[1] -= n7;
                }
                return true;
            }
            if (array != null) {
                array[1] = (array[0] = 0);
            }
        }
        return false;
    }
    
    public final ViewParent g(final int n) {
        if (n == 0) {
            return this.a;
        }
        if (n != 1) {
            return null;
        }
        return this.b;
    }
    
    public final boolean h(final int n) {
        return this.g(n) != null;
    }
    
    public final void i(final boolean d) {
        if (this.d) {
            final View c = this.c;
            final WeakHashMap a = p0.a;
            p0.i.z(c);
        }
        this.d = d;
    }
    
    public final boolean j(final int n, final int n2) {
        if (this.h(n2)) {
            return true;
        }
        if (this.d) {
            ViewParent viewParent = this.c.getParent();
            View c = this.c;
            while (viewParent != null) {
                final View c2 = this.c;
                final boolean b = viewParent instanceof c0;
                boolean b2 = false;
                Label_0140: {
                    if (b) {
                        b2 = ((c0)viewParent).o(c, c2, n, n2);
                    }
                    else {
                        if (n2 == 0) {
                            try {
                                b2 = p1.f(viewParent, c, c2, n);
                                break Label_0140;
                            }
                            catch (final AbstractMethodError abstractMethodError) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("ViewParent ");
                                sb.append(viewParent);
                                sb.append(" does not implement interface method onStartNestedScroll");
                                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                            }
                        }
                        b2 = false;
                    }
                }
                if (b2) {
                    if (n2 != 0) {
                        if (n2 == 1) {
                            this.b = viewParent;
                        }
                    }
                    else {
                        this.a = viewParent;
                    }
                    final View c3 = this.c;
                    if (b) {
                        ((c0)viewParent).i(c, c3, n, n2);
                    }
                    else if (n2 == 0) {
                        try {
                            p1.e(viewParent, c, c3, n);
                        }
                        catch (final AbstractMethodError abstractMethodError2) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("ViewParent ");
                            sb2.append(viewParent);
                            sb2.append(" does not implement interface method onNestedScrollAccepted");
                            Log.e("ViewParentCompat", sb2.toString(), (Throwable)abstractMethodError2);
                        }
                    }
                    return true;
                }
                if (viewParent instanceof View) {
                    c = (View)viewParent;
                }
                viewParent = viewParent.getParent();
            }
        }
        return false;
    }
    
    public final void k(final int n) {
        final ViewParent g = this.g(n);
        if (g != null) {
            final View c = this.c;
            if (g instanceof c0) {
                ((c0)g).h(n, c);
            }
            else if (n == 0) {
                try {
                    p1.g(g, c);
                }
                catch (final AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(g);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                }
            }
            if (n != 0) {
                if (n == 1) {
                    this.b = null;
                }
            }
            else {
                this.a = null;
            }
        }
    }
}
