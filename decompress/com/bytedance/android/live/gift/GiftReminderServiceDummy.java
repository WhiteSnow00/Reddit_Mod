// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.gift;

import com.bytedance.android.livesdk.LiveDialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public class GiftReminderServiceDummy implements IGiftReminderService
{
    static {
        Covode.recordClassIndex(6883);
    }
    
    @Override
    public boolean getABTestState() {
        return false;
    }
    
    @Override
    public int getABTestStateV2() {
        return 0;
    }
    
    public Fragment getLiveGiftReminderAmountFragment() {
        return null;
    }
    
    @Override
    public LiveDialogFragment getLiveGiftReminderDialog() {
        return null;
    }
    
    @Override
    public Fragment getLiveGiftReminderFragment(final int n) {
        return null;
    }
    
    @Override
    public boolean getNotificationState() {
        return false;
    }
    
    @Override
    public void initGiftReminder() {
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void setGiftLimitNotifyShowFrom() {
    }
    
    @Override
    public void setNotificationState(final int n) {
    }
}
