// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import android.graphics.Outline;
import android.view.ViewOutlineProvider;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 0cJ
{
    static {
        Covode.recordClassIndex(5705);
    }
    
    public static void LIZ(final View view, final int n) {
        view.setOutlineProvider((ViewOutlineProvider)new a((float)n, (byte)0));
        view.setClipToOutline(true);
    }
    
    public static void LIZIZ(final View view, final int n) {
        view.setOutlineProvider((ViewOutlineProvider)new b((float)n));
        view.setClipToOutline(true);
    }
    
    public static final class a extends ViewOutlineProvider
    {
        public float LIZ;
        
        static {
            Covode.recordClassIndex(5706);
        }
        
        public a(final float liz) {
            this.LIZ = liz;
        }
        
        public final void getOutline(final View view, final Outline outline) {
            outline.setRoundRect(new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom()), this.LIZ);
        }
    }
    
    public static final class b extends ViewOutlineProvider
    {
        public float LIZ;
        public int LIZIZ;
        
        static {
            Covode.recordClassIndex(5707);
        }
        
        public b(final float liz, final int n) {
            this.LIZIZ = 1;
            this.LIZ = liz;
        }
        
        public final void getOutline(final View view, final Outline outline) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int n = view.getWidth() - view.getPaddingRight();
            int n2 = view.getHeight() - view.getPaddingBottom();
            final int liziz = this.LIZIZ;
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        if (liziz == 4) {
                            n += (int)this.LIZ;
                        }
                    }
                    else {
                        paddingLeft -= (int)this.LIZ;
                    }
                }
                else {
                    paddingTop -= (int)this.LIZ;
                }
            }
            else {
                n2 += (int)this.LIZ;
            }
            outline.setRoundRect(new Rect(paddingLeft, paddingTop, n, n2), this.LIZ);
        }
    }
}
