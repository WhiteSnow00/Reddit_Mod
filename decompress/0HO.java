// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import android.view.GestureDetector$SimpleOnGestureListener;

public final class 0ho extends GestureDetector$SimpleOnGestureListener
{
    public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
    
    static {
        Covode.recordClassIndex(6537);
    }
    
    public 0ho(final LiveEffectNewDialogFragment liz) {
        this.LIZ = liz;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            1K3.LJIIJ.LIZ(this.LIZ.LJIL, true);
            1K3.LJIIIZ = true;
        }
        return super.onDown(motionEvent);
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, float n2) {
        if (motionEvent2 == null) {
            return false;
        }
        if (motionEvent == null) {
            return false;
        }
        n2 = motionEvent2.getX() - motionEvent.getX();
        final boolean b = Math.abs(motionEvent.getRawX() - motionEvent2.getRawX()) > Math.abs(motionEvent.getRawY() - motionEvent2.getRawY());
        if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported() && !GTi.LIZJ() && Math.abs(n2) > 200.0f && Math.abs(n) > 100.0f) {
            final FGP liz = FGP.LIZ();
            int n3;
            if (n2 > 0.0f) {
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            liz.LIZ((Object)new 0hN(n3));
            return true;
        }
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported() && b) {
            1K3.LJIIJ.LIZIZ(null);
            return true;
        }
        return false;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, float n, final float n2) {
        if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            return false;
        }
        if (motionEvent2 == null) {
            return false;
        }
        if (motionEvent == null) {
            return false;
        }
        n = motionEvent.getRawX();
        if (1K3.LIZJ) {
            1K3.LIZLLL = (motionEvent2.getRawX() - n > 0.0f);
            1K3.LJIIJ.LIZ(this.LIZ.LJIL, false);
            1K3.LJIIJ.LIZJ();
        }
        if (1K3.LIZLLL) {
            n = Math.abs(Math.max(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LIZ.LJIIIIZZ);
        }
        else {
            n = 1.0f - Math.abs(Math.min(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LIZ.LJIIIIZZ);
        }
        1K3.LJIIJ.LIZ(n);
        return true;
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        ((DialogFragment)this.LIZ).dismiss();
        return true;
    }
}
