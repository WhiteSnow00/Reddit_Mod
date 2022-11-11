// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;

public class GPUProcessor
{
    public static Listener sListener;
    
    static {
        Covode.recordClassIndex(2795);
    }
    
    public static void destroy() {
        MessageCenter.destroy();
        GPUProcessor.sListener = null;
    }
    
    public static void init() {
        MessageCenter.init();
        MessageCenter.setListener((MessageCenter.Listener)new MessageCenter.Listener() {
            static {
                Covode.recordClassIndex(2796);
            }
            
            @Override
            public final void onMessageReceived(final int n, final int n2, final int n3, final String s) {
                if (GPUProcessor.sListener != null) {
                    GPUProcessor.sListener.onMessageReceived(n, n2, n3, s);
                }
            }
        });
    }
    
    public static void setListener(final Listener sListener) {
        GPUProcessor.sListener = sListener;
    }
    
    public interface Listener
    {
        default static {
            Covode.recordClassIndex(2797);
        }
        
        void onMessageReceived(final int p0, final int p1, final int p2, final String p3);
    }
}
