// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.ContextWrapper;
import android.app.Application;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import kotlin.jvm.internal.n;
import java.util.ArrayList;
import java.util.Collection;
import android.net.Uri$Builder;
import android.view.View;
import android.widget.ImageView$ScaleType;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import android.widget.ImageView;
import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public final class 0cm
{
    static {
        Covode.recordClassIndex(5755);
    }
    
    public static String LIZ(final ImageModel imageModel) {
        if (imageModel == null || Fhk.LIZ((List)imageModel.getUrls())) {
            return "";
        }
        return imageModel.getUrls().get(0);
    }
    
    public static void LIZ(final ImageView imageView) {
        if (!(imageView instanceof SE3)) {
            return;
        }
        try {
            ((SE3)imageView).setImageURI((String)null);
        }
        catch (final Exception ex) {}
    }
    
    public static void LIZ(final ImageView imageView, final int n, final int n2, final int n3) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            final G18 liz = 0cp.LIZ();
            liz.LIZ(n);
            liz.LIZ(Boolean.valueOf(true));
            liz.LIZ(ImageView$ScaleType.CENTER_CROP);
            liz.LIZ(n2, n3);
            liz.LIZ((View)imageView);
            return;
        }
        if (imageView != null && LIZ(imageView.getContext())) {
            final 0bz liz2 = 0bz.LIZ(imageView.getContext());
            liz2.LIZJ = new Uri$Builder().scheme("res").path(String.valueOf(n)).build();
            liz2.LIZ();
            liz2.LIZ(ImageView$ScaleType.CENTER_CROP);
            if (n2 > 0 && n3 > 0) {
                liz2.LIZ(n2, n3);
            }
            liz2.LIZ((View)imageView);
        }
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel lizlll) {
        if (!LiveImageLoaderModuleSetting.useImageModule()) {
            if (imageView != null && LIZ(imageView.getContext())) {
                final 0bz liz = 0bz.LIZ(imageView.getContext());
                liz.LIZLLL = lizlll;
                liz.LIZ();
                liz.LIZ(ImageView$ScaleType.CENTER_CROP);
                liz.LIZ((View)imageView);
            }
            return;
        }
        if (!0cp.LIZ(lizlll)) {
            return;
        }
        final G18 liz2 = 0cp.LIZ();
        liz2.LIZ((List)lizlll.getUrls());
        liz2.LIZ(ImageView$ScaleType.CENTER_CROP);
        liz2.LIZ(Boolean.valueOf(true));
        liz2.LIZ((View)imageView);
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel imageModel, final int n) {
        LIZIZ(imageView, imageModel, -1, -1, n, null);
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel imageModel, final int n, final int n2) {
        if (imageView != null && imageModel != null && !5s7.LIZ((Collection)imageModel.getUrls()) && LIZ(imageView.getContext())) {
            LIZIZ(imageView, imageModel, n, n2, -1, null);
        }
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel lizlll, final int n, final int n2, final int n3, final IAA iaa) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            final ArrayList list = new ArrayList();
            if (lizlll != null && lizlll.getUrls() != null) {
                list.addAll(lizlll.getUrls());
            }
            final G18 liz = 0cp.LIZ();
            liz.LIZ((List)list);
            liz.LIZ(Boolean.valueOf(true));
            liz.LIZ(ImageView$ScaleType.CENTER_CROP);
            liz.LIZ(n, n2);
            liz.LIZIZ(n3);
            liz.LIZ(iaa);
            liz.LIZ((View)imageView);
            return;
        }
        if (0cp.LIZ(lizlll) && imageView != null && LIZ(imageView.getContext())) {
            final 0bz liz2 = 0bz.LIZ(imageView.getContext());
            liz2.LIZLLL = lizlll;
            liz2.LIZ();
            liz2.LIZ(ImageView$ScaleType.CENTER_CROP);
            n.LIZIZ((Object)liz2, "");
            if (n > 0 && n2 > 0) {
                liz2.LIZ(n, n2);
            }
            F0v.LIZ((BFk)Cc0.LIZ, (F2r)EiD.LIZIZ, (SRT)new 2Bm(n3, liz2, iaa, lizlll, imageView, null), 2);
        }
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel imageModel, final int n, final int n2, final boolean b, final int n3, final IAA iaa) {
        LIZ(imageView, imageModel, n, n2, b, n3, ImageView$ScaleType.CENTER_CROP, iaa);
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel lizlll, final int n, final int n2, final boolean b, final int n3, final ImageView$ScaleType imageView$ScaleType, final IAA iaa) {
        String s = null;
        if (lizlll == null) {
            if (iaa != null) {
                iaa.LIZ((String)null, (Exception)new IllegalArgumentException("imageModel == null"));
            }
            return;
        }
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!0cp.LIZ(lizlll)) {
                return;
            }
            final G18 liz = 0cp.LIZ();
            liz.LIZ((List)lizlll.getUrls());
            liz.LIZIZ(n3);
            liz.LIZ(imageView$ScaleType);
            liz.LIZ(b);
            liz.LIZ(n, n2);
            liz.LIZ(iaa);
            liz.LIZ((View)imageView);
        }
        else {
            if (lizlll.getUrls().size() != 0) {
                s = lizlll.getUrls().get(0);
            }
            if (5s7.LIZ((Collection)lizlll.getUrls())) {
                if (iaa != null) {
                    iaa.LIZ(s, (Exception)new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"));
                }
                return;
            }
            if (imageView == null || !LIZ(imageView.getContext())) {
                if (iaa != null) {
                    iaa.LIZ(s, (Exception)new IllegalArgumentException("!isActivityOK(view.getContext())"));
                }
                return;
            }
            final 0bz liz2 = 0bz.LIZ(imageView.getContext());
            liz2.LIZ(LIZ(lizlll));
            liz2.LIZLLL = lizlll;
            liz2.LIZ(imageView$ScaleType);
            if (n > 0 && n2 > 0) {
                liz2.LIZ(n, n2);
            }
            if (n3 > 0) {
                liz2.LIZ(n3);
            }
            if (b) {
                liz2.LJI = true;
            }
            liz2.LIZIZ = (KFw)new 0ch.b(lizlll, iaa);
            liz2.LIZ((View)imageView);
        }
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel imageModel, final int n, final IAA iaa) {
        LIZIZ(imageView, imageModel, -1, -1, n, iaa);
    }
    
    public static void LIZ(final ImageView imageView, final ImageModel lizlll, final IA6 ia6) {
        if (!LiveImageLoaderModuleSetting.useImageModule()) {
            if (lizlll != null && !5s7.LIZ((Collection)lizlll.getUrls()) && imageView != null) {
                if (LIZ(imageView.getContext())) {
                    final 0bz liz = 0bz.LIZ(imageView.getContext());
                    liz.LIZ(LIZ(lizlll));
                    liz.LIZLLL = lizlll;
                    liz.LIZ(ImageView$ScaleType.CENTER_CROP);
                    if (ia6 != null) {
                        liz.LJ = (I7e)1iE.LIZ;
                        final int n = 0cl.LIZ[ia6.ordinal()];
                        PointF ljff;
                        if (n != 1) {
                            if (n != 2) {
                                ljff = new PointF(0.5f, 0.5f);
                            }
                            else {
                                ljff = new PointF(0.5f, 1.0f);
                            }
                        }
                        else {
                            ljff = new PointF(0.5f, 0.0f);
                        }
                        liz.LJFF = ljff;
                    }
                    liz.LIZ((View)imageView);
                }
            }
            return;
        }
        if (!0cp.LIZ(lizlll)) {
            return;
        }
        final G18 liz2 = 0cp.LIZ();
        liz2.LIZ((List)lizlll.getUrls());
        liz2.LIZIZ(0);
        liz2.LIZ(ia6);
        liz2.LIZ((View)imageView);
    }
    
    public static boolean LIZ(Context baseContext) {
        while (baseContext != null) {
            if (baseContext instanceof Activity) {
                final Activity activity = (Activity)baseContext;
                return !activity.isDestroyed() && !activity.isFinishing();
            }
            if (baseContext instanceof Application || !(baseContext instanceof ContextWrapper)) {
                return true;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return false;
    }
    
    public static void LIZIZ(final ImageView imageView, final ImageModel imageModel) {
        if (imageModel != null && !5s7.LIZ((Collection)imageModel.getUrls())) {
            LIZ(imageView, imageModel, 0);
        }
    }
    
    public static void LIZIZ(final ImageView imageView, final ImageModel lizlll, final int n, final int n2) {
        if (!LiveImageLoaderModuleSetting.useImageModule()) {
            if (imageView != null && lizlll != null && LIZ(imageView.getContext())) {
                final 0bz liz = 0bz.LIZ(imageView.getContext());
                liz.LIZ(LIZ(lizlll));
                liz.LIZIZ(0cB.LIZ((float)n2));
                liz.LIZLLL = lizlll;
                liz.LIZ(ImageView$ScaleType.CENTER_CROP);
                liz.LIZ(n);
                liz.LIZ((View)imageView);
            }
            return;
        }
        if (!0cp.LIZ(lizlll)) {
            return;
        }
        final G18 liz2 = 0cp.LIZ();
        liz2.LIZ((List)lizlll.getUrls());
        liz2.LIZ(ImageView$ScaleType.CENTER_CROP);
        liz2.LIZIZ(n);
        final float n3 = (float)0cB.LIZ((float)n2);
        liz2.LIZ();
        liz2.LIZ((View)imageView);
    }
    
    public static void LIZIZ(final ImageView imageView, final ImageModel imageModel, final int n, final int n2, final int n3, final IAA iaa) {
        LIZ(imageView, imageModel, n, n2, false, n3, iaa);
    }
}
