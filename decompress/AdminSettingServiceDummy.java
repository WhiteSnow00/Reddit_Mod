// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.adminsetting;

import X.QgG;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import android.view.View$OnClickListener;
import androidx.fragment.app.DialogFragment;
import X.0aC;
import X.2P9;
import X.SRS;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import X.CTM;
import X.0AB;
import com.bytedance.covode.number.Covode;

public class AdminSettingServiceDummy implements IAdminSettingService
{
    static {
        Covode.recordClassIndex(4828);
    }
    
    @Override
    public void checkFastAddBlockKeywordsDialog(final long n, final String s, final 0AB 0ab, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
    }
    
    @Override
    public LiveDialogFragment getAdminSettingDialog(final boolean b) {
        return null;
    }
    
    @Override
    public Fragment getLiveCommentBlockKeywordsFragment() {
        return null;
    }
    
    @Override
    public Fragment getLiveCommentSettingFragment(final SRS<? super Boolean, 2P9> srs, final String s) {
        CTM.LIZ((Object)srs, (Object)s);
        return null;
    }
    
    @Override
    public Fragment getLiveFilterCommentSettingFragment(final String s) {
        CTM.LIZ((Object)s);
        return null;
    }
    
    @Override
    public DialogFragment getMuteConfirmDialog(final SRS<? super 0aC, 2P9> srs) {
        CTM.LIZ((Object)srs);
        return null;
    }
    
    @Override
    public Fragment getMuteDurationSettingFragment(final View$OnClickListener view$OnClickListener, final SRS<? super 0aC, 2P9> srs) {
        CTM.LIZ((Object)view$OnClickListener, (Object)srs);
        return null;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void reportDefaultMuteDurationChange(final String s, final 0aC 0aC, final String s2, final long n, final Long n2) {
        CTM.LIZ((Object)s, (Object)0aC, (Object)s2);
    }
    
    @Override
    public void showLiveFilterCommentApproveDialog(final 0AB 0ab, final ChatMessage chatMessage, final QgG<2P9> qgG) {
        CTM.LIZ((Object)chatMessage, (Object)qgG);
    }
}
