// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.View$OnTouchListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.io.File;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.widget.ImageView$ScaleType;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.graphics.PointF;
import com.bytedance.android.live.base.model.ImageModel;
import android.net.Uri;

public final class 0bz
{
    public SDZ<SB0> LIZ;
    public KFw LIZIZ;
    public Uri LIZJ;
    public ImageModel LIZLLL;
    public I7e LJ;
    public PointF LJFF;
    public boolean LJI;
    public Context LJII;
    public a LJIIIIZZ;
    public Qys LJIIIZ;
    public S7S LJIIJ;
    public float LJIIJJI;
    public boolean LJIIL;
    public Rgh LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    
    static {
        Covode.recordClassIndex(5684);
    }
    
    public 0bz(Context ljii) {
        ljii = ((Context)ljii).getApplicationContext();
        if (5WL.LIZIZ) {
            if (ljii == null) {
                ljii = 5WL.LIZ;
            }
        }
        this.LJII = (Context)ljii;
        this.LJIIIIZZ = null;
        this.LJIIJJI = 0.0f;
        this.LJIIL = true;
        this.LJ = SEU.LIZIZ;
        this.LJFF = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = false;
        this.LJI = false;
        this.LJIILL = false;
        this.LIZIZ = null;
        this.LIZ = null;
    }
    
    public static 0bz LIZ(final Context context) {
        if (context != null) {
            return new 0bz(context);
        }
        throw new IllegalArgumentException("appContext == null");
    }
    
    public static I7e LIZ(final ImageView$ScaleType imageView$ScaleType, final I7e i7e) {
        switch (0bx.LIZ[imageView$ScaleType.ordinal()]) {
            default: {
                return i7e;
            }
            case 1: {
                return I7e.LJFF;
            }
            case 2: {
                return I7e.LJII;
            }
            case 3: {
                return I7e.LJI;
            }
            case 4: {
                return I7e.LIZLLL;
            }
            case 5: {
                return I7e.LIZJ;
            }
            case 6: {
                return I7e.LJ;
            }
            case 7: {
                return I7e.LIZIZ;
            }
            case 8: {
                return I7e.LJIIIIZZ;
            }
        }
    }
    
    public static S8e LIZ(final Uri uri, final S7S lizlll) {
        if (uri == null) {
            return null;
        }
        final S8f liz = S8f.LIZ(uri);
        if (lizlll != null) {
            liz.LIZLLL = lizlll;
        }
        return liz.LIZ();
    }
    
    public static S8e[] LIZ(final Uri uri, final ImageModel imageModel, final S7S lizlll, final Qys ljiij) {
        if (uri == null && (imageModel == null || Fhk.LIZ((List)imageModel.getUrls()))) {
            return new S8e[0];
        }
        final ArrayList list = new ArrayList();
        final S8e liz = LIZ(uri, lizlll);
        if (liz != null) {
            list.add(liz);
        }
        if (imageModel != null && !Fhk.LIZ((List)imageModel.getUrls())) {
            final 1sZ 1sZ = new 1sZ();
            for (final String s : imageModel.getUrls()) {
                if (!5ow.LIZ(s)) {
                    final S8f liz2 = S8f.LIZ(Uri.parse(s));
                    if (ljiij != null) {
                        liz2.LJIIJ = ljiij;
                    }
                    if (lizlll != null) {
                        liz2.LIZLLL = lizlll;
                    }
                    1sZ.LIZ(liz2);
                    final S8e liz3 = liz2.LIZ();
                    if (list.contains(liz3)) {
                        continue;
                    }
                    list.add(liz3);
                }
            }
        }
        if (list.size() == 0) {
            return new S8e[0];
        }
        return (S8e[])list.toArray(new S8e[list.size()]);
    }
    
