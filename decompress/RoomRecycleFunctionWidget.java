// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.performance.widget;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import X.6mZ;

public abstract class RoomRecycleFunctionWidget extends PerformProcessWidget implements 6mZ
{
    public boolean LIZJ;
    
    static {
        Covode.recordClassIndex(10504);
    }
    
    public RoomRecycleFunctionWidget() {
        ((Widget)this).register((Object)Room.class);
    }
    
    public void LIZ(final Room room) {
    }
    
    public <T> void onCustomInfoCallBack(final T t) {
        if (t instanceof Room) {
            this.LIZ((Room)t);
        }
        super.onCustomInfoCallBack((Object)t);
    }
    
    @Override
    public void onLoad(final Object[] array) {
        super.onLoad(array);
        if (!this.LIZJ && LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(((LiveWidget)this).dataChannel)) {
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            final View view = ((Widget)this).getView();
            if (view != null) {
                view.startAnimation((Animation)alphaAnimation);
            }
            this.LIZJ = true;
        }
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    @Override
    public void onUnload() {
        super.onUnload();
        this.LIZJ = false;
    }
}
