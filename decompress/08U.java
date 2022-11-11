// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.core.g.t;
import java.util.Arrays;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;

public class 08u
{
    public static final Interpolator LJIL;
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public int LJ;
    public final int LJFF;
    public int LJI;
    public View LJII;
    public float[] LJIIIIZZ;
    public float[] LJIIIZ;
    public float[] LJIIJ;
    public float[] LJIIJJI;
    public int[] LJIIL;
    public int[] LJIILIIL;
    public int[] LJIILJJIL;
    public int LJIILL;
    public VelocityTracker LJIILLIIL;
    public float LJIIZILJ;
    public OverScroller LJIJ;
    public final a LJIJI;
    public boolean LJIJJ;
    public final ViewGroup LJIJJLI;
    public final Runnable LJJ;
    
    static {
        Covode.recordClassIndex(929);
        LJIL = (Interpolator)new 08r();
    }
    
    public 08u(final Context context, final ViewGroup ljijjli, final a ljiji) {
        this.LIZJ = -1;
        this.LJJ = new 08s(this);
        if (ljijjli == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (ljiji != null) {
            this.LJIJJLI = ljijjli;
            this.LJIJI = ljiji;
            final ViewConfiguration value = ViewConfiguration.get(context);
            final int n = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
            this.LJFF = n;
            this.LJ = n;
            this.LIZIZ = value.getScaledTouchSlop();
            this.LJIIZILJ = (float)value.getScaledMaximumFlingVelocity();
            this.LIZLLL = (float)value.getScaledMinimumFlingVelocity();
            this.LJIJ = new OverScroller(context, 08u.LJIL);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }
    
    private float LIZ(final float n) {
        return (float)Math.sin((n - 0.5f) * 0.47123894f);
    }
    
    private float LIZ(final float n, float n2, final float n3) {
        final float abs = Math.abs(n);
        if (abs < n2) {
            return 0.0f;
        }
        n2 = n;
        if (abs > n3) {
            if (n > 0.0f) {
                return n3;
            }
            n2 = -n3;
        }
        return n2;
    }
    
    private int LIZ(int n, int abs, final int n2) {
        if (n == 0) {
            return 0;
        }
        final int width = this.LJIJJLI.getWidth();
        final int n3 = width / 2;
        final float min = Math.min(1.0f, Math.abs(n) / (float)width);
        final float n4 = (float)n3;
        final float liz = this.LIZ(min);
        abs = Math.abs(abs);
        if (abs > 0) {
            n = Math.round(Math.abs((n4 + liz * n4) / abs) * 1000.0f) * 4;
        }
        else {
            n = (int)((Math.abs(n) / (float)n2 + 1.0f) * 256.0f);
        }
        return Math.min(n, 600);
    }
    
    private int LIZ(final View view, int liz, int liz2, int liziz, int liziz2) {
        liziz = this.LIZIZ(liziz, (int)this.LIZLLL, (int)this.LJIIZILJ);
        liziz2 = this.LIZIZ(liziz2, (int)this.LIZLLL, (int)this.LJIIZILJ);
        final int abs = Math.abs(liz);
        final int abs2 = Math.abs(liz2);
        final int abs3 = Math.abs(liziz);
        final int abs4 = Math.abs(liziz2);
        final int n = abs3 + abs4;
        final int n2 = abs + abs2;
        float n3;
        float n4;
        if (liziz != 0) {
            n3 = (float)abs3;
            n4 = (float)n;
        }
        else {
            n3 = (float)abs;
            n4 = (float)n2;
        }
        final float n5 = n3 / n4;
        float n6;
        float n7;
        if (liziz2 != 0) {
            n6 = (float)abs4;
            n7 = (float)n;
        }
        else {
            n6 = (float)abs2;
            n7 = (float)n2;
        }
        final float n8 = n6 / n7;
        liz = this.LIZ(liz, liziz, this.LJIJI.LIZ(view));
        liz2 = this.LIZ(liz2, liziz2, this.LJIJI.LIZIZ());
        return (int)(liz * n5 + liz2 * n8);
    }
    
    public static 08u LIZ(final ViewGroup viewGroup, final float n, final a a) {
        final 08u liz = LIZ(viewGroup, a);
        liz.LIZIZ *= (int)(1.0f / n);
        return liz;
    }
    
    public static 08u LIZ(final ViewGroup viewGroup, final a a) {
        return new 08u(viewGroup.getContext(), viewGroup, a);
    }
    
    private void LIZ(final float n, final float n2) {
        this.LJIJJ = true;
        this.LJIJI.LIZ(this.LJII, n, n2);
        this.LJIJJ = false;
        if (this.LIZ == 1) {
            this.LIZ(0);
        }
    }
    
    private void LIZ(final float n, final float n2, final int n3) {
        final float[] ljiiiizz = this.LJIIIIZZ;
        boolean b = false;
        if (ljiiiizz == null || ljiiiizz.length <= n3) {
            final int n4 = n3 + 1;
            final float[] ljiiiizz2 = new float[n4];
            final float[] ljiiiz = new float[n4];
            final float[] ljiij = new float[n4];
            final float[] ljiijji = new float[n4];
            final int[] ljiil = new int[n4];
            final int[] ljiiliil = new int[n4];
            final int[] ljiiljjil = new int[n4];
            if (ljiiiizz != null) {
                System.arraycopy(ljiiiizz, 0, ljiiiizz2, 0, ljiiiizz.length);
                final float[] ljiiiz2 = this.LJIIIZ;
                System.arraycopy(ljiiiz2, 0, ljiiiz, 0, ljiiiz2.length);
                final float[] ljiij2 = this.LJIIJ;
                System.arraycopy(ljiij2, 0, ljiij, 0, ljiij2.length);
                final float[] ljiijji2 = this.LJIIJJI;
                System.arraycopy(ljiijji2, 0, ljiijji, 0, ljiijji2.length);
                final int[] ljiil2 = this.LJIIL;
                System.arraycopy(ljiil2, 0, ljiil, 0, ljiil2.length);
                final int[] ljiiliil2 = this.LJIILIIL;
                System.arraycopy(ljiiliil2, 0, ljiiliil, 0, ljiiliil2.length);
                final int[] ljiiljjil2 = this.LJIILJJIL;
                System.arraycopy(ljiiljjil2, 0, ljiiljjil, 0, ljiiljjil2.length);
            }
            this.LJIIIIZZ = ljiiiizz2;
            this.LJIIIZ = ljiiiz;
            this.LJIIJ = ljiij;
            this.LJIIJJI = ljiijji;
            this.LJIIL = ljiil;
            this.LJIILIIL = ljiiliil;
            this.LJIILJJIL = ljiiljjil;
        }
        this.LJIIIIZZ[n3] = (this.LJIIJ[n3] = n);
        this.LJIIIZ[n3] = (this.LJIIJJI[n3] = n2);
        final int[] ljiil3 = this.LJIIL;
        final int n5 = (int)n;
        final int n6 = (int)n2;
        if (n5 < this.LJIJJLI.getLeft() + this.LJ) {
            b = true;
        }
        int n7 = b ? 1 : 0;
        if (n6 < this.LJIJJLI.getTop() + this.LJ) {
            n7 = ((b ? 1 : 0) | 0x4);
        }
        int n8 = n7;
        if (n5 > this.LJIJJLI.getRight() - this.LJ) {
            n8 = (n7 | 0x2);
        }
        int n9 = n8;
        if (n6 > this.LJIJJLI.getBottom() - this.LJ) {
            n9 = (n8 | 0x8);
        }
        ljiil3[n3] = n9;
        this.LJIILL |= 1 << n3;
    }
    
    private boolean LIZ(float abs, float abs2, final int n, final int n2) {
        abs = Math.abs(abs);
        abs2 = Math.abs(abs2);
        if ((this.LJIIL[n] & n2) == n2 && (this.LJI & n2) != 0x0 && (this.LJIILJJIL[n] & n2) != n2) {
            final int[] ljiiliil = this.LJIILIIL;
            if ((ljiiliil[n] & n2) != n2) {
                final int liziz = this.LIZIZ;
                if ((abs > liziz || abs2 > liziz) && (ljiiliil[n] & n2) == 0x0 && abs > liziz) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean LIZ(int n, int n2, int liz, final int n3) {
        final int left = this.LJII.getLeft();
        final int top = this.LJII.getTop();
        n -= left;
        n2 -= top;
        if (n == 0 && n2 == 0) {
            this.LJIJ.abortAnimation();
            this.LIZ(0);
            return false;
        }
        liz = this.LIZ(this.LJII, n, n2, liz, n3);
        this.LJIJ.startScroll(left, top, n, n2, liz);
        this.LIZ(2);
        return true;
    }
    
    private boolean LIZ(final View view, final float n, final float n2) {
        if (view == null) {
            return false;
        }
        int n3;
        if (this.LJIJI.LIZ(view) > 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        boolean b;
        if (this.LJIJI.LIZIZ() > 0) {
            b = true;
        }
        else {
            b = false;
        }
        if (n3 == 0) {
            return b && Math.abs(n2) > this.LIZIZ;
        }
        if (b) {
            final int liziz = this.LIZIZ;
            return n * n + n2 * n2 > liziz * liziz;
        }
        return Math.abs(n) > this.LIZIZ;
    }
    
    private int LIZIZ(final int n, int n2, final int n3) {
        final int abs = Math.abs(n);
        if (abs < n2) {
            return 0;
        }
        n2 = n;
        if (abs > n3) {
            if (n > 0) {
                return n3;
            }
            n2 = -n3;
        }
        return n2;
    }
    
    private void LIZIZ(final float n, final float n2, final int n3) {
        int liz;
        final boolean b = (liz = (this.LIZ(n, n2, n3, 1) ? 1 : 0)) != 0;
        if (this.LIZ(n2, n, n3, 4)) {
            liz = ((b ? 1 : 0) | 0x4);
        }
        int n4 = liz;
        if (this.LIZ(n, n2, n3, 2)) {
            n4 = (liz | 0x2);
        }
        int n5 = n4;
        if (this.LIZ(n2, n, n3, 8)) {
            n5 = (n4 | 0x8);
        }
        if (n5 != 0) {
            final int[] ljiiliil = this.LJIILIIL;
            ljiiliil[n3] |= n5;
            this.LJIJI.LIZ(n5, n3);
        }
    }
    
    private void LIZIZ(final int n) {
        if (this.LJIIIIZZ != null && this.LIZJ(n)) {
            this.LJIIIIZZ[n] = 0.0f;
            this.LJIIIZ[n] = 0.0f;
            this.LJIIJ[n] = 0.0f;
            this.LJIIJJI[n] = 0.0f;
            this.LJIIL[n] = 0;
            this.LJIILIIL[n] = 0;
            this.LJIILJJIL[n] = 0;
            this.LJIILL &= ~(1 << n);
        }
    }
    
    private boolean LIZIZ(final View view, final int lizj) {
        if (view == this.LJII && this.LIZJ == lizj) {
            return true;
        }
        if (view != null && this.LJIJI.LIZIZ(view, lizj)) {
            this.LIZ(view, this.LIZJ = lizj);
            return true;
        }
        return false;
    }
    
    private void LIZJ(final MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
            final int pointerId = motionEvent.getPointerId(i);
            if (this.LIZLLL(pointerId)) {
                final float x = motionEvent.getX(i);
                final float y = motionEvent.getY(i);
                this.LJIIJ[pointerId] = x;
                this.LJIIJJI[pointerId] = y;
            }
        }
    }
    
    private boolean LIZJ(final int n) {
        return (1 << n & this.LJIILL) != 0x0;
    }
    
    private boolean LIZLLL(final int n) {
        return this.LIZJ(n);
    }
    
    private void LJ() {
        this.LJIILLIIL.computeCurrentVelocity(1000, this.LJIIZILJ);
        this.LIZ(this.LIZ(this.LJIILLIIL.getXVelocity(this.LIZJ), this.LIZLLL, this.LJIIZILJ), this.LIZ(this.LJIILLIIL.getYVelocity(this.LIZJ), this.LIZLLL, this.LJIIZILJ));
    }
    
    public final void LIZ() {
        this.LIZJ = -1;
        final float[] ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            Arrays.fill(ljiiiizz, 0.0f);
            Arrays.fill(this.LJIIIZ, 0.0f);
            Arrays.fill(this.LJIIJ, 0.0f);
            Arrays.fill(this.LJIIJJI, 0.0f);
            Arrays.fill(this.LJIIL, 0);
            Arrays.fill(this.LJIILIIL, 0);
            Arrays.fill(this.LJIILJJIL, 0);
            this.LJIILL = 0;
        }
        final VelocityTracker ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.recycle();
            this.LJIILLIIL = null;
        }
    }
    
    public final void LIZ(final int liz) {
        this.LJIJJLI.removeCallbacks(this.LJJ);
        if (this.LIZ != liz) {
            this.LIZ = liz;
            this.LJIJI.LIZ(liz);
            if (this.LIZ == 0) {
                this.LJII = null;
            }
        }
    }
    
    public final void LIZ(final View ljii, final int lizj) {
        if (ljii.getParent() == this.LJIJJLI) {
            this.LJII = ljii;
            this.LIZJ = lizj;
            this.LJIJI.LIZ(ljii, lizj);
            this.LIZ(1);
            return;
        }
        final StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.LJIJJLI);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean LIZ(final int n, final int n2) {
        if (this.LJIJJ) {
            return this.LIZ(n, n2, (int)this.LJIILLIIL.getXVelocity(this.LIZJ), (int)this.LJIILLIIL.getYVelocity(this.LIZJ));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    
    public final boolean LIZ(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.LIZ();
        }
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = VelocityTracker.obtain();
        }
        this.LJIILLIIL.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked != 6) {
                                return this.LIZ == 1;
                            }
                            this.LIZIZ(motionEvent.getPointerId(actionIndex));
                            return this.LIZ == 1;
                        }
                        else {
                            final int pointerId = motionEvent.getPointerId(actionIndex);
                            final float x = motionEvent.getX(actionIndex);
                            final float y = motionEvent.getY(actionIndex);
                            this.LIZ(x, y, pointerId);
                            final int liz = this.LIZ;
                            if (liz == 0) {
                                if ((this.LJIIL[pointerId] & this.LJI) != 0x0) {
                                    this.LJIJI.LIZ();
                                    return this.LIZ == 1;
                                }
                                return this.LIZ == 1;
                            }
                            else {
                                if (liz != 2) {
                                    return this.LIZ == 1;
                                }
                                final View liziz = this.LIZIZ((int)x, (int)y);
                                if (liziz == this.LJII) {
                                    this.LIZIZ(liziz, pointerId);
                                    return this.LIZ == 1;
                                }
                                return this.LIZ == 1;
                            }
                        }
                    }
                }
                else {
                    if (this.LJIIIIZZ != null && this.LJIIIZ != null) {
                        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                            final int pointerId2 = motionEvent.getPointerId(i);
                            if (this.LIZLLL(pointerId2)) {
                                final float x2 = motionEvent.getX(i);
                                final float y2 = motionEvent.getY(i);
                                final float n = x2 - this.LJIIIIZZ[pointerId2];
                                final float n2 = y2 - this.LJIIIZ[pointerId2];
                                final View liziz2 = this.LIZIZ((int)x2, (int)y2);
                                int n5 = 0;
                                Label_0422: {
                                    if (liziz2 != null && this.LIZ(liziz2, n, n2)) {
                                        final int n3 = 1;
                                        final int left = liziz2.getLeft();
                                        final int lizj = this.LJIJI.LIZJ(liziz2, (int)n + left);
                                        final int top = liziz2.getTop();
                                        final int n4 = (int)n2;
                                        final int liz2 = this.LJIJI.LIZ(liziz2, top + n4, n4);
                                        final int liz3 = this.LJIJI.LIZ(liziz2);
                                        final int liziz3 = this.LJIJI.LIZIZ();
                                        if (liz3 != 0) {
                                            n5 = n3;
                                            if (liz3 <= 0) {
                                                break Label_0422;
                                            }
                                            n5 = n3;
                                            if (lizj != left) {
                                                break Label_0422;
                                            }
                                        }
                                        if (liziz3 == 0) {
                                            break;
                                        }
                                        n5 = n3;
                                        if (liziz3 > 0) {
                                            if (liz2 == top) {
                                                break;
                                            }
                                            n5 = n3;
                                        }
                                    }
                                    else {
                                        n5 = 0;
                                    }
                                }
                                this.LIZIZ(n, n2, pointerId2);
                                if (this.LIZ == 1 || (n5 != 0 && this.LIZIZ(liziz2, pointerId2))) {
                                    break;
                                }
                            }
                        }
                        this.LIZJ(motionEvent);
                        return this.LIZ == 1;
                    }
                    return this.LIZ == 1;
                }
            }
            this.LIZ();
        }
        else {
            final float x3 = motionEvent.getX();
            final float y3 = motionEvent.getY();
            final int pointerId3 = motionEvent.getPointerId(0);
            this.LIZ(x3, y3, pointerId3);
            final View liziz4 = this.LIZIZ((int)x3, (int)y3);
            if (liziz4 == this.LJII && this.LIZ == 2) {
                this.LIZIZ(liziz4, pointerId3);
            }
            if ((this.LJIIL[pointerId3] & this.LJI) != 0x0) {
                this.LJIJI.LIZ();
            }
        }
        return this.LIZ == 1;
    }
    
    public final boolean LIZ(final View ljii, final int n, final int n2) {
        this.LJII = ljii;
        this.LIZJ = -1;
        final boolean liz = this.LIZ(n, n2, 0, 0);
        if (!liz && this.LIZ == 0 && this.LJII != null) {
            this.LJII = null;
        }
        return liz;
    }
    
    public final View LIZIZ(final int n, final int n2) {
        for (int i = this.LJIJJLI.getChildCount() - 1; i >= 0; --i) {
            final View child = this.LJIJJLI.getChildAt(i);
            if (n >= child.getLeft() && n < child.getRight() && n2 >= child.getTop() && n2 < child.getBottom()) {
                return child;
            }
        }
        return null;
    }
    
    public final void LIZIZ() {
        this.LIZ();
        if (this.LIZ == 2) {
            final int currX = this.LJIJ.getCurrX();
            final int currY = this.LJIJ.getCurrY();
            this.LJIJ.abortAnimation();
            final int currX2 = this.LJIJ.getCurrX();
            final int currY2 = this.LJIJ.getCurrY();
            this.LJIJI.LIZ(this.LJII, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        this.LIZ(0);
    }
    
    public final void LIZIZ(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.LIZ();
        }
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = VelocityTracker.obtain();
        }
        this.LJIILLIIL.addMovement(motionEvent);
        final int n = 0;
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.LIZ == 1) {
                    this.LJ();
                }
                this.LIZ();
                return;
            }
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            final int pointerId = motionEvent.getPointerId(actionIndex);
                            Label_0657: {
                                if (this.LIZ == 1 && pointerId == this.LIZJ) {
                                    while (i < motionEvent.getPointerCount()) {
                                        final int pointerId2 = motionEvent.getPointerId(i);
                                        if (pointerId2 != this.LIZJ) {
                                            final View liziz = this.LIZIZ((int)motionEvent.getX(i), (int)motionEvent.getY(i));
                                            final View ljii = this.LJII;
                                            if (liziz == ljii && this.LIZIZ(ljii, pointerId2)) {
                                                if (this.LIZJ == -1) {
                                                    break;
                                                }
                                                break Label_0657;
                                            }
                                        }
                                        ++i;
                                    }
                                    this.LJ();
                                }
                            }
                            this.LIZIZ(pointerId);
                        }
                    }
                    else {
                        final int pointerId3 = motionEvent.getPointerId(actionIndex);
                        final float x = motionEvent.getX(actionIndex);
                        final float y = motionEvent.getY(actionIndex);
                        this.LIZ(x, y, pointerId3);
                        if (this.LIZ == 0) {
                            this.LIZIZ(this.LIZIZ((int)x, (int)y), pointerId3);
                            if ((this.LJIIL[pointerId3] & this.LJI) != 0x0) {
                                this.LJIJI.LIZ();
                            }
                            return;
                        }
                        final int n2 = (int)x;
                        final int n3 = (int)y;
                        final View ljii2 = this.LJII;
                        if (ljii2 != null && n2 >= ljii2.getLeft() && n2 < ljii2.getRight() && n3 >= ljii2.getTop() && n3 < ljii2.getBottom()) {
                            this.LIZIZ(this.LJII, pointerId3);
                        }
                    }
                }
                else {
                    if (this.LIZ == 1) {
                        this.LIZ(0.0f, 0.0f);
                    }
                    this.LIZ();
                }
            }
            else {
                if (this.LIZ != 1) {
                    for (int pointerCount = motionEvent.getPointerCount(), j = n; j < pointerCount; ++j) {
                        final int pointerId4 = motionEvent.getPointerId(j);
                        if (this.LIZLLL(pointerId4)) {
                            final float x2 = motionEvent.getX(j);
                            final float y2 = motionEvent.getY(j);
                            final float n4 = x2 - this.LJIIIIZZ[pointerId4];
                            final float n5 = y2 - this.LJIIIZ[pointerId4];
                            this.LIZIZ(n4, n5, pointerId4);
                            if (this.LIZ == 1) {
                                break;
                            }
                            final View liziz2 = this.LIZIZ((int)x2, (int)y2);
                            if (this.LIZ(liziz2, n4, n5) && this.LIZIZ(liziz2, pointerId4)) {
                                break;
                            }
                        }
                    }
                    this.LIZJ(motionEvent);
                    return;
                }
                if (this.LIZLLL(this.LIZJ)) {
                    final int pointerIndex = motionEvent.findPointerIndex(this.LIZJ);
                    final float x3 = motionEvent.getX(pointerIndex);
                    final float y3 = motionEvent.getY(pointerIndex);
                    final float[] ljiij = this.LJIIJ;
                    final int lizj = this.LIZJ;
                    final int n6 = (int)(x3 - ljiij[lizj]);
                    final int n7 = (int)(y3 - this.LJIIJJI[lizj]);
                    final int n8 = this.LJII.getLeft() + n6;
                    final int n9 = this.LJII.getTop() + n7;
                    final int left = this.LJII.getLeft();
                    final int top = this.LJII.getTop();
                    int lizj2 = n8;
                    if (n6 != 0) {
                        lizj2 = this.LJIJI.LIZJ(this.LJII, n8);
                        t.LIZJ(this.LJII, lizj2 - left);
                    }
                    int liz = n9;
                    if (n7 != 0) {
                        liz = this.LJIJI.LIZ(this.LJII, n9, n7);
                        t.LIZIZ(this.LJII, liz - top);
                    }
                    if (n6 != 0 || n7 != 0) {
                        this.LJIJI.LIZ(this.LJII, lizj2, liz, lizj2 - left, liz - top);
                    }
                    this.LIZJ(motionEvent);
                }
            }
        }
        else {
            final float x4 = motionEvent.getX();
            final float y4 = motionEvent.getY();
            final int pointerId5 = motionEvent.getPointerId(0);
            final View liziz3 = this.LIZIZ((int)x4, (int)y4);
            this.LIZ(x4, y4, pointerId5);
            this.LIZIZ(liziz3, pointerId5);
            if ((this.LJIIL[pointerId5] & this.LJI) != 0x0) {
                this.LJIJI.LIZ();
            }
        }
    }
    
    public final boolean LIZJ() {
        if (this.LIZ == 2) {
            final boolean computeScrollOffset = this.LJIJ.computeScrollOffset();
            final int currX = this.LJIJ.getCurrX();
            final int currY = this.LJIJ.getCurrY();
            final int n = currX - this.LJII.getLeft();
            final int n2 = currY - this.LJII.getTop();
            if (n != 0) {
                t.LIZJ(this.LJII, n);
            }
            if (n2 != 0) {
                t.LIZIZ(this.LJII, n2);
            }
            if (n != 0 || n2 != 0) {
                this.LJIJI.LIZ(this.LJII, currX, currY, n, n2);
            }
            if (computeScrollOffset) {
                if (currX != this.LJIJ.getFinalX() || currY != this.LJIJ.getFinalY()) {
                    return this.LIZ == 2;
                }
                this.LJIJ.abortAnimation();
            }
            this.LJIJJLI.post(this.LJJ);
        }
        return this.LIZ == 2;
    }
    
    public final boolean LIZLLL() {
        for (int length = this.LJIIIIZZ.length, i = 0; i < length; ++i) {
            if (this.LIZJ(i)) {
                final float n = this.LJIIJ[i] - this.LJIIIIZZ[i];
                final float n2 = this.LJIIJJI[i] - this.LJIIIZ[i];
                final int liziz = this.LIZIZ;
                if (n * n + n2 * n2 > liziz * liziz) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public abstract static class a
    {
        static {
            Covode.recordClassIndex(932);
        }
        
        public int LIZ(final View view) {
            return 0;
        }
        
        public int LIZ(final View view, final int n, final int n2) {
            return 0;
        }
        
        public void LIZ() {
        }
        
        public void LIZ(final int n) {
        }
        
        public void LIZ(final int n, final int n2) {
        }
        
        public void LIZ(final View view, final float n, final float n2) {
        }
        
        public void LIZ(final View view, final int n) {
        }
        
        public void LIZ(final View view, final int n, final int n2, final int n3, final int n4) {
        }
        
        public int LIZIZ() {
            return 0;
        }
        
        public abstract boolean LIZIZ(final View p0, final int p1);
        
        public int LIZJ(final View view, final int n) {
            return 0;
        }
    }
}
