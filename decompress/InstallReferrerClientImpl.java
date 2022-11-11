// 
// Decompiled by Procyon v0.6.0
// 

package com.android.installreferrer.api;

import java.util.List;
import X.KiO;
import android.content.pm.ResolveInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.RemoteException;
import android.os.Bundle;
import com.android.installreferrer.commons.InstallReferrerCommons;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import X.6Tl;
import X.NQO;
import X.5WL;
import com.bytedance.covode.number.Covode;
import android.content.ServiceConnection;
import android.content.Context;
import X.6sv;

public final class InstallReferrerClientImpl extends InstallReferrerClient
{
    public int LIZ;
    public 6sv LIZIZ;
    public final Context LIZJ;
    public ServiceConnection LIZLLL;
    
    static {
        Covode.recordClassIndex(2532);
    }
    
    public InstallReferrerClientImpl(Context lizj) {
        lizj = ((Context)lizj).getApplicationContext();
        if (5WL.LIZIZ) {
            if (lizj == null) {
                lizj = 5WL.LIZ;
            }
        }
        this.LIZJ = (Context)lizj;
    }
    
    private boolean LIZ() {
        final PackageManager packageManager = this.LIZJ.getPackageManager();
        try {
            final Context liz = NQO.LJJ.LIZ();
            PackageInfo packageInfo;
            if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)"com.android.vending", (CharSequence)liz.getPackageName())) {
                if (6Tl.LIZIZ == null) {
                    6Tl.LIZIZ = packageManager.getPackageInfo("com.android.vending", 128);
                }
                packageInfo = 6Tl.LIZIZ;
            }
            else {
                if (6Tl.LJIIIZ) {
                    TextUtils.equals((CharSequence)"com.android.vending", (CharSequence)liz.getPackageName());
                }
                if (6Tl.LJIIIZ) {
                    TextUtils.equals((CharSequence)"com.android.vending", (CharSequence)liz.getPackageName());
                }
                if (6Tl.LJIIIZ) {
                    TextUtils.equals((CharSequence)"com.android.vending", (CharSequence)liz.getPackageName());
                }
                packageInfo = packageManager.getPackageInfo("com.android.vending", 128);
            }
            if (packageInfo.versionCode >= 80837300) {
                return true;
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    @Override
    public final void endConnection() {
        this.LIZ = 3;
        if (this.LIZLLL != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.LIZJ.unbindService(this.LIZLLL);
            this.LIZLLL = null;
        }
        this.LIZIZ = null;
    }
    
    @Override
    public final ReferrerDetails getInstallReferrer() {
        if (this.isReady()) {
            final Bundle bundle = new Bundle();
            bundle.putString("package_name", this.LIZJ.getPackageName());
            try {
                return new ReferrerDetails(this.LIZIZ.LIZ(bundle));
            }
            catch (final RemoteException ex) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.LIZ = 0;
                throw ex;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }
    
    @Override
    public final boolean isReady() {
        return this.LIZ == 2 && this.LIZIZ != null && this.LIZLLL != null;
    }
    
    @Override
    public final void startConnection(final InstallReferrerStateListener installReferrerStateListener) {
        if (this.isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        final int liz = this.LIZ;
        if (liz == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (liz == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        final Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        final List queryIntentServices = this.LIZJ.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            final ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                final String packageName = resolveInfo.serviceInfo.packageName;
                final String name = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(packageName) && name != null && this.LIZ()) {
                    final Intent intent2 = new Intent(intent);
                    final InstallReferrerClientImpl.a lizlll = new InstallReferrerClientImpl.a(this, installReferrerStateListener, (byte)0);
                    this.LIZLLL = (ServiceConnection)lizlll;
                    try {
                        final Context lizj = this.LIZJ;
                        Label_0282: {
                            boolean b;
                            if (lizj != null && lizj instanceof Context) {
                                if (KiO.LIZ(lizj, intent2, (ServiceConnection)lizlll, 1)) {
                                    break Label_0282;
                                }
                                b = lizj.bindService(intent2, (ServiceConnection)lizlll, 1);
                            }
                            else {
                                b = lizj.bindService(intent2, (ServiceConnection)lizlll, 1);
                            }
                            if (!b) {
                                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                                this.LIZ = 0;
                                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                                return;
                            }
                        }
                        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    catch (final SecurityException ex) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
                        this.LIZ = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.LIZ = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
        }
        this.LIZ = 0;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
