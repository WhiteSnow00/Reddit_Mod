// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.GestureDetector;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import android.view.VelocityTracker;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import android.view.View$OnTouchListener;

public final class 0hp implements View$OnTouchListener
{
    public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
    
    static {
        Covode.recordClassIndex(6538);
    }
    
    public 0hp(final LiveEffectNewDialogFragment liz) {
        this.LIZ = liz;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (this.LIZ.LJII == null) {
            this.LIZ.LJII = VelocityTracker.obtain();
        }
        final VelocityTracker ljii = this.LIZ.LJII;
        if (ljii != null) {
            ljii.addMovement(motionEvent);
        }
        Label_0157: {
            if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported() || 1K3.LIZJ) {
                break Label_0157;
            }
            n.LIZIZ((Object)motionEvent, "");
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                break Label_0157;
            }
            final VelocityTracker ljii2 = this.LIZ.LJII;
            if (ljii2 != null) {
                ljii2.computeCurrentVelocity(1000);
            }
            final VelocityTracker ljii3 = this.LIZ.LJII;
            float xVelocity;
            if (ljii3 != null) {
                xVelocity = ljii3.getXVelocity();
            }
            else {
                xVelocity = 0.0f;
            }
            if (Math.abs(xVelocity) > 100.0f) {
                final GestureDetector lji = this.LIZ.LJI;
                if (lji != null) {
                    lji.onTouchEvent(motionEvent);
                }
            }
            else {
                1K3.LJIIJ.LIZ(null);
            }
            return true;
        }
        final GestureDetector lji2 = this.LIZ.LJI;
        if (lji2 != null) {
            lji2.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }
}
