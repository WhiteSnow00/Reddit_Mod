// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;
import android.os.Handler;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import X.1nK;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.widget.Button;
import android.view.View;
import android.widget.ListView;
import android.view.Window;
import X.12a;
import android.content.Context;

public final class AlertController
{
    public final Context LIZ;
    public final 12a LIZIZ;
    public final Window LIZJ;
    public final int LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public ListView LJI;
    public View LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public Button LJIILJJIL;
    public CharSequence LJIILL;
    public Message LJIILLIIL;
    public Drawable LJIIZILJ;
    public Button LJIJ;
    public CharSequence LJIJI;
    public Message LJIJJ;
    public Drawable LJIJJLI;
    public Button LJIL;
    public CharSequence LJJ;
    public Message LJJI;
    public Drawable LJJIFFI;
    public 1nK LJJII;
    public int LJJIII;
    public Drawable LJJIIJ;
    public ImageView LJJIIJZLJL;
    public TextView LJJIIZ;
    public TextView LJJIIZI;
    public View LJJIJ;
    public ListAdapter LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public boolean LJJJI;
    public int LJJJIL;
    public Handler LJJJJ;
    public final View$OnClickListener LJJJJI;
    
    static {
        Covode.recordClassIndex(237);
    }
    
    public AlertController(final Context liz, final 12a liziz, final Window lizj) {
        this.LJJIJIIJIL = -1;
        this.LJJJJI = (View$OnClickListener)new View$OnClickListener() {
            static {
                Covode.recordClassIndex(238);
            }
            
            public final void onClick(final View view) {
                Label_0040: {
                    Message message;
                    if (view == AlertController.this.LJIILJJIL && AlertController.this.LJIILLIIL != null) {
                        message = Message.obtain(AlertController.this.LJIILLIIL);
                    }
                    else if (view == AlertController.this.LJIJ && AlertController.this.LJIJJ != null) {
                        message = Message.obtain(AlertController.this.LJIJJ);
                    }
                    else {
                        if (view != AlertController.this.LJIL || AlertController.this.LJJI == null) {
                            break Label_0040;
                        }
                        message = Message.obtain(AlertController.this.LJJI);
                    }
                    if (message != null) {
                        message.sendToTarget();
                    }
                }
                AlertController.this.LJJJJ.obtainMessage(1, (Object)AlertController.this.LIZIZ).sendToTarget();
            }
        };
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LJJJJ = (Handler)new AlertController.b((DialogInterface)liziz);
        final TypedArray obtainStyledAttributes = liz.obtainStyledAttributes((AttributeSet)null, new int[] { 16842994, 2130969187, 2130969189, 2130969917, 2130969918, 2130970681, 2130970978, 2130970996 }, 2130969033, 0);
        this.LJJIJIL = obtainStyledAttributes.getResourceId(0, 0);
        this.LJJIJL = obtainStyledAttributes.getResourceId(2, 0);
        this.LJJIJLIJ = obtainStyledAttributes.getResourceId(4, 0);
        this.LJJIL = obtainStyledAttributes.getResourceId(5, 0);
        this.LJJIZ = obtainStyledAttributes.getResourceId(7, 0);
        this.LJJJ = obtainStyledAttributes.getResourceId(3, 0);
        this.LJJJI = obtainStyledAttributes.getBoolean(6, true);
        this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        liziz.eD_();
    }
    
    public static void LIZ(final View view, final View view2, final View view3) {
        final int n = 0;
        if (view2 != null) {
            int visibility;
            if (view.canScrollVertically(-1)) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            view2.setVisibility(visibility);
        }
        if (view3 != null) {
            int visibility2;
            if (view.canScrollVertically(1)) {
                visibility2 = n;
            }
            else {
                visibility2 = 4;
            }
            view3.setVisibility(visibility2);
        }
    }
    
    public static boolean LIZ(final View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        int i = viewGroup.getChildCount();
        while (i > 0) {
            if (LIZ(viewGroup.getChildAt(--i))) {
                return true;
            }
        }
        return false;
    }
    
    public final ViewGroup LIZ(View inflate, View inflate2) {
        if (inflate == null) {
            inflate = inflate2;
            if (inflate2 instanceof ViewStub) {
                inflate = ((ViewStub)inflate2).inflate();
            }
            return (ViewGroup)inflate;
        }
        if (inflate2 != null) {
            final ViewParent parent = inflate2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(inflate2);
            }
        }
        inflate2 = inflate;
        if (inflate instanceof ViewStub) {
            inflate2 = ((ViewStub)inflate).inflate();
        }
        return (ViewGroup)inflate2;
    }
    
    public final void LIZ(final int ljjiii) {
        this.LJJIIJ = null;
        this.LJJIII = ljjiii;
        final ImageView ljjiijzljl = this.LJJIIJZLJL;
        if (ljjiijzljl != null) {
            if (ljjiii != 0) {
                ljjiijzljl.setVisibility(0);
                this.LJJIIJZLJL.setImageResource(this.LJJIII);
                return;
            }
            ljjiijzljl.setVisibility(8);
        }
    }
    
    public final void LIZ(final int n, final CharSequence ljiill, final DialogInterface$OnClickListener dialogInterface$OnClickListener, Message obtainMessage, final Drawable ljiizilj) {
        if (dialogInterface$OnClickListener != null) {
            obtainMessage = this.LJJJJ.obtainMessage(n, (Object)dialogInterface$OnClickListener);
        }
        if (n == -3) {
            this.LJJ = ljiill;
            this.LJJI = obtainMessage;
            this.LJJIFFI = ljiizilj;
            return;
        }
        if (n == -2) {
            this.LJIJI = ljiill;
            this.LJIJJ = obtainMessage;
            this.LJIJJLI = ljiizilj;
            return;
        }
        if (n == -1) {
            this.LJIILL = ljiill;
            this.LJIILLIIL = obtainMessage;
            this.LJIIZILJ = ljiizilj;
            return;
        }
        throw new IllegalArgumentException("Button does not exist");
    }
    
    public final void LIZ(final Button button) {
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public final void LIZ(final CharSequence charSequence) {
        this.LJ = charSequence;
        final TextView ljjiiz = this.LJJIIZ;
        if (ljjiiz != null) {
            ljjiiz.setText(charSequence);
        }
    }
}
