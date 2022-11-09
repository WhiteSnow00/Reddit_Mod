// 
// Decompiled by Procyon v0.6.0
// 

package b80;

import com.reddit.ui.onboarding.topic.TopicsView;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.reddit.ui.button.RedditButton;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

public final class a implements x5.a
{
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    
    public a(final LinearLayout b, final ImageView c, final TextView d, final TextView e, final RedditButton f) {
        this.a = 4;
        this.b = (View)b;
        this.c = (View)c;
        this.d = (View)d;
        this.e = (View)e;
        this.f = (View)f;
    }
    
    public a(final LinearLayout b, final TextView d, final TextView e, final LinearLayout c, final TextView f) {
        this.a = 0;
        this.b = (View)b;
        this.d = (View)d;
        this.e = (View)e;
        this.c = (View)c;
        this.f = (View)f;
    }
    
    public a(final ConstraintLayout b, final ImageView c, final Button e, final TextView d, final TopicsView f) {
        this.a = 5;
        this.b = (View)b;
        this.c = (View)c;
        this.e = (View)e;
        this.d = (View)d;
        this.f = (View)f;
    }
    
    public static a a(final View view) {
        int n = 2131428909;
        final ImageView imageView = (ImageView)at1.a.m0(2131428909, view);
        if (imageView != null) {
            n = 2131428912;
            final TextView textView = (TextView)at1.a.m0(2131428912, view);
            if (textView != null) {
                n = 2131428915;
                final TextView textView2 = (TextView)at1.a.m0(2131428915, view);
                if (textView2 != null) {
                    n = 2131430993;
                    final RedditButton redditButton = (RedditButton)at1.a.m0(2131430993, view);
                    if (redditButton != null) {
                        return new a((LinearLayout)view, imageView, textView, textView2, redditButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public final LinearLayout b() {
        switch (this.a) {
            default: {
                return (LinearLayout)this.b;
            }
            case 1: {
                return (LinearLayout)this.b;
            }
            case 0: {
                return (LinearLayout)this.b;
            }
        }
    }
    
    public final ConstraintLayout c() {
        switch (this.a) {
            default: {
                return (ConstraintLayout)this.b;
            }
            case 5: {
                return (ConstraintLayout)this.b;
            }
            case 2: {
                return (ConstraintLayout)this.b;
            }
        }
    }
    
    @Override
    public final View getRoot() {
        switch (this.a) {
            default: {
                return (View)this.c();
            }
            case 5: {
                return (View)this.c();
            }
            case 4: {
                return (View)this.b();
            }
            case 3: {
                return this.b;
            }
            case 2: {
                return (View)this.c();
            }
            case 1: {
                return (View)this.b();
            }
            case 0: {
                return (View)this.b();
            }
        }
    }
}
