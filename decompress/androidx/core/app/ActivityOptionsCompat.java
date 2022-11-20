// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.app.ActivityOptions;
import android.os.Bundle;
import android.app.PendingIntent;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.util.Pair;
import z3.c;
import android.app.Activity;
import android.content.Context;
import android.view.View;

public class ActivityOptionsCompat
{
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
    
    public static ActivityOptionsCompat makeBasic() {
        return new a(d.a());
    }
    
    public static ActivityOptionsCompat makeClipRevealAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        return new a(d.b(view, n, n2, n3, n4));
    }
    
    public static ActivityOptionsCompat makeCustomAnimation(final Context context, final int n, final int n2) {
        return new a(b.a(context, n, n2));
    }
    
    public static ActivityOptionsCompat makeScaleUpAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        return new a(b.b(view, n, n2, n3, n4));
    }
    
    public static ActivityOptionsCompat makeSceneTransitionAnimation(final Activity activity, final View view, final String s) {
        return new a(c.a(activity, view, s));
    }
    
    public static ActivityOptionsCompat makeSceneTransitionAnimation(final Activity activity, final z3.c<View, String>... array) {
        Pair<View, String>[] array2 = null;
        if (array != null) {
            final Pair[] array3 = new Pair[array.length];
            int n = 0;
            while (true) {
                array2 = (Pair<View, String>[])array3;
                if (n >= array.length) {
                    break;
                }
                final z3.c<View, String> c = array[n];
                c.getClass();
                final View view = null;
                c.getClass();
                final String s = null;
                array3[n] = Pair.create((Object)null, (Object)null);
                ++n;
            }
        }
        return new a(c.b(activity, array2));
    }
    
    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new a(c.c());
    }
    
    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(final View view, final Bitmap bitmap, final int n, final int n2) {
        return new a(b.c(view, bitmap, n, n2));
    }
    
    public Rect getLaunchBounds() {
        return null;
    }
    
    public void requestUsageTimeReport(final PendingIntent pendingIntent) {
    }
    
    public ActivityOptionsCompat setLaunchBounds(final Rect rect) {
        return this;
    }
    
    public Bundle toBundle() {
        return null;
    }
    
    public void update(final ActivityOptionsCompat activityOptionsCompat) {
    }
    
    public static final class a extends ActivityOptionsCompat
    {
        public final ActivityOptions a;
        
        public a(final ActivityOptions a) {
            this.a = a;
        }
        
        @Override
        public final Rect getLaunchBounds() {
            return e.a(this.a);
        }
        
        @Override
        public final void requestUsageTimeReport(final PendingIntent pendingIntent) {
            d.c(this.a, pendingIntent);
        }
        
        @Override
        public final ActivityOptionsCompat setLaunchBounds(final Rect rect) {
            return new a(e.b(this.a, rect));
        }
        
        @Override
        public final Bundle toBundle() {
            return this.a.toBundle();
        }
        
        @Override
        public final void update(final ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof a) {
                this.a.update(((a)activityOptionsCompat).a);
            }
        }
    }
    
    public static final class b
    {
        public static ActivityOptions a(final Context context, final int n, final int n2) {
            return ActivityOptions.makeCustomAnimation(context, n, n2);
        }
        
        public static ActivityOptions b(final View view, final int n, final int n2, final int n3, final int n4) {
            return ActivityOptions.makeScaleUpAnimation(view, n, n2, n3, n4);
        }
        
        public static ActivityOptions c(final View view, final Bitmap bitmap, final int n, final int n2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, n, n2);
        }
    }
    
    public static final class c
    {
        public static ActivityOptions a(final Activity activity, final View view, final String s) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, s);
        }
        
        @SafeVarargs
        public static ActivityOptions b(final Activity activity, final Pair<View, String>... array) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, (Pair[])array);
        }
        
        public static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }
    
    public static final class d
    {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
        
        public static ActivityOptions b(final View view, final int n, final int n2, final int n3, final int n4) {
            return ActivityOptions.makeClipRevealAnimation(view, n, n2, n3, n4);
        }
        
        public static void c(final ActivityOptions activityOptions, final PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }
    
    public static final class e
    {
        public static Rect a(final ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }
        
        public static ActivityOptions b(final ActivityOptions activityOptions, final Rect launchBounds) {
            return activityOptions.setLaunchBounds(launchBounds);
        }
    }
}
