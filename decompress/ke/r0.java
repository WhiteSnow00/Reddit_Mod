// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import zd.a;
import java.util.Map;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;

public interface r0 extends IInterface
{
    void beginAdUnitExposure(final String p0, final long p1) throws RemoteException;
    
    void clearConditionalUserProperty(final String p0, final String p1, final Bundle p2) throws RemoteException;
    
    void clearMeasurementEnabled(final long p0) throws RemoteException;
    
    void endAdUnitExposure(final String p0, final long p1) throws RemoteException;
    
    void generateEventId(final u0 p0) throws RemoteException;
    
    void getAppInstanceId(final u0 p0) throws RemoteException;
    
    void getCachedAppInstanceId(final u0 p0) throws RemoteException;
    
    void getConditionalUserProperties(final String p0, final String p1, final u0 p2) throws RemoteException;
    
    void getCurrentScreenClass(final u0 p0) throws RemoteException;
    
    void getCurrentScreenName(final u0 p0) throws RemoteException;
    
    void getGmpAppId(final u0 p0) throws RemoteException;
    
    void getMaxUserProperties(final String p0, final u0 p1) throws RemoteException;
    
    void getTestFlag(final u0 p0, final int p1) throws RemoteException;
    
    void getUserProperties(final String p0, final String p1, final boolean p2, final u0 p3) throws RemoteException;
    
    void initForTests(final Map p0) throws RemoteException;
    
    void initialize(final a p0, final a1 p1, final long p2) throws RemoteException;
    
    void isDataCollectionEnabled(final u0 p0) throws RemoteException;
    
    void logEvent(final String p0, final String p1, final Bundle p2, final boolean p3, final boolean p4, final long p5) throws RemoteException;
    
    void logEventAndBundle(final String p0, final String p1, final Bundle p2, final u0 p3, final long p4) throws RemoteException;
    
    void logHealthData(final int p0, final String p1, final a p2, final a p3, final a p4) throws RemoteException;
    
    void onActivityCreated(final a p0, final Bundle p1, final long p2) throws RemoteException;
    
    void onActivityDestroyed(final a p0, final long p1) throws RemoteException;
    
    void onActivityPaused(final a p0, final long p1) throws RemoteException;
    
    void onActivityResumed(final a p0, final long p1) throws RemoteException;
    
    void onActivitySaveInstanceState(final a p0, final u0 p1, final long p2) throws RemoteException;
    
    void onActivityStarted(final a p0, final long p1) throws RemoteException;
    
    void onActivityStopped(final a p0, final long p1) throws RemoteException;
    
    void performAction(final Bundle p0, final u0 p1, final long p2) throws RemoteException;
    
    void registerOnMeasurementEventListener(final x0 p0) throws RemoteException;
    
    void resetAnalyticsData(final long p0) throws RemoteException;
    
    void setConditionalUserProperty(final Bundle p0, final long p1) throws RemoteException;
    
    void setConsent(final Bundle p0, final long p1) throws RemoteException;
    
    void setConsentThirdParty(final Bundle p0, final long p1) throws RemoteException;
    
    void setCurrentScreen(final a p0, final String p1, final String p2, final long p3) throws RemoteException;
    
    void setDataCollectionEnabled(final boolean p0) throws RemoteException;
    
    void setDefaultEventParameters(final Bundle p0) throws RemoteException;
    
    void setEventInterceptor(final x0 p0) throws RemoteException;
    
    void setInstanceIdProvider(final z0 p0) throws RemoteException;
    
    void setMeasurementEnabled(final boolean p0, final long p1) throws RemoteException;
    
    void setMinimumSessionDuration(final long p0) throws RemoteException;
    
    void setSessionTimeoutDuration(final long p0) throws RemoteException;
    
    void setUserId(final String p0, final long p1) throws RemoteException;
    
    void setUserProperty(final String p0, final String p1, final a p2, final boolean p3, final long p4) throws RemoteException;
    
    void unregisterOnMeasurementEventListener(final x0 p0) throws RemoteException;
}
