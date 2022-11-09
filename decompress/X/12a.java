// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Bundle;
import android.view.Window$Callback;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.KeyEvent;
import android.util.TypedValue;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.app.Dialog;

public class 12a extends Dialog implements 026
{
    public 027 LIZ;
    public final 07z.a LIZIZ;
    
    static {
        Covode.recordClassIndex(285);
    }
    
    public 12a(final Context context) {
        this(context, 0);
    }
    
    public 12a(final Context context, final int n) {
        super(context, LIZ(context, n));
        this.LIZIZ = new 12Z(this);
        final 027 liziz = this.LIZIZ();
        liziz.LIZ(LIZ(context, n));
        liziz.LIZJ();
    }
    
    public static int LIZ(final Context context, final int n) {
        int resourceId = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130969456, typedValue, true);
            resourceId = typedValue.resourceId;
        }
        return resourceId;
    }
    
    private 027 LIZIZ() {
        if (this.LIZ == null) {
            this.LIZ = 027.LIZ(this, this);
        }
        return this.LIZ;
    }
    
    public final boolean LIZ(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.LIZIZ().LIZIZ(view, viewGroup$LayoutParams);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return 07z.LIZ(this.LIZIZ, this.getWindow().getDecorView(), (Window$Callback)this, keyEvent);
    }
    
    public final boolean eD_() {
        return this.LIZIZ().LIZLLL(1);
    }
    
    public <T extends View> T findViewById(final int n) {
        return this.LIZIZ().LIZIZ(n);
    }
    
    public void invalidateOptionsMenu() {
        this.LIZIZ().LJIIIIZZ();
    }
    
    public void onCreate(final Bundle bundle) {
        this.LIZIZ().LJIIJJI();
        super.onCreate(bundle);
        this.LIZIZ().LIZJ();
    }
    
    public void onStop() {
        super.onStop();
        this.LIZIZ().LJFF();
    }
    
    public void onSupportActionModeFinished(final 02T 02T) {
    }
    
    public void onSupportActionModeStarted(final 02T 02T) {
    }
    
    public 02T onWindowStartingSupportActionMode(final 02T.a a) {
        return null;
    }
    
    public void setContentView(final int n) {
        this.LIZIZ().LIZJ(n);
    }
    
    public void setContentView(final View view) {
        this.LIZIZ().LIZ(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.LIZIZ().LIZ(view, viewGroup$LayoutParams);
    }
    
    public void setTitle(final int title) {
        super.setTitle(title);
        this.LIZIZ().LIZ(this.getContext().getString(title));
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.LIZIZ().LIZ(title);
    }
}
