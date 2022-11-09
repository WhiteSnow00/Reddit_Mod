// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.message;

import android.text.TextUtils;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public class ResourceMonitor implements MessageInterceptor
{
    public Listener mListener;
    
    static {
        Covode.recordClassIndex(2838);
    }
    
    @Override
    public void destroy() {
        this.mListener = null;
    }
    
    @Override
    public boolean intercept(final Message message) {
        if (17 != message.what) {
            return false;
        }
        final String s = (String)message.obj;
        if (TextUtils.isEmpty((CharSequence)s)) {
            return true;
        }
        final int arg1 = message.arg1;
        if (arg1 != 3) {
            if (arg1 == 4) {
                final Listener mListener = this.mListener;
                if (mListener != null) {
                    mListener.onResourceLoadFinish(s, false);
                }
            }
        }
        else {
            final Listener mListener2 = this.mListener;
            if (mListener2 != null) {
                mListener2.onResourceLoadFinish(s, true);
            }
        }
        return true;
    }
    
    public void reset() {
    }
    
    public void setListener(final Listener mListener) {
        this.mListener = mListener;
    }
    
    public interface Listener
    {
        default static {
            Covode.recordClassIndex(2839);
        }
        
        void onResourceLoadFinish(final String p0, final boolean p1);
    }
}
