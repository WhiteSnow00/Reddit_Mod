// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import X.CTM;
import X.Gtu;
import X.Hoi;
import java.util.ArrayList;
import java.util.List;
import X.0b1;
import X.0b0;
import X.0az;
import androidx.fragment.app.Fragment;
import X.Hq5;
import X.Hs9;
import android.app.Activity;
import X.Hi2;
import android.os.Bundle;
import X.How;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import X.0b2;
import X.HgG;
import android.net.Uri;
import android.content.Context;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.covode.number.Covode;

public class BrowserServiceDummy implements IBrowserService
{
    static {
        Covode.recordClassIndex(5573);
    }
    
    @Override
    public void configWebDialogHelper(final BaseFragment baseFragment, final DataChannel dataChannel, final boolean b, final 0CH 0ch) {
    }
    
    @Override
    public HgG createCardView(final Context context, final Uri uri, final String s) {
        return null;
    }
    
    public 0b2 createH5DialogBuilder(final String s) {
        return null;
    }
    
    @Override
    public How createHybridDialog(final PopupConfig popupConfig) {
        return null;
    }
    
    @Override
    public Hi2 createLiveBrowserFragment(final Bundle bundle) {
        return null;
    }
    
    public Hq5 createLynxComponent(final Activity activity, final int n, final Hs9 hs9) {
        return null;
    }
    
    @Override
    public 0b2 createLynxDialogBuilder(final String s, final String s2) {
        return null;
    }
    
    @Override
    public Fragment createLynxFragment(final Context context, final Bundle bundle) {
        return null;
    }
    
    @Override
    public 0az getHybridContainerManager() {
        return null;
    }
    
    @Override
    public 0b0 getHybridDialogManager() {
        return null;
    }
    
    @Override
    public 0b1 getHybridPageManager() {
        return null;
    }
    
    public List<String> getSafeHost() {
        return new ArrayList<String>();
    }
    
    @Override
    public String getWebDialogTag() {
        return "";
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void openHybridDialog(final Context context, final PopupConfig popupConfig) {
    }
    
    public void removeNotifyBoxOpenedCallbacks() {
    }
    
    public void setNotifyBoxOpenedCallback(final Hoi hoi) {
    }
    
    @Override
    public void setUserSilent(final boolean b) {
    }
    
    @Override
    public Gtu webViewManager() {
        return null;
    }
    
    @Override
    public <T> void xClearStorageItem(final Context context, final String s) {
    }
    
    @Override
    public <T> T xGetStorageItem(final Context context, final String s) {
        return null;
    }
    
    @Override
    public <T> void xSetStorageItem(final Context context, final String s, final T t) {
        CTM.LIZ((Object)context);
    }
}
