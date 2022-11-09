// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.gift;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IGiftReminderService extends 0Vq
{
    default static {
        Covode.recordClassIndex(6885);
    }
    
    boolean getABTestState();
    
    int getABTestStateV2();
    
    LiveDialogFragment getLiveGiftReminderDialog();
    
    Fragment getLiveGiftReminderFragment(final int p0);
    
    boolean getNotificationState();
    
    void initGiftReminder();
    
    void setGiftLimitNotifyShowFrom();
    
    void setNotificationState(final int p0);
}