    public final 0bz LIZ() {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new Rgh();
        }
        this.LJIILIIL.LIZIZ = true;
        return this;
    }
    
    public final 0bz LIZ(final int n) {
        this.LJII.getResources().getDrawable(n);
        return this;
    }
    
    public final 0bz LIZ(final int n, final int n2) {
        this.LJIIJ = new S7S(n, n2);
        return this;
    }
    
    public final 0bz LIZ(final ImageView$ScaleType imageView$ScaleType) {
        this.LJ = LIZ(imageView$ScaleType, SEU.LIZIZ);
        return this;
    }
    
    public final 0bz LIZ(final File file) {
        this.LIZJ = Uri.fromFile(file);
        return this;
    }
    
    public final 0bz LIZ(final String s) {
        this.LIZJ = Uri.parse(s);
        return this;
    }
    
    public final void LIZ(final View view) {
        if (view == null) {
            return;
        }
        if (this.LIZJ == null && this.LIZLLL == null) {
            return;
        }
        if (this.LIZ == null) {
            final Object liz = 0c5.LIZ(view, "DraweeHolder");
            if (liz instanceof SDZ) {
                this.LIZ = (SDZ<SB0>)liz;
            }
        }
        if (this.LJIIJ == null && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            this.LIZ(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        final SDZ<SB0> liz2 = this.LIZ;
        Label_0478: {
            if (liz2 == null) {
                view.getContext();
                this.LIZ = (SDZ<SB0>)SDZ.LIZ((SB0)null);
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = new a((byte)0);
                }
                final SEU seu = new SEU(view.getResources());
                seu.LJIILJJIL = this.LJFF;
                seu.LJIILIIL = this.LJ;
                seu.LJIJI = this.LJIILIIL;
                this.LIZ.LIZIZ((SB0)seu.LIZ());
                final S8e[] liz3 = LIZ(this.LIZJ, this.LIZLLL, this.LJIIJ, this.LJIIIZ);
                if (liz3 == null || liz3.length == 0) {
                    return;
                }
                final SAp liziz = SBH.LIZIZ();
                ((SDU)liziz).LIZJ(this.LJI);
                ((SDU)liziz).LIZ(this.LIZIZ);
                ((SDU)liziz).LIZ(this.LIZ.LIZIZ);
                ((SDU)liziz).LIZ((Object[])liz3);
                ((SDU)liziz).LIZIZ(this.LJIILL);
                ((SDU)liziz).LIZ(this.LJIILJJIL);
                this.LIZ.LIZ((SDe)((SDU)liziz).LIZJ());
                if (view.isAttachedToWindow()) {
                    this.LJIIIIZZ.onViewAttachedToWindow(view);
                }
                view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.LJIIIIZZ);
                view.setOnTouchListener((View$OnTouchListener)this.LJIIIIZZ);
                0c5.LIZ(view, this.LIZ);
                break Label_0478;
            }
            else {
                liz2.LIZJ();
                final SEU seu2 = new SEU(view.getResources());
                seu2.LJIILJJIL = this.LJFF;
                seu2.LJIILIIL = this.LJ;
                seu2.LJIJI = this.LJIILIIL;
                this.LIZ.LIZIZ((SB0)seu2.LIZ());
                final S8e[] liz4 = LIZ(this.LIZJ, this.LIZLLL, this.LJIIJ, this.LJIIIZ);
                if (liz4 != null && liz4.length != 0) {
                    final SAp liziz2 = SBH.LIZIZ();
                    ((SDU)liziz2).LIZJ(this.LJI);
                    ((SDU)liziz2).LIZ(this.LIZIZ);
                    ((SDU)liziz2).LIZ((Object[])liz4);
                    ((SDU)liziz2).LIZ(this.LIZ.LIZIZ);
                    ((SDU)liziz2).LIZIZ(this.LJIILL);
                    ((SDU)liziz2).LIZ(this.LJIILJJIL);
                    this.LIZ.LIZ((SDe)((SDU)liziz2).LIZJ());
                    this.LIZ.LIZIZ();
                    break Label_0478;
                }
            }
            return;
        }
        Label_0565: {
            if (this.LJIIJJI != 0.0f) {
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    int width = layoutParams.width;
                    int height = layoutParams.height;
                    if (this.LJIIL) {
                        if (width <= 0 || height != 0) {
                            break Label_0565;
                        }
                        height = (int)(width * 1.0 / this.LJIIJJI + 0.5);
                    }
                    else {
                        if (height <= 0 || width != 0) {
                            break Label_0565;
                        }
                        width = (int)(height * this.LJIIJJI + 0.5f);
                        if (width == -1) {
                            break Label_0565;
                        }
                    }
                    if (height != -1) {
                        layoutParams.width = width;
                        layoutParams.height = height;
                        view.requestLayout();
                    }
                }
            }
        }
        if (view instanceof ImageView) {
            ((ImageView)view).setImageDrawable(this.LIZ.LJFF());
            return;
        }
        view.setBackground(this.LIZ.LJFF());
    }
    
    public final 0bz LIZIZ(final int n) {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new Rgh();
        }
        this.LJIILIIL.LIZ((float)n);
        return this;
    }
    
    public final class a implements View$OnAttachStateChangeListener, View$OnTouchListener
    {
        static {
            Covode.recordClassIndex(5686);
        }
        
        public final boolean onTouch(final View view, final MotionEvent motionEvent) {
            return 0bz.this.LIZ != null && 0bz.this.LIZ.LIZ(motionEvent);
        }
        
        public final void onViewAttachedToWindow(final View view) {
            if (0bz.this.LIZ != null) {
                0bz.this.LIZ.LIZIZ();
            }
        }
        
        public final void onViewDetachedFromWindow(final View view) {
            if (0bz.this.LIZ != null) {
                0bz.this.LIZ.LIZJ();
            }
        }
    }
}
