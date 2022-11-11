// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.AnimatorListenerAdapter;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.view.View$MeasureSpec;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.animation.Animator;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public abstract class 16O extends 0Dg
{
    public static final String[] LJIILL;
    public int LIZ;
    
    static {
        Covode.recordClassIndex(1407);
        LJIILL = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public 16O() {
        this.LIZ = 3;
    }
    
    private b LIZIZ(final 0Dl 0Dl, final 0Dl 0Dl2) {
        final b b = new b();
        b.LIZ = false;
        b.LIZIZ = false;
        if (0Dl != null && 0Dl.LIZ.containsKey("android:visibility:visibility")) {
            b.LIZJ = 0Dl.LIZ.get("android:visibility:visibility");
            b.LJ = 0Dl.LIZ.get("android:visibility:parent");
        }
        else {
            b.LIZJ = -1;
            b.LJ = null;
        }
        if (0Dl2 != null && 0Dl2.LIZ.containsKey("android:visibility:visibility")) {
            b.LIZLLL = 0Dl2.LIZ.get("android:visibility:visibility");
            b.LJFF = 0Dl2.LIZ.get("android:visibility:parent");
        }
        else {
            b.LIZLLL = -1;
            b.LJFF = null;
        }
        if (0Dl != null) {
            if (0Dl2 != null) {
                if (b.LIZJ == b.LIZLLL && b.LJ == b.LJFF) {
                    return b;
                }
                if (b.LIZJ != b.LIZLLL) {
                    if (b.LIZJ == 0) {
                        b.LIZIZ = false;
                        b.LIZ = true;
                        return b;
                    }
                    if (b.LIZLLL == 0) {
                        b.LIZIZ = true;
                        b.LIZ = true;
                        return b;
                    }
                    return b;
                }
                else {
                    if (b.LJFF == null) {
                        b.LIZIZ = false;
                        b.LIZ = true;
                        return b;
                    }
                    if (b.LJ == null) {
                        b.LIZIZ = true;
                        b.LIZ = true;
                        return b;
                    }
                    return b;
                }
            }
        }
        else {
            if (b.LIZLLL == 0) {
                b.LIZIZ = true;
                b.LIZ = true;
                return b;
            }
            if (0Dl2 != null) {
                return b;
            }
        }
        if (b.LIZJ == 0) {
            b.LIZIZ = false;
            b.LIZ = true;
        }
        return b;
    }
    
    private void LIZLLL(final 0Dl 0Dl) {
        0Dl.LIZ.put("android:visibility:visibility", 0Dl.LIZIZ.getVisibility());
        0Dl.LIZ.put("android:visibility:parent", 0Dl.LIZIZ.getParent());
        final int[] array = new int[2];
        0Dl.LIZIZ.getLocationOnScreen(array);
        0Dl.LIZ.put("android:visibility:screenLocation", array);
    }
    
    @Override
    public final Animator LIZ(final ViewGroup viewGroup, final 0Dl 0Dl, final 0Dl 0Dl2) {
        final b liziz = this.LIZIZ(0Dl, 0Dl2);
        if (!liziz.LIZ || (liziz.LJ == null && liziz.LJFF == null)) {
            return null;
        }
        final boolean liziz2 = liziz.LIZIZ;
        boolean b = true;
        if (!liziz2) {
            final int lizlll = liziz.LIZLLL;
            if ((this.LIZ & 0x2) == 0x2 && 0Dl != null) {
                final View liziz3 = 0Dl.LIZIZ;
                Object liziz4;
                if (0Dl2 != null) {
                    liziz4 = 0Dl2.LIZIZ;
                }
                else {
                    liziz4 = null;
                }
                final View view = (View)liziz3.getTag(2131370729);
                Label_0182: {
                    if (view == null) {
                    Label_0637_Outer:
                        while (true) {
                            Label_0390: {
                                if (liziz4 == null) {
                                    break Label_0390;
                                }
                                View view2;
                                if (((View)liziz4).getParent() == null) {
                                    view2 = null;
                                }
                                else {
                                    if (lizlll != 4 && liziz3 != liziz4) {
                                        break Label_0390;
                                    }
                                    view2 = (View)liziz4;
                                    liziz4 = null;
                                }
                                b = false;
                                if (liziz4 != null) {
                                    break Label_0182;
                                }
                                if (view2 != null) {
                                    final int visibility = view2.getVisibility();
                                    0Ds.LIZ(view2, 0);
                                    final Animator liz = this.LIZ(viewGroup, view2, 0Dl);
                                    if (liz != null) {
                                        final a a = new a(view2, lizlll);
                                        liz.addListener((Animator$AnimatorListener)a);
                                        liz.addPauseListener((Animator$AnimatorPauseListener)a);
                                        this.LIZ((c)a);
                                    }
                                    else {
                                        0Ds.LIZ(view2, visibility);
                                    }
                                    return liz;
                                }
                                return null;
                            }
                            final View view4;
                            final View view3 = view4 = null;
                            if (liziz3.getParent() != null) {
                                liziz4 = view3;
                                View view2 = view4;
                                if (!(liziz3.getParent() instanceof View)) {
                                    continue;
                                }
                                final View view5 = (View)liziz3.getParent();
                                if (!this.LIZIZ(this.LIZ(view5, true), this.LIZIZ(view5, true)).LIZ) {
                                    final Matrix matrix = new Matrix();
                                    matrix.setTranslate((float)(-view5.getScrollX()), (float)(-view5.getScrollY()));
                                    0Ds.LIZ.LIZ(liziz3, matrix);
                                    0Ds.LIZ.LIZIZ((View)viewGroup, matrix);
                                    final RectF rectF = new RectF(0.0f, 0.0f, (float)liziz3.getWidth(), (float)liziz3.getHeight());
                                    matrix.mapRect(rectF);
                                    final int round = Math.round(rectF.left);
                                    final int round2 = Math.round(rectF.top);
                                    final int round3 = Math.round(rectF.right);
                                    final int round4 = Math.round(rectF.bottom);
                                    final ImageView imageView = new ImageView(liziz3.getContext());
                                    imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
                                    boolean b2 = false;
                                    boolean attachedToWindow = false;
                                    Label_0621: {
                                        if (0Dk.LIZ) {
                                            b2 = (liziz3.isAttachedToWindow() ^ true);
                                            if (viewGroup != null) {
                                                attachedToWindow = viewGroup.isAttachedToWindow();
                                                break Label_0621;
                                            }
                                        }
                                        else {
                                            b2 = false;
                                        }
                                        attachedToWindow = false;
                                    }
                                    while (true) {
                                        ViewGroup viewGroup2 = null;
                                        int indexOfChild = 0;
                                        Label_0722: {
                                            if (!0Dk.LIZIZ || !b2) {
                                                viewGroup2 = null;
                                                indexOfChild = 0;
                                                break Label_0722;
                                            }
                                            if (attachedToWindow) {
                                                viewGroup2 = (ViewGroup)liziz3.getParent();
                                                indexOfChild = viewGroup2.indexOfChild(liziz3);
                                                viewGroup.getOverlay().add(liziz3);
                                                break Label_0722;
                                            }
                                            imageView.measure(View$MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View$MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view2 = view4;
                                            liziz4 = imageView;
                                            continue Label_0637_Outer;
                                        }
                                        final int round5 = Math.round(rectF.width());
                                        final int round6 = Math.round(rectF.height());
                                        Bitmap imageBitmap;
                                        if (round5 > 0 && round6 > 0) {
                                            final float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                            final int round7 = Math.round(round5 * min);
                                            final int round8 = Math.round(round6 * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            if (0Dk.LIZJ) {
                                                final Picture picture = new Picture();
                                                final Canvas beginRecording = picture.beginRecording(round7, round8);
                                                beginRecording.concat(matrix);
                                                liziz3.draw(beginRecording);
                                                picture.endRecording();
                                                imageBitmap = Bitmap.createBitmap(picture);
                                            }
                                            else {
                                                imageBitmap = Bitmap.createBitmap(round7, round8, Bitmap$Config.ARGB_8888);
                                                final Canvas canvas = new Canvas(imageBitmap);
                                                canvas.concat(matrix);
                                                liziz3.draw(canvas);
                                            }
                                        }
                                        else {
                                            imageBitmap = null;
                                        }
                                        if (0Dk.LIZIZ && b2) {
                                            viewGroup.getOverlay().remove(liziz3);
                                            viewGroup2.addView(liziz3, indexOfChild);
                                        }
                                        if (imageBitmap != null) {
                                            imageView.setImageBitmap(imageBitmap);
                                        }
                                        continue;
                                    }
                                }
                                else {
                                    final int id = view5.getId();
                                    if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null) {
                                        liziz4 = view3;
                                        view2 = view4;
                                        continue;
                                    }
                                    liziz4 = view3;
                                    view2 = view4;
                                    if (!super.LJIIJ) {
                                        continue;
                                    }
                                }
                            }
                            liziz4 = liziz3;
                            View view2 = view4;
                            continue;
                        }
                    }
                    liziz4 = view;
                }
                if (!b) {
                    final int[] array = 0Dl.LIZ.get("android:visibility:screenLocation");
                    final int n = array[0];
                    final int n2 = array[1];
                    final int[] array2 = new int[2];
                    viewGroup.getLocationOnScreen(array2);
                    ((View)liziz4).offsetLeftAndRight(n - array2[0] - ((View)liziz4).getLeft());
                    ((View)liziz4).offsetTopAndBottom(n2 - array2[1] - ((View)liziz4).getTop());
                    0Do.LIZ(viewGroup).LIZ((View)liziz4);
                }
                final Animator liz2 = this.LIZ(viewGroup, (View)liziz4, 0Dl);
                if (!b) {
                    if (liz2 == null) {
                        0Do.LIZ(viewGroup).LIZIZ((View)liziz4);
                    }
                    else {
                        liziz3.setTag(2131370729, liziz4);
                        this.LIZ((c)new 1gK(this, viewGroup, (View)liziz4, liziz3));
                    }
                }
                return liz2;
            }
            return null;
        }
        if ((this.LIZ & 0x1) != 0x1 || 0Dl2 == null) {
            return null;
        }
        if (0Dl == null) {
            final View view6 = (View)0Dl2.LIZIZ.getParent();
            if (this.LIZIZ(this.LIZIZ(view6, false), this.LIZ(view6, false)).LIZ) {
                return null;
            }
        }
        return this.LIZ(viewGroup, 0Dl2.LIZIZ, 0Dl, 0Dl2);
    }
    
    public Animator LIZ(final ViewGroup viewGroup, final View view, final 0Dl 0Dl) {
        return null;
    }
    
    public Animator LIZ(final ViewGroup viewGroup, final View view, final 0Dl 0Dl, final 0Dl 0Dl2) {
        return null;
    }
    
    @Override
    public void LIZ(final 0Dl 0Dl) {
        this.LIZLLL(0Dl);
    }
    
    @Override
    public final boolean LIZ(final 0Dl 0Dl, final 0Dl 0Dl2) {
        if (0Dl == null) {
            if (0Dl2 == null) {
                return false;
            }
        }
        else if (0Dl2 != null && 0Dl2.LIZ.containsKey("android:visibility:visibility") != 0Dl.LIZ.containsKey("android:visibility:visibility")) {
            return false;
        }
        final b liziz = this.LIZIZ(0Dl, 0Dl2);
        return liziz.LIZ && (liziz.LIZJ == 0 || liziz.LIZLLL == 0);
    }
    
    @Override
    public final String[] LIZ() {
        return 16O.LJIILL;
    }
    
    @Override
    public void LIZIZ(final 0Dl 0Dl) {
        this.LIZLLL(0Dl);
    }
    
    public static final class b
    {
        public boolean LIZ;
        public boolean LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public ViewGroup LJ;
        public ViewGroup LJFF;
        
        static {
            Covode.recordClassIndex(1410);
        }
    }
    
    public static final class a extends AnimatorListenerAdapter implements c
    {
        public boolean LIZ;
        public final View LIZIZ;
        public final int LIZJ;
        public final ViewGroup LIZLLL;
        public final boolean LJ;
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(1409);
        }
        
        public a(final View liziz, final int lizj) {
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = (ViewGroup)liziz.getParent();
            this.LIZ(this.LJ = true);
        }
        
        private void LIZ(final boolean ljff) {
            if (this.LJ && this.LJFF != ljff) {
                final ViewGroup lizlll = this.LIZLLL;
                if (lizlll != null) {
                    0Do.LIZ(lizlll, this.LJFF = ljff);
                }
            }
        }
        
        private void LIZLLL() {
            if (!this.LIZ) {
                0Ds.LIZ(this.LIZIZ, this.LIZJ);
                final ViewGroup lizlll = this.LIZLLL;
                if (lizlll != null) {
                    lizlll.invalidate();
                }
            }
            this.LIZ(false);
        }
        
        public final void LIZ() {
        }
        
        public final void LIZ(final 0Dg 0Dg) {
            this.LIZLLL();
            0Dg.LIZIZ((c)this);
        }
        
        public final void LIZIZ() {
            this.LIZ(false);
        }
        
        public final void LIZIZ(final 0Dg 0Dg) {
        }
        
        public final void LIZJ() {
            this.LIZ(true);
        }
        
        public final void onAnimationCancel(final Animator animator) {
            this.LIZ = true;
        }
        
        public final void onAnimationEnd(final Animator animator) {
            this.LIZLLL();
        }
        
        public final void onAnimationPause(final Animator animator) {
            if (!this.LIZ) {
                0Ds.LIZ(this.LIZIZ, this.LIZJ);
            }
        }
        
        public final void onAnimationRepeat(final Animator animator) {
        }
        
        public final void onAnimationResume(final Animator animator) {
            if (!this.LIZ) {
                0Ds.LIZ(this.LIZIZ, 0);
            }
        }
        
        public final void onAnimationStart(final Animator animator) {
        }
    }
}
