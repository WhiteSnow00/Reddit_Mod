// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android;

import android.content.Context;
import X.Flv;
import X.0VW;
import java.util.LinkedHashMap;
import java.util.Map;
import X.CTM;
import androidx.fragment.app.Fragment;
import X.GCK;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.feed.api.ILiveFeedApiService;

public class FeedServiceDummy implements ILiveFeedApiService
{
    static {
        Covode.recordClassIndex(4423);
    }
    
    @Override
    public Fragment createDrawerFeedFragment(final GCK gck) {
        return null;
    }
    
    @Override
    public Fragment createDrawerFeedFragmentV2(final GCK gck, final String s) {
        CTM.LIZ((Object)s);
        return null;
    }
    
    @Override
    public void delayInit() {
    }
    
    @Override
    public Map<String, Object> getFeedTab(final long n) {
        return new LinkedHashMap<String, Object>();
    }
    
    @Override
    public Map<String, Object> getFeedTabForyouPage(final long n) {
        return new LinkedHashMap<String, Object>();
    }
    
    @Override
    public 0VW getMinimizeManager() {
        return null;
    }
    
    @Override
    public Flv getStartLiveRoomInterceptor() {
        return null;
    }
    
    public String getTopLiveTitle(final Context context) {
        return "";
    }
    
    @Override
    public void init() {
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void recordNeedRetryTabApi() {
    }
    
    @Override
    public void requestTabInNetWorkState() {
    }
    
    @Override
    public void requestTabListForyouPage() {
    }
}
