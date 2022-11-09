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
import X.0AB;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IAdminSettingService extends 0Vq
{
    default static {
        Covode.recordClassIndex(4830);
    }
    
    void checkFastAddBlockKeywordsDialog(final long p0, final String p1, final 0AB p2, final String p3);
    
    LiveDialogFragment getAdminSettingDialog(final boolean p0);
    
    Fragment getLiveCommentBlockKeywordsFragment();
    
    Fragment getLiveCommentSettingFragment(final SRS<? super Boolean, 2P9> p0, final String p1);
    
    Fragment getLiveFilterCommentSettingFragment(final String p0);
    
    DialogFragment getMuteConfirmDialog(final SRS<? super 0aC, 2P9> p0);
    
    Fragment getMuteDurationSettingFragment(final View$OnClickListener p0, final SRS<? super 0aC, 2P9> p1);
    
    void reportDefaultMuteDurationChange(final String p0, final 0aC p1, final String p2, final long p3, final Long p4);
    
    void showLiveFilterCommentApproveDialog(final 0AB p0, final ChatMessage p1, final QgG<2P9> p2);
}
