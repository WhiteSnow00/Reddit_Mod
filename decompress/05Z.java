// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Bundle;
import android.os.Build$VERSION;
import android.content.Context;
import android.util.Pair;
import android.app.ActivityOptions;
import android.view.View;
import android.app.Activity;
import com.bytedance.covode.number.Covode;

public class 05z
{
    static {
        Covode.recordClassIndex(685);
    }
    
    public static 05z LIZ(final Activity activity, final View view, final String s) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, s));
    }
    
    public static 05z LIZ(final Activity activity, final 07R<View, String>... array) {
        Pair[] array3;
        if (array != null) {
            final Pair[] array2 = new Pair[array.length];
            int n = 0;
            while (true) {
                array3 = array2;
                if (n >= array.length) {
                    break;
                }
                array2[n] = Pair.create((Object)array[n].LIZ, (Object)array[n].LIZIZ);
                ++n;
            }
        }
        else {
            array3 = null;
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, array3));
    }
    
    public static 05z LIZ(final Context context) {
        return new a(ActivityOptions.makeCustomAnimation(context, 2130772127, 2130772127));
    }
    
    public static 05z LIZ(final View view, final int n, final int n2) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, n, n2, 0, 0));
    }
    
    public static 05z LIZIZ(final View view, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 23) {
            return new a(ActivityOptions.makeClipRevealAnimation(view, 0, 0, n, n2));
        }
        return new 05z();
    }
    
    public Bundle LIZ() {
        return null;
    }
    
    public static final class a extends 05z
    {
        public final ActivityOptions LIZ;
        
        static {
            Covode.recordClassIndex(686);
        }
        
        public a(final ActivityOptions liz) {
            this.LIZ = liz;
        }
        
        @Override
        public final Bundle LIZ() {
            return this.LIZ.toBundle();
        }
    }
}
