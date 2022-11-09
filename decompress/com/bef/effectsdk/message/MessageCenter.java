// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.message;

import android.os.Looper;
import android.os.Message;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

public class MessageCenter
{
    public static final List<Listener> sListeners;
    public static HandlerThread sMessageCenterThread;
    public static final Object sMessageCenterThreadLock;
    public static Handler sMessageHandler;
    
    static {
        Covode.recordClassIndex(2833);
        sMessageCenterThreadLock = new Object();
        sListeners = new ArrayList<Listener>();
    }
    
    public static void addListener(final Listener listener) {
        MethodCollector.i(3016);
        final List<Listener> sListeners = MessageCenter.sListeners;
        monitorenter(sListeners);
        try {
            if (sListeners.isEmpty()) {
                init();
            }
            sListeners.add(listener);
        }
        finally {
            monitorexit(sListeners);
            MethodCollector.o(3016);
        }
    }
    
    public static void destroy() {
        MethodCollector.i(3053);
        final List<Listener> sListeners = MessageCenter.sListeners;
        monitorenter(sListeners);
        try {
            if (!sListeners.isEmpty()) {
                return;
            }
            final Object sMessageCenterThreadLock = MessageCenter.sMessageCenterThreadLock;
            monitorenter(sMessageCenterThreadLock);
            try {
                final Handler sMessageHandler = MessageCenter.sMessageHandler;
                if (sMessageHandler != null) {
                    sMessageHandler.removeCallbacksAndMessages((Object)null);
                    MessageCenter.sMessageHandler = null;
                }
                final HandlerThread sMessageCenterThread = MessageCenter.sMessageCenterThread;
                if (sMessageCenterThread != null) {
                    sMessageCenterThread.quit();
                    MessageCenter.sMessageCenterThread = null;
                }
                monitorexit(sMessageCenterThreadLock);
                sListeners.clear();
            }
            finally {
                monitorexit(sMessageCenterThreadLock);
                MethodCollector.o(3053);
            }
        }
        finally {
            monitorexit(sListeners);
            MethodCollector.o(3053);
        }
    }
    
    public static void handleMessage(final Message message) {
        MethodCollector.i(3236);
        final List<Listener> sListeners = MessageCenter.sListeners;
        monitorenter(sListeners);
        try {
            final int size = sListeners.size();
            final Listener[] array = new Listener[size];
            sListeners.toArray(array);
            monitorexit(sListeners);
            if (size <= 0) {
                MethodCollector.o(3236);
                return;
            }
            int n = 0;
            do {
                array[n].onMessageReceived(message.what, message.arg1, message.arg2, (String)message.obj);
            } while (++n < size);
            MethodCollector.o(3236);
        }
        finally {
            monitorexit(sListeners);
            MethodCollector.o(3236);
        }
    }
    
    public static void init() {
        MethodCollector.i(3046);
        final Object sMessageCenterThreadLock = MessageCenter.sMessageCenterThreadLock;
        monitorenter(sMessageCenterThreadLock);
        try {
            final HandlerThread sMessageCenterThread = MessageCenter.sMessageCenterThread;
            if (sMessageCenterThread == null || !sMessageCenterThread.isAlive() || MessageCenter.sMessageCenterThread.getLooper() == null) {
                (MessageCenter.sMessageCenterThread = new HandlerThread("MessageCenter")).start();
                MessageCenter.sMessageHandler = new MessageHandler(MessageCenter.sMessageCenterThread.getLooper());
            }
        }
        finally {
            monitorexit(sMessageCenterThreadLock);
            MethodCollector.o(3046);
        }
    }
    
    public static void postMessage(final int n, final int n2, final int n3, final String s) {
        MethodCollector.i(3057);
        final Object sMessageCenterThreadLock = MessageCenter.sMessageCenterThreadLock;
        monitorenter(sMessageCenterThreadLock);
        try {
            final Handler sMessageHandler = MessageCenter.sMessageHandler;
            if (sMessageHandler == null) {
                return;
            }
            Message.obtain(sMessageHandler, n, n2, n3, (Object)s).sendToTarget();
        }
        finally {
            monitorexit(sMessageCenterThreadLock);
            MethodCollector.o(3057);
        }
    }
    
    public static void removeAllListener() {
        MethodCollector.i(3039);
        final List<Listener> sListeners = MessageCenter.sListeners;
        monitorenter(sListeners);
        try {
            sListeners.clear();
            destroy();
        }
        finally {
            monitorexit(sListeners);
            MethodCollector.o(3039);
        }
    }
    
    public static void removeListener(final Listener listener) {
        MethodCollector.i(3029);
        final List<Listener> sListeners = MessageCenter.sListeners;
        monitorenter(sListeners);
        try {
            sListeners.remove(listener);
            if (sListeners.isEmpty()) {
                destroy();
            }
        }
        finally {
            monitorexit(sListeners);
            MethodCollector.o(3029);
        }
    }
    
    public static void setListener(final Listener listener) {
        MethodCollector.i(3010);
        final List<Listener> sListeners = MessageCenter.sListeners;
        monitorenter(sListeners);
        try {
            addListener(listener);
        }
        finally {
            monitorexit(sListeners);
            MethodCollector.o(3010);
        }
    }
    
    public interface Listener
    {
        default static {
            Covode.recordClassIndex(2834);
        }
        
        void onMessageReceived(final int p0, final int p1, final int p2, final String p3);
    }
    
    public static class MessageHandler extends Handler
    {
        static {
            Covode.recordClassIndex(2835);
        }
        
        public MessageHandler(final Looper looper) {
            super(looper);
        }
        
        public void handleMessage(final Message message) {
            MessageCenter.handleMessage(message);
        }
    }
}
