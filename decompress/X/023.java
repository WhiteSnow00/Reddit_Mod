// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.view.KeyEvent;
import android.content.res.Configuration;
import com.bytedance.covode.number.Covode;

public abstract class 023
{
    static {
        Covode.recordClassIndex(255);
    }
    
    public 02T LIZ(final 02T.a a) {
        return null;
    }
    
    public abstract void LIZ();
    
    public void LIZ(final float n) {
        if (n == 0.0f) {
            return;
        }
        throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
    }
    
    public void LIZ(final int n) {
    }
    
    public void LIZ(final Configuration configuration) {
    }
    
    public void LIZ(final CharSequence charSequence) {
    }
    
    public abstract void LIZ(final boolean p0);
    
    public boolean LIZ(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public boolean LIZ(final KeyEvent keyEvent) {
        return false;
    }
    
    public abstract int LIZIZ();
    
    public void LIZIZ(final boolean b) {
    }
    
    public abstract void LIZJ();
    
    public void LIZJ(final boolean b) {
    }
    
    public Context LIZLLL() {
        return null;
    }
    
    public void LIZLLL(final boolean b) {
    }
    
    public void LJ() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }
    
    public boolean LJFF() {
        return false;
    }
    
    public boolean LJI() {
        return false;
    }
    
    public boolean LJII() {
        return false;
    }
    
    public boolean LJIIIIZZ() {
        return false;
    }
    
    public void LJIIIZ() {
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        public int LIZ;
        
        static {
            Covode.recordClassIndex(256);
        }
        
        public a() {
            super(-2, -2);
            this.LIZ = 8388627;
        }
        
        public a(final a a) {
            super((ViewGroup$MarginLayoutParams)a);
            this.LIZ = a.LIZ;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842931 });
            this.LIZ = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
