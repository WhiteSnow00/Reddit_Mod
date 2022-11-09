// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import X.Gtu;
import X.0b1;
import X.0b0;
import X.0az;
import androidx.fragment.app.Fragment;
import X.0b2;
import X.Hi2;
import android.os.Bundle;
import X.How;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import X.HgG;
import android.net.Uri;
import android.content.Context;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IBrowserService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5577);
    }
    
    void configWebDialogHelper(final BaseFragment p0, final DataChannel p1, final boolean p2, final 0CH p3);
    
    HgG createCardView(final Context p0, final Uri p1, final String p2);
    
    How createHybridDialog(final PopupConfig p0);
    
    Hi2 createLiveBrowserFragment(final Bundle p0);
    
    0b2 createLynxDialogBuilder(final String p0, final String p1);
    
    Fragment createLynxFragment(final Context p0, final Bundle p1);
    
    0az getHybridContainerManager();
    
    0b0 getHybridDialogManager();
    
    0b1 getHybridPageManager();
    
    String getWebDialogTag();
    
    void openHybridDialog(final Context p0, final PopupConfig p1);
    
    void setUserSilent(final boolean p0);
    
    Gtu webViewManager();
    
     <T> void xClearStorageItem(final Context p0, final String p1);
    
     <T> T xGetStorageItem(final Context p0, final String p1);
    
     <T> void xSetStorageItem(final Context p0, final String p1, final T p2);
}
