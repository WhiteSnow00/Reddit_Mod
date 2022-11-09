// 
// Decompiled by Procyon v0.6.0
// 

package x3;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import np0.a;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import android.view.WindowInsets;
import android.graphics.Rect;
import android.view.WindowInsets$Builder;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import android.view.View;
import android.view.ViewGroup$OnHierarchyChangeListener;
import ah2.f;
import android.os.Build$VERSION;
import android.app.Activity;

public final class c
{
    public final b a;
    
    public c(final Activity activity) {
        Object a;
        if (Build$VERSION.SDK_INT >= 31) {
            a = new a(activity);
        }
        else {
            a = new b(activity);
        }
        this.a = (b)a;
    }
    
    public static final class a extends b
    {
        public d c;
        public final c$a$a d;
        
        public a(final Activity activity) {
            f.f((Object)activity, "activity");
            super(activity);
            this.d = new ViewGroup$OnHierarchyChangeListener() {
                public final /* synthetic */ a f;
                
                public final void onChildViewAdded(final View view, final View view2) {
                    if (view2 instanceof SplashScreenView) {
                        final a f = this.f;
                        final SplashScreenView splashScreenView = (SplashScreenView)view2;
                        f.getClass();
                        a.d(splashScreenView);
                        ((ViewGroup)activity.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)null);
                    }
                }
                
                public final void onChildViewRemoved(final View view, final View view2) {
                }
            };
        }
        
        public static void d(final SplashScreenView splashScreenView) {
            f.f((Object)splashScreenView, "child");
            final WindowInsets build = new WindowInsets$Builder().build();
            f.e((Object)build, "Builder().build()");
            final Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (build == splashScreenView.getRootView().computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
        }
        
        @Override
        public final void a() {
            final Resources$Theme theme = ((Context)super.a).getTheme();
            f.e((Object)theme, "activity.theme");
            ((b)this).c(theme, new TypedValue());
            ((ViewGroup)super.a.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)this.d);
        }
        
        @Override
        public final void b(final np0.a b) {
            super.b = (c)b;
            final View viewById = super.a.findViewById(16908290);
            final ViewTreeObserver viewTreeObserver = viewById.getViewTreeObserver();
            if (this.c != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.c);
            }
            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)(this.c = new d(this, viewById)));
        }
    }
    
    public static class b
    {
        public final Activity a;
        public c b;
        
        public b(final Activity a) {
            f.f((Object)a, "activity");
            this.a = a;
            this.b = new x3.a();
        }
        
        public void a() {
            final TypedValue typedValue = new TypedValue();
            final Resources$Theme theme = ((Context)this.a).getTheme();
            theme.resolveAttribute(2130970083, typedValue, true);
            if (theme.resolveAttribute(2130970081, typedValue, true)) {
                theme.getDrawable(typedValue.resourceId);
            }
            theme.resolveAttribute(2130969814, typedValue, true);
            this.c(theme, typedValue);
        }
        
        public void b(final np0.a b) {
            this.b = (c)b;
            final View viewById = this.a.findViewById(16908290);
            viewById.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new x3.b(this, viewById));
        }
        
        public final void c(final Resources$Theme resources$Theme, final TypedValue typedValue) {
            if (resources$Theme.resolveAttribute(2130969485, typedValue, true)) {
                final int resourceId = typedValue.resourceId;
                if (resourceId != 0) {
                    this.a.setTheme(resourceId);
                }
            }
        }
    }
    
    public interface c
    {
        boolean a();
    }
}
