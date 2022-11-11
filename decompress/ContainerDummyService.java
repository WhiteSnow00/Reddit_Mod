// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.browser;

import android.webkit.WebView;
import X.HqE;
import androidx.fragment.app.Fragment;
import X.CTM;
import X.Hoh;
import android.net.Uri;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class ContainerDummyService implements IContainerService
{
    static {
        Covode.recordClassIndex(5574);
    }
    
    public Hoh createHybridView(final Context context, final Uri uri) {
        CTM.LIZ((Object)uri);
        return null;
    }
    
    @Override
    public Fragment createPageFragment(final Uri uri, final Context context) {
        CTM.LIZ((Object)uri);
        return null;
    }
    
    @Override
    public HqE<?> getLynxCustomReport() {
        return null;
    }
    
    @Override
    public HqE<WebView> getWebViewCustomReport() {
        return null;
    }
    
    @Override
    public boolean handleScheme(final Uri uri, final Context context) {
        return false;
    }
    
    @Override
    public boolean isContainerScheme(final Uri uri) {
        return false;
    }
    
    @Override
    public void onInit() {
    }
}
