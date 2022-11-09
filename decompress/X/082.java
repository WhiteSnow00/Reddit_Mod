// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.View;
import android.view.ViewParent;

public class 082
{
    public boolean LIZ;
    public ViewParent LIZIZ;
    public ViewParent LIZJ;
    public final View LIZLLL;
    public int[] LJ;
    
    static {
        Covode.recordClassIndex(853);
    }
    
    public 082(final View lizlll) {
        this.LIZLLL = lizlll;
    }
    
    private void LIZ(final int n, final ViewParent viewParent) {
        if (n != 0) {
            if (n == 1) {
                this.LIZJ = viewParent;
            }
            return;
        }
        this.LIZIZ = viewParent;
    }
    
    private int[] LIZ() {
        if (this.LJ == null) {
            this.LJ = new int[2];
        }
        return this.LJ;
    }
    
    private ViewParent LIZJ(final int n) {
        if (n == 0) {
            return this.LIZIZ;
        }
        if (n != 1) {
            return null;
        }
        return this.LIZJ;
    }
    
    public final void LIZ(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, final int[] array2) {
        this.LIZIZ(n, n2, n3, n4, array, n5, array2);
    }
    
    public final void LIZ(final boolean liz) {
        if (this.LIZ) {
            this.LIZLLL.stopNestedScroll();
        }
        this.LIZ = liz;
    }
    
    public final boolean LIZ(final float n, final float n2) {
        if (this.LIZ) {
            final ViewParent lizj = this.LIZJ(0);
            if (lizj != null) {
                return 08J.LIZ(lizj, this.LIZLLL, n, n2);
            }
        }
        return false;
    }
    
    public final boolean LIZ(final float n, final float n2, final boolean b) {
        if (this.LIZ) {
            final ViewParent lizj = this.LIZJ(0);
            if (lizj != null) {
                return 08J.LIZ(lizj, this.LIZLLL, n, n2, b);
            }
        }
        return false;
    }
    
    public final boolean LIZ(final int n) {
        return this.LIZJ(n) != null;
    }
    
    public final boolean LIZ(final int n, final int n2) {
        if (this.LIZ(n2)) {
            return true;
        }
        if (!this.LIZ) {
            return false;
        }
        ViewParent viewParent = this.LIZLLL.getParent();
        View lizlll = this.LIZLLL;
    Label_0117_Outer:
        while (true) {
            if (viewParent == null) {
                return false;
            }
            Label_0104: {
                if (!08J.LIZ(viewParent, lizlll, this.LIZLLL, n, n2)) {
                    break Label_0104;
                }
                this.LIZ(n2, viewParent);
                final View lizlll2 = this.LIZLLL;
                Block_6: {
                    if (viewParent instanceof 14d) {
                        ((14d)viewParent).LIZIZ(lizlll, lizlll2, n, n2);
                    }
                    else if (n2 == 0) {
                        break Block_6;
                    }
                    return true;
                }
                try {
                    viewParent.onNestedScrollAccepted(lizlll, lizlll2, n);
                    return true;
                    while (true) {
                        viewParent = viewParent.getParent();
                        continue Label_0117_Outer;
                        iftrue(Label_0117:)(!(viewParent instanceof View));
                        lizlll = (View)viewParent;
                        continue;
                    }
                }
                catch (final AbstractMethodError abstractMethodError) {
                    return true;
                }
            }
            break;
        }
    }
    
    public final boolean LIZ(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.LIZIZ(n, n2, n3, n4, array, 0, null);
    }
    
    public final boolean LIZ(final int n, final int n2, final int[] array, final int[] array2) {
        return this.LIZ(n, n2, array, array2, 0);
    }
    
    public final boolean LIZ(final int n, final int n2, int[] liz, final int[] array, final int n3) {
        final int[] array2 = liz;
        if (this.LIZ) {
            final ViewParent lizj = this.LIZJ(n3);
            if (lizj == null) {
                return false;
            }
            if (n != 0 || n2 != 0) {
                int n4;
                int n5;
                if (array != null) {
                    this.LIZLLL.getLocationInWindow(array);
                    n4 = array[0];
                    n5 = array[1];
                }
                else {
                    n4 = 0;
                    n5 = 0;
                }
                liz = array2;
                if (array2 == null) {
                    liz = this.LIZ();
                }
                liz[1] = (liz[0] = 0);
                08J.LIZ(lizj, this.LIZLLL, n, n2, liz, n3);
                if (array != null) {
                    this.LIZLLL.getLocationInWindow(array);
                    array[0] -= n4;
                    array[1] -= n5;
                }
                return liz[0] != 0 || liz[1] != 0;
            }
            if (array != null) {
                array[1] = (array[0] = 0);
            }
        }
        return false;
    }
    
    public final void LIZIZ(final int n) {
        final ViewParent lizj = this.LIZJ(n);
        if (lizj != null) {
            final View lizlll = this.LIZLLL;
            if (lizj instanceof 14d) {
                ((14d)lizj).LIZ(lizlll, n);
            }
            else if (n == 0) {
                try {
                    lizj.onStopNestedScroll(lizlll);
                }
                catch (final AbstractMethodError abstractMethodError) {}
            }
            this.LIZ(n, null);
        }
    }
    
    public final boolean LIZIZ(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, int[] liz) {
        final int[] array2 = liz;
        if (this.LIZ) {
            final ViewParent lizj = this.LIZJ(n5);
            if (lizj == null) {
                return false;
            }
            if (n != 0 || n2 != 0 || n3 != 0 || n4 != 0) {
                int n6;
                int n7;
                if (array != null) {
                    this.LIZLLL.getLocationInWindow(array);
                    n6 = array[0];
                    n7 = array[1];
                }
                else {
                    n6 = 0;
                    n7 = 0;
                }
                liz = array2;
                if (array2 == null) {
                    liz = this.LIZ();
                    liz[1] = (liz[0] = 0);
                }
                08J.LIZ(lizj, this.LIZLLL, n, n2, n3, n4, n5, liz);
                if (array != null) {
                    this.LIZLLL.getLocationInWindow(array);
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
}
