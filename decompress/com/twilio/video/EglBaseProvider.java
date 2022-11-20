// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.HashSet;
import tvi.webrtc.EglBase;
import java.util.Set;

class EglBaseProvider
{
    private static final String RELEASE_MESSAGE_TEMPLATE = "EglBaseProvider released %s unavailable";
    private static volatile Set<Object> eglBaseProviderOwners;
    private static volatile EglBaseProvider instance;
    private EglBase rootEglBase;
    
    static {
        EglBaseProvider.eglBaseProviderOwners = new HashSet<Object>();
    }
    
    private EglBaseProvider() {
        this.rootEglBase = EglBase.create();
    }
    
    private void checkReleased(final String s) {
        if (EglBaseProvider.instance != null) {
            return;
        }
        throw new IllegalStateException(String.format("EglBaseProvider released %s unavailable", s));
    }
    
    public static EglBaseProvider instance(final Object o) {
        synchronized (EglBaseProvider.class) {
            if (EglBaseProvider.instance == null) {
                EglBaseProvider.instance = new EglBaseProvider();
            }
            EglBaseProvider.eglBaseProviderOwners.add(o);
            return EglBaseProvider.instance;
        }
    }
    
    public static void waitForNoOwners() {
        while (true) {
            synchronized (EglBaseProvider.class) {
                if (EglBaseProvider.eglBaseProviderOwners.isEmpty()) {
                    return;
                }
                continue;
            }
        }
    }
    
    public EglBase getRootEglBase() {
        synchronized (EglBaseProvider.class) {
            this.checkReleased("getRootEglBase");
            return EglBaseProvider.instance.rootEglBase;
        }
    }
    
    public void release(final Object o) {
        synchronized (EglBaseProvider.class) {
            EglBaseProvider.eglBaseProviderOwners.remove(o);
            if (EglBaseProvider.instance != null && EglBaseProvider.eglBaseProviderOwners.isEmpty()) {
                EglBaseProvider.instance.rootEglBase.release();
                EglBaseProvider.instance.rootEglBase = null;
                EglBaseProvider.instance = null;
            }
        }
    }
}
